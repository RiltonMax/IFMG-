import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
            int soma = 0;
            int n = teclado.nextInt();
           
                while (n != 0) {
                    soma = soma + n;
                    int x = teclado.nextInt();
                    n = x;
                }System.out.println(soma);

        }
    }

