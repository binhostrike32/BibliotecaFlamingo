package br.com.flamingo.biblioteca.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TipoFuncionario implements Serializable {
	
	private static final long serialVersionUID = -3949603036339932907L;
	
	@Column(name="tipo_funcionario")
	private String tipoFuncionario;
	
	public String getTipoFuncionario() {
		return tipoFuncionario;
	}
	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
}
