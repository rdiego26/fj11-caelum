package br.com.empresa.sistema;
import br.com.empresa.conta.Conta;

public class AtualizadorDeContas {

	private double saldoTotal = 0.0;
	private double selic ;


	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}


	public void roda(Conta c) {
		System.out.println("Saldo anterior: [ " + c.getClass().getName() + " ] " + c.getSaldo() );
		c.atualiza(this.selic);
		System.out.println("Saldo atualizado: [ " + c.getClass().getName() + " ] " + c.getSaldo() );
		this.saldoTotal += c.getSaldo();
	}


	
}
