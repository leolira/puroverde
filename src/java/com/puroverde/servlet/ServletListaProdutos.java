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
@WebServlet(name = "ServletListaProdutos", urlPatterns = {"/ServletListaProdutos"})
public class ServletListaProdutos extends HttpServlet {
    
  

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       ProdutoService ps = new ProdutoService();
       ArrayList<Produto> lista =(ArrayList) ps.listar();
       req.setAttribute("lista",lista);
       RequestDispatcher dispatcher = req.getRequestDispatcher(" <script $('#conteudo').load('carrinho.jsp');  </script> ");
       dispatcher.forward(req,resp);
       
       
    }
    

    

    
    


}
