/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.EnderecoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.Endereco;

/**
 *
 * @author claudinei
 */
public class EnderecoController {
    
    public EnderecoController() {
    }

    public void inserirEnderecoController(Endereco endereco) {

        EnderecoDAO enderecoDAO = new EnderecoDAO();

        if (enderecoDAO.inserirEnderecoDAO(endereco)) {
            JOptionPane.showMessageDialog(null, "Endereco inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Endereco!");
        }
    }

    public List<Endereco> buscarEnderecoController() {

        EnderecoDAO enderecoDAO = new EnderecoDAO();;
        return enderecoDAO.buscarEnderecoDAO();
    }

    public List<Endereco> buscarEnderecoController(String enderecoDescricao) {

        EnderecoDAO enderecoDAO = new EnderecoDAO();
        return enderecoDAO.buscarEnderecoDAOComLike(enderecoDescricao);
    }

    public void excluirEnderecoController(Endereco endereco) {

        EnderecoDAO enderecoDAO = new EnderecoDAO();

        if (enderecoDAO.excluirEnderecoDAO(endereco)) {
           JOptionPane.showMessageDialog(null, "Endereco escluido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Endereco!");
        }
    }

    public void atualizarEnderecoController(Endereco endereco) {

        EnderecoDAO enderecoDAO = new EnderecoDAO();

        if (enderecoDAO.atualizarEnderecoDAO(endereco)) {
           JOptionPane.showMessageDialog(null, "Endereco atualizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Endereco!");
        }
    }
    
}
