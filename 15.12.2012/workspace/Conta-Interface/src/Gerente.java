class Gerente extends Funcionario {

	public Gerente(String n) {
		super(n);
	}

	private int senha;
	
	public boolean autentica(int senha) {
		return true;
	}

	public double getBonificacao() {
		return this.salario + 200;
	}
}

