/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesUI;

import javax.swing.JOptionPane;
import metodos.Asignacion1;

/**
 *
 * @author Celia
 */
public class frmAsignacion1 extends javax.swing.JFrame {

    Asignacion1 asignacion = new Asignacion1();
    PantallaPrincipal principal;

    /**
     * Creates new form Asignación1
     */
    public frmAsignacion1() {
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
        btnRegresar = new javax.swing.JButton();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCifras = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtX1 = new javax.swing.JTextField();
        txtX2 = new javax.swing.JTextField();
        txtX3 = new javax.swing.JTextField();
        txtX4 = new javax.swing.JTextField();
        txtErrorX1 = new javax.swing.JTextField();
        txtErrorX2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("X");
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 50, -1));

        txtA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });
        jPanel1.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 80, 20));

        txtB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBKeyTyped(evt);
            }
        });
        jPanel1.add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 80, 20));

        txtC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCKeyTyped(evt);
            }
        });
        jPanel1.add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 80, 20));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("x  +");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 20));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 10, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("x  +");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 40, 20));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 130, 80, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("x2=");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 30, 20));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("x1=");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 30, 20));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("x2=");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 30, 20));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("x1=");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 30, 20));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor calculado:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 189, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Número de cifras para redondeo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 20));

        txtCifras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtCifras, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 50, 20));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Valor real:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Error: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 20));

        txtX1.setEditable(false);
        txtX1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 220, 180, 20));

        txtX2.setEditable(false);
        txtX2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 250, 180, 20));

        txtX3.setEditable(false);
        txtX3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtX3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 180, 20));

        txtX4.setEditable(false);
        txtX4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtX4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 180, 20));

        txtErrorX1.setEditable(false);
        txtErrorX1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtErrorX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 180, 20));

        txtErrorX2.setEditable(false);
        txtErrorX2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtErrorX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 180, 20));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("x2=");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 30, 20));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("x1=");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 30, 20));

        Fondo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, -120, 630, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (txtC.getText().isEmpty() || txtCifras.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar datos.");
        } else {
            if (txtA.getText().isEmpty()) {
                txtA.setText("1");
            }
            if (txtA.getText().equals("-")) {
                txtA.setText("-1");
            }
            if (txtB.getText().isEmpty()) {
                txtB.setText("1");
            }
            if (txtB.getText().equals("-")) {
                txtB.setText("-1");
            }
            if ((Double.parseDouble(txtB.getText()) * Double.parseDouble(txtB.getText())) - (4 * Double.parseDouble(txtA.getText()) * Double.parseDouble(txtC.getText())) < 0.0) {
                JOptionPane.showMessageDialog(null, "Tiene raices complejas.");
            } else {
                try {
                    txtX1.setText(String.valueOf(asignacion.calcularX1(Double.parseDouble(txtA.getText()), Double.parseDouble(txtB.getText()), Double.parseDouble(txtC.getText()), Integer.parseInt(txtCifras.getText()))));
                    txtX2.setText(String.valueOf(asignacion.calcularX2(Double.parseDouble(txtA.getText()), Double.parseDouble(txtB.getText()), Double.parseDouble(txtC.getText()), Integer.parseInt(txtCifras.getText()))));
                    txtX3.setText(String.valueOf(asignacion.valorRealX1(Double.parseDouble(txtA.getText()), Double.parseDouble(txtB.getText()), Double.parseDouble(txtC.getText()))));
                    txtX4.setText(String.valueOf(asignacion.valorRealX2(Double.parseDouble(txtA.getText()), Double.parseDouble(txtB.getText()), Double.parseDouble(txtC.getText()))));
                    calcularError();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo datos validos.");
                }
            }
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    public void calcularError() {
        double Error;
        Error = ((Double.parseDouble(txtX3.getText()) - Double.parseDouble(txtX1.getText())) / Double.parseDouble(txtX3.getText())) * 100;
        txtErrorX1.setText(String.valueOf(Error));
        Error = ((Double.parseDouble(txtX4.getText()) - Double.parseDouble(txtX2.getText())) / Double.parseDouble(txtX4.getText())) * 100;
        txtErrorX2.setText(String.valueOf(Error));
    }

    private void txtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyTyped
        char c = evt.getKeyChar();
        if (c == '.' || c == '-') {
        } else if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAKeyTyped

    private void txtBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBKeyTyped
        char c = evt.getKeyChar();
        if (c == '.' || c == '-') {
        } else if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtBKeyTyped

    private void txtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyTyped
        char c = evt.getKeyChar();
        if (c == '.' || c == '-') {
        } else if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCKeyTyped

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        principal = new PantallaPrincipal();
        principal.show();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmAsignacion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAsignacion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAsignacion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAsignacion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAsignacion1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtCifras;
    private javax.swing.JTextField txtErrorX1;
    private javax.swing.JTextField txtErrorX2;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtX3;
    private javax.swing.JTextField txtX4;
    // End of variables declaration//GEN-END:variables
}
