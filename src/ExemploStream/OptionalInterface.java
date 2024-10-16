package ExemploStream;

import java.util.Optional;

public class OptionalInterface {

	public static void main(String[] args) {
		
		Optional<String> optionalValue = Optional.ofNullable(null);
		// orElseGet() – Semelhante a orElse(), mas aceita um fornecedor que só é executado se o valor não estiver presente.
		String result = optionalValue.orElseGet(() -> "Value from Supplier");
		System.out.println(result);
		
		
		Optional<String> optionalValues = Optional.empty();
		// isPresent() – Verifica se o Optional contém um valor - booleano.
		System.out.println(optionalValues.isPresent());
		
		
		Optional<String> optionalValue1 = Optional.ofNullable(null);
		//orElseThrow() – Lança uma exceção se o valor não estiver presente.
		String result1 = optionalValue1.orElseThrow(() -> new RuntimeException("Value not present"));
	}

}
