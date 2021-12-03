public class CodeGerente{
	public static void main(String[] args) {
		
		
		Gerente fernando = new Gerente(222);
		fernando.setCpf("321567849");
		fernando.setNome("Fernando");
		fernando.setSalario(4856.0);
		
		System.out.println("Nome: " + fernando.getNome());
		System.out.println("CPF: " + fernando.getCpf());
		System.out.println("Salario: " + fernando.getSalario());
		
		fernando.setSenha(4242);
		System.out.println(fernando.autentica(4242));
		
		System.out.println(fernando.getBonificacao());
		
		//Temos dois metodos chamados autentica na aba de Gerente
		//Cada um com parametros diferentes, e dependendo de como eu colocar os parametros, sera qual dos metodos que sera usado.
		//Esse métodos é chamado de SOBRECARGA
		fernando.autentica(123);
		fernando.autentica("Carlos", 123);
		
		
	}
}
