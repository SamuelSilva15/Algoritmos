package algoritmosResolvidos;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimilarStrings {

    public static long countSimilarPairs(List<String> words) {
        words = distinct(words);
        System.out.println(words);
        int soma = 0;
        for (int i = 0; i < words.size(); i++) {
            for (int c = i + 1; c < words.size(); c++) {
                if (words.get(i).equals(words.get(c)));
                    soma++;
            }

        }
        return soma;
    }

    public static List<String> distinct(List<String> words) {
        List<String> distinct = new ArrayList<>();


        return distinct;
    }

    public static void main(String[] args) {
        List<String> words = List.of("aba", "abaca", "baab", "cba");


        var a = words.stream()
                .map(w -> Stream.of(w)
                        .map(x -> x.split(""))
                        .flatMap(Arrays::stream)
                        .distinct()
                        .sorted()
                        .collect(Collectors.joining()))
                .collect(Collectors.groupingBy(String::hashCode, Collectors.counting()));

        var c = a.values().stream().map(x -> x == 2 ? x - 1 : x).reduce(0L, Long::sum);
        System.out.println(c);
        //System.out.println(words.stream().map(String::chars).distinct().sorted().mapToObj(c -> (char) c).collect(Collectors.toList()));
     }
}
