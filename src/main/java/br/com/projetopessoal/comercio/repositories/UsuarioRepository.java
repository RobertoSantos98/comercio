package br.com.projetopessoal.comercio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.projetopessoal.comercio.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);

}
