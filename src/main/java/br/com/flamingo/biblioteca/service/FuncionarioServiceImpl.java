package br.com.flamingo.biblioteca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flamingo.biblioteca.model.Funcionario;
import br.com.flamingo.biblioteca.repository.FuncionarioRepository;

@Service("funcionarioService")
public class FuncionarioServiceImpl implements FuncionarioService{
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public Funcionario findFuncionarioByEmail(String emailFuncionario) {
		return funcionarioRepository.findByEmailFuncionario(emailFuncionario);
	}

	@Override
	public void saveFuncionario(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}
	
}
