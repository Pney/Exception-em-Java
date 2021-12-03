public class CodeSistema {
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente(2222);
		g.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		Autenticavel referenciaGerente = new Gerente(222);
		Autenticavel referenciaAdm = new Administrador();
		Autenticavel referenciaCliente = new Cliente();
		
		//A senha correta para ter acesso ao SistemaInterno é 2222
		referenciaGerente.setSenha(22232);
		si.autentica(referenciaGerente);
		
		referenciaAdm.setSenha(2222);
		si.autentica(referenciaAdm);
		
		referenciaCliente.setSenha(24222);
		si.autentica(referenciaCliente);
		
		
	}
}
