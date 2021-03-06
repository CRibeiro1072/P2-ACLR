/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SituacaoController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Situacao;

/**
 *
 * @author Claudinei
 */
public class ViewSituacao extends javax.swing.JFrame {

    /**
     * Creates new form ViewCategoria
     */
    public ViewSituacao() {
        initComponents();

        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        btnSituacaoAdicionar = new javax.swing.JButton();
        btnSituacaoExcluir = new javax.swing.JButton();
        btnSituacaoAlterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtSituacao = new javax.swing.JTable();
        txtSituacaoCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSituacaoPesquisar = new javax.swing.JTextField();
        btnSituacaoPesquisar = new javax.swing.JButton();
        txtSituacaoDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmnSair = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro e Manutenção de Situacao");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnSituacaoAdicionar.setText("Salvar");
        btnSituacaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSituacaoAdicionarActionPerformed(evt);
            }
        });

        btnSituacaoExcluir.setText("Excluir");
        btnSituacaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSituacaoExcluirActionPerformed(evt);
            }
        });

        btnSituacaoAlterar.setText("Alterar");
        btnSituacaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSituacaoAlterarActionPerformed(evt);
            }
        });

        jtSituacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descricao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtSituacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtSituacaoMouseClicked(evt);
            }
        });
        jtSituacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtSituacaoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtSituacaoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtSituacaoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jtSituacao);

        txtSituacaoCodigo.setEditable(false);
        txtSituacaoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSituacaoCodigoActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo");

        txtSituacaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSituacaoPesquisarActionPerformed(evt);
            }
        });

        btnSituacaoPesquisar.setText("Pesquisar");
        btnSituacaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSituacaoPesquisarActionPerformed(evt);
            }
        });

        txtSituacaoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSituacaoDescricaoActionPerformed(evt);
            }
        });

        jLabel1.setText("Descricao");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jMenu2.setText("Arquivo");

        jmnSair.setText("Sair");
        jmnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnSairActionPerformed(evt);
            }
        });
        jMenu2.add(jmnSair);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(89, 89, 89)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtSituacaoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(txtSituacaoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnSituacaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSituacaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSituacaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtSituacaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnSituacaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSituacaoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSituacaoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSituacaoAdicionar)
                    .addComponent(btnSituacaoExcluir)
                    .addComponent(btnSituacaoAlterar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtSituacaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSituacaoPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnSair))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSituacaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSituacaoAdicionarActionPerformed

        Situacao situacao = new Situacao();
        SituacaoController situacaoController = new SituacaoController();

        situacao.setSituacaoDescricao(txtSituacaoDescricao.getText());
        //inserir situacao no BD
        situacaoController.inserirSituacaoController(situacao);

        txtSituacaoCodigo.setText("");
        txtSituacaoDescricao.setText("");

        //Atualiza tabela (grid)
        atualizarTabela();
    }//GEN-LAST:event_btnSituacaoAdicionarActionPerformed

    public void atualizarTabela() {

        //limpa dados da DefaultTableModel
        DefaultTableModel modelo = (DefaultTableModel) jtSituacao.getModel();
        modelo.setNumRows(0);

        SituacaoController situacaoController = new SituacaoController();

        for (Situacao situacao : situacaoController.buscarSituacaoController()) {
            //DefaultTable
            modelo.addRow(new Object[]{
                situacao.getSituacaoCodigo(),
                situacao.getSituacaoDescricao()

            });

        }

    }
    private void btnSituacaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSituacaoExcluirActionPerformed
        //A6
        if (jtSituacao.getSelectedRow() != -1) { //verifica se está selecionada
            Situacao situacao = new Situacao();
            SituacaoController situacaoController = new SituacaoController();
            //excluir situacao no BD
            situacao.setSituacaoCodigo((int) 
                    jtSituacao.getValueAt(jtSituacao.getSelectedRow(), 0));
            situacaoController.excluirSituacaoController(situacao);
            txtSituacaoCodigo.setText("");
            txtSituacaoDescricao.setText("");
            //Atualiza tabela (grid)
            atualizarTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um situacao para excluir");
        }
    }//GEN-LAST:event_btnSituacaoExcluirActionPerformed

    private void btnSituacaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSituacaoAlterarActionPerformed

        if (jtSituacao.getSelectedRow() != -1) {
            Situacao situacao = new Situacao();
            SituacaoController situacaoController = new SituacaoController();
            situacao.setSituacaoDescricao(txtSituacaoDescricao.getText());
            situacao.setSituacaoCodigo((int) jtSituacao.getValueAt(
                    jtSituacao.getSelectedRow(), 0));
            situacaoController.atualizarSituacaoController(situacao);
            txtSituacaoCodigo.setText("");
            txtSituacaoDescricao.setText("");
            atualizarTabela();
        }

    }//GEN-LAST:event_btnSituacaoAlterarActionPerformed

    public void pesquisarSituacao(String situacaoDescricao) {

        //limpa dados da DefaultTableModel
        DefaultTableModel modelo = (DefaultTableModel) jtSituacao.getModel();
        modelo.setNumRows(0);

        SituacaoController situacaoController = new SituacaoController();

        for (Situacao situacao : situacaoController.buscarSituacaoController(situacaoDescricao)) {

            //DefaultTable
            modelo.addRow(new Object[]{
                situacao.getSituacaoCodigo(),
                situacao.getSituacaoDescricao()
            });

        }

    }


    private void txtSituacaoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSituacaoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSituacaoCodigoActionPerformed

    private void txtSituacaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSituacaoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSituacaoPesquisarActionPerformed

    private void btnSituacaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSituacaoPesquisarActionPerformed

        pesquisarSituacao(txtSituacaoPesquisar.getText());

    }//GEN-LAST:event_btnSituacaoPesquisarActionPerformed

    private void txtSituacaoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSituacaoDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSituacaoDescricaoActionPerformed

    private void jtSituacaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSituacaoKeyReleased
        if (jtSituacao.getSelectedRow() != -1) {
            txtSituacaoCodigo.setText(jtSituacao.getValueAt(jtSituacao.getSelectedRow(), 0).toString());
            txtSituacaoDescricao.setText(jtSituacao.getValueAt(jtSituacao.getSelectedRow(), 1).toString());

        }
    }//GEN-LAST:event_jtSituacaoKeyReleased

    private void jtSituacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSituacaoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSituacaoKeyPressed

    private void jtSituacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSituacaoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSituacaoKeyTyped

    private void jtSituacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtSituacaoMouseClicked
        if (jtSituacao.getSelectedRow() != -1) {
           
            txtSituacaoCodigo.setText(jtSituacao.getValueAt(
                    jtSituacao.getSelectedRow(), 0).toString());
            
            txtSituacaoDescricao.setText(jtSituacao.getValueAt(
                    jtSituacao.getSelectedRow(), 1).toString());

        }
    }//GEN-LAST:event_jtSituacaoMouseClicked

    private void jmnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnSairActionPerformed

        this.dispose(); // fecha esta tela

    }//GEN-LAST:event_jmnSairActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose(); // fecha esta tela
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSituacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSituacaoAdicionar;
    private javax.swing.JButton btnSituacaoAlterar;
    private javax.swing.JButton btnSituacaoExcluir;
    private javax.swing.JButton btnSituacaoPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem jmnSair;
    private javax.swing.JTable jtSituacao;
    private javax.swing.JTextField txtSituacaoCodigo;
    private javax.swing.JTextField txtSituacaoDescricao;
    private javax.swing.JTextField txtSituacaoPesquisar;
    // End of variables declaration//GEN-END:variables
}
