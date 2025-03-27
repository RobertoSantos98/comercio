package br.com.projetopessoal.comercio.strategy;

import java.math.BigDecimal;

public class DescontoFuncionario implements DescontoStrategy {

    @Override
    public BigDecimal calcularDesconto(BigDecimal valor) {
        
        return valor.multiply(new BigDecimal(0.15));
    }

}
