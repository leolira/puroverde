<%@page import="java.text.DecimalFormat"%>
<%@page import="com.projeto.puroverde.entity.Produto"%>
<%@page import="java.util.ArrayList"%>
<h3>Produtos</h3>
<%
    DecimalFormat df = new DecimalFormat("#,###.00");
    ArrayList<Produto> lista = (ArrayList) request.getAttribute("lista");
    for(Produto produto: lista){
 %>
 
  <div class="product">
            <div class="prodtop">
                <div class="imgbox">
                    <a href="?pg=ProdutoServlet&id=<%= produto.getId() %>"><img src="image/produto<%= produto.getId() %>.jpg" class="product-img"></a>
                </div>
                <div class="textcart">
                    <a href="?quantidade=1&pg=CarrinhoServlet&tipo=adicionar&id=<%= produto.getId() %>" ><img src="image/products/cart-icon.png" class="cart-icon"><br><span>comprar</span></a>
                </div>
            </div>
            <div class="prodbot">
                <h1><%= produto.getNomeProduto() %></h1>
                <p>Tipo: <%= produto.getCategoriaProduto().getNomeCategoria() %></p>
                <p>Preço: R$<%= df.format(produto.getValorUnitario()) %></p>
            </div>
        </div>    
<%}%>
