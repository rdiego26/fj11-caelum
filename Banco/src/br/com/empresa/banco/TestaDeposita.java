package br.com.empresa.banco;
import javax.management.RuntimeErrorException;

import br.com.empresa.conta.ContaPoupanca;
import br.com.empresa.conta.ValorInvalidoException;

public class TestaDeposita {

	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca();
		
		try {
		cp.deposita(-10);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		//System.out.println(Runtime.getRuntime().maxMemory());
		
	}
}
