import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    //faça o fibonnaci e retorne se retorne um elemento
    public static int fibonacci(int num){
        if(num <= 0){
            return 0;
        }
        if(num < 2){
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static int retornaNonoElemento(int num){
        List<Integer> fibonacci = new ArrayList<>();
        for(int i = 0; i <= num; i++) {
            fibonacci.add(fibonacci(i));
        }
        return fibonacci.get(8);
    }


    public static void main(String[] args) {

        System.out.println(retornaNonoElemento(12));
    }

}
