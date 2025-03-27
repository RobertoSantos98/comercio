package br.com.projetopessoal.comercio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetopessoal.comercio.entities.Produto;
import br.com.projetopessoal.comercio.repositories.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findAll(){
        return repository.findAll();
    }

    public Produto create(Produto produto){
        return repository.save(produto);
    }

    public Produto update(Produto produto){
        return repository.save(produto);
    }

    public Produto delete(Long id){
        Produto produto = repository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado no sistema."));
        repository.delete(produto);
        return produto;
    }
    
}
