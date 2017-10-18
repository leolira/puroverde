package com.projeto.puroverde.dao;

import javax.persistence.EntityManager;
import com.projeto.puroverde.entity.Comentario;


public class ComentarioDAO extends AbstractDAO{

	public ComentarioDAO(EntityManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Class<Comentario> getEntityClass() {
		// TODO Auto-generated method stub
		return Comentario.class;
	}

}
