class Empresa {

	Funcionario[] empregados;
	String cnpj;


	void adiciona(Funcionario f) {

		if ( empregados == null ) {
			empregados = new Funcionario[100];
		}
		
		for(int i =0; i < empregados.length; i++) {
			if(empregados[i] == null) {
				empregados[i] = f;
				break;
			}
		}

	}

	void listaFuncionarios() {
		for(int i = 0; i < empregados.length; i++) {
			if(empregados[i] != null) {
				System.out.println("Salario " + empregados[i].salario);
			}
			else { break; }

		}

	}

}
