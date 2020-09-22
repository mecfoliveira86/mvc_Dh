package view;

public class VisualizaProduto extends Visualizar{
	@Override
	public void showDetails(String data) {
		System.out.print("Produto: ");
		super.showDetails(data);
	}
}
