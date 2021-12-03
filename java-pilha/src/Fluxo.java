public class Fluxo {
	
	public static void main(String[]args) {
		System.out.println("Ini do Main");
		m1();
		System.out.println("Fim do Main");
	}
	
	public static void m1() {
		System.out.println("Ini do M1");
		try {
			m2();
		} catch(Exception ex) {
			String msg = ex.getMessage(); 
			System.out.println("Exceptions " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do M1");
	}
	
	public static void m2() {
		System.out.println("Ini do m2");	
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			int bug = i / 0;
			//Conta C = null;
			//C.deposita();
		}
		System.out.println("Fim do m2");
	}
	
}
