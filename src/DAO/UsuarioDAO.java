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
import model.Usuario;

/**
 *
 * @author claudinei
 */
public class UsuarioDAO {

    private Connection con = null;

    public UsuarioDAO() {

        con = ConnectionDB.getConnection();

    }

    public boolean inserirUsuarioDAO(Usuario usuario) {

        String sql = "INSERT INTO usuario (usuarioNome, usuarioEmail, usuarioSenha, usuarioAdministrador) values (?, ?, ?, ?)";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getUsuarioNome());
            stmt.setString(2, usuario.getUsuarioEmail());
            stmt.setString(3, usuario.getUsuarioSenha());
            stmt.setBoolean(4, usuario.getUsuarioAdministrador());
            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro salvarUsuarioDAO: " + ex);
            return false;

        } finally {

            ConnectionDB.closeConnection(con, stmt);
        }
    }

    public List<Usuario> buscarUsuarioDAO() {

        String sql = "SELECT * FROM usuario ORDER BY usuarioNome";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarioLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();
                
                usuario.setUsuarioCodigo(rs.getInt(Usuario.USUARIO_CODIGO));
                usuario.setUsuarioNome(rs.getString(Usuario.USUARIO_NOME));
                usuario.setUsuarioEmail(rs.getString(Usuario.USUARIO_EMAIL));
                usuario.setUsuarioSenha(rs.getString(Usuario.USUARIO_SENHA));
                usuario.setUsuarioAdministrador(rs.getBoolean(Usuario.USUARIO_ADMINISTRADOR));

                usuarioLista.add(usuario);

            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarUsuarioDAO: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return usuarioLista;

    }    
    
    public boolean atualizarUsuarioDAO(Usuario usuario) {
        String sql = "UPDATE usuario SET usuarioNome = ?, usuarioEmail = ?, usuarioSenha = ?, usuarioAdministrador = ? "
                + "WHERE usuarioCodigo = ? ";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getUsuarioNome());
            stmt.setString(2, usuario.getUsuarioEmail());
            stmt.setString(3, usuario.getUsuarioSenha());
            stmt.setBoolean(4, usuario.getUsuarioAdministrador());
            stmt.setInt(5, usuario.getUsuarioCodigo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro atualizarUsuarioDAO: " + ex);
            return false;
        } finally {
            ConnectionDB.closeConnection(con, stmt);
        }
    }
        
    public boolean excluirUsuarioDAO(Usuario usuario) {

        String sql = "DELETE FROM usuario WHERE usuarioCodigo = ?";

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, usuario.getUsuarioCodigo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro excluirUsuarioDAO: " + ex);
            return false;
        } finally {
            ConnectionDB.closeConnection(con, stmt);
        }
    }     
    
    public List<Usuario> buscarUsuarioComLikeDAO(String usuarioNome) {

        String sql = "SELECT * FROM usuario WHERE usuarioNome LIKE ? ORDER BY usuarioNome ";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarioLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + usuarioNome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();
                usuario.setUsuarioCodigo(rs.getInt(Usuario.USUARIO_CODIGO));
                usuario.setUsuarioNome(rs.getString(usuario.USUARIO_NOME));
                usuario.setUsuarioEmail(rs.getString(usuario.USUARIO_EMAIL));
                usuario.setUsuarioSenha(rs.getString(usuario.USUARIO_SENHA));
                usuario.setUsuarioAdministrador(rs.getBoolean(usuario.USUARIO_ADMINISTRADOR));

                usuarioLista.add(usuario);

            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarUsuarioDAOComLike: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return usuarioLista;

    }
    
    public boolean usuarioLoginDAO(String usuarioEmail, String usuarioSenha) {

        String sql = "SELECT usuarioEmail, usuarioSenha FROM usuario WHERE usuarioEmail = ? AND usuarioSenha = ?";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuarioEmail);
            stmt.setString(2, usuarioSenha);
            rs = stmt.executeQuery();
            
            if (rs.next()){
                check = true;
            }

        } catch (SQLException ex) {
            System.err.println("Erro ao logar usuario: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return check;

    }
    


}
