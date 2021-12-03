package br.com.bytebankPney.banco.Testes;

import br.com.bytebankPney.banco.Codes.*;

public class Code {
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(123, 1546);
		cc.deposita(500);
		
		ContaPoupança cp = new ContaPoupança(142, 1567);
		cp.deposita(500);//Mais 100 reais por padrão, por ter criado uma conta.
		System.out.println();
		
		System.out.println("Valor CC: " + cc.getSaldo());
		System.out.println("Valor CP: " + cp.getSaldo());
		System.out.println();
		
		cc.transfere(350, cp);
		System.out.println();
		System.out.println("Valor 2° CC: " + cc.getSaldo());
		System.out.println("Valor 2° CP: " + cp.getSaldo());
		System.out.println();
		
		cc.saca(100);
		System.out.println(cc.getSaldo());
	}
}
