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
import model.Categoria;

/**
 *
 * @author claudinei
 */
public class CategoriaDAO {

    private Connection con = null;

    public CategoriaDAO() {

        con = ConnectionDB.getConnection();

    }

    public boolean inserirCategoriaDAO(Categoria categoria) {

        String sql = "INSERT INTO categoria (categoriaDescricao) values (?)";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, categoria.getCategoriaDescricao());
            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro salvarCategoriaDAO: " + ex);
            return false;

        } finally {

            ConnectionDB.closeConnection(con, stmt);
        }
    }

    public List<Categoria> buscarCategoriasDAO() {

        String sql = "SELECT * FROM categoria ORDER BY categoriaDescricao  ";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Categoria> categoriaLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Categoria categoria = new Categoria();

                //categoria.setCategoriaCodigo(rs.getInt("categoriaCodigo"));
                //categoria.setCategoriaDescricao(rs.getString("categoriaDescricao"));
                
                categoria.setCategoriaCodigo(rs.getInt(Categoria.CATEGORIA_CODIGO));
                categoria.setCategoriaDescricao(rs.getString(Categoria.CATEGORIA_DESCRICAO));

                categoriaLista.add(categoria);

            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarCategoriaDAO: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return categoriaLista;

    }

    
    
    
    public boolean atualizarCategoriaDAO(Categoria categoria) {
        String sql = "UPDATE categoria SET categoriaDescricao = ? "
                + "WHERE categoriaCodigo = ? ";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, categoria.getCategoriaDescricao());
            stmt.setInt(2, categoria.getCategoriaCodigo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro atualizarCategoriaDAO: " + ex);
            return false;
        } finally {
            ConnectionDB.closeConnection(con, stmt);
        }
    }
    
    
    
    
    
    public boolean excluirCategoriaDAO(Categoria categoria) {

        String sql = "DELETE FROM categoria WHERE categoriaCodigo = ?";

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, categoria.getCategoriaCodigo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro excluirCategoriaDAO: " + ex);
            return false;
        } finally {
            ConnectionDB.closeConnection(con, stmt);
        }
    }

    
    
    
    
    
    public List<Categoria> buscarCategoriasComLikeDAO(String categoriaDescricao) {

        String sql = "SELECT * FROM categoria WHERE categoriaDescricao LIKE ? ORDER BY categoriaDescricao ";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Categoria> categoriaLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + categoriaDescricao + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Categoria categoria = new Categoria();
                categoria.setCategoriaCodigo(rs.getInt(Categoria.CATEGORIA_CODIGO));
                categoria.setCategoriaDescricao(rs.getString(Categoria.CATEGORIA_DESCRICAO));

                categoriaLista.add(categoria);

            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarCategoriasDAOComLike: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return categoriaLista;

    }

}
