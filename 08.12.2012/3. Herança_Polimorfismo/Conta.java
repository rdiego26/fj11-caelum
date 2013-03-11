class Conta {

	protected double saldo;
	

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double vlr) {
		this.saldo += vlr;
	}

	public void sacar(double vlr) {
		this.saldo -= vlr;
	}

	public void atualiza(double tx) {
		this.saldo += this.saldo * tx;
	}

}
