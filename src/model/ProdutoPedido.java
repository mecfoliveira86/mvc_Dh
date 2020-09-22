package model;

public class ProdutoPedido {
	
	private int fkProduto;
	private String fkPedido;
	private int produtoQuantidade;

	public ProdutoPedido(int fkProduto, String fkPedido, int produtoQuantidade) {
		super();
		this.fkProduto = fkProduto;
		this.fkPedido = fkPedido;
		this.produtoQuantidade = produtoQuantidade;
	}	

	public int getFkProduto() {
		return fkProduto;
	}

	public void setFkProduto(int fkProduto) {
		this.fkProduto = fkProduto;
	}

	public String getFkPedido() {
		return fkPedido;
	}

	public void setFkPedido(String fkPedido) {
		this.fkPedido = fkPedido;
	}

	public int getProdutoQuantidade() {
		return produtoQuantidade;
	}

	public void setProdutoQuantidade(int produtoQuantidade) {
		this.produtoQuantidade = produtoQuantidade;
	}

	@Override
	public String toString() {
		return String.format("{ \"fk_product\": %d, \"fk_order\": \"%s\", \"product_quantity\": %d }", 
				fkProduto, fkPedido, produtoQuantidade);
	}

}
