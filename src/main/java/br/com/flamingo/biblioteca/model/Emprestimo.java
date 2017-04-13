package br.com.flamingo.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_emprestimo")
	private int idEmprestimo;
	
	@Embedded
	private EmprestimoPK emprestimoPK;
}
