/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.puroverde.dao;

import com.projeto.puroverde.entity.Categoria;
import javax.persistence.EntityManager;

/**
 *
 * @author alex
 */
public class CategoriaDAO extends AbstractDAO<Categoria>{

    /**
     *
     * @param manager
     */
    public CategoriaDAO(EntityManager manager) {
                
		super(manager);
	}

    /**
     *
     * @return
     */
    @Override
	public Class<Categoria> getEntityClass() {
		return Categoria.class;
	}
}
