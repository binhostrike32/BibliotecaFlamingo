package br.com.flamingo.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

public class Funcionario {
	
	@Id
	@CPF
	@Column(name="cpf_funcionario")
	private String cpfFuncionario;
	
	@Column(name = "nome_funcionario")
	@NotEmpty(message = "*Por favor, forneça o !")
	private String nomeFuncionario;
	
	@Embedded
	private TipoFuncionario tipoFuncionario;
	
	@Column(name = "email_funcionario")
	@NotEmpty(message = "*Por favor, forneça o título do livro!")
	private String emailFuncionario;
	
	@Column(name = "titulo_livro")
	@NotEmpty(message = "*Por favor, forneça o título do livro!")
	private String senhaFuncionario;
	
	public String getCpfFuncionario() {
		return cpfFuncionario;
	}
	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public String getSenhaFuncionario() {
		return senhaFuncionario;
	}
	public void setSenhaFuncionario(String senhaFuncionario) {
		this.senhaFuncionario = senhaFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getEmailFuncionario() {
		return emailFuncionario;
	}
	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}
}
