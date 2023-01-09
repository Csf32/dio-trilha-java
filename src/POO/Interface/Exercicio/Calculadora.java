package POO.Interface.Exercicio;

public class Calculadora implements OperacaoMatematica{
    
    @Override
    public void somar(double operando1, double operando2){
        System.out.println("Soma: " + (operando1 + operando2));
    }

    @Override
    public void subtrair(double operando1, double operando2){
        System.out.println("subtrair: " + (operando1 - operando2));
    }

    @Override
    public void multiplicar(double operando1, double operando2){
        System.out.println("multiplicar: " + (operando1 * operando2));
    }

    @Override
    public void dividir(double operando1, double operando2){
        System.out.println("dividir: " + (operando1 / operando2));
    }

    
}
