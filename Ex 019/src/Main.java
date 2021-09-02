import java.text.DecimalFormat;
import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int del1 = 4, del2 = 4, del3 = 4;
        float maiorAlt1 = 0, menorAlt1 = 0, soma = 0, media;
        float maiorAlt2 = 0, menorAlt2 = 0;
        float maiorAlt3 = 0, menorAlt3 = 0;

                //Maior e Menor altura da 1ª delegação
            for (int i = 0; i < del1; i++) {
                float alt = teclado.nextFloat();
                    soma = soma + alt;

                    if (maiorAlt1 == 0) {
                        maiorAlt1 = alt;
                        menorAlt1 = alt;

                    }else if (maiorAlt1 < alt) {
                        maiorAlt1 = alt;

                    }if (menorAlt1 > alt) {
                        menorAlt1 = alt;
                    }
            }
                // Maior e Menor altura da 2ª delegação
            for (int i = 0; i < del2; i++) {
                float alt = teclado.nextFloat();
                    soma = soma + alt;

                    if (maiorAlt2 == 0) {
                        maiorAlt2 = alt;
                        menorAlt2 = alt;

                    }else if (maiorAlt2 < alt) {
                        maiorAlt2 = alt;

                    }if (menorAlt2 > alt) {
                        menorAlt2 = alt;
                    }
            }
                // Maior e Menor altura da 3ª delegação
            for (int i = 0; i < del3; i++) {
                float alt = teclado.nextFloat();
                    soma = soma + alt;

                    if (maiorAlt3 == 0) {
                        maiorAlt3 = alt;
                        menorAlt3 = alt;

                    }else if (maiorAlt3 < alt) {
                        maiorAlt3 = alt;

                    }if (menorAlt3 > alt) {
                        menorAlt3 = alt;
                    }
            }            

                media = soma/12;
                System.out.println("Maior altura \n" + "Delegacao 1: " + maiorAlt1 + "\nDelegacao 2: " + maiorAlt2 + "\nDelegacao 3: " + maiorAlt3);
                System.out.println("\nMenor altura \n" + "Delegacao 1: " + menorAlt1 + "\nDelegacao 2: " + menorAlt2 + "\nDelegacao 3: " + menorAlt3);
                System.out.println("\nAltura media: " + new DecimalFormat(".0#").format(media));
    }
}
