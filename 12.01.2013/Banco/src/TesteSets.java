import java.util.HashMap;
import java.util.HashSet;

public class TesteSets {

	public static void main(String[] args) {

		HashSet<String> lista = new HashSet<String>();
		lista.add("Funcionario 1.");
		lista.add("Funcionario 3.");
		lista.add("Funcionario 2.");
		lista.add("F");
		
		System.out.println( lista.contains("F") );
		
		
		HashMap<Integer, Conta> listaContas = new HashMap<Integer, Conta>();
		Conta c = new Conta();
		c.setNumero(123);
		
		listaContas.put(123, c);
		listaContas.get(123);
		
		for(int chave : listaContas.keySet())
		{
			Conta c1 = listaContas.get(chave);
		}
		
		
		
		
	}
	

	
}