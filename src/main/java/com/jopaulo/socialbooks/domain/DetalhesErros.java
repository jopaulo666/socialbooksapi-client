package com.jopaulo.socialbooks.domain;

public class DetalhesErros {
	
	private String titulo;
	
	private Long status;
	
	private Long timestamp;
	
	private String msgDesenvoledor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMsgDesenvoledor() {
		return msgDesenvoledor;
	}

	public void setMsgDesenvoledor(String msgDesenvoledor) {
		this.msgDesenvoledor = msgDesenvoledor;
	}

}
