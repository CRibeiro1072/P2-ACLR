/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;

/**
 *
 * @author romildo
 */
public class ProdutoVendaDAO {
    
    private Connection con = null;
    
    public ProdutoVendaDAO(){
        con = ConnectionDB.getConnection();
    }
    
    public void listarItensVenda(){
        
    }
    
}
