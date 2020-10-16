/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.UsuarioDAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author claudinei
 */
public class UsuarioController {
    
    public UsuarioController(){
        
    }
    
        public void inserirUsuarioController(Usuario usuario) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        if (usuarioDAO.inserirUsuarioDAO(usuario)) {

            JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso!");

        } else {
            
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuario!");
        }
    }
        
    public List<Usuario> buscarUsuarioController() {

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.buscarUsuarioDAO();
    }

    public List<Usuario> buscarUsuarioController(String usuarioNome) {

         UsuarioDAO usuarioDAO = new UsuarioDAO();

        return usuarioDAO.buscarUsuarioComLikeDAO(usuarioNome);

    }
    
    public void excluirUsuarioController(Usuario usuario) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        if (usuarioDAO.excluirUsuarioDAO(usuario)) {

          JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso!");
            
        } else {
            
           JOptionPane.showMessageDialog(null, "Erro ao excluir usuario!");
        }
    }

    public void atualizarUsuarioController(Usuario usuario) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        if (usuarioDAO.atualizarUsuarioDAO(usuario)) {

            JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso!");

        } else {
            
            JOptionPane.showMessageDialog(null, "Erro ao atualizar usuario!");
        }
    }
}
