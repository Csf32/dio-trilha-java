package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio1 {
    /*Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno
     e o segundo sua idade 
    */

    public static void main (String[] args){
        int idade;
        String nome;
    
        Scanner sc = new Scanner(System.in);

        //Enquanto o nome não for 0
        while(true){

            System.out.println(" Digite seu nome ");
            nome = sc.next();
            if(nome.equals("0")){
                break;
            }
            else {
                System.out.println(" O nome é " + nome);
                System.out.println(" Digite sua idade ");
                idade = sc.nextInt();

                System.out.println(" O nome é " + idade);
             
            }
        }
        
        System.out.println("Parar");

        sc.close();
        
    }
    
    




}
