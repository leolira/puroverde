/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.service;

import com.projeto.puroverde.dao.CarrinhoDAO;
import com.projeto.puroverde.dao.VendasDAO;
import com.projeto.puroverde.entity.Carrinho;
import com.projeto.puroverde.entity.Cliente;
import com.projeto.puroverde.entity.Vendas;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alex
 */
public class CarrinhoService {
    
    static EntityManagerFactory fac = Persistence.createEntityManagerFactory("mohr");
    
    public void salvar(Carrinho carrinho){
        EntityManager manager = fac.createEntityManager();
        try{
                manager.getTransaction().begin();
                CarrinhoDAO carrinhoDAO = new CarrinhoDAO(manager);
                carrinhoDAO.salvar(carrinho);
                manager.getTransaction().commit();

        }catch(Exception e){
                manager.getTransaction().rollback();
        }
        finally{
                manager.close();
        }
    }
    
     public void salvarCarrinho(ArrayList<Carrinho> lista,Vendas venda,Cliente cliente){
        EntityManager manager = fac.createEntityManager();
        try{
                manager.getTransaction().begin();
                CarrinhoDAO carrinhoDAO = new CarrinhoDAO(manager);
                VendasDAO vendaDAO = new VendasDAO(manager);
                vendaDAO.salvar(venda);
                
                
                for(int x = 0;x<lista.size();x++){
                    lista.get(x).setVendaCliente(cliente);
                    lista.get(x).setVenda(venda);
                    carrinhoDAO.salvar(lista.get(x));
                }

                manager.getTransaction().commit();

        }catch(Exception e){
                manager.getTransaction().rollback();
        }
        finally{
                manager.close();
        }
    }
    
    
    
     
}
