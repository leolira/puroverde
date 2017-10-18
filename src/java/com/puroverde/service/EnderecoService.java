/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.service;

import com.projeto.puroverde.dao.ClienteDAO;
import com.projeto.puroverde.dao.EnderecoDAO;
import com.projeto.puroverde.entity.Cliente;
import com.projeto.puroverde.entity.Endereco;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alex
 */
public class EnderecoService {
    static EntityManagerFactory fac = Persistence.createEntityManagerFactory("mohr");
	
    public void salvar(Endereco endereco){
            EntityManager manager = fac.createEntityManager();
            try{
                    manager.getTransaction().begin();
                    EnderecoDAO enderecoDAO = new EnderecoDAO(manager);
                    enderecoDAO.salvar(endereco);
                    manager.getTransaction().commit();
            }catch(Exception e){
                    manager.getTransaction().rollback();
            }
            finally{
                    manager.close();
            }
    }
    
}
