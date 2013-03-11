class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public void atualiza(double tx) {
		//this.saldo += this.saldo * ( 3 * tx);
		super.atualiza( 3 * tx );
	}

	
	@Override
	public int compareTo(ContaPoupanca outraConta) {
		if(this.getNumero() > outraConta.getNumero() )
			return -1;
		else if (this.getNumero() < outraConta.getNumero() )
			return 1;
		else
			return 0;
	}
}
