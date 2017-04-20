package br.com.flamingo.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flamingo.biblioteca.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
