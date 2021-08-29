import java.util.Scanner;
class Main {

    /*
    Crie um programa que leia um valor de hora (hh:mm:ss) [hh no formato de
    24h] inserido pelo usuário e informe quantos segundos se passaram desde
    o início do dia. 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        byte horas = teclado.nextByte();
        byte min = teclado.nextByte();
        byte seg = teclado.nextByte();
        int totalSeg = ((horas * 3600) + (min * 60) + seg);
        
            System.out.println(totalSeg);
    }
    
}
