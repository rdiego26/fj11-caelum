public abstract class Conta {
	
	//Atributos
	protected double saldo;

	public void depositarDinheiro(double vlr) {
		this.saldo += vlr;
	}
	
	public void saca(double vlr) {
		this.saldo -= vlr;
	}
	
	public abstract void atualiza(double taxa);
	/*
	{
		this.saldo += this.saldo * taxa;		
	}
	*/
	
	public double getSaldo() {
		return saldo;
	}
	
}