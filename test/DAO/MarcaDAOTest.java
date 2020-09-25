/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import model.Marca;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author claudinei
 */
public class MarcaDAOTest {
    /**
     * Test of inserirCategoriaDAO method, of class CategoriaDAO.
     * @throws java.sql.SQLException
     */
   //  @Test
   //  @Ignore
    public void InserirMarcaDAO() throws SQLException{
        Marca marca = new Marca();
        marca.setMarcaDescricao("Nova Marca 1");
        
        MarcaDAO marcaDAO = new MarcaDAO();
        
        if(marcaDAO.inserirMarcaDAO(marca)){
            System.out.println("Marca inserida com sucesso "+
                    marca.getMarcaDescricao());
            BuscarMarcaDAO();
        }else{
            System.err.println("Erro no teste de inserção: inserirMarcaDAO");
        }
    }

    /**
     * Test of buscarCategoriasDAO method, of class CategoriaDAO.
     * @throws java.sql.SQLException
     */
   // @Test
    @Ignore
    public void BuscarMarcaDAO() throws SQLException{
        MarcaDAO marcaDAO = new MarcaDAO();
        
        for(Marca marca : marcaDAO.buscarMarcaDAO()){
            System.out.println("Codigo: "+String.valueOf(marca.getMarcaCodigo())+
                    " Marca: "+ marca.getMarcaDescricao());
        }
        
        
    }

    /**
     * Test of atualizarCategoriaDAO method, of class CategoriaDAO.
     * @throws java.sql.SQLException
     */
  //  @Test
    @Ignore
    public void AtualizarMarcaDAO()throws SQLException {
        Marca marca = new Marca();
        
        marca.setMarcaCodigo(7);
        marca.setMarcaDescricao("Marca atualizada");
        
        MarcaDAO marcaDAO = new MarcaDAO();
        
        if(marcaDAO.atualizarMarcaDAO(marca)){
            System.out.println("Marca atualizada com sucesso");
            BuscarMarcaDAO();
        }else{
            System.err.println("Erro no teste de atualização: AtualizarMarcaDAO");            
        }
        
    }

    /**
     * Test of excluirCategoriaDAO method, of class CategoriaDAO.
     */
    //  @Test
   // @Ignore
    public void ExcluirMarcaDAO() throws SQLException {
        Marca marca = new Marca();
        
        marca.setMarcaCodigo(8);
        
        MarcaDAO marcaDAO = new MarcaDAO();
        
        if(marcaDAO.excluirMarcaDAO(marca)){
            System.out.println("Marca excluida com sucesso");
            BuscarMarcaDAO();
        }else{
            System.err.println("Erro no teste de exclusão: excluirMarcaDAO");
            
        }
    }
    /**
     * Test of buscarCategoriasComLikeDAO method, of class CategoriaDAO.
     */
    @Test
   // @Ignore
    public void BuscarMarcaComLikeDAO() throws SQLException {
        MarcaDAO marcaDAO = new MarcaDAO();
        
        for(Marca marca : marcaDAO.buscarMarcasComLikeDAO("b")){
            System.out.println("Codigo: "+String.valueOf(marca.getMarcaCodigo())+
                    " Marca: "+ marca.getMarcaDescricao());
        }
        

    }

   
}
