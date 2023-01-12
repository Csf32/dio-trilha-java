package POO.Desafios;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        int mult = doce * 2;

        leitor.close();
        System.out.println("O cliente obteve " + mult + " doces");
    }
}
