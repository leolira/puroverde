package com.puroverde.servlet;

import com.projeto.puroverde.entity.Carrinho;
import com.puroverde.service.CarrinhoService;
import com.puroverde.service.ProdutoService;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CarrinhoServlet", urlPatterns = {"/CarrinhoServlet"})
public class CarrinhoServlet extends HttpServlet {
    
    ArrayList<Carrinho> lista;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        HttpSession session = req.getSession();
        CarrinhoService c = new CarrinhoService();
      
        
        if(session.getAttribute("lista")==null){
            lista = new ArrayList<Carrinho>();
            session.setAttribute("lista", lista);
            
        }else{
            lista = (ArrayList) session.getAttribute("lista");
        }
        
        switch(req.getParameter("tipo")){
            case "adicionar":
                adincionar(req,resp);
                break;
            case "remover":
                remover(req,resp);
                break;
            case "quantidade":
                quantidade(req,resp);
                break;
            default:
                
                
        }
        
        req.setAttribute("lista",lista);
        
        req.getRequestDispatcher("carrinho.jsp").include(req, resp);
        
    }
    
    protected ArrayList<Carrinho> adincionar(HttpServletRequest req, HttpServletResponse resp){
        
        ProdutoService ps = new ProdutoService();
        Carrinho p = new Carrinho();

        p.setVendaProduto(ps.Busca(Long.parseLong(req.getParameter("id"))));
        p.setQuantidadeVenda(Integer.parseInt(req.getParameter("quantidade")));
        
        boolean contem = false;
        
        for(Carrinho v:lista){
            if(v.getVendaProduto().getId()==p.getVendaProduto().getId()){
                v.setQuantidadeVenda((v.getQuantidadeVenda()+p.getQuantidadeVenda()));
                contem = true;
            }
        }
        
        if(!contem){
            lista.add(p);
        }
        return lista;
    }
    
    protected ArrayList<Carrinho> remover(HttpServletRequest req, HttpServletResponse resp){
        
        Long id = Long.parseLong(req.getParameter("id"));
            
        for(int x = 0;x<lista.size();x++){
            if(lista.get(x).getVendaProduto().getId().equals(id)){
                lista.remove(lista.get(x));
            }
        }
    return lista;
    
    }
    
    protected ArrayList<Carrinho> quantidade (HttpServletRequest req, HttpServletResponse resp){
        
        Long id = Long.parseLong(req.getParameter("id"));
        int quantidade = Integer.parseInt(req.getParameter("quant"));
        
            
        for(int x = 0;x<lista.size();x++){
            if(lista.get(x).getVendaProduto().getId().equals(id)){
               lista.get(x).setQuantidadeVenda(lista.get(x).getQuantidadeVenda()+quantidade);
               if(lista.get(x).getQuantidadeVenda()==0){
                   lista.remove(x);
               }
               
            }
        }
        
        
        return lista;
    
    }
}
