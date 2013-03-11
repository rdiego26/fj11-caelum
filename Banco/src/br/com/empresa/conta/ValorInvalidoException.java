package br.com.empresa.conta;
public class ValorInvalidoException extends RuntimeException {
	
	public ValorInvalidoException(double vlr) {
		super("Valor inválido " + vlr);
	}
}
