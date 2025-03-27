package br.com.projetopessoal.comercio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetopessoal.comercio.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
