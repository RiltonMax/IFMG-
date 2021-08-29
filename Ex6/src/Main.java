import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float peso = teclado.nextShort();
        float altura = teclado.nextFloat();
        float imc = peso/(altura * altura);
        
        if(imc < 18.5){;
            System.out.println("abaixo do peso");
            
        }else if(imc > 18.5 && imc <= 25){;
            System.out.println("peso normal");
            
        }else if(imc > 25 && imc <= 30){;
            System.out.println("acima do peso");
            
        }else if(imc > 30){;
            System.out.println("obeso");
        }
    
    }
    
}
