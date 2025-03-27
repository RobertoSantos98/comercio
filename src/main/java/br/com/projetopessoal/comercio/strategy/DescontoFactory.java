package br.com.projetopessoal.comercio.strategy;

import br.com.projetopessoal.comercio.entities.Cliente;
import br.com.projetopessoal.comercio.entities.Role.RoleCliente;

public class DescontoFactory {

    public static DescontoStrategy getDesconto(Cliente cliente){
        if (cliente.getRole() == RoleCliente.FUNCIONARIO) {
            return new DescontoFuncionario();

        } else if(cliente.isClienteFidelidade()){
            return new DescontoFidelidade();
            
        } else {
            return new SemDesconto();
        }
    }

}
