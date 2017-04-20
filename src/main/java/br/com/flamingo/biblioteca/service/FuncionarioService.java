package br.com.flamingo.biblioteca.service;

import br.com.flamingo.biblioteca.model.Funcionario;

public interface FuncionarioService {
	public Funcionario findFuncionarioByEmail(String emailFuncionario);
	public void saveFuncionario(Funcionario funcionario);
}
