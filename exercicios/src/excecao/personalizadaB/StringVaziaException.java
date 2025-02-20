package excecao.personalizadaB;


public class StringVaziaException extends Exception {

	private static final long serialVersionUID = -3014530899920482717L;
	
	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está vazio", nomeDoAtributo);
	}

}
