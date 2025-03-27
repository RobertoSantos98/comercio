package br.com.projetopessoal.comercio.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PedidoDTO {

    private Long clienteId;
    private Long usuarioId;
    private LocalDateTime data;
    private BigDecimal valorDesconto;
    private BigDecimal valorTotal;

    public PedidoDTO(Long clienteId, Long usuarioId, LocalDateTime data, BigDecimal valorDesconto,
            BigDecimal valorTotal) {
        this.clienteId = clienteId;
        this.usuarioId = usuarioId;
        this.data = data;
        this.valorDesconto = valorDesconto;
        this.valorTotal = valorTotal;
    }

    
    public Long getClienteId() {
        return clienteId;
    }
    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }
    public Long getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }
    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    


}
