/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.servlet;

import com.projeto.puroverde.entity.Comentario;
import com.puroverde.service.ComentarioService;
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
@WebServlet(name = "ComentarioServelet", urlPatterns = {"/ComentarioServelet"})
public class ComentarioServelet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Comentario con = new Comentario();
       con.setComentario(req.getParameter("nome"));
       con.setComentario(req.getParameter("comentario"));
       ComentarioService cs = new ComentarioService();
       cs.salvar(con);
       
       PrintWriter out = resp.getWriter();
       out.println("<h1>Salvo Com Sucesso! "+req.getParameter("nome")+" "+req.getParameter("comentario")+"</h1>");
    }

    
}
