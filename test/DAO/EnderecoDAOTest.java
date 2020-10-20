/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.SQLException;
import model.Cliente;
import model.Endereco;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author claudinei
 */
public class EnderecoDAOTest {

    public EnderecoDAOTest() {
    }

   // @Test
    @Ignore
    public void inserirEnderecoDAO() throws SQLException {
        
        Cliente cliente = new Cliente();
        cliente.setClienteCodigo(1);

        Endereco endereco = new Endereco();
        endereco.setEnderecoDescricao("Rua 24");
        endereco.setEnderecoLogradouro("Rua");
        endereco.setEnderecoNumero("150");
        endereco.setEnderecoComplemento("Em frente ao Eco Ponto");
        endereco.setEnderecoCep("75806616");
        endereco.setEnderecoBairro("Colmeia Park");
        endereco.setEnderecoCidade("Jatai");
        endereco.setEnderecoUf("GO");
        endereco.setEnderecoCliente(cliente);

        EnderecoDAO enderecoDAO = new EnderecoDAO();

        if (enderecoDAO.inserirEnderecoDAO(endereco)) {

            System.out.println("Endereco inserido com sucesso");
            buscarEnderecoDAO();

        } else {
            System.err.println("Erro no Teste de insercao: inserirEnderecoDAO");
        }
    }

   // @Test
    @Ignore
    public void buscarEnderecoDAO() throws SQLException {

         EnderecoDAO enderecoDAO = new EnderecoDAO();

        for (Endereco endereco : enderecoDAO.buscarEnderecoDAO()) {

            System.out.println(" Codigo: " + String.valueOf(endereco.getEnderecoCodigo()) + 
                               " Descricao: " + endereco.getEnderecoDescricao() +
                               " Logradouro: " + endereco.getEnderecoLogradouro() +
                               " Numero: " + endereco.getEnderecoNumero() +
                               " Complemento: " + endereco.getEnderecoComplemento() +
                               " CEP: " + endereco.getEnderecoCep() +
                               " Bairro: " + endereco.getEnderecoBairro() +
                               " Cidade: " + endereco.getEnderecoCidade() +
                               " UF: " + endereco.getEnderecoUf() +
                               " Cliente:" + endereco.getEnderecoCliente().getClienteNome());
        }
    }

   // @Test
    @Ignore
    public void atualizarEnderecoDAO() throws SQLException {
        
        Cliente cliente = new Cliente();
        cliente.setClienteCodigo(2);

        Endereco endereco = new Endereco();
        endereco.setEnderecoDescricao("Rua 24");
        endereco.setEnderecoLogradouro("Rua");
        endereco.setEnderecoNumero("150");
        endereco.setEnderecoComplemento("Em frente ao Eco Ponto");
        endereco.setEnderecoCep("75806616");
        endereco.setEnderecoBairro("Colmeia Park");
        endereco.setEnderecoCidade("Jatai");
        endereco.setEnderecoUf("GO");
        endereco.setEnderecoCliente(cliente);
        endereco.setEnderecoCodigo(1);

        EnderecoDAO enderecoDAO = new EnderecoDAO();

        if (enderecoDAO.atualizarEnderecoDAO(endereco)) {

            System.out.println("Endereco atualizado com sucesso");
            buscarEnderecoDAO();

        } else {
            System.err.println("Erro no Teste de atualizacao: atualizarEnderecoDAO");
        }
    }
    
     @Test
  //  @Ignore
    public void ExcluirEnderecoDAO() throws SQLException {
        Endereco endereco = new Endereco();
        
        endereco.setEnderecoCodigo(11);
        
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        
        if(enderecoDAO.excluirEnderecoDAO(endereco)){
            System.out.println("Endereco excluido com sucesso");
            buscarEnderecoDAO();
        }else{
            System.err.println("Erro no teste de exclusão: excluirEnderecoDAO");
            
        }
    }
    
    //@Test
    @Ignore
    public void testbuscarEnderecoDAOComLike() throws SQLException {
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        
        for(Endereco endereco : enderecoDAO.buscarEnderecoDAOComLike("Rua 24")){
            System.out.println(" Codigo: " + String.valueOf(endereco.getEnderecoCodigo()) + 
                               " Descricao: " + endereco.getEnderecoDescricao() +
                               " Logradouro: " + endereco.getEnderecoLogradouro() +
                               " Numero: " + endereco.getEnderecoNumero() +
                               " Complemento: " + endereco.getEnderecoComplemento() +
                               " CEP: " + endereco.getEnderecoCep() +
                               " Bairro: " + endereco.getEnderecoBairro() +
                               " Cidade: " + endereco.getEnderecoCidade() +
                               " UF: " + endereco.getEnderecoUf() +
                               " Cliente:" + endereco.getEnderecoCliente().getClienteNome());
        }
        

    }

   
}

