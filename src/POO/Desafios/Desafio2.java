package POO.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        
        String saida = "";
        for(int i =0; i< tamanho; i++) {
          saida = saida + "/";
        }
        
        leitor.close();
        System.out.println(saida);
    }
}
