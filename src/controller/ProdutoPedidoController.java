package controller;

import model.ProdutoPedido;
import view.VisualizaPedidoProduto;

public class ProdutoPedidoController {

		private ProdutoPedido model;
		private VisualizaPedidoProduto view;
		
		public ProdutoPedidoController(ProdutoPedido model, VisualizaPedidoProduto view) {
			this.model = model;
			this.view = view;
		}
		
		public int getOrderProductFkProduto() {
			return model.getFkProduto();
		}
		
		public String getOrderProductFkPedido() {
			return model.getFkPedido();
		}
		
		public int getOrderProductProdutoQuantidade() {
			return model.getProdutoQuantidade();
		}
		
		public void updateView() {
			view.showDetails(model.toString());
		}
}
