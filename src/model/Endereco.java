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
public class Endereco {
    public static final String ENDERECO_CODIGO = "enderecoCodigo";
    public static final String ENDERECO_CLIENTE = "enderecoCliente";
    public static final String ENDERECO_DESCRICAO = "enderecoDescricao";
    public static final String ENDERECO_LOGRADOURO = "enderecoLogradouro";
    public static final String ENDERECO_NUMERO = "enderecoNumero";
    public static final String ENDERECO_COMPLEMENTO = "enderecoComplemento";
    public static final String ENDERECO_CEP = "enderecoCep";
    public static final String ENDERECO_BAIRRO = "enderecoBairro";
    public static final String ENDERECO_CIDADE = "enderecoCidade";
    public static final String ENDERECO_UF = "enderecoUf";
    
    private int enderecoCodigo;
    private Cliente enderecoCliente;
    private String enderecoDescricao;
    private String enderecoLogradouro;
    private String enderecoNumero;
    private String enderecoComplemento;
    private String enderecoCep;
    private String enderecoBairro;
    private String enderecoCidade;
    private String enderecoUf;

    public Endereco() {
    }

    public int getEnderecoCodigo() {
        return enderecoCodigo;
    }

    public void setEnderecoCodigo(int enderecoCodigo) {
        this.enderecoCodigo = enderecoCodigo;
    }

    public Cliente getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(Cliente enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getEnderecoDescricao() {
        return enderecoDescricao;
    }

    public void setEnderecoDescricao(String enderecoDescricao) {
        this.enderecoDescricao = enderecoDescricao;
    }

    public String getEnderecoLogradouro() {
        return enderecoLogradouro;
    }

    public void setEnderecoLogradouro(String enderecoLogradouro) {
        this.enderecoLogradouro = enderecoLogradouro;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getEnderecoComplemento() {
        return enderecoComplemento;
    }

    public void setEnderecoComplemento(String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
    }

    public String getEnderecoCep() {
        return enderecoCep;
    }

    public void setEnderecoCep(String enderecoCep) {
        this.enderecoCep = enderecoCep;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public String getEnderecoCidade() {
        return enderecoCidade;
    }

    public void setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
    }

    public String getEnderecoUf() {
        return enderecoUf;
    }

    public void setEnderecoUf(String enderecoUf) {
        this.enderecoUf = enderecoUf;
    }
}