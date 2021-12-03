package br.com.bytebankPney.banco.Codes;

public class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
