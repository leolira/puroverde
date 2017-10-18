package com.projeto.puroverde.dao;

import javax.persistence.EntityManager;
import com.projeto.puroverde.entity.Produto;

public class ProdutoDAO extends AbstractDAO {

	public ProdutoDAO(EntityManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Class<Produto> getEntityClass() {
		return Produto.class;
	}
}
