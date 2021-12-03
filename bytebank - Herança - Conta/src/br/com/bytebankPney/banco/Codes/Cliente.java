package br.com.bytebankPney.banco.Codes;

public class Cliente {
	private String nome;
	private long cpf;
	private String profissao;
	private String cargo;
	private int idade;
	
	/**
	* Classe que vai representar um Cliente no bytebank.
	* @author Thiago
	* @version 0.1
	* @return
	*/
	
		//Getter & Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Getter & Setters
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	//Getter & Setters
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	//Getter & Setters
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	//Getter & Setters
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}