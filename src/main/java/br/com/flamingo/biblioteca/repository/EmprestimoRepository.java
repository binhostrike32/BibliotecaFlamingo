package br.com.flamingo.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flamingo.biblioteca.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{

}
