/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesUI;

/**
 *
 * @author Celia
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    frmAsignacion1 asignacion1 = new frmAsignacion1();
    frmAsignacion2 asignacion2 = new frmAsignacion2();
    frmAsignacion3 asignacion3 = new frmAsignacion3();
    
    public PantallaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAsignacion1 = new javax.swing.JButton();
        btnAsignacion2 = new javax.swing.JButton();
        btnAsignacion3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 320));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAsignacion1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAsignacion1.setText("Asignacion 1");
        btnAsignacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignacion1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 140, 25));

        btnAsignacion2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAsignacion2.setText("Asignacion 2");
        btnAsignacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignacion2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 140, 25));

        btnAsignacion3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAsignacion3.setText("Asignacion 3");
        btnAsignacion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignacion3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 140, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Análisis numérico 2018");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 360, 22));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Villafuerte Mangandí Bryan Villafuerte");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 430, 22));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Primera tarea de programación");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 360, 22));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doratt Herrera Luis Enrique");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 360, 22));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, -70, 610, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignacion1ActionPerformed
        asignacion1.show(true);
        this.show(false);
    }//GEN-LAST:event_btnAsignacion1ActionPerformed

    private void btnAsignacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignacion2ActionPerformed
        asignacion2.show(true);
        this.show(false);
    }//GEN-LAST:event_btnAsignacion2ActionPerformed

    private void btnAsignacion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignacion3ActionPerformed
        asignacion3.show(true);
        this.dispose();
    }//GEN-LAST:event_btnAsignacion3ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignacion1;
    private javax.swing.JButton btnAsignacion2;
    private javax.swing.JButton btnAsignacion3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
