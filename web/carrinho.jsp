
<%@page import="com.projeto.puroverde.entity.Carrinho"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.projeto.puroverde.entity.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.projeto.puroverde.entity.Vendas"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=no">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Love+Ya+Like+A+Sister" rel="stylesheet">
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="js/incrementing.js"></script>
        <script src="js/npm.js"></script>
    
<div class="container product-info">
    <div class="row">
        <div class="col-lg-12 col-sx-12 col-sm-12 col-md-12">
            <h1>&nbsp Carrinho</h1>
                    <table class="tabela">
                        <td colspan="5"><hr/> </td>      
                        <tr>
                            <th></th>
                            <th>Produto</th>
                            <th>Preço </th>
                            <th>Quantidade</th>
                            <th>Total</th>
                            <th></th>
                        </tr>
                        <td colspan="5"> <hr> </td> 
                <%
                  DecimalFormat df = new DecimalFormat("#,###.00");
                  ArrayList<Carrinho> lista = new ArrayList<Carrinho>();
                  lista = (ArrayList) request.getAttribute("lista");
                  String listaVazia = lista.size()==0?"Lista Vazia":"";







                  double valorTotal=0;
                  for(Carrinho x:lista){
                %>

                    <tr>

                        <td>

                                    <div class="imgbox">
                                        <%= x.getVendaProduto().getNomeProduto() %>
                                        <img src="image/produto<%= x.getVendaProduto().getId() %>.jpg" class="product-img">
                                    </div>

                            </ul>
                        </td>
                        <td>R$ <%= df.format(x.getVendaProduto().getValorUnitario()) %></td>
                        <td><a href="http://localhost:8080/puroverdeweb/index.jsp?pg=CarrinhoServlet?tipo=quantidade&id=<%= x.getVendaProduto().getId() %>&quant=1"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span></a><%= x.getQuantidadeVenda() %><a href="http://localhost:8080/puroverdeweb/index.jsp?pg=CarrinhoServlet?tipo=quantidade&id=<%= x.getVendaProduto().getId() %>&quant=-1"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span> </a></td>
                        <td>R$ <%= df.format(x.getVendaProduto().getValorUnitario()*x.getQuantidadeVenda())  %></td>
                        <td><a href="http://localhost:8080/puroverdeweb/index.jsp?pg=CarrinhoServlet&tipo=remover&id=<%= x.getVendaProduto().getId() %>"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></a></td>

                    </tr>

                <% 
                    valorTotal+=x.getVendaProduto().getValorUnitario()*x.getQuantidadeVenda();
                   }
                %>
                </table>
                <h1><%=listaVazia%></h1>
                <h3>Total do Carrinho: R$ <%=df.format(valorTotal)%></h3>

                <div class="row">
                <a href="http://localhost:8080/puroverdeweb/index.jsp?pg=FinalizarCompras">
                <input type="submit" value="Finalizar" name="finalizar"></a>
                </div>
                <div class="row">
                <a href="http://localhost:8080/puroverdeweb/index.jsp">Continuar comprando<img src="image/return.png"/></a>
                </div>
        </div>
    </div>
</div>