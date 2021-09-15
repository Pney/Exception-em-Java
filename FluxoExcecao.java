public class FluxoExcecao {
	
	public static void main(String[]args) throws MinhaExcecao {
		System.out.println("Ini do Main");
		m1();
		System.out.println("Fim do Main");
	}
	
	public static void m1() throws MinhaExcecao {
		System.out.println("Ini do M1");
		try {
			m2();
		} catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage(); 
			System.out.println("Exceptions " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do M1");
	}
	
	public static void m2() throws MinhaExcecao {
		System.out.println("Ini do m2");	
		throw new MinhaExcecao("Hello, Your Computer has Virus");
		//System.out.println("Fim do m2");
	}
}
