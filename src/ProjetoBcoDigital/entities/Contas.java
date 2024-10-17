package ProjetoBcoDigital.entities;

import ProjetoBcoDigital.Cliente;

public class Contas {
	
		protected int agencia;
		protected int conta;
		protected double saldo;
		private Cliente cliente;
	
		// Criar um método statico para agencia
		private static final int AGENCIA_PADRAO = 0001;
		private static int Sequencial = 000003;
		
		// Construtor
		public Contas(Cliente cliente) {
			this.agencia = Contas.AGENCIA_PADRAO;
			this.conta = Sequencial++ * 3 - 1;
			this.cliente = cliente;
		}
		
			/*
		 * protected = modificador de acesso;
		 * int/String/Double/etc é um tipo
		 * nome que vc dá para o tipo é uma variável
		 * */

		
		
		//Usar o get para apresentar somente agencia e conta. O saldo é depois por conta da manipulação de valores
		
		public int getAgencia() {
			return agencia;
		}
		
		public int getConta() {
			return conta;
		}
		
		
		
		// Métodos de usabilidade na classe Banco.
		public void sacarValor(double valor) {
			this.saldo -= valor;
		}
		
		public void transferirValor(double valor, Contas contaDestino) {
			this.sacarValor(valor);
			contaDestino.depositoValor(valor);
		}
		
		public void depositoValor(double valor) {
			this.saldo += valor;
		}
		
		
		//Imprimir informações
		protected void imprimirExtratoCliente() {
			System.out.println(String.format("Titular: %s", this.cliente.getNome()));
			System.out.println(String.format("Agecia: %d", this.agencia));
			System.out.println(String.format("Conta: %d", this.conta));
			System.out.println(String.format("Saldo: %.2f", this.saldo));
		}
}
