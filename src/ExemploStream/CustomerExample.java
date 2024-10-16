package ExemploStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CustomerExample {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		//Interface Consumer com expressão Lambda (predicatos)
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if (numero % 2 == 0) {
				System.out.println(numero); /* A expressão la de baixo executa esse código aqui*/
			}
		};
		
		Consumer<Integer> imprimirNumeroImpar = n -> {
			if (n % 2 != 0) {
				System.out.println(n);
			}
		};
		
		System.out.println("Abaixo estao os numeros pares");
		// Usando o Consumer para imprimir os numeros pares no Stream
		numeros.stream().forEach(imprimirNumeroPar);
		
		System.out.println("Abaixo estao os numeros impares");
		numeros.stream().forEach(imprimirNumeroImpar);

	}

}
