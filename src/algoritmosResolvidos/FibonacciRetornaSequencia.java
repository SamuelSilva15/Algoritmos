public class FibonacciRetornaSequencia {

    //faça o fibonnaci e retorne se o numero pertence ou não a sequencia

    public static int fibonacci(int num){
        if(num <= 0){
            return 0;
        }
        if(num < 2){
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static String verificaFibonacci(int num){
        fibonacci(num);
        for(int i = 0; i <= fibonacci(num); i++){
            if(fibonacci(i) == num){
                return num + " pertence a sequencia";
            }
        }
        return num + " não pertence a sequencia";
    }

    public static void main(String[] args) {
        System.out.println(verificaFibonacci(1));
    }
}
