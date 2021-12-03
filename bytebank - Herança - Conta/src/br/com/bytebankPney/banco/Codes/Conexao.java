package br.com.bytebankPney.banco.Codes;

public class Conexao implements AutoCloseable{
	public Conexao() {
		System.out.println("Abrindo Conexão");
	}
	public void leDados() {
		System.out.println("Recebendo Dados");
	}
	@Override
	public void close() throws Exception {
		System.out.println("Encerrando Conexão");
	}
}
