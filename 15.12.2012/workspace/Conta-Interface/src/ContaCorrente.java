class ContaCorrente implements Tributavel, Conta {
	
	private double saldo;
	
	/* (non-Javadoc)
	 * @see Conta#atualiza(double)
	 */
	@Override
	public void atualiza(double tx) {
		this.saldo += this.saldo * ( 2 * tx);
	}	

	/* (non-Javadoc)
	 * @see Conta#deposita(double)
	 */
	@Override
	public void deposita(double vlr) {
		this.saldo += vlr - 0.10;
	}
	
	/* (non-Javadoc)
	 * @see Conta#calculaTributos()
	 */
	@Override
	public double calculaTributos() {
		return getSaldo() * 0.01;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

}
