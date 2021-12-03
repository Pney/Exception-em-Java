package br.com.bytebankPney.banco.Codes;

public class ContaPoupan�a extends Conta{
	
	public ContaPoupan�a(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		if(valor >= 0) {
			saldo += valor;
		}
	}
	@Override
	public String toString() {
		return "Conta Poupan�a: " + super.toString();
	}
}
