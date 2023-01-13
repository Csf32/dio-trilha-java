package POO.TratamentoExcecoes.UncheckedException;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        //Com erro
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        //Tratando

        try {

            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        
        } 
        catch (NumberFormatException e) {
            e.printStackTrace(); //Verificar informações do erro na tela
            //JOptionPane.showInputDialog("Erro de entrada de dados, informe somente números" + e.getMessage());
           
            System.out.println("Erro de entrada de dados, informe somente números");
        }
        catch (ArithmeticException e ){
           System.out.println("Tentativa de dividr numero por 0");

        }
        // finally{
        //     System.out.println("Chegou no finally");
        // }
        
        System.out.println("Codigo continua");

    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
