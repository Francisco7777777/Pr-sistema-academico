/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Evandro
 */
public class MatricularDisc extends javax.swing.JFrame {

    /**
     * Creates new form MatricularDisc
     */
    public MatricularDisc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        disciplina1 = new javax.swing.JCheckBox();
        disciplina3 = new javax.swing.JCheckBox();
        disciplina4 = new javax.swing.JCheckBox();
        disciplina5 = new javax.swing.JCheckBox();
        disciplina6 = new javax.swing.JCheckBox();
        disciplina7 = new javax.swing.JCheckBox();
        disciplina8 = new javax.swing.JCheckBox();
        botaoConfirmar = new javax.swing.JButton();
        disciplina2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setBackground(new java.awt.Color(0, 102, 255));
        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Matricular nas disciplinas");
        labelTitulo.setOpaque(true);
        labelTitulo.setPreferredSize(new java.awt.Dimension(295, 100));

        buttonGroup1.add(disciplina1);
        disciplina1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        disciplina1.setForeground(new java.awt.Color(255, 255, 255));
        disciplina1.setText("Disciplina 1");

        buttonGroup1.add(disciplina3);
        disciplina3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        disciplina3.setForeground(new java.awt.Color(255, 255, 255));
        disciplina3.setText("Disciplina 3");

        buttonGroup1.add(disciplina4);
        disciplina4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        disciplina4.setForeground(new java.awt.Color(255, 255, 255));
        disciplina4.setText("Disciplina 4");

        buttonGroup1.add(disciplina5);
        disciplina5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        disciplina5.setForeground(new java.awt.Color(255, 255, 255));
        disciplina5.setText("Disciplina 5");

        buttonGroup1.add(disciplina6);
        disciplina6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        disciplina6.setForeground(new java.awt.Color(255, 255, 255));
        disciplina6.setText("Disciplina 6");

        buttonGroup1.add(disciplina7);
        disciplina7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        disciplina7.setForeground(new java.awt.Color(255, 255, 255));
        disciplina7.setText("Disciplina 7");

        buttonGroup1.add(disciplina8);
        disciplina8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        disciplina8.setForeground(new java.awt.Color(255, 255, 255));
        disciplina8.setText("Disciplina 8");

        botaoConfirmar.setBackground(new java.awt.Color(0, 102, 255));
        botaoConfirmar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botaoConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        botaoConfirmar.setText("Confirmar");

        buttonGroup1.add(disciplina2);
        disciplina2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        disciplina2.setForeground(new java.awt.Color(255, 255, 255));
        disciplina2.setText("Disciplina 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disciplina1)
                            .addComponent(disciplina2)
                            .addComponent(disciplina3)
                            .addComponent(disciplina4))
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disciplina5)
                            .addComponent(disciplina6)
                            .addComponent(disciplina7)
                            .addComponent(disciplina8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disciplina1)
                    .addComponent(disciplina5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disciplina2)
                    .addComponent(disciplina6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disciplina3)
                    .addComponent(disciplina7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disciplina4)
                    .addComponent(disciplina8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(botaoConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MatricularDisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatricularDisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatricularDisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatricularDisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatricularDisc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox disciplina1;
    private javax.swing.JCheckBox disciplina2;
    private javax.swing.JCheckBox disciplina3;
    private javax.swing.JCheckBox disciplina4;
    private javax.swing.JCheckBox disciplina5;
    private javax.swing.JCheckBox disciplina6;
    private javax.swing.JCheckBox disciplina7;
    private javax.swing.JCheckBox disciplina8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
