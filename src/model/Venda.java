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
public class Venda {
    public static final String ENDERECO_CODIGO = "vendaCodigo";
    public static final String ENDERECO_CLIENTE = "vendaCliente";
    public static final String ENDERECO_DESCRICAO = "vendaDataVenda";
    public static final String ENDERECO_LOGRADOURO = "vendaSituacao";
    public static final String ENDERECO_NUMERO = "vendaEnderecoEntrega";
    
    private int vendaCodigo;
    private Cliente vendaCliente;
    private String vendaDataVenda;
    private Situacao vendaSituacao;
    private Endereco vendaEnderecoEntrega;

    public Venda() {
    }

    public int getVendaCodigo() {
        return vendaCodigo;
    }

    public void setVendaCodigo(int vendaCodigo) {
        this.vendaCodigo = vendaCodigo;
    }

    public Cliente getVendaCliente() {
        return vendaCliente;
    }

    public void setVendaCliente(Cliente vendaCliente) {
        this.vendaCliente = vendaCliente;
    }

    public String getVendaDataVenda() {
        return vendaDataVenda;
    }

    public void setVendaDataVenda(String vendaDataVenda) {
        this.vendaDataVenda = vendaDataVenda;
    }

    public Situacao getVendaSituacao() {
        return vendaSituacao;
    }

    public void setVendaSituacao(Situacao vendaSituacao) {
        this.vendaSituacao = vendaSituacao;
    }

    public Endereco getVendaEnderecoEntrega() {
        return vendaEnderecoEntrega;
    }

    public void setVendaEnderecoEntrega(Endereco vendaEnderecoEntrega) {
        this.vendaEnderecoEntrega = vendaEnderecoEntrega;
    }    
}
