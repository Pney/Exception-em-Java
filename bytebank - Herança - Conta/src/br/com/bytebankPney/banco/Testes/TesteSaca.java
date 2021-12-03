package br.com.bytebankPney.banco.Testes;

import br.com.bytebankPney.banco.Codes.*;

public class TesteSaca {
	public static void main(String []args) {
		
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200.0);
		System.out.println(conta.getSaldo());
		
		try {
			conta.saca(210.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Exception " + ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println(conta.getSaldo());
		
	}
}
