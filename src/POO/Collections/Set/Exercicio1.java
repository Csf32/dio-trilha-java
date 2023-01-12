package POO.Collections.Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio1 {
    public static void main(String[] args) {

        // Dada uma lista com 4 notas de um aluno [7, 8.5 , 6.0, 4.8], faça:

        System.out.println("Crie um conjunto e adicione as notas de maneira aleatória: ");

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 6.0, 4.8));
        System.out.println(notas);

        System.out.println();
        System.out.println("Confira se a nota 6.0 está no conjunto" + notas.contains(6d));

        System.out.println();
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println();
        System.out.println("Exiba a soma dos conjuntos: ");

        double soma = 0.0;

        for (Double somar : notas) {
            soma += somar;
        }

        System.out.println(soma);
        // ou
        System.out.println();

        double somaIterator = 0.0;

        Iterator<Double> iterator = notas.iterator();

        while (iterator.hasNext()) {
            Double next = iterator.next();
            somaIterator += next;
        }
        System.out.println(somaIterator);

        System.out.println();
        System.out.println("A média é: " + soma / notas.size());

        System.out.println();
        System.out.println("Remova a nota 6.0");
        notas.remove(6d);
        System.out.println(notas);

        System.out.println();
        System.out.println("Remover as notas menores que 7:");

        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {

            Double next = iterator2.next();
            if (next < 7) {
                iterator2.remove();
            }
        }
        System.out.println(notas);

        System.out.println();
        System.out.println("Exibir a ordem que foi informada: ");

        Set<Double> notas2 = new LinkedHashSet<>();

        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(6.0);
        notas2.add(4.8);
        notas2.add(8d);
        System.out.println(notas2);

        System.out.println();
        System.out.println("Exiba todas as ordens em ordem crescente");

        Set<Double> notas3 = new TreeSet<>(notas);
        System.out.println(notas3);

    }
}
