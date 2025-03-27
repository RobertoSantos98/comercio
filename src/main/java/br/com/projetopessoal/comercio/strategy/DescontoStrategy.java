package br.com.projetopessoal.comercio.strategy;

import java.math.BigDecimal;

public interface DescontoStrategy {

    BigDecimal calcularDesconto(BigDecimal valor);

}
