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
public class Cliente {
    public static final String CLIENTE_CODIGO = "clienteCodigo";
    public static final String CLIENTE_NOME = "clienteNome";
    public static final String CLIENTE_CPF = "clienteCpf";
    public static final String CLIENTE_TELEFONE = "clienteTelefone";
    public static final String CLIENTE_CELULAR = "clienteCelular";
    public static final String CLIENTE_EMAIL = "clienteEmail";
    public static final String CLIENTE_DTNASCIMENTO = "clienteDtNascimento";
    
    private int clienteCodigo;
    private String clienteNome;
    private String clienteCpf;
    private String clienteTelefone;
    private String clienteCelular;
    private String clienteEmail;
    private String clienteDtNascimento;

    public Cliente() {
    }

    public int getClienteCodigo() {
        return clienteCodigo;
    }

    public void setClienteCodigo(int clienteCodigo) {
        this.clienteCodigo = clienteCodigo;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public String getClienteTelefone() {
        return clienteTelefone;
    }

    public void setClienteTelefone(String clienteTelefone) {
        this.clienteTelefone = clienteTelefone;
    }

    public String getClienteCelular() {
        return clienteCelular;
    }

    public void setClienteCelular(String clienteCelular) {
        this.clienteCelular = clienteCelular;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    public String getClienteDtNascimento() {
        return clienteDtNascimento;
    }

    public void setClienteDtNascimento(String clienteDtNascimento) {
        this.clienteDtNascimento = clienteDtNascimento;
    }
    
    
}