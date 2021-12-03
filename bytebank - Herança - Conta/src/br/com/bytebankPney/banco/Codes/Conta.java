package br.com.bytebankPney.banco.Codes;

 public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	/**
	 * Construtor para inicializar o contrato de um objeto a partir de agencia e numero
	 * @param agencia
	 * @param numero
	 */
	
	//CONSTRUTOR
	public Conta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;//Ou seja toda conta começa com 100 reais.
		System.out.println("Estou criando uma conta");
		System.out.println(total);
		total++;
	}
	
	//Getters & MÉTODOS - SALDO
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Valor precisar ser igual ou menor ao saldo
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + "Valor: " + valor);
		} 
			this.saldo -= valor;
		
	}
	public abstract void deposita(double valor);
	
	public void transfere(double valor, Conta troca)throws SaldoInsuficienteException {
		this.saca(valor);
		troca.deposita(valor);
	}
	
	//Getter&Setter - AGENCIA
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) { 
		this.agencia = agencia;
	}
	
	//Getter&Setter - NÚMERO
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//Getter&Setter - TITULAR
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//Getter&Setter - TOTAL
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Conta.total = total;
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + " Agencia: " + this.agencia;
	}
}
