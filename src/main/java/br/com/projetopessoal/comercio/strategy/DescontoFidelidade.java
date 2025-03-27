package br.com.projetopessoal.comercio.strategy;

import java.math.BigDecimal;

public class DescontoFidelidade implements DescontoStrategy {

    @Override
    public BigDecimal calcularDesconto(BigDecimal valor) {
        
        return valor.multiply(new BigDecimal("0.10"));
    }

}
