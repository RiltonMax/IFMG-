import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       int av1 = teclado.nextInt();
       int av2 = teclado.nextInt();
       int freq = teclado.nextInt();
      
        int media = (av1 + av2) /2;
            
        if(freq < 50 || av1 < 4 && av2 < 4){;
            System.out.println("reprovado");
            
        }else if(av1 < 4 || av2 < 4 || media < 6){;
            System.out.println("recuperacao");
        }else{
            System.out.println("aprovado " + media);
        }
    }
    
}
