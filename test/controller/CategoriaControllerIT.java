/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import model.Categoria;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author claudinei
 */
public class CategoriaControllerIT {
    
    public CategoriaControllerIT() {
    }

   // @Test
    @Ignore
    public void inserirCategoriaController() throws SQLException {
        Categoria categoria = new Categoria();
        categoria.setCategoriaDescricao("Novo Registro1");

        CategoriaController categoriaController = new CategoriaController();
        
        categoriaController.inserirCategoriaController(categoria);
        
        buscarCategoriasController();
        
    }
    
      @Test
    //@Ignore
    public void buscarCategoriasController() throws SQLException {
        CategoriaController categoriaController = new CategoriaController();
        for (Categoria categoria : categoriaController.buscarCategoriasController()) {

            System.out.println("Codigo: " + String.valueOf(categoria.getCategoriaCodigo())
                    + " Categoria: " + categoria.getCategoriaDescricao());
        
    }


        
        
    }
    
}
