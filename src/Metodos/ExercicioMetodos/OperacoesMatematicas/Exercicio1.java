package Metodos.ExercicioMetodos.OperacoesMatematicas;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Calcule as 4 operações básicas passando dois parâmetros

        Scanner sc = new Scanner(System.in);
        Operacao op = new Operacao();

        System.out.println("Digite o 1° número");
        double primeiroNumero = sc.nextDouble();

        System.out.println("Digite o 2º número");
        double segundoNumero = sc.nextDouble();

        System.out.println("Escolha o tipo de operação: soma, subtração, divisão ou multiplicação");
        String escolherOperacao = sc.next();
        
        if(escolherOperacao.equals("soma")){
           
            System.out.println(" A soma é: " + op.operarSoma(primeiroNumero, segundoNumero));
        }
        
        else if(escolherOperacao.equals("subtração")) {
            System.out.println(" A subtração é: " + op.operarSubtracao(primeiroNumero, segundoNumero));
        }
        
        else if(escolherOperacao.equals("multiplicação")) {
            System.out.println(" A multiplicação é: " + op.operarMultiplicacao(primeiroNumero, segundoNumero));
        }
        
        else{
            System.out.println(" A divisão é: " + op.operarDivisao(primeiroNumero, segundoNumero));
        }
        sc.close();
    }

}
