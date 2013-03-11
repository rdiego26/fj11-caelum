/**
 * @author Diego Ramos
 * @version 0.1
 * */
public class ControleBonificacao {

	private double totalBonificacao;
	
	public void registra(Funcionario f) {
		this.totalBonificacao = f.getBonificacao();
	}
	
	public double getBonificacao() {
		return this.totalBonificacao;
	}
	
}
