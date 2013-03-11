package br.com.empresa.conta;
import br.com.empresa.banco.outros.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
	
	public void atualiza(double tx) {
		//this.saldo += this.saldo * ( 2 * tx);
		super.atualiza( ( 2 * tx) );
	}	

	@Override
	public void deposita(double vlr) throws ValorInvalidoException {
		super.deposita(vlr - 0.10);
	}
	
	public double calculaTributos() {
		return getSaldo() * 0.01;
	}

}
