import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class TesteScanner {


	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		PrintStream ps = new PrintStream("/home/oo3134/Diego Ramos/12.01.2013/testeLeituraEscrita/arquivo.txt");

		while(scan.hasNextLine() ) {
			ps.println(scan.nextLine() );
		}
		
		scan.close();
		scan.close();
		
	}
	

	
}
