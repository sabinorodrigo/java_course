package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		System.out.println("Minha data");
		Data d1 = new Data(12, 4, 1988);
		System.out.println(d1.obterDataFormatado() + "\n");
		
		System.out.println("Data mãe");
		var d2 = new Data(10, 9, 1956);
		System.out.println(d2.obterDataFormatado() + "\n");
		
		System.out.println("Com valores definidos por padrão");
		Data d3 = new Data();
		System.out.println(d3.obterDataFormatado());
		
		System.out.println();
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}
}
