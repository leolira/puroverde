/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.service;

import com.projeto.puroverde.dao.VendasDAO;
import com.projeto.puroverde.entity.Vendas;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alex
 */
public class VendasService {
    
    static EntityManagerFactory fac = Persistence.createEntityManagerFactory("mohr");
    
   public List<Vendas> listar(){
		
		List<Vendas> lista = null;
		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			VendasDAO vendasDAO = new VendasDAO(manager);
			lista = (List) vendasDAO.listarVendas();
			manager.getTransaction().commit();
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
		return lista;		
	}
    
}
