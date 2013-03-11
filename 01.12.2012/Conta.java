class Conta {
	public static voida main(String args[]) {

	}

	int numero;
	String titular;
	double saldo;
	String tipo;


	void depositar(double valor) {
		saldo += valor + saldo;
	}

	boolean sacar(double valor {
			
		if( saldo >= valor ) {
			saldo -= valor;
			return true;

		} else {
			return false;
		}			
		return saldo;
	}
	
}
