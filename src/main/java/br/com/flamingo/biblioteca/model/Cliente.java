package br.com.flamingo.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Cliente")
public class Cliente {
	
	@Id
	@Column(name="cpf_cliente")
	private String cpfCliente;
	
	@Column(name = "nome_cliente")
	@NotEmpty(message = "*Por favor, forneça o nome do cliente!")
	private String nomeCliente;
	
	@Column(name = "email_cliente")
	@NotEmpty(message = "*Por favor, forneça o e-mail do cliente!")
	private String emailCliente;
	
	@Column(name = "curso_cliente")
	@NotEmpty(message = "*Por favor forneça o curso do cliente")
	private String cursoCliente;
	private String telefoneCliente;
	
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getCursoCliente() {
		return cursoCliente;
	}
	public void setCursoCliente(String cursoCliente) {
		this.cursoCliente = cursoCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
	
}
