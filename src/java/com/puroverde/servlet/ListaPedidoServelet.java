/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.servlet;

import com.projeto.puroverde.entity.Vendas;
import com.puroverde.service.ProdutoService;
import com.puroverde.service.VendasService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alex
 */
@WebServlet(name = "ListaPedidoServelet", urlPatterns = {"/ListaPedidoServelet"})
public class ListaPedidoServelet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp); 
        
        ProdutoService vs = new ProdutoService();
        
        
       
    }
    
 
}
