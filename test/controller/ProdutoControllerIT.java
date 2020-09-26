/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import model.Categoria;
import model.Marca;
import model.Produto;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author claudinei
 */
public class ProdutoControllerIT {
    
    public ProdutoControllerIT() {
    }

  //@Test
    @Ignore
    public void inserirProdutoController() throws SQLException {
        
        Categoria categoria = new Categoria(); 
        categoria.setCategoriaCodigo(1);
        
        Marca marca = new Marca();
        marca.setMarcaCodigo(2);
        
        Produto produto = new Produto();
        produto.setProdutoDescricao("TV PHILCO 55PH7865");
        produto.setProdutoQuantidade(880);
        produto.setProdutoValor(137.0);
        produto.setProdutoCategoria(categoria);
        produto.setProdutoMarca(marca);

        ProdutoController produtoController = new ProdutoController();
        
        produtoController.inserirProdutoController(produto);
        
        buscarProdutoController();
        
    }
    
    //  @Test
    @Ignore
    public void buscarProdutoController() throws SQLException {
        ProdutoController produtoController = new ProdutoController();
        
        for (Produto produto : produtoController.buscarProdutoController()) {

            System.out.println("Codigo: " + String.valueOf(produto.getProdutoCodigo()) + " Produto: " + produto.getProdutoDescricao()
                    + " Categoria: " + produto.getProdutoCategoria().getCategoriaCodigo()
                    + " Marca: " + produto.getProdutoMarca().getMarcaDescricao());
        }
    }
    
}
