package model;

public class Telefone {
	private int ddd;
	private String numero;
	private int fkCliente;

	public Telefone(int ddd, String numero, int fkCliente) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.fkCliente = fkCliente;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getFkCliente() {
		return fkCliente;
	}

	public void setFkCliente(int fkCliente) {
		this.fkCliente = fkCliente;
	}

	@Override
	public String toString() {
		return String.format("{ \"ddd\": %d, \"number\": \"%s\", \"fk_client\": %d }", 
				ddd, numero, fkCliente);
	}
}
