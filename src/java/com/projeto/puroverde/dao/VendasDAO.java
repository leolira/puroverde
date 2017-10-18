/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.puroverde.dao;

import com.projeto.puroverde.entity.Vendas;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author alex
 */
public class VendasDAO extends AbstractDAO<Vendas>{
    
    public VendasDAO(EntityManager manager) {
                
		super(manager);
	}

    /**
     *
     * @return
     */
    @Override
	public Class<Vendas> getEntityClass() {
		return Vendas.class;
	}
        
        
    public List<Vendas> listarVendas() {
        //select d.descricao, p.nome, p.preco from Produto p 
   //inner join p.detalhesProduto as d
		Query query = manager.createQuery("select c  from Vendas c inner join fetch c.vendaProduto");
		return query.getResultList();

	}
}
    

