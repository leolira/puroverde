<%-- 
    Document   : listadeprodutos
    Created on : 01/10/2017, 19:40:41
    Author     : alex
--%>

<%@page import="com.projeto.puroverde.entity.Produto"%>
<%@page import="com.puroverde.service.ProdutoService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Produtos</title>
    </head>
    <body>
        <h1>Produtos</h1>
        
        <table border="1px solid black">
            <tr>
               
                <td>Nome</td>
                <td>Descrição</td>
                <td>Valor</td>
                <td>Quantidade</td>
                <td>Adicionar ao Carrinho<td>
            </tr>
        <%
           ProdutoService ps = new ProdutoService();
           for(Produto produto:ps.listar()){
        %>
        
            <tr>
                <form action="CarrinhoServlet">
                    <input type="hidden" value="adicionar" name="tipo"/>
                    <input type="hidden" value="<%= produto.getId() %>" name="id"/>
                    <td><%= produto.getNomeProduto() %></td>
                    <td><%= produto.getDescricao() %></td>
                    <td><%= produto.getValorUnitario() %></td>
                    <td><input type="number" name="quantidade"/></td>
                    <td><input type="submit" value="salva" /></td>
                </form>
            </tr>
        
        <%  }%>
        </table>
    </body>
</html>
