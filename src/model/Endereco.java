package model;

public class Endereco {
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private int fkCliente;
	
	public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String estado,
			int fkCliente) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.fkCliente = fkCliente;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getFkCliente() {
		return fkCliente;
	}

	public void setFkCliente(int fkCliente) {
		this.fkCliente = fkCliente;
	}

	@Override
	public String toString() {
		return String.format(
				"{ \"rua\": \"%s\", \"numero\": %d, \"complemento\": \"%s\", \"bairro\": \"%s\", \"cidade\": \"%s\", \"estado\": \"%s\", \"fk_cliente\": %d }",
				rua, numero, complemento, bairro, cidade, estado, fkCliente);
	}

}
