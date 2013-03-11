public class TestaConta {
	
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.depositarDinheiro(1000);
		cc.depositarDinheiro(1000);
		cp.depositarDinheiro(1000);
		
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println("Saldo Conta: R$ " + c.getSaldo());
		System.out.println("Saldo Conta Corrente: R$ " + cc.getSaldo());
		System.out.println("Saldo Conta Poupança: R$ " + cp.getSaldo());
		
	}
}
