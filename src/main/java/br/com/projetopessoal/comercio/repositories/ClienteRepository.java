package br.com.projetopessoal.comercio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetopessoal.comercio.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
