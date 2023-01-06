package Metodos;

import java.util.Scanner;

import Metodos.Teste.SmartTv;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SmartTv tv = new SmartTv();
        
        System.out.println("Qual o estado da TV? (Ligada ou Desligada)");
        tv.estadoTV = sc.next();
        tv.ligarDesligar();
       
        
        System.out.println("A tv começa no volume = 0");
        System.out.println("Deseja aumentar o volume da tv? (Sim ou Não?)");
        tv.volume = sc.next();

        System.out.println("Em quanto deseja mexer o volume?");
        tv.volumeDesejado = sc.nextInt();
        tv.volumeTV();

        sc.close();
        
    }
}
