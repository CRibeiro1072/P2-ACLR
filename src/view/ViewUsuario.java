/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.UsuarioDAO;
import controller.UsuarioController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Usuario;


/**
 *
 * @author ARAÍ
 */
public class ViewUsuario extends javax.swing.JFrame {
 
    
    public ViewUsuario() {
        initComponents();
        atualizarTabela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuarioSenha = new javax.swing.JPasswordField();
        txtUsuarioConfirmaSenha = new javax.swing.JPasswordField();
        txtUsuarioNome = new javax.swing.JTextField();
        txtUsuarioEmail = new javax.swing.JTextField();
        btnUsuarioCadastrar = new javax.swing.JButton();
        cbxUsuarioAdministrador = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtUsuario = new javax.swing.JTable();
        btnUsuarioExcluir = new javax.swing.JButton();
        btnUsuarioAlterar = new javax.swing.JButton();
        txtUsuarioPesquisar = new javax.swing.JTextField();
        btnUsuarioPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(752, 500));

        jLabel2.setText("Nome:");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Senha:");

        jLabel5.setText("Confirmar Senha:");

        txtUsuarioSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioSenhaActionPerformed(evt);
            }
        });

        txtUsuarioNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioNomeActionPerformed(evt);
            }
        });

        btnUsuarioCadastrar.setText("Cadastrar");
        btnUsuarioCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioCadastrarActionPerformed(evt);
            }
        });

        cbxUsuarioAdministrador.setText("É Administrador ?");

        jtUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome", "E-mail", "Adiministrador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtUsuarioMouseClicked(evt);
            }
        });
        jtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtUsuarioKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtUsuarioKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jtUsuario);

        btnUsuarioExcluir.setText("Excluir");
        btnUsuarioExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioExcluirActionPerformed(evt);
            }
        });

        btnUsuarioAlterar.setText("Alterar");
        btnUsuarioAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioAlterarActionPerformed(evt);
            }
        });

        txtUsuarioPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioPesquisarActionPerformed(evt);
            }
        });

        btnUsuarioPesquisar.setText("Pesquisar");
        btnUsuarioPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuarioNome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuarioEmail))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuarioConfirmaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxUsuarioAdministrador))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnUsuarioCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUsuarioExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUsuarioAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuarioPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUsuarioPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuarioEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtUsuarioConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUsuarioAdministrador))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuarioCadastrar)
                    .addComponent(btnUsuarioExcluir)
                    .addComponent(btnUsuarioAlterar)
                    .addComponent(txtUsuarioPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarioPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Usuários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(786, 501));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioNomeActionPerformed
        
    }//GEN-LAST:event_txtUsuarioNomeActionPerformed

    public void atualizarTabela() {

        //limpa dados da DefaultTableModel
        DefaultTableModel modelo = (DefaultTableModel) jtUsuario.getModel();
        modelo.setNumRows(0);

        UsuarioController usuarioController = new UsuarioController();

        for (Usuario usuario : usuarioController.buscarUsuarioController()) {
            //DefaultTable
            modelo.addRow(new Object[]{
                usuario.getUsuarioCodigo(),
                usuario.getUsuarioNome(),
                usuario.getUsuarioEmail(),
                usuario.getUsuarioAdministrador()

            });
        }
    }  
    
    public void pesquisarUsuario(String usuarioDescricao) {

        //limpa dados da DefaultTableModel
        DefaultTableModel modelo = (DefaultTableModel) jtUsuario.getModel();
        modelo.setNumRows(0);

        UsuarioController usuarioController = new UsuarioController();

        for (Usuario usuario : usuarioController.buscarUsuarioController(usuarioDescricao)) {

            //DefaultTable
            modelo.addRow(new Object[]{
                usuario.getUsuarioCodigo(),
                usuario.getUsuarioNome(),
                usuario.getUsuarioEmail(),
                usuario.getUsuarioAdministrador()
            });

        }

    }
    

    
    private void btnUsuarioCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioCadastrarActionPerformed
        
        Usuario usuario = new Usuario();
        UsuarioController usuarioController = new UsuarioController();
        
        usuario.setUsuarioNome(txtUsuarioNome.getText());
        usuario.setUsuarioEmail(txtUsuarioEmail.getText());
        usuario.setUsuarioSenha(txtUsuarioSenha.getText());
        usuario.setUsuarioAdministrador(cbxUsuarioAdministrador.isSelected());
        
        if (txtUsuarioSenha.getText().equals(txtUsuarioConfirmaSenha.getText())){
            usuarioController.inserirUsuarioController(usuario);
            txtUsuarioNome.setText("");
            txtUsuarioEmail.setText("");
            txtUsuarioSenha.setText(""); 
            txtUsuarioConfirmaSenha.setText("");
            cbxUsuarioAdministrador.setSelected(false);
            atualizarTabela();
        }else
        {
            JOptionPane.showMessageDialog(null, "As senhas nao coferem");
        }
        

    }//GEN-LAST:event_btnUsuarioCadastrarActionPerformed

    private void txtUsuarioSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioSenhaActionPerformed

    private void jtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuarioMouseClicked
        String check;
        if (jtUsuario.getSelectedRow() != -1) {

        txtUsuarioNome.setText(jtUsuario.getValueAt(
            jtUsuario.getSelectedRow(), 1).toString());

        txtUsuarioEmail.setText(jtUsuario.getValueAt(
            jtUsuario.getSelectedRow(), 2).toString());
       
        txtUsuarioSenha.setText("*******");
        txtUsuarioConfirmaSenha.setText("*******");
        
        if (jtUsuario.getValueAt(jtUsuario.getSelectedRow(), 3).toString() == "true"){
            cbxUsuarioAdministrador.setSelected(true);
        }else{
            cbxUsuarioAdministrador.setSelected(false);
        }
    }
    }//GEN-LAST:event_jtUsuarioMouseClicked

    private void jtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUsuarioKeyTyped

    private void jtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtUsuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUsuarioKeyPressed

    private void jtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtUsuarioKeyReleased
        if (jtUsuario.getSelectedRow() != -1) {
            
        txtUsuarioNome.setText(jtUsuario.getValueAt(
            jtUsuario.getSelectedRow(), 1).toString());

        txtUsuarioEmail.setText(jtUsuario.getValueAt(
            jtUsuario.getSelectedRow(), 2).toString());
       
        txtUsuarioSenha.setText("*******");
        txtUsuarioConfirmaSenha.setText("*******");
        
        if (jtUsuario.getValueAt(jtUsuario.getSelectedRow(), 3).toString() == "true"){
            cbxUsuarioAdministrador.setSelected(true);
        }else{
            cbxUsuarioAdministrador.setSelected(false);
        }
    }
    }//GEN-LAST:event_jtUsuarioKeyReleased

    private void btnUsuarioExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioExcluirActionPerformed
        //A6
        if (jtUsuario.getSelectedRow() != -1) { //verifica se está selecionada

            Usuario usuario = new Usuario();
            UsuarioController usuarioController = new UsuarioController();

            usuario.setUsuarioCodigo((int)jtUsuario.getValueAt(jtUsuario.getSelectedRow(), 0));

            usuarioController.excluirUsuarioController(usuario);
            
            txtUsuarioNome.setText("");
            txtUsuarioEmail.setText("");
            txtUsuarioSenha.setText(""); 
            txtUsuarioConfirmaSenha.setText("");
            cbxUsuarioAdministrador.setSelected(false);            
            atualizarTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");
        }
    }//GEN-LAST:event_btnUsuarioExcluirActionPerformed

    private void btnUsuarioAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioAlterarActionPerformed

        if (jtUsuario.getSelectedRow() != -1) {
            Usuario usuario = new Usuario();
            UsuarioController usuarioController = new UsuarioController();
            
           usuario.setUsuarioNome(txtUsuarioNome.getText());
           usuario.setUsuarioEmail(txtUsuarioEmail.getText());
           usuario.setUsuarioSenha(txtUsuarioSenha.getText());
           usuario.setUsuarioAdministrador(cbxUsuarioAdministrador.isSelected());
        
        if (txtUsuarioSenha.getText().equals(txtUsuarioConfirmaSenha.getText())){
            usuario.setUsuarioCodigo((int) jtUsuario.getValueAt(jtUsuario.getSelectedRow(), 0));    
            usuarioController.atualizarUsuarioController(usuario);
            txtUsuarioNome.setText("");
            txtUsuarioEmail.setText("");
            txtUsuarioSenha.setText(""); 
            txtUsuarioConfirmaSenha.setText("");
            cbxUsuarioAdministrador.setSelected(false);
            atualizarTabela();
        }else
        {
            JOptionPane.showMessageDialog(null, "As senhas nao coferem");
        }
        }
    }//GEN-LAST:event_btnUsuarioAlterarActionPerformed

    private void txtUsuarioPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioPesquisarActionPerformed

    private void btnUsuarioPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioPesquisarActionPerformed

        pesquisarUsuario(txtUsuarioPesquisar.getText());
    }//GEN-LAST:event_btnUsuarioPesquisarActionPerformed

    
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
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuarioAlterar;
    private javax.swing.JButton btnUsuarioCadastrar;
    private javax.swing.JButton btnUsuarioExcluir;
    private javax.swing.JButton btnUsuarioPesquisar;
    private javax.swing.JCheckBox cbxUsuarioAdministrador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtUsuario;
    private javax.swing.JPasswordField txtUsuarioConfirmaSenha;
    private javax.swing.JTextField txtUsuarioEmail;
    private javax.swing.JTextField txtUsuarioNome;
    private javax.swing.JTextField txtUsuarioPesquisar;
    private javax.swing.JPasswordField txtUsuarioSenha;
    // End of variables declaration//GEN-END:variables
}
