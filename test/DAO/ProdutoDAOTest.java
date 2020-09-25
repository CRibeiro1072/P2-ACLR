/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.SQLException;
import model.Categoria;
import model.Produto;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author Celio
 */
public class ProdutoDAOTest {

    public ProdutoDAOTest() {
    }

   // @Test
    @Ignore
    public void inserirProdutoDAO() throws SQLException {

        Categoria categoria = new Categoria();
        categoria.setCategoriaCodigo(5);

        Produto produto = new Produto();
        produto.setProdutoDescricao("Pneus BridsTone 175 70 14");
        produto.setProdutoQuantidade(880);
        produto.setProdutoValor(137.0);
        produto.setProdutoCategoria(categoria);

        ProdutoDAO produtoDAO = new ProdutoDAO();

        if (produtoDAO.inserirProdutoDAO(produto)) {

            System.out.println("Produto inserido com sucesso");
            buscarProdutosDAO();

        } else {
            System.err.println("Erro no Teste de insercao: inserirProdutoDAO");
        }
    }

    @Test
   // @Ignore
    public void buscarProdutosDAO() throws SQLException {
        //A11
        ProdutoDAO produtoDAO = new ProdutoDAO();

        for (Produto produto : produtoDAO.buscarProdutosDAO()) {

            System.out.println("Codigo: " + String.valueOf(produto.getProdutoCodigo()) + " Produto: " + produto.getProdutoDescricao()
                    + " Codigo Categoria: " + produto.getProdutoCategoria().getCategoriaCodigo()
                    + " Categoria: " + produto.getProdutoCategoria().getCategoriaDescricao());
        }
    }

   // @Test
    @Ignore
    public void atualizarProdutoDAO() throws SQLException {

        //SIMULANDO - Recebendo o codigo da categoria
        Categoria categoria = new Categoria();
        categoria.setCategoriaCodigo(5);

        Produto produto = new Produto();
        produto.setProdutoDescricao("TV COLORIDO 55 POLEGADAS");
        produto.setProdutoQuantidade(2);
        produto.setProdutoValor(1500.0);
        produto.setProdutoCategoria(categoria);
        produto.setProdutoCodigo(6);

        ProdutoDAO produtoDAO = new ProdutoDAO();

        if (produtoDAO.atualizarProdutoDAO(produto)) {

            System.out.println("Produto atualizado com sucesso");
            buscarProdutosDAO();

        } else {
            System.err.println("Erro no Teste de atualizacao: atualizarProdutoDAO");
        }
    }
    
   //  @Test
    @Ignore
    public void ExcluirProdutoDAO() throws SQLException {
        Produto produto = new Produto();
        
        produto.setProdutoCodigo(6);
        
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        if(produtoDAO.excluirProdutoDAO(produto)){
            System.out.println("Produto excluido com sucesso");
            buscarProdutosDAO();
        }else{
            System.err.println("Erro no teste de exclusão: excluirProdutoDAO");
            
        }
    }
}
