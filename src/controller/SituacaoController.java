/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.SituacaoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.Situacao;

/**
 *
 * @author claudinei
 */
public class SituacaoController {
    

    public SituacaoController() {
    }

    public void inserirSituacaoController(Situacao situacao) {

        SituacaoDAO situacaoDAO = new SituacaoDAO();

        if (situacaoDAO.inserirSituacaoDAO(situacao)) {
            JOptionPane.showMessageDialog(null, "Situacao inserida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao inserir situacao!");
        }
    }

    public List<Situacao> buscarSituacaoController() {

        SituacaoDAO situacaoDAO = new SituacaoDAO();
        return situacaoDAO.buscarSituacaoDAO();
    }

    public List<Situacao> buscarSituacaoController(String situacaoDescricao) {

        SituacaoDAO situacaoDAO = new SituacaoDAO();

        return situacaoDAO.buscarSituacaoComLikeDAO(situacaoDescricao);

    }

    public void excluirSituacaoController(Situacao situacao) {

        SituacaoDAO situacaoDAO = new SituacaoDAO();

        if (situacaoDAO.excluirSituacaoDAO(situacao)) {
            JOptionPane.showMessageDialog(null, "Situacao excluida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir situacao!");
        }
    }

    public void atualizarSituacaoController(Situacao situacao) {

        SituacaoDAO situacaoDAO = new SituacaoDAO();

        if (situacaoDAO.atualizarSituacaoDAO(situacao)) {
            JOptionPane.showMessageDialog(null, "Situacao atualizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar situacao!");
            }
    }    
}
