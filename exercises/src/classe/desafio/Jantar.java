package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.400);
		Comida c2 = new Comida("Feijao", 0.200);
		
		Pessoa p1 = new Pessoa("Dark Magician", 70.8);
		
		System.out.println("Before: " + p1);
		
		p1.comer(c1);
		p1.comer(c2);
		
		System.out.println("After: " + p1);
		
		
	}
}
