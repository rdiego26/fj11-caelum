class TestaPorta {
	public static void main(String[] args) {

		Porta p;

		p = new Porta();

		p.aberta = false;
		p.cor = "AZUL";
		p.dimensaoX = 35;
		p.dimensaoY = 44;
		p.dimensaoZ = 64;
		p.status();

		p.pinta("AMARELO");
		p.abre();
		p.status();

		p.pinta("VERMELHO");
		p.fecha();
		p.status();

	}
}