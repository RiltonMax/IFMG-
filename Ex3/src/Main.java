import java.util.Scanner;
class Main {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       String estado = teclado.nextLine(); // Ler o estado solicitado
       
       if(estado.equals ("RJ")){;
           System.out.println("carioca");
           
       }else if(estado.equals("SP")){;
            System.out.println("paulista");
            
       }else if(estado.equals("MG")){;
            System.out.println("mineiro");
            
       }else if(estado.equals("RN")){;
            System.out.println("potiguar");
            
       }else if(estado.equals("ES")){;
            System.out.println("capixaba");
            
       }else if(estado.equals("RS")){;
            System.out.println("gaucho");
            
       }else if(estado.equals("SC")){;
            System.out.println("catarino");
            
       }else{;
            System.out.println("outro estado");
          
       }
    }
    
}
