import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
         Scanner teclado = new Scanner (System.in);
         int dias = teclado.nextInt();
         int menorProd = 0, maiorProd = 0, media, prodTotal = 0;

            for (int i = 0; i < dias; i++) {
                int qnt = teclado.nextInt();

                prodTotal += qnt;                   

                    if (i == 0) {
                        maiorProd = qnt;
                        menorProd = qnt;

                    }else if (maiorProd <= qnt) {
                        maiorProd = qnt;

                    }if (menorProd >= qnt) {
                        menorProd = qnt;
                    }            

            }
                media = prodTotal / dias;
                System.out.println("Quantidade produzida nos " + dias + " dias: " + prodTotal);
                System.out.println("Media diaria de producao: " + media);
                System.out.println("Menor producao diaria: " + menorProd);
                System.out.println("Maior producao diaria: " + maiorProd);
    }
}
