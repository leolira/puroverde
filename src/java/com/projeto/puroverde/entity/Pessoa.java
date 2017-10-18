package com.projeto.puroverde.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance (strategy=InheritanceType.JOINED)
public class Pessoa extends AbstractEntity{
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(nullable = false,length = 100)
    private String nome;
    
    @Column(nullable = false,length = 13)
    private String telefone;
    
    @Column(nullable = false,length = 50)
    private String email;
    
    @Column(nullable = false,length = 50)
    private String senha;
    
    @OneToOne(fetch=FetchType.LAZY)
    private Endereco endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}


