package com.projeto.puroverde.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Endereco extends AbstractEntity{

    @Id
    @GeneratedValue
    private Long id;
    
    @Column(nullable = false,length = 30)
    private String estado;
    
    @Column(nullable = false,length = 30)
    private String cidade;
    
    @Column(nullable = false,length = 50)
    private String bairro;
    
    private String complemento;
   
    @Column(nullable = false,length = 70)
    private String rua;
    
    @Column(nullable = false)
    private int numCasa;
    
    @Column(nullable = false,length = 8)
    private String cep;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}