import java.util.Scanner;
class Main {

    /*
    Faça um programa para ler as quatro notas escolares de um aluno e imprimir 
    uma mensagem dizendo que o aluno foi aprovado se o valor da média
    escolar for maior ou igual a 7,0. Se a média for entre 5,0 (inclusive) e 7,0,
    informar que o aluno está em recuperação. Se a média for inferior a 5,0 o
    aluno foi reprovado. 
     */
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float n3 = teclado.nextFloat();
        float n4 = teclado.nextFloat();
        float media = (n1 + n2 + n3 + n4) / 4;
        
            if (media >= 7) {
                System.out.println("aprovado");
                           
            }else if (media >= 5 && media < 7) {
                System.out.println("recuperacao");
            
            }else if (media < 5) {
                System.out.println("reprovado");
            }
    }
    
}
