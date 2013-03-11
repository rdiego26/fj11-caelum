class ArrayExemplo {
	public static void main(String[] args) {
		float[] notas = new float[4];

		float soma;
		double media;

		for(int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}

		media = soma / notas.length;
		System.out.println("Media: " + media);
	}



}
