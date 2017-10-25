
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.projeto.puroverde.entity.Produto"%>
<script src="js/incrementing.js"></script>
<%
    DecimalFormat df = new DecimalFormat("#,###.00");
    Produto produto = (Produto) request.getAttribute("produto");
%>

<div class="container product-info">
    <div class="row">
        <div class="col-lg-6 col-sx-6 col-sm-6 col-md-6">
            <img src="image/produto<%= produto.getId()%>.jpg" class="product-imgbig">
        </div>

        <div class="col-lg-6 col-sx-6 col-sm-6 col-md-6">
            <h1><%= produto.getNomeProduto() %></h1>                    
            <h3>R$<%= df.format(produto.getValorUnitario()) %></h3>
            <h4>Conservação: Natural </h4>
            <h4>Embalagem: 20 unidades</h4>
            <form >
                <label for="name">Quantidade: </label>
                <div class="inputdiv">
                    <div class="dec button">-</div>
                    <div class="inputfield"><input type="text" name="quantidade"  value="1"></div>
                    <div class="inc button">+</div>
                </div>
                    <br>
                <input type="hidden" name="pg" value="CarrinhoServlet" />
                <input type="hidden" name="tipo" value="adicionar" />
                <input type="hidden" name="id" value="<%=produto.getId() %>"/>
                <input type="submit" value="Comprar" id="submit">

            </form>
        </div>
    </div>
</div> 

