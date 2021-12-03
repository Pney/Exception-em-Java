package br.com.bytebankPney.banco.Especial;

import br.com.bytebankPney.banco.Codes.Conta;

public class ContaEspecial extends Conta{
public ContaEspecial(int agencia, int numero) {
	super(agencia, numero);
}
@Override
	public void deposita(double valor) {
		valor += saldo;
	}
}
