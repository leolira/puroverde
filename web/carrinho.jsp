
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.projeto.puroverde.entity.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.projeto.puroverde.entity.Vendas"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h3>Lista De produtos</h3>
        <table class="table">
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
          String listaVazia = lista.size()==0?"Lista Vazia":"";
         
          
          double valorTotal=0;
          for(Vendas x:lista){
        %>
            <tr>
                
                <td><%= x.getVendaProduto().getNomeProduto() %></td>
                <td><%= x.getVendaProduto().getValorUnitario() %></td>
                <td><a href="http://localhost:8080/puroverdeweb/index.jsp?pg=CarrinhoServlet?tipo=quantidade&id=<%= x.getVendaProduto().getId() %>&quant=1"> + </a><%= x.getQuantidadeVenda() %><a href="http://localhost:8080/puroverdeweb/index.jsp?pg=CarrinhoServlet?tipo=quantidade&id=<%= x.getVendaProduto().getId() %>&quant=-1"> - </a></td>
                <td><a href="http://localhost:8080/puroverdeweb/index.jsp?pg=CarrinhoServlet&tipo=remover&id=<%= x.getVendaProduto().getId() %>">remover</a></td>
                
            </tr>
        
        <% 
            valorTotal+=x.getVendaProduto().getValorUnitario()*x.getQuantidadeVenda();
            
            
            
           }
                         
            
        %>
        </table>
        <h1><%=listaVazia%></h1>
        <h1>valor total: <%=df.format(valorTotal)%></h1>
        
        <a href="http://localhost:8080/puroverdeweb/FinalizarCompras">Finalizar Compras</a>
   