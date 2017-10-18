package com.projeto.puroverde.dao;

import javax.persistence.EntityManager;
import com.projeto.puroverde.entity.Endereco;


public class EnderecoDAO extends AbstractDAO<Endereco>{

	public EnderecoDAO(EntityManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Class<Endereco> getEntityClass() {
		return Endereco.class;
	}

}
