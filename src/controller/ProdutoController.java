/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProdutoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author claudinei
 */
public class ProdutoController {
    
    public ProdutoController() {
    }

    public void inserirProdutoController(Produto produto) {

        ProdutoDAO produtoDAO = new ProdutoDAO();

        if (produtoDAO.inserirProdutoDAO(produto)) {

            System.out.println("Controller: Produto inserido"
                    + " com sucesso: inserirProdutoController");

            JOptionPane.showMessageDialog(null, "Produto inserido "
                    + "com sucesso: inserirProdutoController");

        } else {
            System.err.println("Controller: Erro na insercao:"
                    + " inserirProdutoController");
        }
    }

    public List<Produto> buscarProdutoController() {

        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.buscarProdutosDAO();
    }

    public List<Produto> buscarProdutoController(String produtoDescricao) {

        ProdutoDAO produtoDAO = new ProdutoDAO();

        return produtoDAO.buscarProdutosDAOComLike(produtoDescricao);

    }

    public void excluirProdutoController(Produto produto) {

        ProdutoDAO produtoDAO = new ProdutoDAO();

        if (produtoDAO.excluirProdutoDAO(produto)) {

            System.out.println("Controller: Produto EXCLUIDO "
                    + "com sucesso: excluirProdutoController");
            
            JOptionPane.showMessageDialog(null, "Produto EXCLUIDO "
                    + "com sucesso: inserirProdutoController");
        } else {
            System.err.println("Controller: Erro na EXCLUSAO: excluirProdutoController");
        }
    }

    public void atualizarProdutoController(Produto produto) {

        ProdutoDAO produtoDAO = new ProdutoDAO();

        if (produtoDAO.atualizarProdutoDAO(produto)) {

            System.out.println("Controller: Produto ATUALIZADO com sucesso: "
                    + "atualizarProdutoController");

        } else {
            System.err.println("Controller: Erro na ATUALIZACAO: "
                    + "atualizarProdutoController");
        }
    }

    
}
