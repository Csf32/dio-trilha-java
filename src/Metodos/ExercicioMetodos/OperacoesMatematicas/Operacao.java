package Metodos.ExercicioMetodos.OperacoesMatematicas;

public class Operacao {
    
    public double numeroSoma1, numeroSoma2;
    public double numeroSub1, numeroSbu2;
    public double numeroDiv1, numeroDiv2;
    public double numeroMult1, numeroMult2;


  //Calcule as 4 operações básicas passando dois parâmetros


    public double operarSoma(double numeroSoma1, double numeroSoma2) {
        return numeroSoma1 + numeroSoma2;

    }

    public double operarSubtracao(double numeroSub1, double numeroSbu2) {
        return Math.abs(numeroSub1 - numeroSbu2); 
    }
    
    public double operarMultiplicacao(double numeroMult1, double numeroMult2) {
        return numeroMult1 * numeroMult2;
    }
    
    public double operarDivisao(double numeroDiv1, double numeroDiv2) {
        return numeroDiv1 / numeroDiv2;
    }
}


