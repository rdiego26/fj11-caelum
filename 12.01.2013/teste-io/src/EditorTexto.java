import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class EditorTexto {

	public static void main(String[] args) throws IOException {
			
			InputStream is = System.in;
			Scanner entrada = new Scanner(is);
			
			OutputStream os = new FileOutputStream("saida_editorTexto.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			while(entrada.hasNext())
			{
				bw.write(entrada.next());
			}
			
			is.close();
			bw.close();
			
		}		
	}
