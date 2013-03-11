package br.com.empresa.conta;
public class ContaPoupanca extends Conta {

	public void atualiza(double tx) {
		//this.saldo += this.saldo * ( 3 * tx);
		super.atualiza( 3 * tx );
	}

}
