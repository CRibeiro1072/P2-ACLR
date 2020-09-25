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
public class Marca {
    public static final String MARCA_CODIGO = "marcaCodigo";
    public static final String MARCA_DESCRICAO = "marcaDescricao";
    
    private int marcaCodigo;
    private String marcaDescricao;

    @Override
    public String toString() {
        return marcaDescricao;
    }    

    public Marca() {
    }
    
    public int getMarcaCodigo() {
        return marcaCodigo;
    }

    public void setMarcaCodigo(int marcaCodigo) {
        this.marcaCodigo = marcaCodigo;
    }

    public String getMarcaDescricao() {
        return marcaDescricao;
    }

    public void setMarcaDescricao(String marcaDescricao) {
        this.marcaDescricao = marcaDescricao;
    }   
}
