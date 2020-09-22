package view;

public class VisualizaCliente extends Visualizar{
	@Override
	public void showDetails(String data) {
		System.out.print("Cliente: ");
		super.showDetails(data);
	}
}
