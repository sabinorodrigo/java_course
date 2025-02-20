package excecao.personalizadaA;


public class NumeroForaIntervaloException extends RuntimeException {

	private static final long serialVersionUID = -3014530899920482717L;
	
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
	}

}
