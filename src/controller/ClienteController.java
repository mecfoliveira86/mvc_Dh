package controller;

import model.Cliente;
import view.VisualizaCliente;

public class ClienteController {
	
		private Cliente model;
		private VisualizaCliente view;

		public ClienteController(Cliente model, VisualizaCliente view) {
			this.model = model;
			this.view = view;
		}

		public String getClientNome() {
			return model.getNome();
		}

		public void setClientNome(String nome) {
			model.setNome(nome);
		}

		public String getClientEmail() {
			return model.getEmail();
		}

		public void setClientEmail(String email) {
			model.setEmail(email);
		}

		public String getClientCpf() {
			return model.getCpf();
		}

		public void setClientCpf(String cpf) {
			model.setCpf(cpf);
		}

		public String getClientRg() {
			return model.getRg();
		}

		public void setClientRg(String rg) {
			model.setRg(rg);
		}

		public String getClientDataNasc() {
			return model.getDataNasc();
		}

		public void setClientBornDate(String dataNasc) {
			model.setDataNasc(dataNasc);
		}

		public int getIdClient() {
			return model.getIdCliente();
		}

		public void updateView() {
			view.showDetails(model.toString());
		}
}
