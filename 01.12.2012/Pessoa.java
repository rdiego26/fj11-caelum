class Pessoa {
	String nome;
	int idade;

	void fazAniversario() {
		this.idade += 1;
	}

	void seApresente() {
		System.out.println("Meu nome é " + this.nome + " e tenho " + this.idade + " anos de idade." );
	}
}
