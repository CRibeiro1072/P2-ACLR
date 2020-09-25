/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.MarcaDAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.Marca;

/**
 *
 * @author claudinei
 */
public class MarcaController {
    

    public MarcaController() {
    }

    public void inserirMarcaController(Marca marca) {

        MarcaDAO marcaDAO = new MarcaDAO();

        if (marcaDAO.inserirMarcaDAO(marca)) {

            System.out.println("Controller: Marca inserida"
                    + " com sucesso: inserirMarcaController");

            JOptionPane.showMessageDialog(null, "Marca inserida "
                    + "com sucesso: inserirMarcaController");

        } else {
            System.err.println("Controller: Erro na insercao:"
                    + " inserirMarcaController");
        }
    }

    public List<Marca> buscarMarcaController() {

        MarcaDAO marcaDAO = new MarcaDAO();
        return marcaDAO.buscarMarcaDAO();
    }

    public List<Marca> buscarMarcaController(String marcaDescricao) {

        MarcaDAO marcaDAO = new MarcaDAO();

        return marcaDAO.buscarMarcasComLikeDAO(marcaDescricao);

    }

    public void excluirMarcaController(Marca marca) {

        MarcaDAO marcaDAO = new MarcaDAO();

        if (marcaDAO.excluirMarcaDAO(marca)) {

            System.out.println("Controller: Marca EXCLUIDA "
                    + "com sucesso: excluirMarcaController");
            
            JOptionPane.showMessageDialog(null, "Marca EXCLUIDA "
                    + "com sucesso: inserirMarcaController");
        } else {
            System.err.println("Controller: Erro na EXCLUSAO: excluirMarcaController");
        }
    }

    public void atualizarMarcaController(Marca marca) {

        MarcaDAO marcaDAO = new MarcaDAO();

        if (marcaDAO.atualizarMarcaDAO(marca)) {

            System.out.println("Controller: Marca ATUALIZADA com sucesso: "
                    + "atualizarMarcaController");

        } else {
            System.err.println("Controller: Erro na ATUALIZACAO: "
                    + "atualizarMarcaController");
        }
    }

    
}
