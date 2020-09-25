/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import model.Marca;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author claudinei
 */
public class MarcaControllerIT {
    
    public MarcaControllerIT() {
    }

    @Test
   // @Ignore
    public void inserirMarcaController() throws SQLException {
        Marca marca = new Marca();
        marca.setMarcaDescricao("Novo Registro");

        MarcaController marcaController = new MarcaController();
        
        marcaController.inserirMarcaController(marca);
        
        buscarMarcasController();
        
    }
    
    //  @Test
    @Ignore
    public void buscarMarcasController() throws SQLException {
        MarcaController marcaController = new MarcaController();
        for (Marca marca : marcaController.buscarMarcaController()) {

            System.out.println("Codigo: " + String.valueOf(marca.getMarcaCodigo())
                    + " Marca: " + marca.getMarcaDescricao());
        
    }


        
        
    }
    
}
