package br.com.leo.util;

public enum StatusPedido {

	FINALIZADO("F"),
	ABERTO("A"),
	PENDENTE("P"),
	CANCELADO("C");
	
	private String status;
	
	private StatusPedido(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
}
