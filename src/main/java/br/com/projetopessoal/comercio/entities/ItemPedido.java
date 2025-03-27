package br.com.projetopessoal.comercio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "itempedido")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    @Column(nullable = false)  
    private Integer quantidade;

    @Column(nullable = false)  
    private Double precoUnitario;

    @Column(nullable = false)  
    private Double subtotal;

    
    @PrePersist
    @PreUpdate
    public void updateSubtotal() {
        this.subtotal = getTotal();
    }

    public Double getTotal() {
        return this.precoUnitario * this.quantidade;
    }
}
