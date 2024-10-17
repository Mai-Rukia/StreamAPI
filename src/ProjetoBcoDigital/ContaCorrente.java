package ProjetoBcoDigital;

import ProjetoBcoDigital.entities.Contas;

public class ContaCorrente extends Contas {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.println("== Extrato conta corrente ==");
		super.imprimirExtratoCliente();
	}
	
}
