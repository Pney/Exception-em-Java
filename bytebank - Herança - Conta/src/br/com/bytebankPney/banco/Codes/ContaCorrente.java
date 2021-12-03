package br.com.bytebankPney.banco.Codes;
public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super (agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		if(valor > 0) {
			double novoValor = valor + 0.2;
			super.saca(novoValor);
		}
	}
	@Override
	public void deposita(double valor) {
		if(valor >= 0) {
			super.saldo += valor;
		}
		
	}
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.01;
	}
	@Override
	public String toString() {
		return "Conta Poupança: " + super.toString();
	}
}
