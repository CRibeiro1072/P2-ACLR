/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ProdutoVenda;

/**
 *
 * @author romildo
 */
public class ProdutoVendaDAO {
    
    private Connection con = null;
    
    public ProdutoVendaDAO(){
        con = ConnectionDB.getConnection();
    }
    
    public List<ProdutoVenda> listarItensVenda(int idVenda){
        
        String sql = "SELECT produto.produtoDescricao, venda_produto.qtd, produto.produtoValor, venda_produto.total, SUM(venda_produto.total) as subtotal FROM venda_produto\n" +
                        "JOIN venda ON(venda_produto.vendaCodigo = venda.vendaCodigo)\n" +
                        "JOIN produto ON(venda_produto.produtoCodigo = produto.produtoCodigo)\n" +
                        "WHERE venda.vendaCodigo = ?\n" +
                        "GROUP BY produto.produtoCodigo";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ProdutoVenda> listaItensVenda = new ArrayList<>();
        
        try {

            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idVenda);
            rs = stmt.executeQuery();

            while (rs.next()) {

                ProdutoVenda produtoVenda = new ProdutoVenda();               
                
                produtoVenda.setProdutoDescricao(rs.getString("produtoDescricao"));
                produtoVenda.setQtd(rs.getInt("qtd"));
                produtoVenda.setValorUnitario(rs.getFloat("produtoValor"));
                produtoVenda.setTotal(rs.getFloat("total"));
                produtoVenda.setSubtotal(rs.getFloat("subtotal"));

                listaItensVenda.add(produtoVenda);

            }

        } catch (SQLException ex) {
            System.err.println("Erro listarItensVendaDAO: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return listaItensVenda;
        
    }
    
    public float subtotal(int idVenda){
        String sql = "SELECT venda_produto.vendaCodigo, SUM(venda_produto.total) as subtotal FROM venda_produto\n" +   
                        "JOIN venda ON(venda_produto.vendaCodigo = venda.vendaCodigo)\n" +
                        "WHERE venda.vendaCodigo = ?\n" +
                        "GROUP BY venda_produto.vendaCodigo";

        PreparedStatement stmt = null;
        ResultSet rs = null;         
        
        float result = -1;
        
        try {

            stmt = con.prepareStatement(sql);     
            stmt.setInt(1, idVenda);
            rs = stmt.executeQuery(); 
            
            if(rs.next()){
                result = rs.getFloat("subtotal");
            }           
            
            return result;
            
        } catch (SQLException ex) {
            System.err.println("Erro subtotalDAO: " + ex);            
            return result;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }
    }
    
}
