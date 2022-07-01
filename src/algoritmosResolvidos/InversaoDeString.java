public class InversaoDeString {

    //Inverta strings sem usar metodos prontos

    public static String inversaoString(String strOriginal){
        String[] listaPalavras = strOriginal.split(" ");
        String strInversa = "";

        for(int i = 0; i < listaPalavras.length; i++){
            String palavra = listaPalavras[i];
            String palavraInversa = "";

            for(int j = palavra.length()-1; j >= 0; j--){
                palavraInversa = palavraInversa + palavra.charAt(j);
            }

            strInversa = strInversa + palavraInversa + " ";
        }

        return strInversa;
    }

    public static void main(String[] args) {
        System.out.println(inversaoString("acba"));
    }
}
