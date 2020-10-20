/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.SQLException;
import model.Cliente;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author claudinei
 */
public class ClienteDAOTest {

    public ClienteDAOTest() {
    }

    //@Test
    @Ignore
    public void inserirClienteDAO() throws SQLException {
        
        Cliente cliente = new Cliente();
        cliente.setClienteNome("Claudinei Ribeiro");
        cliente.setClienteCpf("88888888888");
        cliente.setClienteTelefone("6436363636");
        cliente.setClienteCelular("64999999999");
        cliente.setClienteEmail("xxxxxxx@gmail.com");
        cliente.setClienteDtNascimento("01/01/0001");

        ClienteDAO clienteDAO = new ClienteDAO();

        if (clienteDAO.inserirClienteDAO(cliente)) {

            System.out.println("Cliente inserido com sucesso");
            buscarClienteDAO();

        } else {
            System.err.println("Erro no Teste de insercao: inserirClienteDAO");
        }
    }

   // @Test
    @Ignore
    public void buscarClienteDAO() throws SQLException {

        ClienteDAO clienteDAO = new ClienteDAO();

        for (Cliente cliente : clienteDAO.buscarClienteDAO()) {

            System.out.println(" Codigo: " + String.valueOf(cliente.getClienteCodigo()) + 
                               " Nome: " + cliente.getClienteNome() +
                               " CPF: " + cliente.getClienteCpf() +
                               " Telefone: " + cliente.getClienteTelefone() +
                               " Celular: " + cliente.getClienteCelular() +
                               " Email: " + cliente.getClienteEmail() +
                               " DtNascimento: " + cliente.getClienteDtNascimento());
        }
    }

    //@Test
    @Ignore
    public void atualizarClienteDAO() throws SQLException {
        
        Cliente cliente = new Cliente();
        cliente.setClienteNome("Claudinei");
        cliente.setClienteCpf("88888888888");
        cliente.setClienteTelefone("6436363636");
        cliente.setClienteCelular("64999999999");
        cliente.setClienteEmail("xxxxxxx@gmail.com");
        cliente.setClienteDtNascimento("01/01/0001");
        cliente.setClienteCodigo(6);

        ClienteDAO clienteDAO = new ClienteDAO();

        if (clienteDAO.atualizarClienteDAO(cliente)) {

            System.out.println("Cliente atualizado com sucesso");
            buscarClienteDAO();

        } else {
            System.err.println("Erro no Teste de atualizacao: atualizarClienteDAO");
        }
    }
    
     @Test
    //@Ignore
    public void ExcluirClienteDAO() throws SQLException {
        Cliente cliente = new Cliente();
        
        cliente.setClienteCodigo(6);
        
        ClienteDAO clienteDAO = new ClienteDAO();
        
        if(clienteDAO.excluirClienteDAO(cliente)){
            System.out.println("Cliente excluido com sucesso");
            buscarClienteDAO();
        }else{
            System.err.println("Erro no teste de exclusão: excluirClienteDAO");
            
        }
    }
    
    //@Test
    @Ignore
    public void testbuscarClienteDAOComLike() throws SQLException {
        ClienteDAO clienteDAO = new ClienteDAO();
        
        for(Cliente cliente : clienteDAO.buscarClienteComLikeDAO("Claudinei")){
            System.out.println(" Codigo: " + String.valueOf(cliente.getClienteCodigo()) + 
                               " Nome: " + cliente.getClienteNome() +
                               " CPF: " + cliente.getClienteCpf() +
                               " Telefone: " + cliente.getClienteTelefone() +
                               " Celular: " + cliente.getClienteCelular() +
                               " Email: " + cliente.getClienteEmail() +
                               " DtNascimento: " + cliente.getClienteDtNascimento());
        }
        

    }

   
}

