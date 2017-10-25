<%@page import="com.projeto.puroverde.entity.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Produto</title>
    </head>
    <body>
        <%
          Produto produto = (Produto)  request.getAttribute("p");
        %>          
        <h1>Editar Produto</h1>
        <form action="EditarProdutoServelet">
            <table>
                <input type="hidden" value="<%= produto.getId()%>" name="id" /></td>
                <tr>
                    <td>Nome:</td>
                    <td><input type="text" value="<%= produto.getNomeProduto() %>" name="nome" /></td>
                </tr>
                <tr>
                    <td>Categoria</td>
                    <td>
                        <select name="categoria">
                            <option value="1" >Frutas</option>
                            <option value="2" >Legumes</option>
                            <option value="3" >Verduras</option>
                            <option value="4" >Ovos</option>
                            <option value="5" >Sucos</option>
                            <option value="6" >Cookies</option>
                            <option value="7" >Farinhas</option>
                            <option value="8" >Laticínios</option>
                            <option value="9" >Outros</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Descrição:</td>
                    <td><input type="text" value="<%= produto.getDescricao() %>"  name="descricao" /></td>
                </tr>
                <tr>
                    <td>Valor:</td>
                    <td><input type="text" value="<%= produto.getValorUnitario() %>" name="valor" /></td>
                </tr>
                <tr>
                    <td>Quantidade em Estoque:</td>
                    <td><input type="text" value="<%= produto.getQuantidadeEstoque() %>" name="estoque" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Salvar" /></td>
                    
                </tr>
            </table>
        </form>
    </body>
</html>
