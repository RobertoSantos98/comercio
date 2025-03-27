package br.com.projetopessoal.comercio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetopessoal.comercio.entities.Cliente;
import br.com.projetopessoal.comercio.repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> listarClientes() {
        return repository.findAll();
    }

    public Cliente createCLiente(Cliente cliente){
        return repository.save(cliente);
    }

    public Cliente updateCliente(Cliente cliente){
        return repository.save(cliente);
    }

    public Cliente deleteCliente(Long id) {
        Cliente cliente = repository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado no sistema."));
        repository.delete(cliente);
        return cliente;
    }

}
