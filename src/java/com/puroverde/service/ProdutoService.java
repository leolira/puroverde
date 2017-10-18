package com.puroverde.service;

import com.projeto.puroverde.dao.ComentarioDAO;
import com.projeto.puroverde.dao.ProdutoDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.projeto.puroverde.entity.Produto;



public class ProdutoService {
	static EntityManagerFactory fac = Persistence.createEntityManagerFactory("mohr");
	
	public void salvar(Produto produto){
		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			ProdutoDAO produtoDAO = new ProdutoDAO(manager);
			produtoDAO.salvar(produto);
			manager.getTransaction().commit();
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	
	public Produto Busca(Long id){
		
		Produto produto = null;
		EntityManager manager = fac.createEntityManager();
		try{
			
			ProdutoDAO produtoDAO = new ProdutoDAO(manager);
			produto = (Produto) produtoDAO.buscarPorId(id);
			
		}catch(Exception e){
			manager.clear();
		}
		finally{
			manager.close();
		}
		
		return produto;
		
		
	}
	
	public boolean remover(Produto produto){
		
		boolean remover = false;
		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			ProdutoDAO produtoDAO = new ProdutoDAO(manager);
			ComentarioDAO comentarioDAO = new ComentarioDAO(manager);
			produtoDAO.remover(produto);
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
        
        public boolean atualizar(Produto produto){
		
		boolean remover = false;
		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			ProdutoDAO produtoDAO = new ProdutoDAO(manager);
			ComentarioDAO comentarioDAO = new ComentarioDAO(manager);
			produtoDAO.atualizar(produto);
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
	
	public List<Produto> listar(){
		
		List<Produto> lista = null;
		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			ProdutoDAO produtoDAO = new ProdutoDAO(manager);
			lista = (List) produtoDAO.listar();
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
