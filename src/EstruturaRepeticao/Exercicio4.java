package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Informar um programa que peça N números inteiros, mostrar os números pares e ímpares
        // e a quantidade desses

        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;
        int count =0;

        System.out.println("Digite a quantidade de números");
        quantidadeNumeros = sc.nextInt();   

        do{

            System.out.println("Digite número");
            numero = sc.nextInt();   

            if(numero % 2 == 0) {
                quantPares++;
                System.out.println("O número " + quantPares + " é par");
            }
            else {
                quantImpares++;
                System.out.println("O número " + quantImpares + " é ímpar");
            }
            count++;
        }
        while(count < quantidadeNumeros);

        System.out.println("Todos os números pares são: " + quantPares);
        System.out.println("Todos os números ímpares são: " + quantImpares);

        sc.close();


    }
}
