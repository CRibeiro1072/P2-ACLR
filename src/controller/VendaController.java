/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.VendaDAO;

/**
 *
 * @author romildo
 */
public class VendaController {
    
    public int iniciarVenda(){
        
        VendaDAO venda = new VendaDAO();             
        
        return venda.iniciarVenda();
        
    }
    
    public boolean anulada(int id){
        
        VendaDAO venda = new VendaDAO();
        
        return venda.anulada(id);
        
    }
    
    public boolean setCliente(int idVenda, int idCliente) {
        VendaDAO venda = new VendaDAO();
        
        return venda.setCliente(idVenda, idCliente);
    }
    
}
