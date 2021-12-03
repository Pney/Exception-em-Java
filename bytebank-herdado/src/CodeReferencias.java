public class CodeReferencias{
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente(1212);
		g.setNome("Marcos");
		g.setSalario(4600.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Gabriel");
		ev.setSalario(2200.0);
	
		Designer d = new Designer();
		d.setNome("Rafaela");
		d.setSalario(2600.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}
}
