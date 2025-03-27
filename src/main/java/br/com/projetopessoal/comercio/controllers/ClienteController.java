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

import br.com.projetopessoal.comercio.entities.Cliente;
import br.com.projetopessoal.comercio.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;
    
    @GetMapping
    public ResponseEntity<List<Cliente>> listarClientes() {
        return ResponseEntity.ok(service.listarClientes());
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(Cliente cliente) {
        return ResponseEntity.ok(service.createCLiente(cliente));
    }

    @PutMapping
    public ResponseEntity<Cliente> updateCliente(Cliente cliente) {
        return ResponseEntity.ok(service.updateCliente(cliente));
    }

    @DeleteMapping
    public ResponseEntity<Cliente> deleteCliente(Long id) {
        return ResponseEntity.ok(service.deleteCliente(id));
    }
}
