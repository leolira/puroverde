/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.servlet;

import com.projeto.puroverde.entity.Vendas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "FinalizarCompras", urlPatterns = {"/FinalizarCompras"})
public class FinalizarCompras extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if(session.getAttribute("login")==null){
            RequestDispatcher dispatcher = req.getRequestDispatcher("logar.jsp");
            dispatcher.forward(req,resp);
        }
       
        
        
        
        ArrayList<Vendas> lista = (ArrayList) session.getAttribute("lista");
        
                
    }

   
}
