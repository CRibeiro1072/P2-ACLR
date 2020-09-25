/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CategoriaDAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.Categoria;

/**
 *
 * @author claudinei
 */
public class CategoriaController {
    

    public CategoriaController() {
    }

    public void inserirCategoriaController(Categoria categoria) {

        CategoriaDAO categoriaDAO = new CategoriaDAO();

        if (categoriaDAO.inserirCategoriaDAO(categoria)) {

            System.out.println("Controller: Categoria inserida"
                    + " com sucesso: inserirCategoriaController");

            JOptionPane.showMessageDialog(null, "Categoria inserida "
                    + "com sucesso: inserirCategoriaController");

        } else {
            System.err.println("Controller: Erro na insercao:"
                    + " inserirCategoriaController");
        }
    }

    public List<Categoria> buscarCategoriasController() {

        CategoriaDAO categoriaDAO = new CategoriaDAO();
        return categoriaDAO.buscarCategoriasDAO();
        // List<Categoria> categoriaLista = new ArrayList<>();         
        // categoriaLista = categoriaDAO.buscarCategoriasDAO();
    }

    public List<Categoria> buscarCategoriasController(String categoriaDescricao) {

        CategoriaDAO categoriaDAO = new CategoriaDAO();

        return categoriaDAO.buscarCategoriasComLikeDAO(categoriaDescricao);

    }

    public void excluirCategoriaController(Categoria categoria) {

        CategoriaDAO categoriaDAO = new CategoriaDAO();

        if (categoriaDAO.excluirCategoriaDAO(categoria)) {

            System.out.println("Controller: Categoria EXCLUIDA "
                    + "com sucesso: excluirCategoriaController");
            
            JOptionPane.showMessageDialog(null, "Categoria EXCLUIDA "
                    + "com sucesso: inserirCategoriaController");
        } else {
            System.err.println("Controller: Erro na EXCLUSAO: excluirCategoriaController");
        }
    }

    public void atualizarCategoriaController(Categoria categoria) {

        CategoriaDAO categoriaDAO = new CategoriaDAO();

        if (categoriaDAO.atualizarCategoriaDAO(categoria)) {

            System.out.println("Controller: Categoria ATUALIZADA com sucesso: "
                    + "atualizarCategoriaController");

        } else {
            System.err.println("Controller: Erro na ATUALIZACAO: "
                    + "atualizarCategoriaController");
        }
    }

    
}
