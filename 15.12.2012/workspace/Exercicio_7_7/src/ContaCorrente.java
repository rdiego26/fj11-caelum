public class ContaCorrente extends Conta {

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	public void depositarDinheiro(double vlr) {
		this.saldo += vlr - 0.10;
	}
	
}
