<%-- 
    Document   : listadeprodutos
    Created on : 01/10/2017, 19:40:41
    Author     : alex
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.projeto.puroverde.entity.Produto"%>
<%@page import="com.projeto.puroverde.entity.Categoria"%>
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
                <td>Categoria</td>
                <td>Valor</td>
                <td>Quantidade</td>
                
            </tr>
        <%
           ArrayList<Produto> lista = (ArrayList) request.getAttribute("lista");
         
           for(Produto produto:lista){
        %>
      
            <tr>
                
                <input type="hidden" value="<%= produto.getId() %>" name="id"/>
                <td><%= produto.getNomeProduto() %></td>
                <td><%= produto.getDescricao() %></td>
                <td><%= produto.getCategoriaProduto().getNomeCategoria() %></td>
                <td><%= produto.getValorUnitario() %></td>
                <td><%= produto.getQuantidadeEstoque() %></td>
                <td><a href="http://localhost:8080/puroverdeweb/ServletControle?id=<%= produto.getId() %>&controle=remover">remover<a/></td>
                <td><a href="http://localhost:8080/puroverdeweb/ServletControle?id=<%= produto.getId() %>&controle=editar">editar<a/></td>
                
            </tr>
     
        <%  }%>
        </table>
        
        <h1><%=lista.size()==0?"Lista Vazia":""%></h1>
        <a href="http://localhost:8080/puroverdeweb/salvarproduto.jsp">Salvar um novo produto</a>
    </body>
</html>
