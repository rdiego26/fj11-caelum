import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TestaPerformance {

	public static void main(String[] args) {
	
		long inicio, fim, tempo_total;
		//Collection<Integer> teste = new ArrayList<>();
		Collection<Integer> teste = new HashSet<>();
		//Map teste = new HashMap();
		
		int total = 300000;
		
		System.out.println("Iniciando inserção...");
		inicio = System.currentTimeMillis();
		for(int i =0; i < total; i++)
		{
			teste.add(i);
		}
		fim = System.currentTimeMillis();
		tempo_total = fim - inicio;
		System.out.println("Tempo gasto com a inserção: " + tempo_total);
		
		System.out.println("\n");
		
		System.out.println("Iniciando busca...");
		inicio = System.currentTimeMillis();		
		for(int i = 0; i < total; i++)
		{
			teste.contains(i);
		}
		fim = System.currentTimeMillis();
		tempo_total = fim - inicio;
		System.out.println("Tempo gasto com a busca: " + tempo_total);		
		
	}
	
}
