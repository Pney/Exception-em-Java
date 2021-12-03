package br.com.bytebankPney.banco.Testes;

import br.com.bytebankPney.banco.Codes.*;

public class Testes {
	public static void main(String[] args) {
		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupança(11, 44);
		
		System.out.println(cc);
		System.out.println(cp);
	}
}
