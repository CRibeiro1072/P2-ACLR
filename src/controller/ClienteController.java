/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Cliente;
import DAO.ClienteDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author romildo
 */
public class ClienteController {
    
    public void inserirClienteController(Cliente cliente) {

        ClienteDAO clienteDAO = new ClienteDAO();

        if (clienteDAO.inserirClienteDAO(cliente)) {
            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Cliente!");
        }
    }
    
    public List<Cliente> buscarClienteController() {

        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.buscarClienteDAO();
    }
    
    public List<Cliente> buscarClienteController(String clienteNome) {

        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.buscarClienteComLikeDAO(clienteNome);
    }
    
    public void excluirClienteController(Cliente cliente) {

        ClienteDAO clienteDAO = new ClienteDAO();

        if (clienteDAO.excluirClienteDAO(cliente)) {
           JOptionPane.showMessageDialog(null, "Cliente escluido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Cliente!");
        }
    }

    public void atualizarlienteController(Cliente cliente) {

        ClienteDAO clienteDAO = new ClienteDAO();

        if (clienteDAO.atualizarClienteDAO(cliente)) {
           JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Cliente!");
        }
    }
    
    public String getNomeCliente(int id){
        ClienteDAO cliente = new ClienteDAO();  
        
        return cliente.getNomeCliente(id);
    }
}
