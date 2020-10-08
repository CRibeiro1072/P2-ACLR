/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Comentário Romildo
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author Romildo
 */
public class ClienteDAO {
    
    private Connection con = null;

    public ClienteDAO() {

        con = ConnectionDB.getConnection();

    }
    
    public List<Cliente> buscarClienteDAO() {

        String sql = "SELECT * FROM cliente ORDER BY clienteNome";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clienteLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();

                //categoria.setCategoriaCodigo(rs.getInt("categoriaCodigo"));
                //categoria.setCategoriaDescricao(rs.getString("categoriaDescricao"));
                
                cliente.setClienteCodigo(rs.getInt(Cliente.CLIENTE_CODIGO));
                cliente.setClienteNome(rs.getString(Cliente.CLIENTE_NOME));

                clienteLista.add(cliente);

            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarClienteDAO: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return clienteLista;

    }
    
    public List<Cliente> buscarClienteComLikeDAO(String clienteNome) {

        String sql = "SELECT * FROM cliente WHERE clienteNome LIKE ? ORDER BY clienteNome";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clienteLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + clienteNome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();
                cliente.setClienteCodigo(rs.getInt(Cliente.CLIENTE_CODIGO));
                cliente.setClienteNome(rs.getString(Cliente.CLIENTE_NOME));

                clienteLista.add(cliente);

            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarClienteDAOComLike: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return clienteLista;

    }    

    public String getNomeCliente(int id) {
        ResultSet rs = null;
        
        String sql = "SELECT clienteNome AS nome FROM cliente WHERE clienteCodigo = ?";
        
        String nome = "";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);          
            stmt.setInt(1, id);
            rs = stmt.executeQuery();                        
            
            if(rs.next()){
                nome = rs.getString("nome");
            }
            
            return nome;

        } catch (SQLException ex) {
            String error = "Erro getNomeCliente: " + ex;
            return error;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }
    }
}
   
