package Arrays;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        /*Faça um programa que leia N números inteiros e armazene num vetor.
        Ao final, mostre os números e seus sucessores         
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");

        int quantidadeNumero = sc.nextInt();
        int[] numero = new int[quantidadeNumero];

        System.out.println();

        for(int i = 0; i<numero.length; i++){
            
            System.out.println("Digite os números: ");
            numero[i] = sc.nextInt();
        
        }

       System.out.println();

       System.out.println("Sucessor ");
        for (int mostrarNumeros : numero) {
            System.out.println("O número é: " + mostrarNumeros + " e o seu sucessor é: " + (mostrarNumeros +1));
          
        }
    




        sc.close();
    }
}
