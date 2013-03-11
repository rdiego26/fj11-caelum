class ContaCorrente extends Conta {
	
	public void atualiza(double tx) {
		//this.saldo += this.saldo * ( 2 * tx);
		super.atualiza( ( 2 * tx) );
	}	


	public void deposita(double vlr) {
		this.saldo += vlr - 0.10;
	}

}
