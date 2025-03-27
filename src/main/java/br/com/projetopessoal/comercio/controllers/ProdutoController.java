package br.com.projetopessoal.comercio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetopessoal.comercio.entities.Produto;
import br.com.projetopessoal.comercio.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<Produto> getAllProdutos(){
        return service.findAll();
    }

    @PostMapping
    public Produto createProduto(Produto produto){
        return service.create(produto);
    }

    @PutMapping
    public Produto updateProduto(Produto produto){
        return service.update(produto);
    }

    @DeleteMapping("/{id}")
    public Produto deleteProduto(Long id){
        return service.delete(id);
    }

    


}
