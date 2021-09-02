import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int soma = 0;

            while (n1 != 0 || n2 != 0) {
                soma = n1 + n2;
                System.out.println(soma);
                int x1 = teclado.nextInt();
                int x2 = teclado.nextInt();
                n1 = x1;
                n2 = x2;
            }

    }
}
