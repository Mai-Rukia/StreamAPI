package ProjetoBcoDigital;

import ProjetoBcoDigital.entities.Contas;

public class Usuario {

	public static void main(String[] args) {
		
		Cliente ruth = new Cliente();
		ruth.setNome("Ruth");
		ruth.setSobrenome("Araujo");
		
		// Instanciar o objeto Contas
		Contas cc = new ContaCorrente(ruth);
		Contas cpoup = new ContaPoupanca(ruth);
		
		
		
		System.out.println("Incluir saldo na conta corrente.");
		cc.depositoValor(500);
		((ContaCorrente) cc).imprimirExtrato();
		
		System.out.println("Transfencia para conta poupança.");
		cc.transferirValor(275, cpoup);
		((ContaCorrente) cc).imprimirExtrato();
		((ContaPoupanca) cpoup).imprimirExtrato();
		
	}

}
