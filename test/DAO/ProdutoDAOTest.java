/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.SQLException;
import model.Categoria;
import model.Marca;
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
   // @Ignore
    public void inserirProdutoDAO() throws SQLException {

        Categoria categoria = new Categoria();
        categoria.setCategoriaCodigo(3);
        
        Marca marca = new Marca();
        marca.setMarcaCodigo(1);

        Produto produto = new Produto();
        produto.setProdutoDescricao("Pneusvghvgvgv");
        produto.setProdutoQuantidade(550);
        produto.setProdutoValor(105.0);
        produto.setProdutoCategoria(categoria);
        produto.setProdutoMarca(marca);

        ProdutoDAO produtoDAO = new ProdutoDAO();

        if (produtoDAO.inserirProdutoDAO(produto)) {

            System.out.println("Produto inserido com sucesso");
            buscarProdutosDAO();

        } else {
            System.err.println("Erro no Teste de insercao: inserirProdutoDAO");
        }
    }

   // @Test
   // @Ignore
    public void buscarProdutosDAO() throws SQLException {

        ProdutoDAO produtoDAO = new ProdutoDAO();

        for (Produto produto : produtoDAO.buscarProdutosDAO()) {

            System.out.println(" Codigo: " + String.valueOf(produto.getProdutoCodigo()) + 
                               " Produto: " + produto.getProdutoDescricao() +
                               " Quantidade: " + produto.getProdutoQuantidade() +
                               " Valor: " + produto.getProdutoValor() +
                               " Categoria: " + produto.getProdutoCategoria().getCategoriaDescricao() +
                               " Marca: " + produto.getProdutoMarca().getMarcaDescricao());
        }
    }

    //@Test
    //@Ignore
    public void atualizarProdutoDAO() throws SQLException {

        //SIMULANDO - Recebendo o codigo da categoria
        Categoria categoria = new Categoria();
        categoria.setCategoriaCodigo(5);
        
        Marca marca = new Marca();
        marca.setMarcaCodigo(4);

        Produto produto = new Produto();
        produto.setProdutoDescricao("TV COLORIDO 55 POLEGADAS");
        produto.setProdutoQuantidade(2);
        produto.setProdutoValor(1500.0);
        produto.setProdutoCategoria(categoria);
        produto.setProdutoMarca(marca);
        produto.setProdutoCodigo(1);

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
    
       @Test
    //@Ignore
    //Criado dia 26/09/2020
    public void testbuscarProdutosDAOComLike() throws SQLException {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        for(Produto produto : produtoDAO.buscarProdutosDAOComLike("tv")){
            System.out.println(" Codigo: " + String.valueOf(produto.getProdutoCodigo()) + 
                               " Produto: " + produto.getProdutoDescricao() +
                               " Quantidade: " + produto.getProdutoQuantidade() +
                               " Valor: " + produto.getProdutoValor() +
                               " Categoria: " + produto.getProdutoCategoria().getCategoriaDescricao() +
                               " Marca: " + produto.getProdutoMarca().getMarcaDescricao());
        }
        

    }

   
}

