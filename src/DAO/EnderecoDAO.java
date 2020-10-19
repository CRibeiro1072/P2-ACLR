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
import javax.swing.JOptionPane;
import model.Cliente;
import model.Endereco;

/**
 * 
 * @author Claudinei
 */
public class EnderecoDAO {

    private Connection con = null;

    public EnderecoDAO() {

        con = ConnectionDB.getConnection();
    }

    public boolean inserirEnderecoDAO(Endereco endereco) {

        String sql = "INSERT INTO endereco (enderecoCliente, "
                + "enderecoDescricao, "
                + "enderecoLogradouro, "
                + "enderecoNumero, "
                + "enderecoComplemento, "
                + "enderecoCep, "
                + "enderecoBairro, "
                + "enderecoCidade, "
                + "enderecoUf) "
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setInt(1, endereco.getEnderecoCliente().getClienteCodigo());
            stmt.setString(2, endereco.getEnderecoDescricao());
            stmt.setString(3, endereco.getEnderecoLogradouro());
            stmt.setString(4, endereco.getEnderecoNumero());
            stmt.setString(5, endereco.getEnderecoComplemento());
            stmt.setString(6, endereco.getEnderecoCep());
            stmt.setString(7, endereco.getEnderecoBairro());
            stmt.setString(8, endereco.getEnderecoCidade());
            stmt.setString(9, endereco.getEnderecoUf());
            stmt.executeUpdate();                      

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro salvarEnderecoDAO: " + ex);
            return false;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }

    }
    
    public List<Endereco> buscarEnderecoDAO() {
        
        String sql = " SELECT e.enderecoCodigo, e.enderecoDescricao, e.enderecoLogradouro, "
                + " e.enderecoNumero, e.enderecoComplemento, e.enderecoCep, "
                + " e.enderecoBairro, e.enderecoCidade, e.enderecoUf, c.clienteNome "
                + " FROM endereco e INNER JOIN cliente c ON e.enderecoCliente = c.clienteCodigo ";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Endereco> enderecoLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Endereco endereco = new Endereco();
              
                endereco.setEnderecoCodigo(rs.getInt(Endereco.ENDERECO_CODIGO));
                endereco.setEnderecoDescricao(rs.getString(Endereco.ENDERECO_DESCRICAO));
                endereco.setEnderecoLogradouro(rs.getString(Endereco.ENDERECO_LOGRADOURO));
                endereco.setEnderecoNumero(rs.getString(Endereco.ENDERECO_NUMERO));
                endereco.setEnderecoComplemento(rs.getString(Endereco.ENDERECO_COMPLEMENTO));
                endereco.setEnderecoCep(rs.getString(Endereco.ENDERECO_CEP));
                endereco.setEnderecoBairro(rs.getString(Endereco.ENDERECO_BAIRRO));
                endereco.setEnderecoCidade(rs.getString(Endereco.ENDERECO_CIDADE));
                endereco.setEnderecoUf(rs.getString(Endereco.ENDERECO_UF));
                
                Cliente cliente = new Cliente();
                cliente.setClienteNome(rs.getString(Cliente.CLIENTE_NOME));
                
                endereco.setEnderecoCliente(cliente);
                enderecoLista.add(endereco);

            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarEnderecoDAO: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return enderecoLista;

    }
    
    public List<Endereco> buscarEnderecoDAOComLike(String enderecoDescricao) {
        
            String sql = " SELECT e.enderecoCodigo, e.enderecoDescricao, e.enderecoLogradouro, "
                + " e.enderecoNumero, e.enderecoComplemento, e.enderecoCep, "
                + " e.enderecoBairro, e.enderecoCidade, e.enderecoUf, c.clienteNome "
                + " FROM endereco e INNER JOIN cliente c ON e.enderecoCliente = c.clienteCodigo "
                + " WHERE e.enderecoDescricao LIKE ? ORDER BY e.enderecoDescricao ";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Endereco> enderecoLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%"+enderecoDescricao+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Endereco endereco = new Endereco();
              
                endereco.setEnderecoCodigo(rs.getInt(Endereco.ENDERECO_CODIGO));
                endereco.setEnderecoDescricao(rs.getString(Endereco.ENDERECO_DESCRICAO));
                endereco.setEnderecoLogradouro(rs.getString(Endereco.ENDERECO_LOGRADOURO));
                endereco.setEnderecoNumero(rs.getString(Endereco.ENDERECO_NUMERO));
                endereco.setEnderecoComplemento(rs.getString(Endereco.ENDERECO_COMPLEMENTO));
                endereco.setEnderecoCep(rs.getString(Endereco.ENDERECO_CEP));
                endereco.setEnderecoBairro(rs.getString(Endereco.ENDERECO_BAIRRO));
                endereco.setEnderecoCidade(rs.getString(Endereco.ENDERECO_CIDADE));
                endereco.setEnderecoUf(rs.getString(Endereco.ENDERECO_UF));
                
                Cliente cliente = new Cliente();
                cliente.setClienteNome(rs.getString(Cliente.CLIENTE_NOME));
                
                endereco.setEnderecoCliente(cliente);
                enderecoLista.add(endereco);
            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarEnderecoDAO: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return enderecoLista; 

    }

    public boolean atualizarEnderecoDAO(Endereco endereco) {

        String sql = "UPDATE endereco SET enderecoDescricao = ?, enderecoLogradouro = ?, "
                    +"enderecoNumero = ?, enderecoComplemento = ?, enderecoCep = ?, "
                    +"enderecoBairro = ?, enderecoCidade = ?, enderecoUf = ?, "
                    +"enderecoCliente = ? WHERE enderecoCodigo = ?";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, endereco.getEnderecoDescricao());
            stmt.setString(2, endereco.getEnderecoLogradouro());
            stmt.setString(3, endereco.getEnderecoNumero());
            stmt.setString(4, endereco.getEnderecoComplemento());
            stmt.setString(5, endereco.getEnderecoCep());
            stmt.setString(6, endereco.getEnderecoBairro());
            stmt.setString(7, endereco.getEnderecoCidade());
            stmt.setString(8, endereco.getEnderecoUf());
            stmt.setInt(9, endereco.getEnderecoCliente().getClienteCodigo());
            stmt.setInt(10, endereco.getEnderecoCodigo());
            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro atualizarEnderecoDAO: " + ex);
            return false;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }

    }

    public boolean excluirEnderecoDAO(Endereco endereco) {

        String sql = "DELETE FROM endereco WHERE enderecoCodigo = ?";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setInt(1, endereco.getEnderecoCodigo());
            stmt.executeUpdate();
           
            return true;

        } catch (SQLException ex) {
            System.err.println("Erro excluirEnderecoDAO: " + ex);
            return false;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }
    }
}
