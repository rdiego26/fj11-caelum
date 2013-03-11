class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f1;
		Funcionario f2;		
		Departamento dp;
		Data dt;	

		dt = new Data();
		dt.ano = 2012;
		dt.dia = 01;
		dt.mes = 12;
		
		dp = new Departamento();
		dp.nome = "Desenvolvimento WEB";

		f1 = new Funcionario();
		f1.nome = "Diego";
		f1.depto = dp; 
		f1.salario = 4500.00;
		f1.dataEntrada = dt;
		f1.rg = "010101";
		f1.estaNaEmpresa = true;
	
		f2 = new Funcionario();
		//f2 = f1;
		f2.nome = "Amanda";
		f2.depto = dp; 
		f2.salario = 6000.00;
		f2.dataEntrada = dt;
		f2.rg = "010101";
		f2.estaNaEmpresa = true;

		/*
		if ( f1 == f2 )
		{
			System.out.println("São iguais");
		}
		else
		{
			System.out.println("São diferentes");
		}
		*/

		//f.bonifica(100.00);

		f1.informaDados();
		System.out.println("Ganho anual: " + f1.calculaGanhoAnual() );
		
		System.out.println("----------------------------");		

		f2.demite();		
		f2.informaDados();
		System.out.println("Ganho anual: " + f2.calculaGanhoAnual() );
		

	}


}
