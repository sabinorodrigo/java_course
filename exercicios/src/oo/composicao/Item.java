package oo.composicao;

public class Item {

	String nome;
	int quantidade;
	double preco;
	
	Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return String.format("%nNome: %s%nQuantidade: %d%nPreco: %.2f%n", nome, quantidade, preco);
	}
}
