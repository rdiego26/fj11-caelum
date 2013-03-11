class Funcionario {

	String nome;
	Departamento depto;
	double salario;
	Data dataEntrada;
	String rg;
	boolean estaNaEmpresa;

	void bonifica(double bonus) {
		this.salario += bonus;
	}

	double calculaGanhoAnual() {
		return this.salario * 12;
	}

	void demite() {
		this.estaNaEmpresa = false;
	}

	void informaDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.depto.nome);		
		System.out.println("Salário: " + this.salario);
		System.out.println("Data de Entrada: " + dataEntrada.dia + "/" + dataEntrada.mes + "/" + dataEntrada.ano);
		System.out.println("RG: " + this.rg);
		System.out.println("Está na Empresa? " + this.estaNaEmpresa);
	}

}
