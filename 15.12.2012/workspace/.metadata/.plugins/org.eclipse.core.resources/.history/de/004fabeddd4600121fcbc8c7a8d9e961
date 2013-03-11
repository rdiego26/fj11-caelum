class Funcionario {

	private static int id = 0;

	private int identificador;
	private String nome;
	private Departamento depto;
	private double salario;
	private Data dataEntrada;
	private String rg;
	private boolean estaNaEmpresa;

	private double getBonificacao() {
		return this.salario + 100;
	}

	private	double calculaGanhoAnual() {
		return this.salario * 12;
	}

	private void demite() {
		this.estaNaEmpresa = false;
	}

	public void informaDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.depto.nome);		
		System.out.println("Salário: " + this.salario);
		System.out.println("Data de Entrada: " + dataEntrada.dia + "/" + dataEntrada.mes + "/" + dataEntrada.ano);
		System.out.println("RG: " + this.rg);
		System.out.println("Está na Empresa? " + this.estaNaEmpresa);
	}

	/* GETTERS AND SETTERS */
	public String getNome() {
		return this.nome;
	}

	public void setNome(String n) {
		this.nome = n;
	}

	public int getIdentificador(){
		return this.identificador;
	}

	public double getSalario() {
		return this.salario;
	}

	/* CONSTRUTORES */
	public Funcionario(String n) {
		this.nome = n;
		this.identificador = id++;
		Funcionario.id = id++;
	}
	
	/*
	public Funcionario() {
		this.identificador = id++;
		id = id++;
	}
	*/


}
