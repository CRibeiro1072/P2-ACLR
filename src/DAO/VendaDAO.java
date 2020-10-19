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
import model.Venda;

/**
 *
 * @author romildo
 */
public class VendaDAO {
    
    private Connection con = null;

    public VendaDAO() {

        con = ConnectionDB.getConnection();
    }
    
    private int consultaUltimoId(){
        ResultSet rs = null;
        
        String sql = "SELECT MAX(vendaCodigo) AS id FROM venda";
        
        int idVenda = 0;

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);          
            rs = stmt.executeQuery(); 
            
            if(rs.next()){
                idVenda = rs.getInt("id");
            }
            
            return idVenda;

        } catch (SQLException ex) {
            System.err.println("Erro consultaUltimoId: " + ex);
            return -1;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }
    }
    
    public int iniciarVenda(){
        String sql = "INSERT INTO venda (vendaCodigo)"
                + "values (?)";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, null);
            stmt.execute();                       

            return consultaUltimoId();

        } catch (SQLException ex) {
            System.err.println("Erro iniciarVendaDAO: " + ex);
            return -1;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }
    }
    
    public boolean anulada(int id){
        String sql = "DELETE FROM venda WHERE vendaCodigo = ?";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();                       

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro anuladaDAO: " + ex);
            return false;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }
    }
    
    public boolean setCliente(int idVenda, int idCliente) {
        String sql = "UPDATE venda SET vendaCliente = ? WHERE vendaCodigo = ?";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idCliente);
            stmt.setInt(2, idVenda);
            stmt.execute();                       

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro iniciarVendaDAO: " + ex);
            return false;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }
    }
}
