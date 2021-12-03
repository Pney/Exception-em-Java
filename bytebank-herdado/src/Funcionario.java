public abstract class Funcionario {
	private String Nome;
	private String Cpf;
	private double Salario;
	
	public abstract double getBonificacao();
	
	//Getters&Setters - NOME
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	//Getters&Setters - CPF
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	
	//Getters&Setters - SALARIO
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	
	
	
}
