package com.projeto.puroverde.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comentario extends AbstractEntity{
	
    @Id
    @GeneratedValue
    private Long id;
    
    @ManyToOne
    private Cliente comentarioCliente;
    
    @Column(nullable = false)
    private String Comentario;
    @ManyToOne
    @JoinColumn(name="produto_id")
    private Produto produto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getComentarioCliente() {
        return comentarioCliente;
    }

    public void setComentarioCliente(Cliente comentarioCliente) {
        this.comentarioCliente = comentarioCliente;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }
}
