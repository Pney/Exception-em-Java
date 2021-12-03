public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	private AutenticacaoUtil autenticador;
	
	public Gerente(int autenticador) {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	public boolean autenticado = autentica(4242);
	
	public double getBonificacao() {
		System.out.println("Bonificacao de um Gerente");
		return this.getSalario(); //pode haver um erro
	}
	
    public boolean autentica(String login, int senha) {
    	return true;
    }
    //Temos dois metodos com o mesmo nome de autentica, cada uma tendo quantidades de parametros diferentes
}    
