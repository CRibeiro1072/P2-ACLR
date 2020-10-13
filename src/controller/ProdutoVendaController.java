/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProdutoVendaDAO;
import java.util.List;
import model.ProdutoVenda;

/**
 *
 * @author romildo
 */
public class ProdutoVendaController {     
    
    public ProdutoVendaController(){
        
    }
    
    public List<ProdutoVenda> listarItensVenda(int idVenda){
        ProdutoVendaDAO produtoVenda = new ProdutoVendaDAO();
        return produtoVenda.listarItensVenda(idVenda);        
    }
    
    public float subtotal(int idVenda){
        ProdutoVendaDAO produtoVenda = new ProdutoVendaDAO();
        return produtoVenda.subtotal(idVenda);
    }
    
    
    
}
