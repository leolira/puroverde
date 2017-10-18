/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.servlet;

import com.projeto.puroverde.entity.Categoria;
import com.projeto.puroverde.entity.Produto;
import com.puroverde.service.CategoriaService;
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
 * @author Wilma
 */
@WebServlet(name = "EditarProdutoServelet", urlPatterns = {"/EditarProdutoServelet"})
public class EditarProdutoServelet extends HttpServlet {
     ProdutoService ps = new ProdutoService();
     

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Produto produto =  ps.Busca(Long.parseLong(req.getParameter("id")));
        CategoriaService cs = new CategoriaService();
        
        
        
        Categoria categoria = cs.Busca(Long.parseLong(req.getParameter("categoria")));
        
        produto.setNomeProduto(req.getParameter("nome"));
        produto.setDescricao(req.getParameter("descricao"));
        produto.setCategoriaProduto(categoria);
        produto.setValorUnitario(Double.parseDouble(req.getParameter("valor")));
        produto.setQuantidadeEstoque(Integer.parseInt(req.getParameter("estoque")));
        
        
        ps.atualizar(produto);
        
       ArrayList<Produto> lista =(ArrayList) ps.listar();
       req.setAttribute("lista",lista);
       RequestDispatcher dispatcher = req.getRequestDispatcher("listarprodutos.jsp");
       dispatcher.forward(req,resp);
        
                
    }
     
    }
