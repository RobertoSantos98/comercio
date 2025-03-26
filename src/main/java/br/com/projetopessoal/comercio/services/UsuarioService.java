package br.com.projetopessoal.comercio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.RuntimeException;
import java.util.List;

import br.com.projetopessoal.comercio.dtos.AuthUsuario;
import br.com.projetopessoal.comercio.entities.Usuario;
import br.com.projetopessoal.comercio.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario authUsuario(AuthUsuario auth){

        Usuario usuarioEncontrado = repository.findByEmail(auth.getEmail());

        if (usuarioEncontrado == null) {
            throw new RuntimeException("Usuário não encontrado no sistema.");
        }

        if (!usuarioEncontrado.getPassword().equals(auth.getPassword())) {
            throw new RuntimeException("Senha incorreta.");
        }

        return usuarioEncontrado;
    }
    
    public Usuario createUsuario(Usuario usuario){
        return repository.save(usuario);
    }

    public Usuario deleteUsuario(Long id){

        Usuario usuario = repository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado no sistema."));

        repository.delete(usuario);

        return usuario;
    }

    public List<Usuario> getUsuarios(){
        return repository.findAll();
    }

}
