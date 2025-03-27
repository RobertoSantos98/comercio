package br.com.projetopessoal.comercio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetopessoal.comercio.entities.ItemPedido;
import br.com.projetopessoal.comercio.repositories.ItemPedidoRepository;

@Service
public class ItemPedidoService {

    @Autowired
    private ItemPedidoRepository repository;

    public List<ItemPedido> listarItens() {
        return repository.findAll();
    }

    public ItemPedido createItem(ItemPedido item){
        return repository.save(item);
    }

    public ItemPedido updateItem(ItemPedido item){
        return repository.save(item);
    }

    public ItemPedido deleteItem(Long id){
        ItemPedido item = repository.findById(id).orElseThrow(() -> new RuntimeException("Item não encontrado no sistema."));
        repository.delete(item);
        return item;
    }
}
