package br.com.bytebankPney.banco.Testes;

public class TesteString {
	public static void main(String[] args) {

		String nome = "Jabrustina";
		String nombre = new String("Jabrustina");

		System.out.println(nome);// objeto literal - boa pratica
		System.out.println(nombre);// objeto normal - má pratica

		String nomeCerto= nome.replace("abrustina", "essi");

		System.out.println(nomeCerto);
		
		String novo = nomeCerto.toUpperCase();
		
		System.out.println(novo);
	}
}
