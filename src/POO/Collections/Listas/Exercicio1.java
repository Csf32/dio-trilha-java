package POO.Collections.Listas;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.type.NoType;

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

    }

}
