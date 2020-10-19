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
import model.Situacao;


/**
 *
 * @author claudinei
 */
public class SituacaoDAO {


    private Connection con = null;

    public SituacaoDAO() {

        con = ConnectionDB.getConnection();

    }

    public boolean inserirSituacaoDAO(Situacao situacao) {

        String sql = "INSERT INTO situacao (situacaoDescricao) values (?)";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, situacao.getSituacaoDescricao());
            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro salvarSituacaoDAO: " + ex);
            return false;

        } finally {

            ConnectionDB.closeConnection(con, stmt);
        }
    }

    public List<Situacao> buscarSituacaoDAO() {

        String sql = "SELECT * FROM situacao ORDER BY situacaoDescricao  ";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Situacao> situacaoLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Situacao situcao = new Situacao();
                
                situcao.setSituacaoCodigo(rs.getInt(Situacao.SITUACAO_CODIGO));
                situcao.setSituacaoDescricao(rs.getString(Situacao.SITUACAO_DESCRICAO));

                situacaoLista.add(situcao);

            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarSituacaoDAO: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return situacaoLista;

    }

    
    
    
    public boolean atualizarSituacaoDAO(Situacao situacao) {
        String sql = "UPDATE situacao SET situacaoDescricao = ? "
                + "WHERE situacaoCodigo = ? ";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, situacao.getSituacaoDescricao());
            stmt.setInt(2, situacao.getSituacaoCodigo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro atualizarSituacaoDAO: " + ex);
            return false;
        } finally {
            ConnectionDB.closeConnection(con, stmt);
        }
    }
    
    
    
    
    
    public boolean excluirSituacaoDAO(Situacao situacao) {

        String sql = "DELETE FROM situacao WHERE situacaoCodigo = ?";

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, situacao.getSituacaoCodigo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro excluirSituacaoDAO: " + ex);
            return false;
        } finally {
            ConnectionDB.closeConnection(con, stmt);
        }
    }

    
    
    
    
    
    public List<Situacao> buscarSituacaoComLikeDAO(String situacaoDescricao) {

        String sql = "SELECT * FROM situacao WHERE situacaoDescricao LIKE ? ORDER BY situacaoDescricao ";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Situacao> situacaoLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + situacaoDescricao + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Situacao situacao = new Situacao();
                situacao.setSituacaoCodigo(rs.getInt(Situacao.SITUACAO_CODIGO));
                situacao.setSituacaoDescricao(rs.getString(Situacao.SITUACAO_DESCRICAO));

                situacaoLista.add(situacao);

            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarSitucaoDAOComLike: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return situacaoLista;

    }    
}
