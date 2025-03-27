package br.com.projetopessoal.comercio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetopessoal.comercio.entities.Pedido;
import br.com.projetopessoal.comercio.repositories.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public List<Pedido> listarPedidos(){
        return repository.findAll();
    }

    public Pedido creatPedido(Pedido pedido){
        return repository.save(pedido);
    }

    public Pedido updatePedido(Pedido pedido){
        return repository.save(pedido);
    }

    public Pedido deletePedido(Long id){
        Pedido pedido = repository.findById(id).orElseThrow(() -> new RuntimeException("Pedido não encontrado no sistema."));
        repository.delete(pedido);
        return pedido;
    }
    
}
