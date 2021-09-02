import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int n = teclado.nextInt();
        int soma = 0;

            while (n >= 1) {
                
                if (n % 2 != 0) {
                    soma = soma + n;
                }
                n--;
            }
            System.out.println(soma);

            
    }
}
