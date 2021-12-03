package br.com.bytebankPney.banco.Testes;

import br.com.bytebankPney.banco.Codes.*;

public class TesteTributaveis {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100);
		
		SeguroVida vida = new SeguroVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		
		calc.registra(cc);
		calc.registra(vida);
		
		System.out.println(calc.getTotalImposto());
	}

}
