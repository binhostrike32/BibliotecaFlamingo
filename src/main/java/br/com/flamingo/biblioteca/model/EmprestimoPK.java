package br.com.flamingo.biblioteca.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.NotEmpty;

@Embeddable
public class EmprestimoPK implements Serializable {

	private static final long serialVersionUID = -7738397276670855586L;
	
	@Column(name = "data_retirada_livro")
	@NotEmpty(message = "*Por favor, forneça a data de retirada do livro!")
	private Date dataRetirada;
	
	@Column(name = "data_entrega_livro")
	@NotEmpty(message = "*Por favor, forneça a data de entrega do livro!")
	private Date dataEntrega;
	
	public Date getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

}
