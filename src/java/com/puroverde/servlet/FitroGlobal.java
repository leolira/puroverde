/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.Filter;

/**
 *
 * @author alex
 */
@WebServlet(name = "FitroGlobal", urlPatterns = {"/FitroGlobal"})
public class FitroGlobal extends HttpServlet {
   

}


<%@page import="com.projeto.puroverde.entity.Produto"%>
<%@page import="java.util.ArrayList"%>
<h3>Produtos</h3>
<%
    ArrayList<Produto> lista = (ArrayList) request.getAttribute("lista");
    for(Produto produto: lista){
 %>
<div class="col-lg-2 col-sx-2 col-sm-2 col-md-2">
    <div class="list-group">
        <div class="thumbnail">
            
        <a href="product.html"><img alt="" src="image/bg.jpg"></a>
        <div class="caption">
          <a href="product.html"> <h5><%= produto.getNomeProduto() %></h5></a>  Preço: $<%= produto.getValorUnitario() %><br><br>
        </div>
        </div>
    </div>
</div>
<%}%>