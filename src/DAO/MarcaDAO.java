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
import model.Marca;


/**
 *
 * @author claudinei
 */
public class MarcaDAO {


    private Connection con = null;

    public MarcaDAO() {

        con = ConnectionDB.getConnection();

    }

    public boolean inserirMarcaDAO(Marca marca) {

        String sql = "INSERT INTO marca (marcaDescricao) values (?)";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, marca.getMarcaDescricao());
            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro salvarMarcaDAO: " + ex);
            return false;

        } finally {

            ConnectionDB.closeConnection(con, stmt);
        }
    }

    public List<Marca> buscarMarcaDAO() {

        String sql = "SELECT * FROM marca ORDER BY marcaDescricao  ";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Marca> marcaLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Marca marca = new Marca();

                //categoria.setCategoriaCodigo(rs.getInt("categoriaCodigo"));
                //categoria.setCategoriaDescricao(rs.getString("categoriaDescricao"));
                
                marca.setMarcaCodigo(rs.getInt(Marca.MARCA_CODIGO));
                marca.setMarcaDescricao(rs.getString(Marca.MARCA_DESCRICAO));

                marcaLista.add(marca);

            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarMarcaDAO: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return marcaLista;

    }

    
    
    
    public boolean atualizarMarcaDAO(Marca marca) {
        String sql = "UPDATE marca SET marcaDescricao = ? "
                + "WHERE marcaCodigo = ? ";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, marca.getMarcaDescricao());
            stmt.setInt(2, marca.getMarcaCodigo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro atualizarMarcaDAO: " + ex);
            return false;
        } finally {
            ConnectionDB.closeConnection(con, stmt);
        }
    }
    
    
    
    
    
    public boolean excluirMarcaDAO(Marca marca) {

        String sql = "DELETE FROM marca WHERE marcaCodigo = ?";

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, marca.getMarcaCodigo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro excluirMarcaDAO: " + ex);
            return false;
        } finally {
            ConnectionDB.closeConnection(con, stmt);
        }
    }

    
    
    
    
    
    public List<Marca> buscarMarcasComLikeDAO(String marcaDescricao) {

        String sql = "SELECT * FROM marca WHERE marcaDescricao LIKE ? ORDER BY marcaDescricao ";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Marca> marcaLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + marcaDescricao + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Marca marca = new Marca();
                marca.setMarcaCodigo(rs.getInt(Marca.MARCA_CODIGO));
                marca.setMarcaDescricao(rs.getString(Marca.MARCA_DESCRICAO));

                marcaLista.add(marca);

            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarMarcasDAOComLike: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return marcaLista;

    }    
}
