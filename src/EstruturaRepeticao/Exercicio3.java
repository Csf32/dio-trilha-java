package EstruturaRepeticao;
import java.util.Scanner;

public class Exercicio3 {
    public static void main (String [] args) {

       
        Scanner sc = new Scanner(System.in);
        /* Faça um programa que lê 5 números e informe o maior e a média desses*/

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;
        do{

            System.out.println("Numero ");
            numero = sc.nextInt();

            if(numero > maior) {
                maior = numero;
            }
            count += 1;
            soma += numero;
        }
        while(count < 5);
        
        System.out.println("Maior: " + maior);
        System.out.println("A média é: " + soma/2);

        sc.close();
        
    }
}
