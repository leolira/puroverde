/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.service;

import com.projeto.puroverde.dao.CategoriaDAO;
import com.projeto.puroverde.entity.Categoria;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alex
 */
public class CategoriaService {
    static EntityManagerFactory fac = Persistence.createEntityManagerFactory("mohr");
	
	public void salvar(Categoria categoria){
		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			CategoriaDAO categoriaDAO = new CategoriaDAO(manager);
			categoriaDAO.salvar(categoria);
			manager.getTransaction().commit();
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	
	public Categoria Busca(Long id){
		
		Categoria categoria = null;
		EntityManager manager = fac.createEntityManager();
		try{
			
			CategoriaDAO categoriaDAO = new CategoriaDAO(manager);
			categoria = (Categoria) categoriaDAO.buscarPorId(id);
			
		}catch(Exception e){
			manager.clear();
		}
		finally{
			manager.close();
		}
		
		return categoria;	
	}
}
