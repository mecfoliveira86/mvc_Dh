package model;

public class Pedido {
	private String nota;
	private String dataEmissao;
	private double total;
	private String status;
	private int fkCliente;

	
	public Pedido(String nota, String dataEmissao, double total, String status, int fkCliente) {
		super();
		this.nota = nota;
		this.dataEmissao = dataEmissao;
		this.total = total;
		this.status = status;
		this.fkCliente = fkCliente;
	}
	
	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
				"{ \"nota\": \"%s\", \"data_emissao\": \"%s\", \"total\": %.2f, \"status\": \"%s\", \"fk_cliente\": %d }",
				nota, dataEmissao, total, status, fkCliente);
	}

}
