import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaOrdenacao {

	public static void main(String[] args) {
		
		List<ContaPoupanca> contas = new LinkedList<>();
		
		
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(18786);
		contas.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(1786);
		contas.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(5556);
		contas.add(c3);

		
		//Collections.reverseOrder();
		Collections.sort(contas);
		Collections.rotate(contas, 4);
		
		for(int i =0; i < contas.size();i++) {
			Conta atual = contas.get(i);
			System.out.println("Número: " + atual.getNumero());
		}
		
	}
	
	
}
