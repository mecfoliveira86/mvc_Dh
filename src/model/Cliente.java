package model;

public class Cliente {
	
		private int idCliente;
		private String nome;
		private String email;
		private String cpf;
		private String rg;
		private String dataNasc;

	
		public Cliente(int idCliente, String nome, String email, String cpf, String rg, String dataNasc) {
			super();
			this.idCliente = idCliente;
			this.nome = nome;
			this.email = email;
			this.cpf = cpf;
			this.rg = rg;
			this.dataNasc = dataNasc;
		}

		
		public int getIdCliente() {
			return idCliente;
		}


		public void setIdCliente(int idCliente) {
			this.idCliente = idCliente;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getCpf() {
			return cpf;
		}


		public void setCpf(String cpf) {
			this.cpf = cpf;
		}


		public String getRg() {
			return rg;
		}


		public void setRg(String rg) {
			this.rg = rg;
		}


		public String getDataNasc() {
			return dataNasc;
		}


		public void setDataNasc(String dataNasc) {
			this.dataNasc = dataNasc;
		}


		@Override
		public String toString() {
			return String.format(
					"{ \"id\": %d, \"nome\": \"%s\", \"email\": \"%s\", \"cpf\": \"%s\", \"rg\": \"%s\", \"data_nasc\": \"%s\" }",
					idCliente, nome, email, cpf, rg, dataNasc);
		}

}
