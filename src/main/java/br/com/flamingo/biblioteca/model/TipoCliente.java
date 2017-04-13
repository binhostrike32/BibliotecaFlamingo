package br.com.flamingo.biblioteca.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TipoCliente implements Serializable{
	
	private static final long serialVersionUID = 7491802850640365418L;
	
	@Column(name="tipo_cliente")
	private String tipoCliente;
	
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	
}
