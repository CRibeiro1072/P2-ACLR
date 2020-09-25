/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author claudinei
 */
public class Produto { 
    public static final String PRODUTO_CODIGO = "produtoCodigo";
    public static final String PRODUTO_DESCRICAO = "produtoDescricao";
    public static final String PRODUTO_QUANTIDADE= "produtoQuantidade";
    public static final String PRODUTO_VALOR = "produtoValor";
    public static final String PRODUTO_CATEGORIA = "produtoCategoria";
    public static final String PRODUTO_MARCA = "produtoMarca";
    
    private int produtoCodigo;
    private String produtoDescricao;
    private int produtoQuantidade;
    private double produtoValor;
    private Categoria produtoCategoria;
    private Marca produtoMarca;

    public Produto() {
    }

    public int getProdutoCodigo() {
        return produtoCodigo;
    }

    public void setProdutoCodigo(int produtoCodigo) {
        this.produtoCodigo = produtoCodigo;
    }

    public String getProdutoDescricao() {
        return produtoDescricao;
    }

    public void setProdutoDescricao(String produtoDescricao) {
        this.produtoDescricao = produtoDescricao;
    }

    public int getProdutoQuantidade() {
        return produtoQuantidade;
    }

    public void setProdutoQuantidade(int produtoQuantidade) {
        this.produtoQuantidade = produtoQuantidade;
    }

    public double getProdutoValor() {
        return produtoValor;
    }

    public void setProdutoValor(double produtoValor) {
        this.produtoValor = produtoValor;
    }

    public Categoria getProdutoCategoria() {
        return produtoCategoria;
    }

    public void setProdutoCategoria(Categoria produtoCategoria) {
        this.produtoCategoria = produtoCategoria;
    }

    public Marca getProdutoMarca() {
        return produtoMarca;
    }

    public void setProdutoMarca(Marca produtoMarca) {
        this.produtoMarca = produtoMarca;
    }

    
}

   