package view;

public class VisualizaPedidoProduto extends Visualizar{
	@Override
	public void showDetails(String data) {
		System.out.print("Pedido-Produto: ");
		super.showDetails(data);
	}
}
