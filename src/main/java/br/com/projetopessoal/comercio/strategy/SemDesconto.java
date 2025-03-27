package br.com.projetopessoal.comercio.strategy;

import java.math.BigDecimal;

public class SemDesconto implements DescontoStrategy {
    @Override
    public BigDecimal calcularDesconto(BigDecimal valorTotal) {
        return BigDecimal.ZERO;
    }
}
