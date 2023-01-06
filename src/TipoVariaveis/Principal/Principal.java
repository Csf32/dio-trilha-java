package TipoVariaveis.Principal;

import TipoVariaveis.TipoVariaveis;

public class Principal{

    public static void main(String[] args) {
 
        TipoVariaveis x = new TipoVariaveis();
        System.out.println("O salário é: "+ x.salario + "A idade é " + x.idade);
        
        System.out.println("Definir uma variável que não pode ser alterado: " + x.PI);
        
    }
   
}


