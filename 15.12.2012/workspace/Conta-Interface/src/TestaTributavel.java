
public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println("[" + cc.getClass().getName() + "] " + cc.calculaTributos());
		
		//Polimorfismo
		Tributavel t = cc;
		System.out.println("[" + cc.getClass().getName() + "] " + t.calculaTributos());
	}
	
}