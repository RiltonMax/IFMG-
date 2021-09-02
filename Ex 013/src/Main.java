import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int div;

            if (n2 != 0) {
                div = n1 / n2;
                System.out.println(div);

            }
                while (n2 == 0) {
                    int x = teclado.nextInt();
                    n2 = x;
                }
                
                div = n1 / n2;
                System.out.println(div);                
            
            
    }
}
