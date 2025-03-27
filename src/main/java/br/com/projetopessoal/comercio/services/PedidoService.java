package br.com.projetopessoal.comercio.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetopessoal.comercio.dtos.PedidoDTO;
import br.com.projetopessoal.comercio.entities.Cliente;
import br.com.projetopessoal.comercio.entities.Pedido;
import br.com.projetopessoal.comercio.repositories.ClienteRepository;
import br.com.projetopessoal.comercio.repositories.PedidoRepository;
import br.com.projetopessoal.comercio.strategy.DescontoFactory;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    @Autowired
    private ClienteRepository clienteRepository;

    public PedidoDTO createPedido(Pedido pedido){

        Cliente cliente = clienteRepository.findById(pedido.getCliente().getId()).orElseThrow(() -> new RuntimeException("Usuário não encontrado no sistema."));
        BigDecimal valorTotal = pedido.getValorTotal();

        var descontoStrategy = DescontoFactory.getDesconto(cliente);
        BigDecimal valorDesconto = descontoStrategy.calcularDesconto(valorTotal);

        pedido.setValorTotal(valorTotal.subtract(valorDesconto));
        
        repository.save(pedido);

        return new PedidoDTO(pedido.getCliente().getId(), pedido.getUsuario().getId(), pedido.getData(), valorDesconto, pedido.getValorTotal());

    }


    public List<Pedido> listarPedidos(){
        return repository.findAll();
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
