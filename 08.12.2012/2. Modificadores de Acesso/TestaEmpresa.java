class TestaEmpresa {

	public static void main(String[] args) {
		Empresa emp = new Empresa();
		Funcionario[] funcs = new Funcionario[10];

		emp.empregados = funcs;

		Funcionario f1 = new Funcionario("Ana");
		Funcionario f2 = new Funcionario("Alessandra");


		emp.adiciona(f1);
		emp.adiciona(f2);

		System.out.println("Nome do funcionário solicitado: " + emp.getFuncionario(1).getNome() );

	}
}
