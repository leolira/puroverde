
<div class="container">
    <div class="row">				
            <div class="col-lg-12 col-md-12 col-sm-12 col-sx-12">
                <h1>Contato</h1>
            </div>
            <div class="col-lg-12 col-md-12 col-sm-12 col-sx-12">
            <div class="box" id="preBox">
                Se você possui algum questionamento ou sugestão, entre em contato!        
            </div>
            <br>
            <div class="col-lg-12 col-md-12 col-sm-12 col-sx-12">
                <form name="form1" action="enviar" method="post" id="form">
                        <h4>NOME:</h4>            
                        <input type="text" class="campo" id="nome" name="nome" required 
                            data-validation-required-message="Por favor, digite seu nome" required>
                        <h4>E-MAIL:</h4>
                        <input name="email" type="email" class="campo" data-validation-required-message="Por favor, digite seu e-mail." required>

                        <h4>MENSAGEM:</h4>
                        <textarea name="mensagem" class="campoMsg" required></textarea>
                        <br>
                        <input type="submit" value="ENVIAR" class="buttonSend" onclick="return validar()"/>
                </form>										
            </div>
        </div>
    </div>
</div>
