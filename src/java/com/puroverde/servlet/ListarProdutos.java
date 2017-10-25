/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.servlet;

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
@WebServlet(name = "ListarProdutos", urlPatterns = {"/ListarProdutos"})
public class ListarProdutos extends HttpServlet {
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProdutoService ps = new ProdutoService();
        
        String dado = req.getParameter("item");
        String dado2 = req.getParameter("busca");
       
        
        if(dado2!=null){
             req.setAttribute("lista", ps.BuscarProduto(dado2));
        }else if(dado!=null){
            req.setAttribute("lista", ps.BuscarProdutoCategoria(dado));
        }else{
            req.setAttribute("lista", ps.listar());
        }
        
        
        req.getRequestDispatcher("listadeprodutos.jsp").include(req, resp);
    
    }

    
    
    
    
   
}
