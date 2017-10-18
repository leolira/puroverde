package com.puroverde.service;


import com.projeto.puroverde.dao.ClienteDAO;
import com.projeto.puroverde.dao.EnderecoDAO;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.projeto.puroverde.entity.Cliente;



public class ClienteService {
	static EntityManagerFactory fac = Persistence.createEntityManagerFactory("mohr");
	
	public void salvar(Cliente cliente){
		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			ClienteDAO clienteDAO = new ClienteDAO(manager);
                        EnderecoDAO enderecoDAO = new EnderecoDAO(manager);
                        enderecoDAO.salvar(cliente.getEndereco());
			clienteDAO.salvar(cliente);
			manager.getTransaction().commit();
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	
	public Cliente Busca(Long id){
		
		Cliente cliente = null;
		EntityManager manager = fac.createEntityManager();
		try{
			
			ClienteDAO clienteDAO = new ClienteDAO(manager);
			cliente = clienteDAO.buscarPorId(id);
			
		}catch(Exception e){
			manager.clear();
		}
		finally{
			manager.close();
		}
		
		return cliente;
		
		
	}
	
	public boolean remover(Cliente cliente){
		
		boolean remover = false;
		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			ClienteDAO clienteDAO = new ClienteDAO(manager);
			EnderecoDAO enderecoDAO = new EnderecoDAO(manager);
			enderecoDAO.remover(cliente.getEndereco());
			clienteDAO.remover(cliente);
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
	
	public List<Cliente> listar(){
		
		List<Cliente> lista = null;
		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			ClienteDAO clienteDAO = new ClienteDAO(manager);
			lista = (List) clienteDAO.listar();
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
