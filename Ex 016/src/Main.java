import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int base = teclado.nextInt();
        int expo = teclado.nextInt();
        int result = 1;

            for (int i = 0; i < expo; i++) {
                result = result * base;
            }
            
            System.out.println(result);
    }

}
