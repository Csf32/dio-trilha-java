package POO.Collections.Listas;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {

        // Dados as seguintes informações sobre meus gatos, crie uma lista e ordene esta

        List<Gato> meusGatos = new ArrayList<>() {
            {
                add(new Gato("Jon", "preto", 18));
                add(new Gato("Simba", "tigrado", 16));
                add(new Gato("Jon", "amarelo", 8));

            }
        };

        System.out.println("Mostrar na ordem de inserção: ");
        System.out.println(meusGatos);

        System.out.println();
        System.out.println("Mostrar na ordem aleatória: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println();
        System.out.println("Mostrar na ordem natural dos nomes");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        // Utilizando o Comparator
        System.out.println();
        System.out.println("Mostrar na ordem natural das idades");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        // Ou
        // meusGatos.sort(new ComparatorIdade());

        System.out.println();
        System.out.println("Mostrar na ordem natural das cores");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println();
        System.out.println("Orndenar por cor, idade e nome");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }

}

class Gato implements Comparable<Gato> {

    public String nome, cor;
    public Integer idade;

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public String toString() {
        return "{"
                + "nome = " + nome + '\''
                + "idade = " + idade
                + "cor= " + cor + '\''
                + '}';
    }

    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub

        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub

        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) {
            return nome;
        }

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) {
            return cor;
        }

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}