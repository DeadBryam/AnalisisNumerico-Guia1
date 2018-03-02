package interfacesUI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.Asignacion3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author villa
 */
public class frmAsignacion3 extends javax.swing.JFrame {

    /**
     * Creates new form frmAsignacion3
     */
    Asignacion3 asig = new Asignacion3();
    DefaultTableModel model1, model2;
    PantallaPrincipal principal;

    public frmAsignacion3() {
        initComponents();
        this.setLocationRelativeTo(null);
        pnlTabla.show(false);
        btnMostrarModel1.setEnabled(false);
        btnMostrarModel2.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCalculo = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtValorVerdadero = new javax.swing.JTextField();
        txtValorMetodo1 = new javax.swing.JTextField();
        txtValorMetodo2 = new javax.swing.JTextField();
        txtError1 = new javax.swing.JTextField();
        txtConclusion = new javax.swing.JTextField();
        txtError2 = new javax.swing.JTextField();
        txtCifras = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnMostrarModel1 = new javax.swing.JButton();
        btnMostrarModel2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlTabla = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btnCerrarPanel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCalculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha-de-retroceso.png"))); // NOI18N
        btnRegresar.setToolTipText("Regresar");
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlCalculo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese la cifras significativas:");
        pnlCalculo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("valor verdadero");
        pnlCalculo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valor metodo 1");
        pnlCalculo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor metodo 2");
        pnlCalculo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("%");
        pnlCalculo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Error 2");
        pnlCalculo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Metodo 2");
        pnlCalculo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 20));

        txtValorVerdadero.setEditable(false);
        pnlCalculo.add(txtValorVerdadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 155, 20));

        txtValorMetodo1.setEditable(false);
        pnlCalculo.add(txtValorMetodo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 155, 20));

        txtValorMetodo2.setEditable(false);
        pnlCalculo.add(txtValorMetodo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 155, 20));

        txtError1.setEditable(false);
        pnlCalculo.add(txtError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 155, 20));

        txtConclusion.setEditable(false);
        pnlCalculo.add(txtConclusion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 260, 20));

        txtError2.setEditable(false);
        pnlCalculo.add(txtError2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 155, 20));
        pnlCalculo.add(txtCifras, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 51, 20));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        pnlCalculo.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, 20));

        btnMostrarModel1.setText(">");
        btnMostrarModel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarModel1ActionPerformed(evt);
            }
        });
        pnlCalculo.add(btnMostrarModel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 40, 20));

        btnMostrarModel2.setText(">");
        btnMostrarModel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarModel2ActionPerformed(evt);
            }
        });
        pnlCalculo.add(btnMostrarModel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 40, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("%");
        pnlCalculo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/serie1.png"))); // NOI18N
        pnlCalculo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 260, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Error 1");
        pnlCalculo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Serie2.png"))); // NOI18N
        pnlCalculo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 230, 60));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Concusion");
        pnlCalculo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Metodo 1");
        pnlCalculo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.jpg"))); // NOI18N
        pnlCalculo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -50, 570, 560));

        getContentPane().add(pnlCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 490));

        pnlTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Valores obtenidos");
        pnlTabla.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 20));

        tabla1.setModel(new DefaultTableModel(new Object[]{"Iteracion", "Resultado", "Error Aproximado"}, 0));
        jScrollPane1.setViewportView(tabla1);

        pnlTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 370, 430));

        btnCerrarPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha-de-retroceso.png"))); // NOI18N
        btnCerrarPanel.setBorderPainted(false);
        btnCerrarPanel.setContentAreaFilled(false);
        btnCerrarPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarPanelActionPerformed(evt);
            }
        });
        pnlTabla.add(btnCerrarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.jpg"))); // NOI18N
        pnlTabla.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        getContentPane().add(pnlTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (txtCifras.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese la cantidad de cifras.");
        } else {
            btnMostrarModel1.setEnabled(true);
            btnMostrarModel2.setEnabled(true);
            txtValorVerdadero.setText(String.valueOf(asig.getVv()));
            model1 = asig.metodo1(Integer.parseInt(txtCifras.getText()), 5);
            txtValorMetodo1.setText(String.valueOf(asig.getRes1()));
            txtError1.setText(String.valueOf(Math.abs(asig.getEr1())));
            model2 = asig.metodo2(Integer.parseInt(txtCifras.getText()), 5);
            txtValorMetodo2.setText(String.valueOf(1 / asig.getRes2()));
            txtError2.setText(String.valueOf(Math.abs(asig.getEr2())));

            if (Double.parseDouble(String.valueOf(txtError1.getText())) > Double.parseDouble(String.valueOf(txtError2.getText()))) {
                txtConclusion.setText("EL METODO 2 ES MAS PRECISO.");
            } else {
                txtConclusion.setText("EL METODO 1 ES MAS PRECISO.");
            }
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnMostrarModel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarModel2ActionPerformed
        //tabla1.setModel(new DefaultTableModel());
        tabla1.setModel(model2);
        tabla1.sizeColumnsToFit(0);
        pnlCalculo.show(false);
        pnlTabla.show(true);
    }//GEN-LAST:event_btnMostrarModel2ActionPerformed

    private void btnCerrarPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarPanelActionPerformed
        pnlTabla.show(false);
        pnlCalculo.show(true);
        txtCifras.show(true);
    }//GEN-LAST:event_btnCerrarPanelActionPerformed

    private void btnMostrarModel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarModel1ActionPerformed
        //tabla1.setModel(new DefaultTableModel());
        tabla1.setModel(model1);
        tabla1.sizeColumnsToFit(0);
        pnlCalculo.show(false);
        pnlTabla.show(true);
    }//GEN-LAST:event_btnMostrarModel1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmAsignacion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAsignacion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAsignacion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAsignacion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAsignacion3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrarPanel;
    private javax.swing.JButton btnMostrarModel1;
    private javax.swing.JButton btnMostrarModel2;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCalculo;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtCifras;
    private javax.swing.JTextField txtConclusion;
    private javax.swing.JTextField txtError1;
    private javax.swing.JTextField txtError2;
    private javax.swing.JTextField txtValorMetodo1;
    private javax.swing.JTextField txtValorMetodo2;
    private javax.swing.JTextField txtValorVerdadero;
    // End of variables declaration//GEN-END:variables
}
