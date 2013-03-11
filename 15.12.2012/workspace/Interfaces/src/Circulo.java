
public class Circulo implements AreaCalculavel {

	private int raio;

	public Circulo(int r) {
		this.raio = r;
	}
	
	public double calculaArea() {
		return Math.PI * this.raio * this.raio;
	}
	
	
}
