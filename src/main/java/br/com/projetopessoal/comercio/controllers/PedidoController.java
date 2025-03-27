package br.com.projetopessoal.comercio.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetopessoal.comercio.dtos.PedidoDTO;
import br.com.projetopessoal.comercio.entities.Pedido;
import br.com.projetopessoal.comercio.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private PedidoService service;

    @GetMapping
    public ResponseEntity<List<Pedido>> listarPedidos(){
        return ResponseEntity.ok(service.listarPedidos());
    }

    @PostMapping
    public ResponseEntity<PedidoDTO> creatPedido(Pedido pedido){
        return ResponseEntity.ok(service.createPedido(pedido));
    }

    @PutMapping
    public ResponseEntity<Pedido> updatePedido(Pedido pedido){
        return ResponseEntity.ok(service.updatePedido(pedido));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Pedido> deletePedido(Long id){
        return ResponseEntity.ok(service.deletePedido(id));
    }
}
