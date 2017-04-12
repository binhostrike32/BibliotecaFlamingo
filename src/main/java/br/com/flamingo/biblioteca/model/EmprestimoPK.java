package br.com.flamingo.biblioteca.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Embeddable
public class EmprestimoPK implements Serializable {

	private static final long serialVersionUID = -7738397276670855586L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_emprestimo")
	private int idEmprestimo;
	
	@Column(name = "data_retirada_livro")
	@NotEmpty(message = "*Por favor, forneça a data de retirada do livro!")
	private Date dataRetirada;
	
	@Column(name = "data_entrega_livro")
	@NotEmpty(message = "*Por favor, forneça a data de entrega do livro!")
	private Date dataEntrega;
	
	public int getIdEmprestimo() {
		return idEmprestimo;
	}
	public void setIdEmprestimo(int idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}
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
