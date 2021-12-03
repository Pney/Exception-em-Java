public class CodeFuncionario {
	public static void main(String[] args) {

		Funcionario ev1 = new EditorVideo();
		ev1.setCpf("12041563");
		ev1.setNome("Carlos");
		ev1.setSalario(2700.0);
		
		System.out.println("CPF: " + ev1.getCpf()); System.out.println();
		
		System.out.println("Nome: " + ev1.getNome()); System.out.println();
		
		System.out.println("Salario: " + ev1.getSalario()); System.out.println();
		
		System.out.println("Bonificação: " + ev1.getBonificacao()); System.out.println();
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		
		Gerente gerente = new Gerente(222);
		gerente.setSalario(5000);
		System.out.println(gerente.getBonificacao());
		
		EditorVideo ev = new EditorVideo();
		System.out.println(ev.getBonificacao());
		
		Designer design = new Designer();
		System.out.println(design.getBonificacao());
		
	}
}
