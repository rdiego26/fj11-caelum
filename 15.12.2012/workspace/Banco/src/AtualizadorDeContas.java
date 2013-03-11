class AtualizadorDeContas {

	private double saldoTotal = 0.0;
	private double selic ;


	AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}


	void roda(Conta c) {
		System.out.println("Saldo anterior: [ " + c.getClass().getName() + " ] " + c.getSaldo() );
		c.atualiza(this.selic);
		System.out.println("Saldo atualizado: [ " + c.getClass().getName() + " ] " + c.getSaldo() );
		this.saldoTotal += c.getSaldo();
	}


	
}
