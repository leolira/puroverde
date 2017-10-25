/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.puroverde.dao;

import com.projeto.puroverde.entity.Carrinho;
import com.projeto.puroverde.entity.Cliente;
import com.projeto.puroverde.entity.Vendas;
import com.puroverde.service.ClienteService;
import com.puroverde.service.VendasService;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author alex
 */
public class CarrinhoDAO extends AbstractDAO<Carrinho>{
    
    public CarrinhoDAO(EntityManager manager) {        
        super(manager);
    }
    
    @Override
    public Class<Carrinho> getEntityClass() {
        return Carrinho.class;
    }
    
    public void Teste(){
        
        ClienteService c = new ClienteService();
        VendasService v = new VendasService();
        Cliente d = c.Busca(1l);
        Vendas e = new Vendas();
        e.setDataVenda(new Date());
        e.setStatus("dfsf");
        
        Query query = manager.createQuery("insert into Carrinho ()value ()");
	query.executeUpdate();
        
    }
        
    
}
