package Metodos.Sobrecarga;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Crie uma aplicação que calcule as áreas do quadrado, retângulo e trapézio 

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o lado para calcular a área do quadrado");
        double lado = sc.nextDouble();

        System.out.println("Digite a base para calcular a área do retângulo");
        double base = sc.nextDouble();

        System.out.println("Digite a altura para calcular a área do retângulo");
        double altura = sc.nextDouble();
        
        System.out.println("Digite a base maior para calcular a área do trapézio");
        double baseMaior = sc.nextDouble();

        System.out.println("Digite a base menor para calcular a área do trapézio");
        double baseMenor = sc.nextDouble();
        
        
        CalcularArea quadrado = new CalcularArea(lado);
        CalcularArea retangulo = new CalcularArea(altura, base);
        CalcularArea trapezio = new CalcularArea(altura, baseMenor, baseMaior);

        System.out.println(quadrado);
        System.out.println(retangulo);
        System.out.println(trapezio);
        
        sc.close();


    }
}
