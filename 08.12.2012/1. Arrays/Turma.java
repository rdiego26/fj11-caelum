class Turma {

	Aluno[] alunos;


	double calculaMedia() {

		float soma = 0.0F;
		int qtdAlunos = 0;

		for(int i =0; i < alunos.length; i++) {
			if( alunos[i] != null )	{
				soma += alunos[i].nota;
				qtdAlunos++;
			}
		}

		return soma / qtdAlunos;
	}


}