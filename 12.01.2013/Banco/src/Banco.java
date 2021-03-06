import java.util.ArrayList;

public class Banco {

	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public void abre(Conta c) {
		this.contas.add(c);
	}
	
	public Conta acha(int numero) {
		return this.contas.get(contas.indexOf(numero));
	}
	
	public void encerrar(int numero) {
		this.contas.remove(contas.indexOf(numero));
	}
	
}
