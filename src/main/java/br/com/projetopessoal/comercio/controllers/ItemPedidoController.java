package br.com.projetopessoal.comercio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetopessoal.comercio.entities.ItemPedido;
import br.com.projetopessoal.comercio.services.ItemPedidoService;

@RestController
@RequestMapping("/item-pedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService service;

    @GetMapping
    public ResponseEntity<List<ItemPedido>> listarItens(){
        return ResponseEntity.ok(service.listarItens());
    }

    @PostMapping
    public ResponseEntity<ItemPedido> createItem(ItemPedido item) {
        return ResponseEntity.ok(service.createItem(item));
    }

    @PutMapping
    public ResponseEntity<ItemPedido> updateItem(ItemPedido item) {
        return ResponseEntity.ok(service.updateItem(item));
    }

    @DeleteMapping
    public ResponseEntity<ItemPedido> deleteItem(Long id) {
        return ResponseEntity.ok(service.deleteItem(id));
    }

    
}
