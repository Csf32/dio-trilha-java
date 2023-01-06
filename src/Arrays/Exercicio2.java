package Arrays;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*Faça um vetor que contenha 6 strigns e diga quantas consoantes foram lidas e imprima-as*/
        
        Scanner sc = new Scanner(System.in);

        int quantidadeConsoantes = 0;
        int i = 0;

        String[] consoantes = new String[6];
        
        do{
            System.out.println("Digite uma letra ");
            String letra = sc.next();
            
            if(!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") | 
                letra.equalsIgnoreCase("i") | 
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u") 
                )){
                   consoantes[i] = letra;
                   quantidadeConsoantes++;    
            }
            
            i++;
        }

        while(i < consoantes.length);
       
        System.out.println("Consoantes: ");

        for (String consoante : consoantes ) {

            if(consoante != null){
                System.out.println(consoante);
            }
            
        }
        System.out.println("A quantidade de consoantes é: " + quantidadeConsoantes);


        sc.close();

    }
}
