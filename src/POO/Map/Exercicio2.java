package POO.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class Exercicio2 {
	public static void main(String[] args) {
		/*
		 * Dados as seguintes informações sobre meus livros e seus autores,crei um
		 * dicionário e ordene este dicionário
		 * Nome Autor - Nome Livro páginas
		 */
		System.out.println("Mostre na ordem aleatória");

		Map<String, Livro> meusLivros = new HashMap<>() {
			{
				put("Cialdini, Roberto", new Livro("Armas da Persuação", 250));
				put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
				put("Correia, Cristiane", new Livro("Sonho Grande", 256));
				put("Sir Alex Ferguson", new Livro("My Autobiography", 256));
			}
		};

		for (Entry<String, Livro> livros : meusLivros.entrySet()) {
			System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
		}

		System.out.println("_______________________________________________");
		System.out.println("Ordem Inserção:");
		System.out.println();

		Map<String, Livro> meusLivros2 = new LinkedHashMap<>(meusLivros);

		for (Entry<String, Livro> livros2 : meusLivros2.entrySet()) {
			System.out.println(livros2.getKey() + " - " + livros2.getValue().getNome());
		}

		System.out.println("_______________________________________________");
		System.out.println("Ordem alfabética dos autores:");
		System.out.println();

		Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros);

		for (Entry<String, Livro> livros3 : meusLivros3.entrySet()) {
			System.out.println(livros3.getKey() + " " + livros3.getValue().getNome());
		}

		System.out.println("_______________________________________________");
		System.out.println("Ordem alfabética dos livros");
		System.out.println();

		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());

		meusLivros4.addAll(meusLivros.entrySet());

		for (Entry<String, Livro> livros4 : meusLivros4) {

			System.out.println(livros4.getKey() + " - " + livros4.getValue().getNome());
		}

	}
}

class Livro {
	private String nome;
	private Integer paginas;

	public Livro(String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
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
		Livro other = (Livro) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (paginas == null) {
			if (other.paginas != null)
				return false;
		} else if (!paginas.equals(other.paginas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
	}

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

	@Override
	public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {

		return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
	}
}
