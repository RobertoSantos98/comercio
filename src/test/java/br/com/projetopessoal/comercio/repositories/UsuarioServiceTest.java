package br.com.projetopessoal.comercio.repositories;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.*;

import br.com.projetopessoal.comercio.dtos.AuthUsuario;
import br.com.projetopessoal.comercio.entities.Usuario;
import br.com.projetopessoal.comercio.services.UsuarioService;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@SpringBootTest
@ActiveProfiles("test")
public class UsuarioServiceTest {

    @Autowired
    UsuarioService service;

    @Autowired
    EntityManager entityManager;

    @Test
    @DisplayName("Deve Autenticar o usuário com sucesso")
    @Transactional
    void AuthUsuarioSuccess() {

        createUsuario();

        AuthUsuario newAuth = new AuthUsuario("teste@teste.com", "123456789");
        AuthUsuario result = service.authUsuario(newAuth);

        assertThat(result).isNotNull();
        
    }

    private void createUsuario () {
        entityManager.persist(new Usuario( "Teste1", "teste@teste.com", "123456789", "ADMIN"));
        entityManager.persist(new Usuario( "Teste2", "teste2@teste.com", "987654321", "FUNCIONARIO"));
        entityManager.persist(new Usuario( "Teste3", "teste3@teste.com", "123456789", "ADMIN"));
        entityManager.flush();
    }

}
