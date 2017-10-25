<%-- 
    Document   : cadastrarProduto
    Created on : 22/10/2017, 22:32:27
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <div class="registroprod">
         <div class="container">
         <div class="row">
             <h1>Cadastrar produto</h1>
         </div>
             <form name="form1" action="enviar" method="post" id="form" img src="image/file.png">

             <div class="row">
             <div class="col-lg-12 col-md-12 col-sm-12 col-sx-12">
             <p>Imagem do produto <br>(Clique para selecionar: PNG somente)</p>
                 <div class="inputimg">
                     <label for='fileimg'>Selecionar</label>    
                     <input id='fileimg' type="file" accept=".png"/>
                 </div>
             </div>

             </div>

             <div class="row">				
             <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">
                 <p>Nome do produto:</p>            
                 <input type="text" class="campo" id="nome" name="nome" required="" 
                 data-validation-required-message="Por favor, digite seu nome" required="">   
                 </div>
                 <div class="col-lg-1 col-md-1 col-sm-1 col-sx-1"></div>
                 <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">
                 <p>Descrição</p>            
                 <input type="text" class="campo" id="desc" name="desc" required="" 
                 data-validation-required-message="Por favor, digite seu nome" required="">
                 </div>
                 <div class="col-lg-7 col-md-7 col-sm-7 col-sx-7"></div>
             </div>

             <div class="row">

             <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">
                 <p>Preço:</p>            
                 <input type="text" class="campo" id="preco" name="preco" required="" 
                 data-validation-required-message="Por favor, digite seu nome" required="">   
                 </div>
                 <div class="col-lg-1 col-md-1 col-sm-1 col-sx-1"></div>
                 <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">
                 <p>Quantidade</p>            
                 <input type="text" class="campo" id="qtd" name="qtd" required="" 
                 data-validation-required-message="Por favor, digite seu nome" required="">
                 </div>
                 <div class="col-lg-7 col-md-7 col-sm-7 col-sx-7"></div>                

             </div>

            <div class="row">
                <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">
                    <p>Categoria:</p>            
                    <select id="categoria" name="categoria">
                        <option selected="selected" value=""></option>
                        <option value="1">Frutas</option>
                        <option value="2">Legumes</option>
                        <option value="3">Verduras</option>
                        <option value="4">Ovos</option>
                        <option value="5">Sucos</option>
                        <option value="6">Cookies</option>
                        <option value="7">Farinhas</option>
                        <option value="8">Laticínios</option>
                        <option value="9">Outros</option>						
                    </select>
                </div>
                <div class="col-lg-1 col-md-1 col-sm-1 col-sx-1"></div>

                <div class="col-lg-9 col-md-9 col-sm-9 col-sx-9"></div> 

            </div>                 

             <br>
             <input type="submit" value="Cadastrar" class="buttonSend" onclick="return validar()"/>
             </form>
         </div>
     </div>
    </body>
</html>
