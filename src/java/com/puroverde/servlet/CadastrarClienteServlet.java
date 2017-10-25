/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.servlet;

import com.projeto.puroverde.entity.Cliente;
import com.projeto.puroverde.entity.Endereco;
import com.puroverde.service.ClienteService;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alex
 */
@WebServlet(name = "CadastrarClienteServlet", urlPatterns = {"/CadastrarClienteServlet"})
public class CadastrarClienteServlet extends HttpServlet {

    Cliente c = new Cliente();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Cliente c = new Cliente();
        Endereco e = new Endereco();
        
        c.setNome(req.getParameter("nome"));
        c.setEmail(req.getParameter("email"));
        c.setCpf(req.getParameter("cpf"));
        c.setSenha(req.getParameter("senha"));
        c.setTelefone(req.getParameter("telefone"));
        c.setDataNasc(req.getParameter("dataNascimento"));

        
      
        e.setCep(req.getParameter("cep"));
        e.setRua(req.getParameter("rua"));
        e.setNumCasa(new Integer(req.getParameter("numero")));
        e.setCidade(req.getParameter("cidade"));
        e.setComplemento(req.getParameter("complemento"));
        e.setBairro(req.getParameter("bairro"));
        e.setEstado(req.getParameter("uf"));
        
        c.setEndereco(e);
        
        
        
        ClienteService cs = new ClienteService();
        cs.salvar(c);
        
        
        HttpSession session = req.getSession();
        session.setAttribute("login", c);
        
        
    
    }
    
    
    
}
