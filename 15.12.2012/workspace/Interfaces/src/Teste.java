
public class Teste {

		public static void main(String[] args) {
			
			AreaCalculavel ar = new Retangulo(3, 2);
			System.out.println("Área calculada(Retângulo): " + ar.calculaArea());
			
			AreaCalculavel aq = new Quadrado(3);
			System.out.println("Área calculada(Quadrado): " + aq.calculaArea());

			AreaCalculavel ac = new Circulo(9);
			System.out.println("Área calculada(Círculo): " + ac.calculaArea());			
			
		}
	
}
