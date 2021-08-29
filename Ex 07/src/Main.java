import java.util.Scanner;
class Main {
    
    /*Faça um programa que leia um número e some 5 caso seja par e divisível
    por 5 ou some 8 caso seja ímpar. Imprimir o resultado desta operação.
    */
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        
            if (n % 2 == 0 && n % 5 == 0) {
                n = n + 5;
                System.out.println(n);
                
            }else if (n % 2 != 0) {
                n = n + 8;
                System.out.println(n);
            }
        
    }
    
}
