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
import model.Cliente;

/**
 *
 * @author romildo
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
}
   
