package com.projeto.puroverde.dao;

import javax.persistence.EntityManager;

import com.projeto.puroverde.entity.Cliente;





public class ClienteDAO extends AbstractDAO<Cliente>{

	public ClienteDAO(EntityManager manager) {
                
		super(manager);
	}

	@Override
	public Class<Cliente> getEntityClass() {
		return Cliente.class;
	}
        
       

}
