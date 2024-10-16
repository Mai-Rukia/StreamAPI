package ExemploStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		
		List<String> palavras = Arrays.asList("Java", "JavaScript", "Python", "C", "Ruby", "Kotlyn");
		
		System.out.println("Lista composta pelas palavras: " + palavras + "\n");
		
		// Criar um Predicate cujo qual deve verificar se a palavra tem mais de 5 caractere
		Predicate<String> cincoCaracteres = palavra -> palavra.length() > 5;
				
		System.out.println("Apresentacao das palavras que tem acima de 5 caracteres");
		palavras.stream()
			.filter(cincoCaracteres) /* Filtra as palavras de dentro de uma List*/
			.forEach(System.out::println); /* Forma simplificada de retornar uma função Lambda */
		
		System.out.println("\nApresentacao das palavras que tem abaixo de 5 caracteres");
		palavras.stream()
			// No método filter, está usando 100% lambda para "chamar" o Predicate e passando o valor desejado para retorno.
			.filter(noCincoCaracteres -> noCincoCaracteres.length() < 5)
			.forEach(System.out::println);
		
	}

}
