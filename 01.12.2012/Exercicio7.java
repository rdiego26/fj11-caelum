class Exercicio7 {
	public static void main(String[] args) {	

		int x = 13;

		while(x != 1) {
		
			if ( (x % 2) == 1) {
				x = x / 2;
			}
			else if ( (x % 3) == 1) {
				x = (3 * x) + 1;
			}

			System.out.println("x -> " + x);
		}
	}
}
