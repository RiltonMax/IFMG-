import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();

            while (n1 <= n2) {

                if (n1 % 3 == 0 && n1 % 5 == 0) {
                    System.out.print("pifpaf; ");

                }else if (n1 % 3 == 0) {
                    System.out.print("pif; ");

                }else if (n1 % 5 == 0) {
                    System.out.print("paf; ");
                }
                n1++;
            }
    }
}
