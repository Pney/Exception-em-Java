package br.com.bytebankPney.banco.Testes;

import br.com.bytebankPney.banco.Codes.*;

public class CodeConexao {
	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (Exception ex){
			System.out.println("Deu Erro na Conexao");
		}
		
		
		
		//------------------------------------------------------------------------------------
		//Try basico
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			con.fecha();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu Erro na Conexão");
//		} finally {
//			con.fecha();
//		}
	}
}
