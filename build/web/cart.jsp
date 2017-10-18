<%-- 
    Document   : carrinho
    Created on : 01/10/2017, 22:23:27
    Author     : alex
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="com.projeto.puroverde.entity.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.projeto.puroverde.entity.Vendas"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1px solid black">
            <tr>
                <td>Nome</td>
                <td>valor unitario</td>
                <td>quantidade</td>
                <td>remover</td>
            </tr>
        <%
          DecimalFormat df = new DecimalFormat("#,###.00");
          ArrayList<Vendas> lista = new ArrayList<Vendas>();
          
          lista = (ArrayList) request.getAttribute("lista");
          
          if(lista.isEmpty()){
            response.sendRedirect("listadeprodutos.jsp");
          }
          double valorTotal=0;
          for(Vendas x:lista){
        %>
            <tr>
                
                <td><%= x.getVendaProduto().getNomeProduto() %></td>
                <td><%= x.getVendaProduto().getValorUnitario() %></td>
                <td><a href="http://localhost:8080/puroverdeweb/CarrinhoServlet?tipo=quantidade&id=<%= x.getVendaProduto().getId() %>&quant=1"> + </a><%= x.getQuantidadeVenda() %><a href="http://localhost:8080/puroverdeweb/CarrinhoServlet?tipo=quantidade&id=<%= x.getVendaProduto().getId() %>&quant=-1"> - </a></td>
                <td><a href="http://localhost:8080/puroverdeweb/CarrinhoServlet?tipo=remover&id=<%= x.getVendaProduto().getId() %>">remover</a></td>
                
            </tr>
        
        <% valorTotal+=x.getVendaProduto().getValorUnitario()*x.getQuantidadeVenda();
           }
        %>
        </table>
        <h1>valor: <%=df.format(valorTotal)%></h1>
        <a href="http://localhost:8080/puroverdeweb/FinalizarCompras">Finalizar Compras</a>
    </body>
</html>
