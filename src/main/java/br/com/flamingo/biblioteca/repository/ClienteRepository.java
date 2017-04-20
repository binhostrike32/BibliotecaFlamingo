package br.com.flamingo.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flamingo.biblioteca.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
