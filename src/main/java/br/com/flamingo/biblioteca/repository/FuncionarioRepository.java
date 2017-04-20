package br.com.flamingo.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flamingo.biblioteca.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	Funcionario findByEmailFuncionario(String emailFuncionario);
}
