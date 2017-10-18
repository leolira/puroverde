<%-- 
    Document   : teste
    Created on : 30/09/2017, 23:56:00
    Author     : alex
--%>

<%@page import="com.projeto.puroverde.entity.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        
        <h1>Cadastrar Cliente!</h1>
       
         <form method="post" action="..\CadastrarClienteServlet">
            <label>Nome:
            <input name="nome" type="text" size="10" maxlength="50" /></label><br/><br/>
            <label>Email:
                <input name="email" type="email" size="10" maxlength="50" /></label><br/><br/>
            <label>Senha:
                <input name="senha" type="password" size="10" maxlength="50" /></label><br/><br/>
             
            <label>CPF:
                <input name="cpf" type="text" size="10" maxlength="13" /></label><br/><br/>
            
            <label>Telefone:
                <input name="telefone" type="text" size="10" maxlength="13" /></label><br/><br/>
            
             <label>Data Nascimento:
                 <input name="dataNascimento" type="date" size="10" maxlength="50" /></label><br/><br/>
            
            <label>Cep:
            <input name="cep" type="text" id="cep" value="" size="10" maxlength="9"
                   onblur="pesquisacep(this.value);" /></label><br /><br/>
            <label>Rua:
            <input name="rua" type="text" id="rua" size="60" /></label><br /><br />
             <label>Numero:
                <input name="numero" type="text" size="10" maxlength="13" /></label><br/><br/>
              <label>Complemento:
                <input name="complemento" type="text" size="10" maxlength="13" /></label><br/><br/>
            <label>Bairro:
            <input name="bairro" type="text" id="bairro" size="40" /></label><br /><br />
            <label>Cidade:
            <input name="cidade" type="text" id="cidade" size="40" /></label><br /><br />
            <label>Estado:
            <input name="uf" type="text" id="uf" size="2" /></label><br /><br />
            
             <label><input type="submit" value="cadastrar"/></label><br /><br />
            
      </form>
    </body>
</html>
