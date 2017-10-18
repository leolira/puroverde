<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>www.BuscarCep.com.br - Web Service de Ceps e SMS</title>
<meta name="verify-v1" content="yUZBgWaf8i6CalfXTPpy0JqezW3QaQ7/rGCNy/lYl9Y=" />
<meta name="keywords" content="consultas buscas cep web service sms tts torpedo voz online php c# csharp asp.net asp java microsiga avdpl" />
<meta name="description" content="www.BuscarCep.com.br - Web Service de Ceps e SMS" />
<link rel="shortcut icon" href="./img/favicon.ico" />
<link href="style.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" charset="UTF-8">
/* <![CDATA[ */
try { if (undefined == xajax.config) xajax.config = {}; } catch (e) { xajax = {}; xajax.config = {}; };
xajax.config.requestURI = "http://www.buscarcep.com.br/site.php";
xajax.config.statusMessages = false;
xajax.config.waitCursor = true;
xajax.config.version = "xajax 0.5";
xajax.config.legacy = false;
xajax.config.defaultMode = "asynchronous";
xajax.config.defaultMethod = "POST";
/* ]]> */
</script>
<script type="text/javascript" src="./library/ajax/xajax_js/xajax_core.js" charset="UTF-8"></script>
<script type="text/javascript" charset="UTF-8">
/* <![CDATA[ */
window.setTimeout(
 function() {
  var scriptExists = false;
  try { if (xajax.isLoaded) scriptExists = true; }
  catch (e) {}
  if (!scriptExists) {
   alert("Error: the xajax Javascript component could not be included. Perhaps the URL is incorrect?\nURL: ./library/ajax/xajax_js/xajax_core.js");
  }
 }, 2000);
/* ]]> */
</script>

<script type='text/javascript' charset='UTF-8'>
/* <![CDATA[ */
xajax_DadosCliente = function() { return xajax.request( { xjxfun: 'DadosCliente' }, { parameters: arguments } ); };
xajax_geraChave = function() { return xajax.request( { xjxfun: 'geraChave' }, { parameters: arguments } ); };
xajax_buscaCep = function() { return xajax.request( { xjxfun: 'buscaCep' }, { parameters: arguments } ); };
xajax_validaEmail = function() { return xajax.request( { xjxfun: 'validaEmail' }, { parameters: arguments } ); };
xajax_buscaPadrinho = function() { return xajax.request( { xjxfun: 'buscaPadrinho' }, { parameters: arguments } ); };
xajax_solicitarAtivacao = function() { return xajax.request( { xjxfun: 'solicitarAtivacao' }, { parameters: arguments } ); };
xajax_cadastrarConta = function() { return xajax.request( { xjxfun: 'cadastrarConta' }, { parameters: arguments } ); };
xajax_cancelarConta = function() { return xajax.request( { xjxfun: 'cancelarConta' }, { parameters: arguments } ); };
xajax_apagarCredito = function() { return xajax.request( { xjxfun: 'apagarCredito' }, { parameters: arguments } ); };
xajax_gerarCredito = function() { return xajax.request( { xjxfun: 'gerarCredito' }, { parameters: arguments } ); };
xajax_gerarFaturaCredito = function() { return xajax.request( { xjxfun: 'gerarFaturaCredito' }, { parameters: arguments } ); };
xajax_testarPost = function() { return xajax.request( { xjxfun: 'testarPost' }, { parameters: arguments } ); };
xajax_confirmarCadastro = function() { return xajax.request( { xjxfun: 'confirmarCadastro' }, { parameters: arguments } ); };
xajax_recuperar = function() { return xajax.request( { xjxfun: 'recuperar' }, { parameters: arguments } ); };
xajax_contato = function() { return xajax.request( { xjxfun: 'contato' }, { parameters: arguments } ); };
xajax_Paginacao = function() { return xajax.request( { xjxfun: 'Paginacao' }, { parameters: arguments } ); };
xajax_Clientes = function() { return xajax.request( { xjxfun: 'Clientes' }, { parameters: arguments } ); };
xajax_Celulares = function() { return xajax.request( { xjxfun: 'Celulares' }, { parameters: arguments } ); };
xajax_Faturas = function() { return xajax.request( { xjxfun: 'Faturas' }, { parameters: arguments } ); };
xajax_Dados = function() { return xajax.request( { xjxfun: 'Dados' }, { parameters: arguments } ); };
xajax_autenticarCliente = function() { return xajax.request( { xjxfun: 'autenticarCliente' }, { parameters: arguments } ); };
/* ]]> */
</script>
<script src="./library/scriptaculous/lib/prototype.js" type="text/javascript"></script>
<script src="./library/scriptaculous/src/scriptaculous.js" type="text/javascript"></script>
<script src="./library/mascaras.js" type="text/javascript"></script>
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-51952674-1', 'auto');
  ga('send', 'pageview');

</script>
</head>
<body>
<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#86DF00">
  <tr>
    <td height="30" align="center" valign="middle" class="branco" style="background-image:url(img/barra_vertical.png); background-repeat:repeat-x;"><table width="990" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="50%" align="left" class="branco">e-mail contato@buscarcep.com.br ou <a href="?secao=contato">fale conosco</a> <img src="sistema/img/icones_pequenos/email.png" width="18" height="18" /></td>
          <td width="50%" align="right" class="branco">                        <img src="sistema/img/icones_pequenos/auth.png" width="16" height="16" /> <a href="?secao=adm">acesso ao painel administrativo</a>
            </td>
        </tr>
      </table></td>
  </tr>
  <tr>
    <td height="100" align="center"><table width="990" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="25%" height="175" align="center" class="branco"><img name="logo" src="img/logo.png" border="0" id="logo" alt="" /></td>
          <td width="75%" align="center"><table width="96%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td align="center"><span class="titulos">Web Service de buscas de Endere&ccedil;os e</span> <span class="titulos2">SMS</span></td>
              </tr>
              <tr>
                <td align="center">&nbsp;</td>
              </tr>
              <tr>
                <td align="center"><script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<!-- Site Buscar Cep 31-08-2014 -->
<ins class="adsbygoogle"
     style="display:inline-block;width:700px;height:110px"
     data-ad-client="ca-pub-7985113785761594"
     data-ad-slot="4148518263"></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script></td>
              </tr>
          </table></td>
        </tr>
      </table></td>
  </tr>
  <tr>
    <td align="center" class="titulos branco"><table width="990" border="0" cellspacing="0" cellpadding="0" style="background-image:url(img/barra_vertical_maior.png); background-repeat:repeat-x;" height="60">
        <tr>
          <td width="20%" rowspan="2" align="center" valign="middle" class="branco titulos3"><a href="?secao=">principal</a></td>
          <td width="20%" align="center" valign="bottom" class="branco titulos"><a href="?secao=cadastro&amp;servico=ceps">contratar ceps</a></td>
          <td width="20%" rowspan="2" align="center" valign="middle" class="branco titulos3"><a href="?secao=exemplos">exemplos</a></td>
          <td width="20%" rowspan="2" align="center" valign="middle" class="branco titulos3"><a href="?secao=planos">planos</a></td>
          <td width="20%" rowspan="2" align="center" valign="middle" class="branco titulos3"><a href="?secao=webservice">web service</a></td>
        </tr>
        <tr>
          <td align="center" valign="top" class="branco titulos"><a href="?secao=cadastro&amp;servico=sms">contratar SMS</a></td>
        </tr>
      </table></td>
  </tr>
  <tr>
    <td align="center" bgcolor="#D90036"></td>
  </tr>
  <tr>
    <td align="center" bgcolor="#FFFFFF">&nbsp;</td>
  </tr>
    <tr>
    <td height="400" align="center" valign="top" bgcolor="#FFFFFF"><link href="style.css" rel="stylesheet" type="text/css" />
<table width="990" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td colspan="2" align="center" valign="top"><table width="97%" border="0" align="center" cellpadding="2" cellspacing="2" class="tabelaX tdPrataClaro">
      <tr>
        <td align="left" valign="middle" class="vermelho titulos2"><img src="img/document.png" width="17" height="22" border="0" alt="" /> <strong>ATUALIZA&Ccedil;&Atilde;O CADASTRAL, 01/01/2017:</strong></td>
      </tr>
      <tr>
        <td align="left" valign="middle" class="titulos"><blockquote>
          <p>Devido a uma nova norma da FEBRABAN para emiss&atilde;o de boletos vigente em todo<a href="?secao=webservice"><span class="preto"><strong></strong></span></a> Brasil a partir de 01/01/2017 estamos solicitando a todos os nossos clientes que realizem sua atualiza&ccedil;&atilde;o cadastral urgentemente incluindo seu nome completo e cpf ou raz&atilde;o social e cnpj.</p>
          <p>Qualquer d&uacute;vida entre em contato conosco pelo Fale Conosco, e-mail ou telefone.</p>
        </blockquote></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td colspan="2" align="center" valign="top">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="2" align="center" valign="top"><table width="97%" border="0" align="center" cellpadding="2" cellspacing="2" class="tabelaX tdPrataClaro">
        <tr>
          <td align="left" valign="middle" class="verde titulos2"><img src="img/document.png" width="17" height="22" border="0" alt="" /> <strong>EXCLUSIVO BUSCAR CEP - API de SMS:</strong></td>
        </tr>
        <tr>
          <td align="left" valign="middle" class="titulos"><blockquote>
              <p>Cadastre-se no link <a href="?secao=cadastro&servico=sms"><span class="preto"><strong>Contratar SMS</strong></span></a> e ganhe 100 Cr&eacute;ditos SMS mensalmente. Caso precise de mais, voc&ecirc; poder&aacute; comprar mais cr&eacute;ditos a qualquer momento!</p>
              <p>Voc&ecirc; pode utilizar nosso Painel Administrativo, menu SMS, para enviar seus SMS's ou integrar suas aplica&ccedil;&otilde;es e sites diretamente com nossa API de envio de SMS e captura de repostas do SMS. Toda documenta&ccedil;&atilde;o est&aacute; dispon&iacute;vel no link <a href="?secao=webservice"><span class="preto"><strong>Web Services</strong></span></a>.</p>
              <span class="txt_menor">* Os Cr&eacute;ditos SMS ser&atilde;o depositados em sua conta no momento do cadastro e todo dia 01 de cada m&ecirc;s. Essa promo&ccedil;&atilde;o &eacute; v&aacute;lida por tempo indeterminado.</span></blockquote></td>
        </tr>
      </table></td>
  </tr>
  <tr>
    <td colspan="2" align="center" valign="top">&nbsp;</td>
  </tr>
  <tr>
    <td width="50%" align="center" valign="top"><form action="" method="post" name="formChave" id="formChave" style="margin:0px">
        <table width="94%" border="0" align="center" cellpadding="2" cellspacing="2" class="tabelaX tdPrataClaro">
          <tr>
            <td colspan="2" align="left" class="verde titulos2"><img src="img/chave.png" width="29" height="15" border="0" alt="" /> Recupera&ccedil;&atilde;o de chave</td>
          </tr>
          <tr>
            <td width="25%" align="right"><span>E-mail:</span></td>
            <td width="75%" align="left"><input name="email" id="email" type="text" size="20" maxlength="75" class="forms" />
              <input title="Chave" name="btnChave" type="button" class="forms" value="Ok" onclick="xajax_recuperar('Chave', xajax.getFormValues('formChave'));" id="btnChave"/></td>
          </tr>
        </table>
      </form></td>
    <td width="50%" align="center" valign="top"><form id="formRevisaoCep" name="formRevisaoCep" method="post" action="">
        <table width="94%" border="0" align="center" cellpadding="2" cellspacing="2" class="tabelaX tdPrataClaro">
          <tr>
            <td colspan="2" align="left" class="verde titulos2"><img src="img/revisacep.png" width="29" height="21" /> Solicitar Inclus&atilde;o/Revis&atilde;o de Cep</td>
          </tr>
          <tr>
            <td width="25%" align="right"><span>Digite o CEP:</span></td>
            <td width="75%" align="left"><input name="revisaCep" type="text" class="forms" id="revisaCep" size="10" maxlength="9" onkeypress="FormatarCEP(this,event)"/>
              <input name="btnRevisaoCep" type="submit" class="forms" id="btnRevisaoCep" value="Ok" />
              </td>
          </tr>
        </table>
      </form></td>
  </tr>
  <tr>
    <td colspan="2" align="center" valign="top">&nbsp;</td>
  </tr>
  <tr>
    <td width="50%" align="center" valign="top"><form id="formNewsletter" name="formNewsletter" method="post" action="">
        <table width="94%" border="0" align="center" cellpadding="2" cellspacing="2" class="tabelaX tdPrataClaro">
          <tr>
            <td colspan="2" align="left" class="titulos2 verde"><img src="img/email.png" width="22" height="22" border="0" alt="" /> Newsletters Buscar CEP</td>
          </tr>
          <tr>
            <td width="25%" align="right"><span>E-mail:</span></td>
            <td width="75%" align="left" class="titulos"><input name="newsletter" type="text" class="forms" id="newsletter" size="20" maxlength="75" />
              <input name="btnCadastrar" type="submit" class="forms" id="btnCadastrar" value="Ok" />
              </td>
          </tr>
        </table>
      </form></td>
    <td align="center" valign="top"><table width="94%" border="0" align="center" cellpadding="2" cellspacing="2" class="tabelaX tdPrataClaro">
        <tr>
          <td align="left" valign="middle" class="titulos2 verde"><img src="img/up.png" width="22" height="22" border="0" alt="Service Status" /> Estat&iacute;sticas</td>
        </tr>
        <tr>
          <td align="center" valign="middle">&nbsp;</td>
        </tr>
        <tr>
          <td align="center" valign="middle"><table width="50%" border="0" cellpadding="2" cellspacing="2" class="tabelaX tdBranco">
              <tr>
                <td align="center"><img src="img/confirmar.png" width="18" height="18" /></td>
                <td align="center"><a href="?secao=status_servico"><span class="txt_menor preto">Verificar status do servi&ccedil;o.</span></a></td>
              </tr>
            </table></td>
        </tr>
      </table></td>
  </tr>
  <tr>
    <td colspan="2" align="center" valign="top">&nbsp;</td>
  </tr>
  <tr>
    <td align="center" valign="top"><form id="formBuscaCep" name="formBuscaCep" method="post" action="">
        <table width="94%" border="0" align="center" cellpadding="2" cellspacing="2" class="tabelaX tdPrataClaro">
          <tr>
            <td colspan="2" align="left" class="verde titulos2"><img src="img/cep.png" width="29" height="21" /> Buscar Endere&ccedil;o de Cep</td>
          </tr>
          <tr>
            <td width="25%" align="right"><span>Digite o CEP:</span></td>
            <td width="75%" align="left"><input name="cep_procurado" type="text" class="forms" id="cep_procurado" size="10" maxlength="9" onkeyup="if(this.value.length == 9) xajax_buscaCep(this.value, 'endereco', 'bairro', 'cidade', 'estado', 'ibge_municipio', 'innerHTML');" onblur="xajax_buscaCep(this.value, 'endereco', 'bairro', 'cidade', 'estado', 'ibge_municipio', 'innerHTML');" onkeypress="FormatarCEP(this,event)"/>
              <input title="Buscar Cep" name="btnBuscarCep" type="button" class="forms" value="Ok" id="btnBuscarCep"/></td>
          </tr>
          <tr>
            <td align="right"><span>Logradouro:</span></td>
            <td align="left"><label id="endereco"></label></td>
          </tr>
          <tr>
            <td align="right"><span>Bairro:</span></td>
            <td align="left"><label id="bairro"></label></td>
          </tr>
          <tr>
            <td align="right"><span>Cidade:</span></td>
            <td align="left"><label id="cidade"></label></td>
          </tr>
          <tr>
            <td align="right"><span>Estado:</span></td>
            <td align="left"><label id="estado"></label></td>
          </tr>
          <tr>
            <td align="right"><span>C&oacute;d. IBGE:</span></td>
            <td align="left"><label id="ibge_municipio"></label></td>
          </tr>
        </table>
      </form></td>
    <td align="center" valign="top"><table width="94%" border="0" align="center" cellpadding="2" cellspacing="2" class="tabelaX tdPrataClaro">
        <tr>
          <td align="left" valign="middle" class="titulos2 azul"><img src="img/mensagens.png" width="22" height="22" border="0" /> <strong>SMS para quem usa a API de CEPs</strong></td>
        </tr>
        <tr>
          <td align="left" valign="middle"><p>Toda fatura paga do servi&ccedil;o de ceps a partir de 01/06/2014, vai gerar cr&eacute;ditos para envios de SMS para o cliente. Por exemplo:</p>
            <ul>
              <li>Em planos mensais o cliente ganha 5 cr&eacute;ditos a cada fatura paga;</li>
              <li>Em planos trimestrais 15 cr&eacute;ditos;</li>
              <li>E em planos semestrais 30 cr&eacute;ditos.</li>
            </ul></td>
        </tr>
      </table></td>
  </tr>
  <tr>
    <td align="center" valign="top">&nbsp;</td>
    <td align="center" valign="top">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="2" align="center" valign="top"><table width="97%" border="0" align="center" cellpadding="2" cellspacing="2" class="tabelaX tdPrataClaro">
        <tr>
          <td align="left" valign="middle" class="verde titulos2"><img src="img/document.png" width="17" height="22" border="0" alt="" /> NOT&Iacute;CIAS:</td>
        </tr>
        <tr>
          <td align="left" valign="middle"> Not&iacute;cias, 10/08/2016:<br />
            <ul>
              <li>Realizamos uma s&eacute;rie de atualiza&ccedil;&otilde;es em nossos algor&iacute;tmos e frameworks da API de CEPs e da API de SMS para que o servi&ccedil;o fique ainda mais r&aacute;pido;</li>
              <li>Agora todo cliente do Buscar Cep ganha 100 cr&eacute;ditos SMS mensalmente.</li>
            </ul>
            Not&iacute;cias, 01/07/2015:<br />
            <ul>
              <li>Foram disponibilizados novos gateways de envio dos SMS;</li>
              <li>Telas de monitoramento de status do servi&ccedil;os disponibilizadas.</li>
            </ul>
            Not&iacute;cias, 30/12/2014:<br />
            <ul>
              <li>Os SMS enviados pelo Buscar Cep aceitam respostas, que s&atilde;o capturadas e enviadas via POST a uma URL informada em seus dados cadastrais;</li>
              <li>Essas respostas ainda podem ser consultadas pelo web service.</li>
            </ul>
            Not&iacute;cias, 15/06/2014:<br />
            <ul>
              <li>Inserido mais uma busca por endere&ccedil;o, para mais informa&ccedil;&otilde;es consulte o item #4 do link Web Service;</li>
              <li>Inserido no painel de controle o link &quot;cancelar conta&quot; para realizar o cancelamento da conta do cliente.</li>
            </ul>
            Not&iacute;cias, 29/05/2014:<br />
            <ul>
              <li>No retorno de ceps a partir de agora teremos as informa&ccedil;&otilde;es de altitude, longitude, latitude e area.</li>
            </ul>
            Not&iacute;cias, 20/01/2014:<br />
            <ul>
              <li>Tabela de c&oacute;digos do IBGE foi atualizada e agora cont&eacute;m os c&oacute;digos de munic&iacute;pios e distritos.</li>
            </ul>
            Not&iacute;cias, 18/10/2013:<br />
            <ul>
              <li>Foi realizado acerto nos CEPs desmembrados;</li>
              <li>Foi instalado Certificado SSL no servi&ccedil;o: https://buscarcep.com.br.</li>
            </ul>
            Comunicado, 01/01/2014:<br />
            <ul>
              <li>Buscas gratuitas foram encerradas. Todos os usu&aacute;rios gratuitos que quiserem continuar utilizando o servi&ccedil;o dever&atilde;o realizar upgrade de sua conta.</li>
            </ul>
            Not&iacute;cias, 21/06/2013:<br />
            <ul>
              <li>O Buscar Cep disponibilizou uma chave padr&atilde;o para testes e valida&ccedil;&atilde;o de sistemas: Chave_Gratuita_BuscarCep</li>
              <li>A chave tem somente 1 busca por minuto.</li>
            </ul>
            Not&iacute;cias, 07/05/2013:<br />
            <ul>
              <li>Alterada p&aacute;gina inicial do BuscarCep.com.br;</li>
              <li>Disponibilizado Painel Administrativo para os usu&aacute;rio alterarem seus dados e solicitarem altera&ccedil;&atilde;o de planos;</li>
            </ul>
            Not&iacute;cias, 03/05/2013:<br />
            <ul>
              <li>Incluso solicita&ccedil;&atilde;o de inclus&atilde;o e revis&atilde;o de Ceps;</li>
              <li>Mudan&ccedil;a nos valores dos planos e bloqueio de cadastros gratuitos;</li>
              <li>Acerto nos logradouros, removendo &quot;lado par&quot; e &quot;lado impar&quot;;</li>
              <li>Acertados relat&oacute;rios estat&iacute;sticos de uso do servi&ccedil;o.</li>
            </ul>
            Not&iacute;cias, 01/07/2011:<br />
            <ul>
              <li>A atualiza&ccedil;&atilde;o de nossa base de dados de ceps est&aacute; completa;</li>
              <li>Inclu&iacute;mos uma busca por cep na nossa p&aacute;gina principal;</li>
              <li>Formul&aacute;rio para solicitar revis&atilde;o de dados de um determinado cep na p&aacute;gina principal.</li>
            </ul>
            Not&iacute;cias, 28/06/2010:<br />
            <ul>
              <li>A atualiza&ccedil;&atilde;o de nossa base de dados de ceps est&aacute; completa;</li>
              <li>Todo cep buscado em nossa base de dados e n&atilde;o encontrado ser&aacute; cadastrado manualmente no buscar cep em 72 horas.</li>
            </ul>
            Not&iacute;cias, 13/07/2009:<br />
            <ul>
              <li>Foi implementado no buscar cep a busca reversa por logradouro, onde voc&ecirc; passar&aacute; parametros de LOGRADOURO e CIDADE obrigat&oacute;rios e paramatro BAIRRO opcionalmente como filtro.<br />
              </li>
              <li>Com esses parametros passados voc&ecirc; ter&aacute; como retorno todos os dados do endere&ccedil;o, inclusive o c&oacute;digo IBGE da localidade. Clique <a href="?secao=webservice"><span class="preto">aqui</span></a> e veja como funciona.</li>
            </ul></td>
        </tr>
      </table></td>
  </tr>
</table>
</td>
  </tr>
  <tr>
    <td align="center" bgcolor="#FFFFFF">&nbsp;</td>
  </tr>
  <tr>
    <td align="center" class="txt_menor branco"><table width="990" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td align="left" class="branco">&nbsp;</td>
          <td align="right" class="branco">&nbsp;</td>
          <td align="center" class="branco">&nbsp;</td>
        </tr>
        <tr>
          <td width="45%" align="left" class="branco">www.buscarcep.com.br | <a href="?secao=politica_uso">pol&iacute;tica de uso</a> | <a href="?secao=contato">fale conosco</a> | EUA</td>
          <td width="45%" align="right" class="branco txt_menor">um produto desenvolvido por<br />
            Host-Up Solu&ccedil;&otilde;es Web</td>
          <td width="10%" align="center" class="branco"><a href="http://www.host-up.com" target="_blank"><img name="hostup" src="img/hostup.png" width="60" height="60" border="0" id="hostup" alt="" /></a></td>
        </tr>
      </table></td>
  </tr>
  <tr>
    <td align="center" class="txt_menor">&nbsp;</td>
  </tr>
</table>
</body>
</html>
