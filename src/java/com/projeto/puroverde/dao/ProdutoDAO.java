package com.projeto.puroverde.dao;

import javax.persistence.EntityManager;
import com.projeto.puroverde.entity.Produto;
import java.util.List;
import javax.persistence.Query;

public class ProdutoDAO extends AbstractDAO {

	public ProdutoDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<Produto> getEntityClass() {
		return Produto.class;
	}
        
        public List<Produto> buscaProduto(String produto) {
		Query query = manager.createQuery("select c from Produto c WHERE c.nomeProduto like :busca");
                query.setParameter("busca", "%"+produto+"%");
		return query.getResultList();

	}
        
        public List<Produto> buscaProdutoCategoria(String categoria) {
		Query query = manager.createQuery("select c from Produto c WHERE c.categoriaProduto.nomeCategoria like :busca");
                query.setParameter("busca", categoria);
		return query.getResultList();

	}
}
