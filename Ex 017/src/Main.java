import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int n = teclado.nextInt();
        int total = 1;

            while (n >= 1) {
                total = total * n;          
                n--;                 
            }
            
            System.out.println(total);
    }
}
