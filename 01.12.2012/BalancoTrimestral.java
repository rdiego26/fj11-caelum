class BalancoTrimestral {

	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

		double mediaMensal;

		mediaMensal = gastosTrimestre / 3;

		System.out.println("Gastos Trimestre: " + gastosTrimestre);

		System.out.println("Média Mensal: " + mediaMensal);
	}

}
