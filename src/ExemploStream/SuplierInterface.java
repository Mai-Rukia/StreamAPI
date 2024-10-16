package ExemploStream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SuplierInterface {

	public static void main(String[] args) {
		
		Supplier<String> saudacoes = () -> "Venha ver isso aqui!";
		
		List<String> ListaSaudacoes = Stream.generate(saudacoes)
				.limit(3)
				.toList();
		
		//ListaSaudacoes.forEach(arg -> System.out.println(arg));
		ListaSaudacoes.forEach(System.out::println);
		
		/*
		 * Neste cenário abaixo, não seria necessário passar o Supplier dentro do Stream.generate, apenas pela função LAMBDA ja daria certo
		 * 
		 * List<String> ListaSaudacoes = Stream.generate(() -> "Venha ver isso aqui!";)
		 * .limit(3)
		 * .toList(); ...
		 * ListaSaudacoes.forEach(System.out::println);
		 */
	}
}


