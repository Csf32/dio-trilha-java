package POO.Desafios;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
        if(velocidadeAtual <= 60) {
          System.out.println("Nao foi multado");
        }
        
        else if(velocidadeAtual > 60  && velocidadeAtual <= 68){
          System.out.println("Foi multado");
        }
        
        else {
          System.out.println("Foi multado");
        }

        leitor.close();
    }
}
