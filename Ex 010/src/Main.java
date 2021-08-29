import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float media,soma = 0, altMaior = 0, altMenor = 0;
        
            for (int i = 0; i < 4; i++) {
                float alt = teclado.nextFloat();                
                soma = soma + alt;
                
                if (altMaior == 0) {
                    altMaior = alt;
                    
                }else if (altMaior < alt) {
                    altMaior = alt;
                    
                }if (altMenor == 0) {
                    altMenor = alt;
                    
                }else if (altMenor > alt) {
                    altMenor = alt;                    
                }
           
            }   media = (soma/4);
            
                System.out.println("Maior altura: " + altMaior + " metros");
                System.out.println("Menor altura: " + altMenor + " metros");
                System.out.println("Altura media: " + media + " metros");
    }
    
}
