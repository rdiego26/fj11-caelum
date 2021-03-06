class Conta {

	protected double saldo;
	protected int numero;
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public synchronized void deposita(double vlr) {
		this.saldo += vlr;
	}

	public synchronized void sacar(double vlr) {
		this.saldo -= vlr;
	}

	public synchronized void atualiza(double tx) {
		this.saldo += this.saldo * tx;
	}
	
	public synchronized boolean saca(double vlr) {
		
		if(vlr < 0)
			return false;
		
		if(vlr < this.getSaldo()) {
			this.sacar(vlr);
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
	public int compareCom(Conta outraConta) {
		
		if(this.getNumero() > outraConta.getNumero() )
			return -1;
		else if (this.getNumero() < outraConta.getNumero() )
			return 1;
		else
			return 0;
	}
	

	

}
