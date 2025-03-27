package br.com.projetopessoal.comercio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetopessoal.comercio.dtos.AuthUsuario;
import br.com.projetopessoal.comercio.entities.Usuario;
import br.com.projetopessoal.comercio.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<Usuario>> getAllUsuarios(){
        List<Usuario> usuarios = service.getUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    public ResponseEntity<Usuario> createUsuario(Usuario usuario){
        Usuario usuarioCriado = service.createUsuario(usuario);
        return ResponseEntity.ok(usuarioCriado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> deleteUsuario(Long id){
        Usuario usuarioDeletado = service.deleteUsuario(id);
        return ResponseEntity.ok(usuarioDeletado);
    }

    @PostMapping("/auth")
    public ResponseEntity<AuthUsuario> authUsuario(AuthUsuario auth){
        AuthUsuario usuario = service.authUsuario(auth);
        return ResponseEntity.ok(usuario);
    }


}
