package POO.Collections.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio2 {
    public static void main(String[] args) {
        /*Dadas as seguintes informações sobre minhas séreis favoritas, crie um conjunto e ordene este conjunto exibindo:
         (nome - genero - tempo de episódio)
        */

        System.out.println("Ordem aleatória");
        Set<Serie> minhasSeries = new HashSet<>() {{

            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("Peak Blinders", "Drama", 50));
            add(new Serie("Vikings", "Fantasia", 50));
            add(new Serie("Spotify", "Documentário", 60));
        }};

        for (Serie serie : minhasSeries) {
        System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());
           
        }

        System.out.println();
        System.out.println("Ordem de inserção");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>() {{

            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("Peak Blinders", "Drama", 50));
            add(new Serie("Vikings", "Fantasia", 50));
            add(new Serie("Spotify", "Documentário", 60));
        }};

        for (Serie serie : minhasSeries2) {
            System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());
        }

        System.out.println();
        System.out.println("Ordem natural (Tempo de episódio e gênero)");
        Set<Serie> minhasSeries3= new TreeSet<>() {{

            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("Peak Blinders", "Drama", 50));
            add(new Serie("Vikings", "Fantasia", 55));
            add(new Serie("Spotify", "Documentário", 60));
        }};

        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());
        }

        System.out.println();
        System.out.println("Ordem de Nome/Gênero/TempoEpisodio");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        
        minhasSeries4.addAll(minhasSeries4);
        
        for (Serie serie : minhasSeries4) {
            System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());
        }


    }
}

class Serie implements Comparable <Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }
    
    
    public String toString() {
        return "{"
                +"nome = " + nome + '\''
                +", genero = " + genero + '\''
                +", tempoEpisodio = " + tempoEpisodio
                + "}";
     
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Serie other = (Serie) obj;

        if (nome == null) {
            if (other.nome != null)
                return false;

        } else if (!nome.equals(other.nome))
            return false;

        if (genero == null) {
            if (other.genero != null)
                return false;

        } else if (!genero.equals(other.genero))
            return false;

        if (tempoEpisodio == null) {

            if (other.tempoEpisodio != null)
                return false;

        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;

        return true;
    }

    @Override
    public int compareTo(Serie s) {

        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), s.getTempoEpisodio());
        int genero = this.getGenero().compareTo(s.getGenero());

        if(tempoEpisodio != 0) {
            return tempoEpisodio;
        }
        else{
            return genero;
        }
        
    }



}


class ComparatoNomeGeneroTempoEpisodio implements Comparator <Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {

        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) {
            return nome;
        }
        
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) {
            return genero;
        }

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
     
    }

}