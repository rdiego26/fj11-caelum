class TestaEmpresa {

	public static void main(String[] args) {
		Empresa emp = new Empresa();
		Funcionario f;	
		/*
		String nome;
		Departamento depto;
		double salario;
		Data dataEntrada;
		String rg;
		boolean estaNaEmpresa;
		*/

		for(int i = 0; i < 10; i++) {
			f = new Funcionario();
			f.salario = (1000 * i) + 500;
			emp.adiciona(f);	
		}

		emp.listaFuncionarios();
	}
}