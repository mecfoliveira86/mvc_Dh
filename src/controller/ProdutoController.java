package controller;

import model.Produto;
import view.VisualizaProduto;

public class ProdutoController {

		private Produto model;
		private VisualizaProduto view;

		public ProdutoController(Produto model, VisualizaProduto view) {
			this.model = model;
			this.view = view;
		}

		public String getProductNome() {
			return model.getNome();
		}

		public void setProductName(String nome) {
			model.setNome(nome);
		}

		public String getProductDescricao() {
			return model.getDescricao();
		}

		public void setProductDescricao(String descricao) {
			model.setDescricao(descricao);
		}

		public int getProductEstoque() {
			return model.getEstoque();
		}

		public void setProductEstoque(int estoque) {
			model.setEstoque(estoque);
		}

		public double getProductPreco() {
			return model.getPreco();
		}

		public void setProductPreco(double preco) {
			model.setPreco(preco);
		}

		public int getProductId() {
			return model.getId();
		}
		
		public void updateView() {
			view.showDetails(model.toString());
		}
}
