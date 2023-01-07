package POO.Herancas.Polimorfismo.Exercicio1;

public class PrincipalPolimorfismo {

    Funcionario funcionario = new Funcionario();
    //Upcasting
    Funcionario gerente = new Gerente();
    Funcionario vendedor = new Vendedor();
    Funcionario faxineiro = new Faxineiro();

    //Dowcansting
    Vendedor vendedor2 = (Vendedor) new Funcionario(); 
    





    
}
