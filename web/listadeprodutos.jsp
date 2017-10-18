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
            
            <a href="product.html"><img alt="" src="image/produto<%=produto.getId() %>.jpg"></a>
        <div class="caption">
          <a href="product.html"> <h5><%= produto.getNomeProduto() %></h5></a>  Preço: $<%= produto.getValorUnitario() %><br><br>
          <a href="?pg=ProdutoServlet&id=<%= produto.getId() %>" class="btn btn-info" role="button">Compra</a>
        </div>
        </div>
    </div>
</div>
<%}%>