import java.util.Scanner;

class Main {

    
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      int n1 = teclado.nextInt();
      int n2 = teclado.nextInt();
      int n3 = teclado.nextInt();
      int n4 = teclado.nextInt();
      
      if (n1<n2 && n1<n3 && n1<n4){
          System.out.println(n1);
          
      }else if (n2<n3 && n2<n4){
          System.out.println(n2);
          
      }else if (n3<n4){
          System.out.println(n3);
          
      }else{
          System.out.println(n4);
      }
          
      
          
      
    }
    
}
