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
public class Usuario {
    public static final String USUARIO_CODIGO = "usuarioCodigo";
    public static final String USUARIO_NOME = "usuarioNome";
    public static final String USUARIO_EMAIL = "usuarioEmail";
    public static final String USUARIO_SENHA = "usuarioSenha";
    public static final String USUARIO_ADMINISTRADOR = "usuarioAdministrador";
    
    private int usuarioCodigo;
    private String usuarioNome;
    private String usuarioEmail;  
    private String usuarioSenha;
    private Boolean usuarioAdministrador; 

    public Usuario() {
    }
    
    public int getUsuarioCodigo() {
        return usuarioCodigo;
    }

    public void setUsuarioCodigo(int usuarioCodigo) {
        this.usuarioCodigo = usuarioCodigo;
    }

    public String getUsuarioNome() {
        return usuarioNome;
    }

    public void setUsuarioNome(String usuarioNome) {
        this.usuarioNome = usuarioNome;
    }

    public String getUsuarioEmail() {
        return usuarioEmail;
    }

    public void setUsuarioEmail(String usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }

    public String getUsuarioSenha() {
        return usuarioSenha;
    }

    public void setUsuarioSenha(String usuarioSenha) {
        this.usuarioSenha = usuarioSenha;
    }

    public Boolean getUsuarioAdministrador() {
        return usuarioAdministrador;
    }

    public void setUsuarioAdministrador(Boolean usuarioAdministrador) {
        this.usuarioAdministrador = usuarioAdministrador;
    }
    
    
}