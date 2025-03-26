package br.com.projetopessoal.comercio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetopessoal.comercio.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
