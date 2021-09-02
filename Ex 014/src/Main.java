import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner (System.in);
       int qntP = teclado.nextInt(); 
       float soma = 0;     

        for (int i = 0; i < qntP; i++) {
            int idade = teclado.nextInt();
            float peso = teclado.nextFloat();

                if (idade > 30) {
                    soma = soma + peso;
                }
        }
        teclado.close();
        System.out.println(soma);
    }
}
