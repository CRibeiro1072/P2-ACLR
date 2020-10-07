/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Cliente;
import DAO.ClienteDAO;

/**
 *
 * @author romildo
 */
public class ClienteController {
    
    public List<Cliente> buscarClienteController() {

        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.buscarClienteDAO();
    }
    
    public List<Cliente> buscarClienteController(String clienteNome) {

        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.buscarClienteComLikeDAO(clienteNome);
    }
    
}
