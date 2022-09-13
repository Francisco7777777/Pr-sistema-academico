
package View;

import Controller.CadastroProfessorController;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Evandro
 */
public class CadProf extends javax.swing.JFrame {
    
    final private CadastroProfessorController controller;
    /**
     * Creates new form CadAluno
     */
    public CadProf() {
        initComponents();
        
        controller = new CadastroProfessorController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelADM = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        senha = new javax.swing.JTextField();
        sim = new javax.swing.JRadioButton();
        nao = new javax.swing.JRadioButton();
        bCadastrar = new javax.swing.JButton();
        numRegistro = new javax.swing.JTextField();
        labelMatricula = new javax.swing.JLabel();
        bLimpar = new javax.swing.JButton();
        bAlterar = new javax.swing.JButton();
        pesquisar = new javax.swing.JTextField();
        bPesquisar = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        labelTitulo.setBackground(new java.awt.Color(0, 102, 255));
        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Cadastrar Professor");
        labelTitulo.setMaximumSize(new java.awt.Dimension(85, 22));
        labelTitulo.setMinimumSize(new java.awt.Dimension(85, 22));
        labelTitulo.setOpaque(true);

        labelNome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelNome.setForeground(new java.awt.Color(0, 0, 0));
        labelNome.setText("Nome");

        labelEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setText("E-mail");

        labelSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(0, 0, 0));
        labelSenha.setText("Senha");

        labelADM.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelADM.setForeground(new java.awt.Color(0, 0, 0));
        labelADM.setText("Professor é ADM");

        nome.setForeground(new java.awt.Color(0, 0, 0));

        email.setForeground(new java.awt.Color(0, 0, 0));

        senha.setForeground(new java.awt.Color(0, 0, 0));
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });

        sim.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sim.setForeground(new java.awt.Color(0, 0, 0));
        sim.setText("Sim");
        sim.setHideActionText(true);
        sim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sim.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        sim.setIconTextGap(10);
        sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simActionPerformed(evt);
            }
        });

        nao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nao.setForeground(new java.awt.Color(0, 0, 0));
        nao.setText("Não");
        nao.setBorderPainted(true);
        nao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nao.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nao.setIconTextGap(10);
        nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoActionPerformed(evt);
            }
        });

        bCadastrar.setBackground(new java.awt.Color(102, 204, 0));
        bCadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        bCadastrar.setText("Cadastrar");
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        numRegistro.setForeground(new java.awt.Color(0, 0, 0));
        numRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numRegistroActionPerformed(evt);
            }
        });

        labelMatricula.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelMatricula.setForeground(new java.awt.Color(0, 0, 0));
        labelMatricula.setText("Num. do registro");

        bLimpar.setBackground(new java.awt.Color(255, 153, 0));
        bLimpar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bLimpar.setForeground(new java.awt.Color(255, 255, 255));
        bLimpar.setText("Limpar");
        bLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparActionPerformed(evt);
            }
        });

        bAlterar.setBackground(new java.awt.Color(0, 102, 255));
        bAlterar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bAlterar.setForeground(new java.awt.Color(255, 255, 255));
        bAlterar.setText("Alterar");
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        bPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        bPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        bPesquisar.setText("Pesquisar");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        bVoltar.setBackground(new java.awt.Color(255, 51, 0));
        bVoltar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bVoltar.setForeground(new java.awt.Color(255, 255, 255));
        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSenha)
                            .addComponent(labelADM))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(sim, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelMatricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMatricula))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelADM)
                    .addComponent(sim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        bLimpar.getAccessibleContext().setAccessibleName("Linpar");
        bLimpar.getAccessibleContext().setAccessibleParent(bLimpar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        controller.cadastrarController();
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simActionPerformed

    private void numRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numRegistroActionPerformed

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        // TODO add your handling code here:
        controller.limparCamposController();
    }//GEN-LAST:event_bLimparActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarActionPerformed

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        // TODO add your handling code here:
        controller.pesquisarController();
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        // TODO add your handling code here:
        controller.voltarController();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naoActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        // TODO add your handling code here:
        controller.alterarController();
    }//GEN-LAST:event_bAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(CadProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadProf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JTextField email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelADM;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JRadioButton nao;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField numRegistro;
    private javax.swing.JTextField pesquisar;
    private javax.swing.JTextField senha;
    private javax.swing.JRadioButton sim;
    // End of variables declaration//GEN-END:variables

    
    public void exibirMenssagem(String menssagem) {
        JOptionPane.showMessageDialog(null, menssagem, "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public JTextField getEmail() {
        return email;
    }

    public void setEmail(JTextField email) {
        this.email = email;
    }

    public JRadioButton getNao() {
        return nao;
    }

    public void setNao(JRadioButton nao) {
        this.nao = nao;
    }

    public JTextField getNome() {
        return nome;
    }

    public void setNome(JTextField nome) {
        this.nome = nome;
    }

    public JTextField getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(JTextField numRegistro) {
        this.numRegistro = numRegistro;
    }

    public JTextField getPesquisar() {
        return pesquisar;
    }

    public void setPesquisar(JTextField pesquisar) {
        this.pesquisar = pesquisar;
    }

    public JTextField getSenha() {
        return senha;
    }

    public void setSenha(JTextField senha) {
        this.senha = senha;
    }

    public JRadioButton getSim() {
        return sim;
    }

    public void setSim(JRadioButton sim) {
        this.sim = sim;
    } 

}
