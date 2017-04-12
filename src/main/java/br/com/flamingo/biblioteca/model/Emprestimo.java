package br.com.flamingo.biblioteca.model;

import javax.persistence.Embedded;
import javax.persistence.JoinColumn;

public class Emprestimo {
	
	@Embedded
	private EmprestimoPK emprestimopk;
}
