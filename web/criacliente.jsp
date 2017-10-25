<%-- 
    Document   : teste
    Created on : 30/09/2017, 23:56:00
    Author     : alex
--%>

<%@page import="com.projeto.puroverde.entity.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta charset="UTF-8">
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script type="text/javascript" >
    
    function limpa_formulário_cep() {
            //Limpa valores do formulário de cep.
            document.getElementById('rua').value=("");
            document.getElementById('bairro').value=("");
            document.getElementById('cidade').value=("");
            document.getElementById('uf').value=("");
           
    }

    function meu_callback(conteudo) {
        if (!("erro" in conteudo)) {
            //Atualiza os campos com os valores.
            document.getElementById('rua').value=(conteudo.logradouro);
            document.getElementById('bairro').value=(conteudo.bairro);
            document.getElementById('cidade').value=(conteudo.localidade);
            document.getElementById('uf').value=(conteudo.uf);
            
        } //end if.
        else {
            //CEP não Encontrado.
            limpa_formulário_cep();
            alert("CEP não encontrado.");
        }
    }
        
    function pesquisacep(valor) {

        //Nova variável "cep" somente com dígitos.
        var cep = valor.replace(/\D/g, '');

        //Verifica se campo cep possui valor informado.
        if (cep != "") {

            //Expressão regular para validar o CEP.
            var validacep = /^[0-9]{8}$/;

            //Valida o formato do CEP.
            if(validacep.test(cep)) {

                //Preenche os campos com "..." enquanto consulta webservice.
                document.getElementById('rua').value="...";
                document.getElementById('bairro').value="...";
                document.getElementById('cidade').value="...";
                document.getElementById('uf').value="...";
                
                //Cria um elemento javascript.
                var script = document.createElement('script');

                //Sincroniza com o callback.
                script.src = '//viacep.com.br/ws/'+ cep + '/json/?callback=meu_callback';

                //Insere script no documento e carrega o conteúdo.
                document.body.appendChild(script);

            } //end if.
            else {
                //cep é inválido.
                limpa_formulário_cep();
                alert("Formato de CEP inválido.");
            }
        } //end if.
        else {
            //cep sem valor, limpa formulário.
            limpa_formulário_cep();
        }
    };

    </script>
    </head>
    <body>
        <% Cliente c;
           
        %>
<div class="container">
    <div class="row">				
        <div class="col-lg-12 col-md-12 col-sm-12 col-sx-12">
            <h1>Cadastrar Cliente</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 col-sx-12">
            <div class="box" id="preBox">
                Para cadastrar-se preencha o formulário.
            </div>
        </div>
    </div>    
    
    <div class="row">				
        <div class="col-lg-12 col-md-12 col-sm-12 col-sx-12">
            <form method="post" action="?pg=CadastrarClienteServlet">
                <div class="row">
                    <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">            
                        <h4>NOME:
                        <input name="nome" type="text" size="10" maxlength="50" />
                        </h4>
                    </div>
                    <div class="col-lg-1 col-md-1 col-sm-1 col-sx-1"></div>
                    <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">                    
                        <h4>EMAIL:
                        <input name="email" type="email"  size="10" maxlength="50" required/>
                        </h4>
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">            
                        <h4>SENHA:
                            <input name="senha" type="password" size="10"  maxlength="50" />
                        </h4>
                    </div>
                    <div class="col-lg-1 col-md-1 col-sm-1 col-sx-1"></div>
                    <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">                    
                        <h4>CPF:
                            <input name="cpf" type="text" size="10" maxlength="13" />
                        </h4>
                    </div>
                </div>                

                <div class="row">
                    <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">            
                        <h4>TELEFONE:
                            <input name="telefone" type="text" size="10" maxlength="13" />
                        </h4>
                    </div>
                    <div class="col-lg-1 col-md-1 col-sm-1 col-sx-1"></div>
                    <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">                    
                        <h4>DATA NASC.:
                            <input name="dataNascimento" type="date" size="10" maxlength="50" />
                        </h4>
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">            
                        <h4>CEP:
                        <input name="cep" type="text" id="cep" value="" size="10" maxlength="9"
                               onblur="pesquisacep(this.value);" />
                        </h4>
                    </div>
                    <div class="col-lg-1 col-md-1 col-sm-1 col-sx-1"></div>
                    <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">                    
                        <h4>RUA:
                        <input name="rua" type="text" id="rua" size="60" />
                        </h4>
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">            
                        <h4>NÚMERO:
                            <input name="numero" type="text" size="10" maxlength="5" />
                        </h4>
                    </div>
                    <div class="col-lg-1 col-md-1 col-sm-1 col-sx-1"></div>
                    <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">                    
                        <h4>COMPLEMENTO:
                            <input name="complemento" type="text" size="10" maxlength="13" />
                        </h4>
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">            
                        <h4>BAIRRO:
                        <input name="bairro" type="text" id="bairro" size="40" />
                        </h4>
                    </div>
                    <div class="col-lg-1 col-md-1 col-sm-1 col-sx-1"></div>
                    <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">                    
                        <h4>CIDADE:
                        <input name="cidade" type="text" id="cidade" size="40" />
                        </h4>
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-lg-2 col-md-2 col-sm-2 col-sx-2">            
                        <h4>ESTADO:
                        <input name="uf" type="text" id="uf" size="2" />
                        </h4>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3 col-sx-3"></div>
                </div>                 
                <input type="submit" value="cadastrar"/>
            </form>
        </div>    
    </body>
</html>
