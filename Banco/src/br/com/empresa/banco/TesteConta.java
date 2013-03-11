package br.com.empresa.banco;
import br.com.empresa.conta.Conta;
import br.com.empresa.conta.ContaCorrente;
import br.com.empresa.conta.ContaPoupanca;
import br.com.empresa.conta.ValorInvalidoException;

class TesteConta {

	public static void main(String[] args) throws ValorInvalidoException {
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		//Conta cc = new ContaCorrente();
		//Conta cp = new ContaPoupanca();


		c.deposita(1000);
		c.setNomeTitular("Ramos");
		
		cc.deposita(1000);
		cp.deposita(1000);

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		/*
		System.out.println("Saldo Conta: " + c.getSaldo() );
		System.out.println("Saldo Conta Corrente: " + cc.getSaldo() );
		System.out.println("Saldo Conta Poupança: " + cp.getSaldo() );
		*/
		
		
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		System.out.println(c2.toString());
		
		if (c1 != c2)
		{
			System.out.println("Contas diferentes!");
		}
	
	}

}
