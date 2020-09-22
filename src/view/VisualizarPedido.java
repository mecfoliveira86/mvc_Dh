package view;

public class VisualizarPedido extends Visualizar{
	@Override
	public void showDetails(String data) {
		System.out.print("Pedido: ");
		super.showDetails(data);
	}
}
