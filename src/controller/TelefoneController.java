package controller;

import model.Telefone;
import view.VisualizarTelefone;

public class TelefoneController {
		private Telefone model;
		private VisualizarTelefone view;

		public TelefoneController(Telefone model, VisualizarTelefone view) {
			this.model = model;
			this.view = view;
		}
		
		public int getTelefoneDdd() {
			return model.getDdd();
		}
		
		public void setTelefoneDdd(int ddd) {
			model.setDdd(ddd);
		}
		
		public String getTelefoneNumero() {
			return model.getNumero();
		}
		
		public void setTelephoneNumero(String numero) {
			model.setNumero(numero);
		}
		
		public int getTelephoneFkCliente() {
			return model.getFkCliente();
		}
		
		public void updateView() {
			view.showDetails(model.toString());
		}
}
