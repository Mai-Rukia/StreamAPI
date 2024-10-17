package ProjetoBcoDigital;

import java.util.List;

import ProjetoBcoDigital.entities.Contas;

public class Banco {
	
	//Criando a lista para compor o banco
	private List<Contas> contas;	
	
	
	private String nome, sobrenome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	
	
	public List<Contas> getContas() {
		return contas;
	}
	
	public void setContas(List<Contas> contas) {
		this.contas = contas;
	}
}
