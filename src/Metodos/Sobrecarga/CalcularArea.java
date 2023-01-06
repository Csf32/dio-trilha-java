package Metodos.Sobrecarga;

public class CalcularArea {
    // Crie uma aplicação que calcule as áreas do quadrado, retângulo e trapézio
    public double lado, altura, base, baseMaior, baseMenor;

    // Quadrado
    public CalcularArea(double lado) {
        System.out.println(lado * lado);

    }

    // Retângulo
    public CalcularArea(double altura, double base) {
        System.out.println("A área do Retângulo é: " + altura * base);

    }

    // Trapézio
    public CalcularArea(double altura, double baseMaior, double baseMenor) {
        System.out.println("A área do Trapézio é: " + ((baseMaior + baseMenor) * altura) / 2);

    }

}
