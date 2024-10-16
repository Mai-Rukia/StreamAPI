package ExemploStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		
		/* Para usar o Function */
		// Cria uma lista
		
		List<Integer> numeros = Arrays.asList(2, 4, 6, 8, 10);
		
		// Cria o objeto de função interface Function passando dois tipos (o que vc vai enviar de dados e o que vai ser retonado e armazená-lo na sua List.
		Function<Integer, Integer> multiplicarValor = /*Receber função Lambda */ n -> n * 2;
		
		// Criar outra Lista para receber esses valores multiplicados por (funcao LAMBDA)
		List<Integer> numerosMultiplicados = numeros.stream()
			.map(multiplicarValor)
			.toList();
		
		//Como imprimir este valor já usando o forEach + chamando a lista.
		numerosMultiplicados.forEach(System.out::println);

	}

}
