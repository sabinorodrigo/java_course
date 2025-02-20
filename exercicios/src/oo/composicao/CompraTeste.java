package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "Celtic Guardian";
		c1.itens.add(new Item("Espada", 1, 1500.00));
		c1.itens.add(new Item("Bainha", 1, 600.00));
		c1.itens.add(new Item("Botas", 1, 350.00));
		c1.itens.add(new Item("Helmo", 1, 650.00));
		
		System.out.println("Compras de Celtic Guardian");
		c1.itens.forEach(System.out::println);
		System.out.println("Total da compra: R$" + c1.obterValorTotal());
		// System.out.println(c1.itens);
	}
}
