package ProjetoBcoDigital;

import ProjetoBcoDigital.entities.Contas;

public class ContaPoupanca extends Contas {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.println("== Extrato conta poupanca ==");
		super.imprimirExtratoCliente();
	}

}
