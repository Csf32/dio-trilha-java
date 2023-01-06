package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        /*
         * Faça um programa que peça uma nota, entre 0 e 10. Mostre uma mensagem caso o
         * valor sejá inválido
         * e continue pendido o certo
         */

        int nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 10");
        nota = sc.nextInt();

        while (nota > 10) {

            System.out.println("Inválido. Digite um valor entre 0 e 10");
            nota = sc.nextInt();
        }

        System.out.println("fim");

        sc.close();
    }

}
