package br.com.projetopessoal.comercio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "item_produto")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ItemProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    @JoinColumn(nullable = false)
    private Integer quantidade;

    @JoinColumn(nullable = false)
    private Double subtotal;

}
