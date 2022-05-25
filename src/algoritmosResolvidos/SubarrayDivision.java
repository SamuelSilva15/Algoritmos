package algoritmosResolvidos;

import java.util.List;

public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        int squares = 0;
        for (int i = 0; i < s.size(); i++){
            int ate = (i + m - 1);
            if(ate > s.size() - 1){
                return squares;
            }
            int soma = somaSeguemento(s, i, ate);
            if(soma == d){
                squares++;
            }
        }
        return squares;
    }

    public static int somaSeguemento(List<Integer> s, int de, int ate){
        int soma = 0;
        for(int i = de; i <= ate; i++){
            soma += s.get(i);
        }
        return soma;
    }

    public static void main(String[] args) {
        //6
        //1 1 1 1 1 1
        //3 2

        List<Integer> s = List.of(1, 1, 1, 1, 1, 1);
        System.out.println(birthday(s, 3, 2) == 0);

        List<Integer> a = List.of(4);
        System.out.println(birthday(a, 4, 1) == 1);

        System.out.println(somaSeguemento(s, 0, 1));
        System.out.println(somaSeguemento(s, 1, 2));
        System.out.println(somaSeguemento(s, 2, 3));
    }
}
