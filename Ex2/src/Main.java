import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int Salario = teclado.nextInt();
        int prest = teclado.nextInt();
        
        if ( prest > (Salario*0.3)){;
        System.out.println("nao");
        
        }else{
        System.out.println("sim");   
            }
        
        
           
            
        
    }
    
}
