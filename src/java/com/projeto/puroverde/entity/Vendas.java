package com.projeto.puroverde.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author alex
 */
@Entity
public class Vendas extends AbstractEntity{
    
    @Id
    @GeneratedValue
    private Long id;
    
    @ManyToOne(fetch=FetchType.LAZY)
    private Cliente vendaCliente;
    
    @ManyToOne(fetch=FetchType.LAZY)
    private Produto vendaProduto;
    
    @Column(nullable = false)
    private Integer quantidadeVenda;
    
    @Column(nullable = false,length = 30)
    private String status;
    
    @Column(nullable = false)
    private Date dataVenda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

}
