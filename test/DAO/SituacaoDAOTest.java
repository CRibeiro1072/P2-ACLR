/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import model.Situacao;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author claudinei
 */
public class SituacaoDAOTest {

  //  @Test
  //  @Ignore
    public void testInserirSituacaoDAO() throws SQLException{
        Situacao situacao = new Situacao();
        situacao.setSituacaoDescricao("Nova situacao");
        
        SituacaoDAO situacaoDAO = new SituacaoDAO();
        
        if(situacaoDAO.inserirSituacaoDAO(situacao)){
            System.out.println("Situacao inserida com sucesso "+
                    situacao.getSituacaoDescricao());
            testBuscarSituacaoDAO();
        }else{
            System.err.println("Erro no teste de inserção: inserirSituacaoDAO");
        }
    }

    //@Test
    @Ignore
    public void testBuscarSituacaoDAO() throws SQLException{
        SituacaoDAO situacaoDAO = new SituacaoDAO();
        
        for(Situacao situacao : situacaoDAO.buscarSituacaoDAO()){
            System.out.println("Codigo: "+String.valueOf(situacao.getSituacaoCodigo())+
                    " Situacao: "+ situacao.getSituacaoDescricao());
        }
        
        
    }

   // @Test
    @Ignore
    public void testAtualizarSituacaoDAO()throws SQLException {
        Situacao situacao = new Situacao();
        
        situacao.setSituacaoCodigo(3);
        situacao.setSituacaoDescricao("Situcao atualizada");
        
        SituacaoDAO situacaoDAO = new SituacaoDAO();
        
        if(situacaoDAO.atualizarSituacaoDAO(situacao)){
            System.out.println("Situacao atualizada com sucesso");
            testBuscarSituacaoDAO();
        }else{
            System.err.println("Erro no teste de atualização: AtualizarSituacaoDAO");            
        }
        
    }

    // @Test
    @Ignore
    public void testExcluirSituacaoDAO() throws SQLException {
        Situacao situacao = new Situacao();
        
        situacao.setSituacaoCodigo(3);
        
        SituacaoDAO situacaoDAO = new SituacaoDAO();
        
        if(situacaoDAO.excluirSituacaoDAO(situacao)){
            System.out.println("Situacao excluida com sucesso");
            testBuscarSituacaoDAO();
        }else{
            System.err.println("Erro no teste de exclusão: excluirSituacaoDAO");
            
        }
    }

    @Test
    //@Ignore
    public void testBuscarSituacaoComLikeDAO() throws SQLException {
        SituacaoDAO situacaoDAO = new SituacaoDAO();
        
        for(Situacao situacao : situacaoDAO.buscarSituacaoComLikeDAO("em")){
            System.out.println("Codigo: "+String.valueOf(situacao.getSituacaoCodigo())+
                    " Situacao: "+ situacao.getSituacaoDescricao());
        }
    }  
}
