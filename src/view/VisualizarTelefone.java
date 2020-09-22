package view;

public class VisualizarTelefone extends Visualizar{
	@Override
	public void showDetails(String data) {
		System.out.print("Telefone: ");
		super.showDetails(data);
	}
}
