package POO;

import java.util.Scanner;

public class Objetos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do combustivel");
        double valorCombustivel = sc.nextDouble();
        
        AtributosMetodos obj = new AtributosMetodos();

        obj.setcor("Cinza");
        obj.setModelo("Volvo XC90");
        obj.setVolumeTanque(50);

        System.out.println(obj.getcor());
        System.out.println(obj.getModelo());
        System.out.println(obj.getVolumeTanque());
        System.out.println(obj.totalValorTanque(valorCombustivel));
        
        System.out.println();
        System.out.println("Com a sobrecarga");

        AtributosMetodos sobre = new AtributosMetodos("Azul", "BMW X6", 55);

        System.out.println(sobre.getcor());
        System.out.println(sobre.getModelo());
        System.out.println(sobre.getVolumeTanque());
        System.out.println(valorCombustivel);
        sc.close();
    }

}