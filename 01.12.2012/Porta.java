class Porta {
	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;

	void abre() {
		this.aberta = true;
	}

	void fecha() {
		this.aberta = false;
	}
	
	void pinta(String c) {
		this.cor = c;
	}

	boolean estaAberta() {
		return this.aberta;
	}

	void status() {
		System.out.println("Está aberta: " + this.aberta);
		System.out.println("Cor: " + this.cor);
		System.out.println("dimensaoX: " + this.dimensaoX);		
		System.out.println("dimensaoY: " + this.dimensaoY);
		System.out.println("dimensaoZ: " + this.dimensaoZ);
		System.out.println("--------------");
	}	

}
