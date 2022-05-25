package algoritmosResolvidos;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int numeroRecordes = 0;
        int numeroFracassos = 0;
        int maiorRecorde = scores.get(0);
        int menorPontuacao = scores.get(0);
        for (int i = 1; i < scores.size(); i++) {
            if(scores.get(i) > maiorRecorde){
                maiorRecorde = scores.get(i);
                numeroRecordes++;
            } else if (scores.get(i) < menorPontuacao){
                menorPontuacao = scores.get(i);
                numeroFracassos++;
            }
        }
        List<Integer> resultado = new ArrayList<>();
        resultado.add(numeroRecordes);
        resultado.add(numeroFracassos);
        return resultado;
    }

    public static void main(String[] args) {
        //3 4 21 36 10 28 35 5 24 42

        List<Integer> scoresTeste2 = List.of(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);
        List<Integer> teste2 = breakingRecords(scoresTeste2);
        System.out.println(teste2.get(0) == 4);
        System.out.println(teste2.get(1) == 0);

        List<Integer> scoresTeste1 = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1);
        List<Integer> teste1 = breakingRecords(scoresTeste1);
        System.out.println(teste1.get(0) == 2);
        System.out.println(teste1.get(1) == 4);
    }
}
