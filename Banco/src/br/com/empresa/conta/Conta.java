package br.com.empresa.conta;

public class Conta {

	protected double saldo;
	protected String nomeTitular;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double vlr) throws ValorInvalidoException {
		
		if ( vlr < 0){
			throw new ValorInvalidoException(vlr);
		}
		else {
			this.saldo += vlr;			
		}
	}

	public void sacar(double vlr) {
		this.saldo -= vlr;
	}

	public void atualiza(double tx) {
		this.saldo += this.saldo * tx;
	}
	
	public boolean saca(double vlr) {
		
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

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	@Override
	public String toString() {
		return "Titular: " + this.getNomeTitular() + "\n" + "Saldo: " + this.getSaldo();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Conta) {
			return false;
		}
		
		Conta outraConta = (Conta) obj;
		
		if(this.saldo != outraConta.saldo){
			return false;
		}
		
		return true;
		
	}

}
