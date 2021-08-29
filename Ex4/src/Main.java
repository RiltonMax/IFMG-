import java.util.Scanner;
class Main {
    
//Leia 3 números e exiba em ordem decrescente
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();
        
            if(n1 > n2 && n2 > n3){;
                System.out.println(n1 + "\n" + n2 + "\n" + n3);
                             
            }else if(n1 > n3 && n3 > n2){;
                System.out.println(n1 + "\n" + n3 + "\n" + n2);
                
            }else if(n2 > n1 && n1 > n3){;
                System.out.println(n2 + "\n" + n1 + "\n" + n3);
                
            }else if(n2 > n3 && n3 > n1){;
                System.out.println(n2 + "\n" + n3 + "\n" + n1);
                
            }else if(n3 > n1 && n1 > n2){;
                System.out.println(n3 + "\n" + n1 + "\n" + n2);
                
            }else if(n3 > n2 && n2 > n1){;
                System.out.println(n3 + "\n" + n2 + "\n" + n1);
    }
    }
}
