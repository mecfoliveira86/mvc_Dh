package view;

public class VisualizaEndereco extends Visualizar{
	@Override
	public void showDetails(String data) {
		System.out.print("Endereco: ");
		super.showDetails(data);
	}
}
