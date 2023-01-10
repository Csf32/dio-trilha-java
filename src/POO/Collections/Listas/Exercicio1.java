package POO.Collections.Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio1 {

    public static void main(String[] args) {
        // Dado uma lista com 4 notas de um aluno [7, 8.5, 9.3, 5]

        List<Double> notas = new ArrayList<Double>();

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);

        System.out.println(" A quantidade de notas são: " + notas.size());

        double tamanhoTotal = 0;

        System.out.println("As notas foram:");

        for (Double list : notas) {
            System.out.println(list);
        }

        System.out.println("A soma das notas são");
        for (Double soma : notas) {
            System.out.println(tamanhoTotal += soma);
        }

        System.out.println("A média é: " + tamanhoTotal / notas.size());

        System.out.println();

        System.out.println("Adicionando na lista a nota 6.0 na posição 2: ");
        notas.add(2, 6d);

        for (Double novalista : notas) {
            System.out.println(novalista);
        }

        System.out.println();
        System.out.println("A posição da nota 5.0 é: " + notas.indexOf(5d) );

        System.out.println();
        System.out.println("Substituir nota 5.0 pela nota 7.0 " + notas.set(notas.indexOf(5d), 7.0));
        System.out.println(notas);

        System.out.println();
        System.out.println("Conferindo se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println();
        System.out.println("Exibir a quarta nota: " + notas.get(4));
        
        System.out.println();
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println();
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        
        System.out.println();
        System.out.println("Remova a nota 7: ");
        notas.remove(7d);
        System.out.println(notas);

        System.out.println();
        System.out.println("Remova a nota da posição 1");
        notas.remove(1);
        
        System.out.println();
        System.out.println("Apagar toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println();
        System.out.println("Conferir se a lista está vazia" +  notas.isEmpty());
       








    }

}
