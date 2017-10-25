package com.puroverde.servlet;


import com.projeto.puroverde.entity.Carrinho;
import com.projeto.puroverde.entity.Cliente;
import com.projeto.puroverde.entity.Vendas;
import com.puroverde.service.CarrinhoService;
import com.puroverde.service.ClienteService;
import com.puroverde.service.VendasService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alex
 */
@WebServlet(name = "FinalizarCompras", urlPatterns = {"/FinalizarCompras"})
public class FinalizarCompras extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        HttpSession session = req.getSession();

        CarrinhoService carS = new CarrinhoService();
        Vendas vendas = new Vendas();
        Cliente cliente;
        
        if(session.getAttribute("login")==null){
            resp.getWriter().print("<script> alert('Você ainda não possui cadastro!"
                    + "por favor realize seu cadastro');</script>");
            RequestDispatcher dispatcher = req.getRequestDispatcher("criacliente.jsp");
            dispatcher.include(req,resp);
            
        }else{
            ArrayList<Carrinho> lista = (ArrayList) session.getAttribute("lista");
            cliente = (Cliente) session.getAttribute("login");
          
            vendas.setDataVenda(new Date());
            vendas.setStatus("Em andamento"); 
            
            carS.salvarCarrinho(lista,vendas,cliente);
            
            session.removeValue("lista");
             
            req.setAttribute("lista", lista);
            RequestDispatcher dispatcher = req.getRequestDispatcher("itensComprados.jsp");
            dispatcher.include(req,resp);
            
        }
       
                
    }

   
}
