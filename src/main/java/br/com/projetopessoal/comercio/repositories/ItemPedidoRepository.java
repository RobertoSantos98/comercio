package br.com.projetopessoal.comercio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetopessoal.comercio.entities.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {

}
