package com.projeto.puroverde.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Cliente extends Pessoa {
	
    @Column(nullable = false,length = 15)
    private String cpf;
     
    @Column(nullable = false)
    private String dataNasc;
	
	
    public String getCpf() {
	return cpf;
    }
    public void setCpf(String cpf) {
    	this.cpf = cpf;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }	
}