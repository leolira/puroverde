<%@page import="com.projeto.puroverde.entity.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>PuroVerde®</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=no">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Love+Ya+Like+A+Sister" rel="stylesheet">
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="js/incrementing.js"></script>
        <script src="js/npm.js"></script>
    </head>
    
    <body>    
        <div class="container" id="corpo">
            <!---LOGO--->
            <div class="row">
                <%
                    Cliente c = (Cliente) request.getSession().getAttribute("loogin");
                    String valor = c==null?"<a href='?pg=CriaClienteServlet'>Registrar-se</a>":"Bem vindo "+c.getNome();
                %>
                <div class="col-lg-12 col-sx-12 col-sm-12 col-md-12" id="registrar">
                    <%= valor%>
                <a href="#conteudo" onclick="loadPage(this)" value="admin.jsp">&nbsp; Administrador</a>
                </div>
            </div>

            <div class="row" id="bglogo">
                <div class="col-lg-5"></div>
                    <div class="col-lg-2 col-md-12 col-sm-12 col-sx-12" id="logo">
                        <img src="image/logoMarca.png" class="img-responsive" alt="logo">
                    </div>
                <div class="col-lg-5"></div>
            </div>
            <!---LOGO fim--->
                        
            <!---DASH--->
            <div class="row">
                <div class="col-lg-12 col-sx-12 col-sm-12 col-md-12" id="promo">
                    <div id="myCarousel" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                            <ol class="carousel-indicators">
                                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                                <li data-target="#myCarousel" data-slide-to="1"></li>
                                <li data-target="#myCarousel" data-slide-to="2"></li>
                            </ol>

                        <!-- Wrapper for slides -->
                        <div class="carousel-inner">
                            <div class="item active">
                              <img src="image/01.jpg" alt="Promo01">
                            </div>

                            <div class="item">
                              <img src="image/02.jpg" alt="Promo02">
                            </div>

                            <div class="item">
                              <img src="image/03.jpg" alt="Promo03">
                            </div>
                        </div>
                        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#myCarousel" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>    
                </div>
            </div>
            <!---DASH fim--->
            
            <!---MENU--->
            <div class="row">
                <div class = "navbar navbar-default" >
                    <div class="row">
                        <div class="col-sx-12 col-sm-12 col-md-12">
                            <button id="botaoMenu"class="navbar-toggle" data-toggle="collapse" data-target=".navCollapse">
                                <span class="icon-bar" id="icon"></span>
                                <span class="icon-bar" id="icon"></span>
                                <span class="icon-bar" id="icon"></span>
                            </button>
                        </div>
                    </div>  

                <div class="collapse navbar-collapse navCollapse" id="menubar">
                        <div class="row">
                            <div class="col-lg-2"></div>
                            <div class="col-lg-6" id="menu">
                                <ul class="nav navbar-nav" id="menubox">
                                    <li><a href="index.jsp" onclick="loadPage(this)" value="listadeprodutos.jsp">INÍCIO</a></li>
                                    <li><a href="#" data-toggle="dropdown">PRODUTOS</a>
                                        <ul class="dropdown-menu">
                                            <li><a href="?pg=ListarProdutos&item=fruta" onclick="loadPage(this)" value="frutas.html"><img src="image/icon-fruta.png" alt="fruit icon" class="categicon"> Frutas</a></li>
                                            
                                            <li><a href="?pg=ListarProdutos&item=legumes" onclick="loadPage(this)" value="legumes.html"><img src="image/icon-fruta.png" alt="fruit icon" class="categicon" onclick="loadPage(this)" value="home.html"> Legumes</a></li>
                                            
                                            <li><a href="?pg=ListarProdutos&item=verdutas" onclick="loadPage(this)" value="verduras.html"><img src="image/icon-fruta.png" alt="fruit icon" class="categicon" onclick="loadPage(this)" value="home.html"> Verduras</a></li>
                                            
                                            <li><a href="?pg=ListarProdutos&item=ovos" onclick="loadPage(this)" value="ovos.html"><img src="image/icon-fruta.png" alt="fruit icon" class="categicon" onclick="loadPage(this)" value="home.html"> Ovos</a></li>
                                            
                                            <li><a href="?pg=ListarProdutos&item=sucos" onclick="loadPage(this)" value="sucos.html"><img src="image/icon-fruta.png" alt="fruit icon" class="categicon" onclick="loadPage(this)" value="home.html"> Sucos</a></li>
                                            
                                            <li><a href="?pg=ListarProdutos&item=cookies" onclick="loadPage(this)" value="cookies.html"><img src="image/icon-fruta.png" alt="fruit icon" class="categicon" onclick="loadPage(this)" value="home.html"> Cookies</a></li>
                                            
                                            <li><a href="?pg=ListarProdutos&item=farinha" onclick="loadPage(this)" value="farinhas.html"><img src="image/icon-fruta.png" alt="fruit icon" class="categicon" onclick="loadPage(this)" value="home.html"> Farinhas</a></li>
                                            
                                            <li><a href="?pg=ListarProdutos&item=laticionios" onclick="loadPage(this)" value="laticinios.html"><img src="image/icon-fruta.png" alt="fruit icon" class="categicon" onclick="loadPage(this)" value="home.html"> Laticínios</a></li>
                                            
                                            <li><a href="?pg=ListarProdutos&item=outros" onclick="loadPage(this)" value="outros.html"><img src="image/icon-fruta.png" alt="fuit icon" class="categicon" onclick="loadPage(this)" value="home.html"> Outros</a></li>
                                        </ul> 
                                    </li>
                                    <li><a href="?pg=Sobre" onclick="loadPage(this)" value="about.jsp">SOBRE NÓS</a></li>
                                    <li><a href="#conteudo" onclick="loadPage(this)" value="organicos.jsp">ORGÂNICOS?</a></li>
                                    <li><a href="#conteudo" onclick="loadPage(this)" value="sac.jsp">SAC</a></li>
                                    <a href="?pg=CarrinhoServlet&tipo=" onclick="loadPage(this)" value="carrinho.jsp">
                                    <button id="cart">
                                    <span class="glyphicon glyphicon-shopping-cart"> </span>
                                    </button>
                                    Meu Carrinho
                                    </a> 
                                </ul> 
                            </div>
                            <div class="col-lg-4" id="search">
                                <form action="?pg=ListarProdutos" method="get" class="form-inline">
                                    <input type="text" name="busca" placeholder="Busque seu produto" class="form-control mr-sm-2">
                                    <input type="submit" value="Buscar" class="btn btn-outline-success my-2 my-sm-0">
                                </form>
                            </div>  
                        </div>
                    </div>
                </div>
            </div>
                <!---MENU fim--->        

                <!---CONTEUDO-->
                
                 <div class="row">
                    <div class="col-lg-12 col-sx-12 col-sm-12 col-md-12">
                        <div id="conteudo">
                            <% String dado = request.getParameter("pg");
                            if(dado==null){
                            %>
                            <jsp:include page="ListarProdutos"/>
                            <%}else{%>
                            <jsp:include page="<%= dado%>"/>
                            <%}%>
                        </div>
                    </div>
                </div>
              
                <!---CONTEUDO fim-->

            
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
                <!---FOOTER-->
             <footer id="footer">
                <div class="row">
                    <div class="col-lg-3 col-sx-3 col-sm-3 col-md-3"></div>
                    <div class="col-lg-2 col-sx-2 col-sm-2 col-md-2">
                       <h2>Mapa do site:</h2>
                    </div>
                    <div class="col-lg-7 col-sx-7 col-sm-7 col-md-7"></div>                    
                </div>
                 
                <div class="row">
                    <div class="col-lg-3 col-sx-3 col-sm-3 col-md-3"></div>
                    <div class="col-lg-1 col-sx-1 col-sm-1 col-md-1">
                    
                        <a href="#"><h2>Início</h2></a>
                        <a href="#"><h2>Sobre Nós</h2></a>
                        
                    </div>
                    <div class="col-lg-1 col-sx-1 col-sm-1 col-md-1">
                        <a href="#"><h2>Orgânicos?</h2></a>
                        <a href="#"><h2>SAC</h2></a>
                        <br>
                    </div>                    
                 
                    <div class="col-lg-7 col-sx-7 col-sm-4 col-md-7">

                        <h2>PuroVerde® 2017</h2>
                        <h4>Produtos orgânicos na sua casa!</h4>
                        <br>
                    </div>
                </div>                 
            </footer>
                <!---FOOTER fim-->
    </body>
</html>

