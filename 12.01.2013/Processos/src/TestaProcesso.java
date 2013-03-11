public class TestaProcesso {

	public static void main(String[] args) throws InterruptedException {
		
		Processo p1 = new Processo();
		p1.setId(1);
		Thread t1 = new Thread(p1);
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		
		Processo p2 = new Processo();
		p2.setId(2);
		Thread t2 = new Thread(p2);
		t2.start();
				
		Processo p3 = new Processo();
		p3.setId(3);
		Thread t3 = new Thread(p3);
		t3.start();
		
		//Somente após terminarem todas as threads serão executados isso aqui
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Fim do programa");
		
	}
	
}