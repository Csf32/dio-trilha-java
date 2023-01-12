package POO.Desafios;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        int saida = entrada * mesada;
        
        leitor.close();
        System.out.println(saida);
       
    }

   
}
