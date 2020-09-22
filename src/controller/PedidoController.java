package controller;

import model.Pedido;
import view.VisualizaPedidoProduto;

public class PedidoController {

		private Pedido model;
		private VisualizaPedidoProduto view;

		public PedidoController(Pedido model, VisualizaPedidoProduto view) {
			this.model = model;
			this.view = view;
		}
		
		public String getOrderNota() {
			return model.getNota();
		}
		
		public void setOrderEi(String nota) {
			model.setNota(nota);
		}
		
		public String getOrderDataEmissao() {
			return model.getDataEmissao();
		}
		
		public void setOrderDataEmissao(String dataEmissao) {
			model.setDataEmissao(dataEmissao);
		}
		
		public String getOrderStatus() {
			return model.getStatus();
		}
		
		public void setOrderStatus(String status) {
			model.setStatus(status);
		}
		
		public double getOrderTotal() {
			return model.getTotal();
		}
		
		public int getOrderFkCliente() {
			return model.getFkCliente();
		}
		
		public void updateView() {
			view.showDetails(model.toString());
		}

}
