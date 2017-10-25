
package com.projeto.puroverde.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Carrinho extends AbstractEntity {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @ManyToOne(fetch=FetchType.LAZY)
    private Cliente vendaCliente;
    
    @ManyToOne(fetch=FetchType.LAZY)
    private Produto vendaProduto;
    
    @ManyToOne(fetch=FetchType.LAZY)
    private Vendas venda;

    
    @Column(nullable = false)
    private Integer quantidadeVenda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Vendas getVenda() {
        return venda;
    }

    public void setVenda(Vendas venda) {
        this.venda = venda;
    }

    public Cliente getVendaCliente() {
        return vendaCliente;
    }

    public void setVendaCliente(Cliente vendaCliente) {
        this.vendaCliente = vendaCliente;
    }

    public Produto getVendaProduto() {
        return vendaProduto;
    }

    public void setVendaProduto(Produto vendaProduto) {
        this.vendaProduto = vendaProduto;
    }

    public Integer getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(Integer quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }
}
