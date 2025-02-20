package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {			
			imprimirNomeAluno(a1);
		} catch (Exception e) {
			
		}
		
		System.out.println(7 / 0);
		
		System.out.println("Fim!");
	}
	
	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
