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
public class Situacao {
    public static final String SITUACAO_CODIGO = "situacaoCodigo";
    public static final String SITUACAO_DESCRICAO = "situacaoDescricao";
    
    private int situacaoCodigo;
    private String situacaoDescricao;

    public Situacao() {
    }

    public int getSituacaoCodigo() {
        return situacaoCodigo;
    }

    public void setSituacaoCodigo(int situacaoCodigo) {
        this.situacaoCodigo = situacaoCodigo;
    }

    public String getSituacaoDescricao() {
        return situacaoDescricao;
    }

    public void setSituacaoDescricao(String situacaoDescricao) {
        this.situacaoDescricao = situacaoDescricao;
    }
}