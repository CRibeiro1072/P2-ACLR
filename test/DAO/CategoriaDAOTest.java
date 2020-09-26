/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import model.Categoria;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author claudinei
 */
public class CategoriaDAOTest {
    /**
     * Test of inserirCategoriaDAO method, of class CategoriaDAO.
     * @throws java.sql.SQLException
     */
  //  @Test
    @Ignore
    public void testInserirCategoriaDAO() throws SQLException{
        Categoria categoria = new Categoria();
        categoria.setCategoriaDescricao("Nova categoria");
        
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        
        if(categoriaDAO.inserirCategoriaDAO(categoria)){
            System.out.println("Categoria inserida com sucesso "+
                    categoria.getCategoriaDescricao());
            testBuscarCategoriasDAO();
        }else{
            System.err.println("Erro no teste de inserção: inserirCategoriaDAO");
        }
    }

    /**
     * Test of buscarCategoriasDAO method, of class CategoriaDAO.
     * @throws java.sql.SQLException
     */
   // @Test
    //@Ignore
    public void testBuscarCategoriasDAO() throws SQLException{
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        
        for(Categoria categoria : categoriaDAO.buscarCategoriasDAO()){
            System.out.println("Codigo: "+String.valueOf(categoria.getCategoriaCodigo())+
                    " Categoria: "+ categoria.getCategoriaDescricao());
        }
        
        
    }

    /**
     * Test of atualizarCategoriaDAO method, of class CategoriaDAO.
     * @throws java.sql.SQLException
     */
   // @Test
    @Ignore
    public void testAtualizarCategoriaDAO()throws SQLException {
        Categoria categoria = new Categoria();
        
        categoria.setCategoriaCodigo(6);
        categoria.setCategoriaDescricao("Categoria atualizada");
        
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        
        if(categoriaDAO.atualizarCategoriaDAO(categoria)){
            System.out.println("Categoria atualizada com sucesso");
            testBuscarCategoriasDAO();
        }else{
            System.err.println("Erro no teste de atualização: AtualizarCategoriaDAO");            
        }
        
    }

    /**
     * Test of excluirCategoriaDAO method, of class CategoriaDAO.
     */
    //  @Test
  //  @Ignore
    public void testExcluirCategoriaDAO() throws SQLException {
        Categoria categoria = new Categoria();
        
        categoria.setCategoriaCodigo(6);
        
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        
        if(categoriaDAO.excluirCategoriaDAO(categoria)){
            System.out.println("Categoria excluida com sucesso");
            testBuscarCategoriasDAO();
        }else{
            System.err.println("Erro no teste de exclusão: excluirCategoriaDAO");
            
        }
    }
    /**
     * Test of buscarCategoriasComLikeDAO method, of class CategoriaDAO.
     */
    @Test
    //@Ignore
    public void testBuscarCategoriasComLikeDAO() throws SQLException {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        
        for(Categoria categoria : categoriaDAO.buscarCategoriasComLikeDAO("1")){
            System.out.println("Codigo: "+String.valueOf(categoria.getCategoriaCodigo())+
                    " Categoria: "+ categoria.getCategoriaDescricao());
        }
        

    }

   
}
