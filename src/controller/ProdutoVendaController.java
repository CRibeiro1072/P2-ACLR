/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProdutoVendaDAO;

/**
 *
 * @author romildo
 */
public class ProdutoVendaController {     
    
    public ProdutoVendaController(){
        
    }
    
    public void listarItensVenda(){
        ProdutoVendaDAO produtoVenda = new ProdutoVendaDAO();
        produtoVenda.listarItensVenda();
    }
    
    
    
}
