
<%@page import="com.projeto.puroverde.entity.Produto"%>
<%
    Produto produto = (Produto) request.getAttribute("produto");
%>

<div class="row">
    <div class="col-md-12 col-sm-12 col-xs-12">
      <h1 class="page-header"><%=produto.getNomeProduto() %></h1>
    </div>
  </div>
  <!-- /.row -->

  <div class="row">
    <div class="col-sm-12 col-md-12 col-lg-6 mb-4">
      
      <!-- There's only One image -->
      <div class="">
        <div class="main-product-image">
            <img src="image/produto<%=produto.getId()%>.jpg" alt="Dualshock Controller for PlayStation 4" class="img-fluid">
        </div>
      </div>
      
    </div>
       
      <form class="form-horizontal" action="?pg=CarrinhoServlet" method="get" enctype="multipart/form-data" name="buy">
    <div class="col-sm-12 col-md-12 col-lg-6">
      <div class="col-sm-12">
       
          <div>

            <!-- Product Price  -->
            <div class="form-group price_elem row">
              <label class="col-sm-3 col-md-3 form-control-label nopaddingtop">Price:</label>
              <div class="col-sm-8 col-md-9">
                <span class="product-form-price" id="product-form-price">$<%=produto.getValorUnitario() %></span>
                
                
                

              </div>
            </div>

            

            

            
            <div class="form-group row">
              <label for="Quantity" class="col-sm-3 col-md-3 form-control-label">Quantidade:</label>
              <div class="col-sm-8 col-md-9">
               
                  <input type="number" class="qty form-control" id="input-qty" name="quantidade" maxlength="5" value="1" max="<%=produto.getQuantidadeEstoque() %>">
              </div>
            </div>

            


            <!-- Out of Stock -->
            <div class="form-group product-stock product-out-stock row visible">
              <label class="col-sm-3 col-md-3 form-control-label">Availability:</label>
              <div class="col-sm-8 col-md-9">
                <span class="product-form-price">Out of stock</span>
                <p>This product has run out of stock. You may send us an inquiry about it.</p>
                <a href="/contact" class="btn btn-secondary btn-sm" title="Contact Us">Contact Us</a>
                <a href="http://bootstrap.jumpseller.com" class="btn btn-link btn-sm" title="? or Continue Shopping">? or Continue Shopping</a>
              </div>
            </div>

            <!-- Not Available -->

            <div class="form-group product-stock product-unavailable row hidden">
              <label class="col-sm-3 col-md-3 form-control-label">Availability:</label>
              <div class="col-sm-8 col-md-9">
                <span class="product-form-price">Not Available</span>
                <p>This product is currently unavailable. You may send us an inquiry about it.</p>
                <a href="/contact" class="btn btn-secondary btn-sm" title="Contact Us">Contact Us</a>
                <a href="http://bootstrap.jumpseller.com" class="btn btn-link btn-sm" title="? or Continue Shopping">? or Continue Shopping</a>
              </div>
            </div>



            <div class="form-group product-stock product-available row hidden">
              <label class="col-sm-3 col-md-3 form-control-label"></label>
              <div class="col-sm-8 col-sm-offset-3 col-md-9 col-md-offset-3">
                <input type="submit" class="adc btn btn-primary" value="Add to Shopping Cart">
                <a href="http://bootstrap.jumpseller.com" class="btn btn-link btn-sm" title="Continue Shopping">? Continue Shopping</a>
              </div>
            </div>



            <div class="form-group row">
              <label class="col-sm-3 col-md-3 form-control-label">Description:</label>
              <div class="col-sm-8 col-md-9 description">
                <p>The DualShock®4 Wireless Controller for PlayStation®4 defines the next generation of play, combining revolutionary new features with intuitive, precision controls. Improved analog sticks and trigger buttons allow for unparalleled accuracy with every move while innovative new technologies such as the multi-touch, clickable touch pad, integrated light bar, and internal speaker offer exciting new ways to experience and interact with your games. And with the addition of the Share button, celebrate and upload your greatest gaming moments on PlayStation®4 with the touch of a button.&nbsp;</p>
              </div>
            </div>
            <input type="hidden" name="pg" value="CarrinhoServlet" />
            <input type="hidden" name="tipo" value="adicionar" />
            <input type="hidden" name="id" value="<%=produto.getId() %>"/>
            <input type="submit"/>
            </form>
       


           


    </div>
  </div>

  

</div>

