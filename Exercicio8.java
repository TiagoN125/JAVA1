public class Exercicio8 {
    public static void main(String[]args){
        int numero = 10;
        int maiorDivisor = 3;

        for (int i = 2; i<=numero; i++){
            if (numero % i == 0){
                maiorDivisor = i;
            }
        }
        System.out.println("O maior divisor é:" + maiorDivisor);
    }
}