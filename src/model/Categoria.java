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
public class Categoria {
    public static final String CATEGORIA_CODIGO = "categoriaCodigo";
    public static final String CATEGORIA_DESCRICAO = "categoriaDescricao";
    
    private int categoriaCodigo;
    private String categoriaDescricao;    

    public Categoria() {
    }

    @Override
    public String toString() {
        return categoriaDescricao;
    }

    public int getCategoriaCodigo() {
        return categoriaCodigo;
    }

    public void setCategoriaCodigo(int categoriaCodigo) {
        this.categoriaCodigo = categoriaCodigo;
    }

    public String getCategoriaDescricao() {
        return categoriaDescricao;
    }

    public void setCategoriaDescricao(String categoriaDescricao) {
        this.categoriaDescricao = categoriaDescricao;
    }     
}
