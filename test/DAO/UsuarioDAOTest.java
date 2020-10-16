/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import java.util.List;
import model.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author claudinei
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }
    
  //  @Test
   // @Ignore
    public void inserirUsuarioDAO() throws SQLException {

        Usuario usuario = new Usuario();
        usuario.setUsuarioNome("Elza Geller");
        usuario.setUsuarioEmail("joaofernandes@gmail.com");
        usuario.setUsuarioSenha("123456");
        usuario.setUsuarioAdministrador(true);
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        if (usuarioDAO.inserirUsuarioDAO(usuario)){
            System.out.println("Usuario inserido com sucesso");
            buscarUsuarioDAO();
            
        } else {
            System.err.println("Erro no Teste de insercao: inserirUsuarioDAO");
        }
    }
    
   //  @Test
   // @Ignore
    public void buscarUsuarioDAO() throws SQLException {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        for (Usuario usuario : usuarioDAO.buscarUsuarioDAO()) {

            System.out.println(" Codigo: " + String.valueOf(usuario.getUsuarioCodigo()) + 
                               " Nome: " + usuario.getUsuarioNome() +
                               " Email: " + usuario.getUsuarioEmail() +
                               " Senha: " + usuario.getUsuarioSenha() +
                               " Administrador: " + usuario.getUsuarioAdministrador());
        }
    }

}
