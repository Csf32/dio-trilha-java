package Metodos.Sobrecarga;

public class CalcularArea {
    // Crie uma aplicação que calcule as áreas do quadrado, retângulo e trapézio
    public double lado, altura, base, baseMaior, baseMenor;

    public CalcularArea(){

    }
    
    public CalcularArea( double lado, double altura, double base, double baseMaior, double baseMenor){
        this.altura = altura;
        this.lado = lado;
        this.base = base;
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
    }

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
