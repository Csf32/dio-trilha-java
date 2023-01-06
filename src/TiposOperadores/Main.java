package TiposOperadores;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("---------Aplicando Debug---------");

        //concatenação aplicando debug
        String concatenacao;

        concatenacao = "1" + 1;
        System.out.println(concatenacao);

        concatenacao = "2" + 2 + "3";
        System.out.println(concatenacao);

        System.out.println();
        System.out.println("---------Aplicando incrementação---------");

        int numero = 5;
        System.out.println(- numero);

        System.out.println(-- numero);

        System.out.println(++ numero);

        System.out.println();
        System.out.println("---------Aplicando incrementação---------");

        int numero2 = 6;
        numero2 = numero2 + numero; 
        System.out.println(numero2);

        int incrementeNumero = 7;
        System.out.println(incrementeNumero ++);
        System.out.println(incrementeNumero);

        System.out.println();
        System.out.println("---------Aplicando operador diferente---------");

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        System.out.println();
        System.out.println("---------Aplicando operador ternário---------");
         //Ternário
         //variável = Se a condição ? For verdadeira : Do contrário é falso

        int a = 5;
        int b = 6;
        String resultado = "";

        if(a==b) {
           
            resultado = "Verdadeiro";
        }
        else {
            resultado = "Falso";
        }

        System.out.println(resultado);

        String valorFinal = (a==b) ? "Verdadeiro" : "Falso";
        System.out.println(valorFinal);

        System.out.println();
        System.out.println("---------Aplicando operador igualdade e diferença---------");

        int n1 = 1;
        int n2 = 2;
        boolean v = true;
        boolean f = false;

        if(n1 == n2  ) {
            System.out.println("n1 é igual a n2? "+ f);
    
        }
        else if(n1 != n2) {
            System.out.println("n1 é diferente de n2? "+ v);
    
        }

        System.out.println();
        System.out.println("---------Aplicando operador maior e menor---------");

        int num1 = 1;
        int num2 = 2;
        boolean v1 = true;
        boolean f1 = false;

        if(num1 > num2) {
            System.out.println("n1 é maior que n2? "+ f1);
    
        }

        else {
            System.out.println("n1 é menor que n2? "+ v1);
        }
        System.out.println();
        System.out.println("---------Aplicando equals para igualdade entre string e objeto---------");

        String nome1 = "Caique";
        String nome2 = new String("Caique");

        System.out.println(nome1.equals(nome2));
        

        System.out.println();
        System.out.println("---------Aplicando operadores  nd e Or---------");

        boolean cond1 = true;
        boolean cond2= false;

        if(cond1 && cond2){
            System.out.println("As duas condições são verdadeiras");
        }
        System.out.println("Fim");

        if(cond1 || cond2){
            System.out.println("Uma das duas condições são verdadeiras");
        }
        System.out.println("Fim");
    }



}
