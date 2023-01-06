package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*Desenvolver um gerador de tabuada capaz de gerar a tabuada de qualquer número inteiro 
         * entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada
        */

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tabuada: ");
        
        int tabuada = sc.nextInt();

        for(int i = 1; i<=10; i++ ){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));

        }
       
        sc.close();


    }
    
}
