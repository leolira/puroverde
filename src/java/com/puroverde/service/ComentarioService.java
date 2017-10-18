package com.puroverde.service;

import com.projeto.puroverde.dao.ComentarioDAO;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.projeto.puroverde.entity.Comentario;


public class ComentarioService {
	static EntityManagerFactory fac = Persistence.createEntityManagerFactory("mohr");
	
	public void salvar(Comentario comentario){
		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			ComentarioDAO produtoDAO = new ComentarioDAO(manager);
			produtoDAO.salvar(comentario);
			manager.getTransaction().commit();
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	
	public Comentario Busca(Long id){
		
		Comentario comentario = null;
		EntityManager manager = fac.createEntityManager();
		try{
			
			ComentarioDAO comentarioDAO = new ComentarioDAO(manager);
			comentario = (Comentario) comentarioDAO.buscarPorId(id);
			
		}catch(Exception e){
			manager.clear();
		}
		finally{
			manager.close();
		}
		
		return comentario;
		
		
	}
	
	public boolean remover(Comentario comentario){
		
		boolean remover = false;
		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			ComentarioDAO comentarioDAO = new ComentarioDAO(manager);
			comentarioDAO.remover(comentario);
			manager.getTransaction().commit();
			remover = true;
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
		
		return remover;
		
		
	}
	
	public List<Comentario> listar(){
		
		List<Comentario> lista = null;
		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			ComentarioDAO comentarioDAO = new ComentarioDAO(manager);
			lista = (List) comentarioDAO.listar();
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
