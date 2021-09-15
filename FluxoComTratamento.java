public class FluxoComTratamento {
	
	public static void main(String[]args) {
		System.out.println("Ini do Main");
		m1();
		System.out.println("Fim do Main");
	}
	
	public static void m1() {
		System.out.println("Ini do M1");
		try {
			m2();
		} catch(ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage(); 
			System.out.println("Exceptions " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do M1");
	}
	
	public static void m2() {
		System.out.println("Ini do m2");	
		throw new ArithmeticException("Deu erro meu nobre");
		//System.out.println("Fim do m2");
	}
	
}
