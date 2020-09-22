package controller;

import model.Endereco;
import view.VisualizaEndereco;

public class EnderecoController {

	public class AddressController {
		private Endereco model;
		private VisualizaEndereco view;
		
		public AddressController(Endereco model, VisualizaEndereco view) {
			this.model = model;
			this.view = view;
		}
		
		public int getAddressNumber() {
			return model.getNumero();
		}
		
		public void setAddressNumber(int numero) {
			model.setNumero(numero);
		}
		
		public String getAddressStreet() {
			return model.getRua();
		}
		
		public void setAddressStreet(String rua) {
			model.setRua(rua);
		}
		
		public String getAddressNeighbourhood() {
			return model.getBairro();
		}
		
		public void setAddressNeighbourhood(String Bairro) {
			model.setBairro(Bairro);
		}
		
		public String getAddressComplemento() {
			return model.getComplemento();
		}
		
		public void setAddressComplement(String complemento) {
			model.setComplemento(complemento);
		}
		
		public String getAddressCidade() {
			return model.getCidade();
		}
		
		public void setAddressCity(String cidade) {
			model.setCidade(cidade);
		}
		
		public String getAddressEstado() {
			return model.getEstado();
		}
		
		public void setAddressEstado(String estado) {
			model.setEstado(estado);
		}
		
		public int getAddressFkCliente() {
			return model.getFkCliente();
		}
		
		public void updateView() {
			view.showDetails(model.toString());
		}
	}
}
