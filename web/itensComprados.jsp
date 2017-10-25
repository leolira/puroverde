
<%@page import="com.projeto.puroverde.entity.Cliente"%>
<%@page import="com.projeto.puroverde.entity.Carrinho"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.projeto.puroverde.entity.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.projeto.puroverde.entity.Vendas"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container product-info">
<div class="row">
    <div class="col-lg-6 col-sx-6 col-sm-6 col-md-6">
        <%
            ArrayList<Carrinho> lista = new ArrayList<Carrinho>();
            
              lista = (ArrayList) request.getAttribute("lista");
             Cliente cliente = lista.get(0).getVendaCliente();
            
         %>    
    
         <h3>Itens Comprados </h3>
         
         <h3>Pedido N: <%= lista.get(0).getVenda().getId() %> </h3>
   
            <table class="table">
                <tr>
                    <td>Produto</td>
                    <td>Quantidade</td>
                    <td></td>
                </tr>
            <%
              DecimalFormat df = new DecimalFormat("#,###.00");
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

                </tr>

            <% 
                valorTotal+=x.getVendaProduto().getValorUnitario()*x.getQuantidadeVenda();

               }


            %>
            </table>
            <h1><%=listaVazia%></h1>
            <h3>Total à pagar: R$ <%=df.format(valorTotal)%></h3>
            
            <p><%="Endereço de Entrega: Cidade "+cliente.getEndereco().getCidade() %></p>
            <p><%=" Bairro: "+cliente.getEndereco().getBairro() %></p>
            <p><%="Rua "+cliente.getEndereco().getRua() %></p>
            <p><%="Numero da casa: "+cliente.getEndereco().getNumCasa() %></p>
            <p><%="Destinatario :  "+cliente.getNome() %></p>
            
            <a href="http://localhost:8080/puroverdeweb/index.jsp">Gerar Boleto de pagamento</a>
            </div>
</div>
</div>