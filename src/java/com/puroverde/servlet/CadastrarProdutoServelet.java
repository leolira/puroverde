/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.servlet;


import com.projeto.puroverde.dao.CategoriaDAO;
import com.projeto.puroverde.entity.Categoria;
import com.projeto.puroverde.entity.Produto;
import com.puroverde.service.CategoriaService;
import com.puroverde.service.ProdutoService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Wilma
 */
@WebServlet(name = "CadastrarProdutoServelet", urlPatterns = {"/CadastrarProdutoServelet"})
public class CadastrarProdutoServelet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Produto produto = new Produto();
        CategoriaService cs = new CategoriaService();
        
        try{
        
        Categoria categoria = cs.Busca(Long.parseLong(req.getParameter("categoria")));
        
        produto.setNomeProduto(req.getParameter("nome"));
        produto.setDescricao(req.getParameter("descricao"));
        produto.setCategoriaProduto(categoria);
        produto.setValorUnitario(Double.parseDouble(req.getParameter("valor")));
        produto.setQuantidadeEstoque(Integer.parseInt(req.getParameter("estoque")));
        
        ProdutoService ps = new ProdutoService();
        ps.salvar(produto);
        
        PrintWriter out =resp.getWriter();
        out.println("<html><body>Produto Adicionado</br><a href='http://localhost:8080/puroverdeweb/salvarproduto.jsp'>Salva um novo produtos</a></body></html>");
        
        }catch(Exception e){
            
        PrintWriter out =resp.getWriter();
        out.println("<html><body>Erro ao cadastrar o produto.</br><a href='http://localhost:8080/puroverdeweb/salvarproduto.jsp'>Tente Novamente</a></body></html>");
        
            
        }
        
    }
   
}
