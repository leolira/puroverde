/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.servlet;

import com.projeto.puroverde.entity.Produto;
import com.puroverde.service.ProdutoService;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ServletControle", urlPatterns = {"/ServletControle"})
public class ServletControle extends HttpServlet {
    private ProdutoService ps = new ProdutoService();
    private Produto p = new Produto();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       
        
        if(req.getParameter("controle").equals("remover")){
            remover(req,resp);
            RequestDispatcher dispatcher = req.getRequestDispatcher("ServletListaProdutos");
            dispatcher.forward(req,resp);
        }else{
            editar(req,resp);
            req.setAttribute("p",p);
            RequestDispatcher dispatcher = req.getRequestDispatcher("editarproduto.jsp");
            dispatcher.forward(req,resp);
        }
         
       
        

        
        
        
    }
    
    
    
    protected void remover(HttpServletRequest req, HttpServletResponse resp){
        ps.remover(ps.Busca(Long.parseLong(req.getParameter("id"))));
        
        
        
    }
    
    protected void editar(HttpServletRequest req, HttpServletResponse resp){
        
      p = ps.Busca(Long.parseLong(req.getParameter("id")));
    }

    
    
}
