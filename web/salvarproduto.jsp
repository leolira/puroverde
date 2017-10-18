<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Produto</title>
    </head>
    <body>
        <h1>Produto</h1>
        <form action="CadastrarProdutoServelet">
            <table>
                <tr>
                    <td>Nome:</td>
                    <td><input type="text" name="nome" /></td>
                </tr>
                <tr>
                    <td>Categoria</td>
                    <td>
                        <select name="categoria">
                            <option value="1" >Frutas</option>
                            <option value="2" >Legumes
                            </option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Descrição:</td>
                    <td><input type="text" name="descricao" /></td>
                </tr>
                <tr>
                    <td>Valor:</td>
                    <td><input type="text" name="valor" /></td>
                </tr>
                <tr>
                    <td>Quantidade em Estoque:</td>
                    <td><input type="text" name="estoque" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="salvar" /></td>
                    <td><a href="http://localhost:8080/puroverdeweb/ServletListaProdutos">Listar</a></td>
                </tr>
            </table>
        </form>
    </body>
</html>
