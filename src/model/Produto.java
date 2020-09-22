package model;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private int estoque;
	private double preco;

	
	public Produto(int id, String nome, String descricao, int estoque, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.estoque = estoque;
		this.preco = preco;
	}
	
		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return String.format(
				"{ \"id\": %d, \"nome\": \"%s\", \"descricao\": \"%s\", \"estoque\": %d, \"preco\": %.2f }", 
				id, nome, descricao, estoque, preco);
	}

}
