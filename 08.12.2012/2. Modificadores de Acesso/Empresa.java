class Empresa {

	public Funcionario[] empregados;
	private String cnpj;


	public void adiciona(Funcionario f) {

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

	public void listaFuncionarios() {
		for(int i = 0; i < empregados.length; i++) {
			if(empregados[i] != null) {
				System.out.println("Salario " + empregados[i].getSalario());
			}
			else { break; }

		}

	}

	public String getCNPJ() {
		return this.cnpj;	
	}

	public Funcionario getFuncionario(int pos) {
		return this.empregados[pos];
	}
	
}
