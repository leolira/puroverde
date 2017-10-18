/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.servlet;

import com.projeto.puroverde.entity.Vendas;
import com.puroverde.service.ProdutoService;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alex
 */
@WebServlet(name = "CarrinhoServlet", urlPatterns = {"/CarrinhoServlet"})
public class CarrinhoServlet extends HttpServlet {
    
    ArrayList<Vendas> lista = new ArrayList<Vendas>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        
        switch(req.getParameter("tipo")){
            case "adicionar":
                adincionar(req,resp);
                break;
            case "remover":
                remover(req,resp);
                break;
            case "quantidade":
                quantidade(req,resp);
                break;
            default:
                
                
        }   
        
        req.setAttribute("lista",lista);
        
        req.getRequestDispatcher("carrinho.jsp").include(req, resp);

       
    
    }
    
    protected ArrayList<Vendas> adincionar(HttpServletRequest req, HttpServletResponse resp){
        
        ProdutoService ps = new ProdutoService();
        Vendas p = new Vendas();

        p.setVendaProduto(ps.Busca(Long.parseLong(req.getParameter("id"))));
        p.setQuantidadeVenda(Integer.parseInt(req.getParameter("quantidade")));
        
        boolean contem = false;
        
        for(Vendas v:lista){
            if(v.getVendaProduto().getId()==p.getVendaProduto().getId()){
                v.setQuantidadeVenda((v.getQuantidadeVenda()+p.getQuantidadeVenda()));
                contem = true;
            }
        }
        
        if(!contem){
            lista.add(p);
        }
        return lista;
    }
    
    protected ArrayList<Vendas> remover(HttpServletRequest req, HttpServletResponse resp){
        
        Long id = Long.parseLong(req.getParameter("id"));
            
        for(int x = 0;x<lista.size();x++){
            if(lista.get(x).getVendaProduto().getId().equals(id)){
                lista.remove(lista.get(x));
            }
        }
    return lista;
    
    }
    
    protected ArrayList<Vendas> quantidade (HttpServletRequest req, HttpServletResponse resp){
        
        Long id = Long.parseLong(req.getParameter("id"));
        int quantidade = Integer.parseInt(req.getParameter("quant"));
        
            
        for(int x = 0;x<lista.size();x++){
            if(lista.get(x).getVendaProduto().getId().equals(id)){
               lista.get(x).setQuantidadeVenda(lista.get(x).getQuantidadeVenda()+quantidade);
               if(lista.get(x).getQuantidadeVenda()==0){
                   lista.remove(x);
               }
               
            }
        }
        
        
        return lista;
    
    }
}
