/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Metodos.Ferrari;
import Metodos.MetodoHorner;
import Metodos.MetodoMuller;
import Metodos.MetodosGenerales;
import Metodos.Secante;
import Metodos.Tartaglia;
import Metodos.bairstow;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author robal
 */
public class General extends javax.swing.JFrame {

    MetodosGenerales mg = new MetodosGenerales();
    Secante s = new Secante();
    Tartaglia t = new Tartaglia();
    Ferrari F = new Ferrari();
    MetodoHorner mH = new MetodoHorner();
    MetodoMuller M = new MetodoMuller();
    bairstow b = new bairstow();

    int i = 0;
    DefaultTableModel model = new DefaultTableModel();
    

    /**
     * Creates new form Secante
     */
    public General() {
        initComponents();
        this.setLocationRelativeTo(null);
        ver(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabal = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnSecante = new javax.swing.JButton();
        btnFerra = new javax.swing.JButton();
        btnTart = new javax.swing.JButton();
        btnMuller = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblRaiz = new javax.swing.JLabel();
        cmbFunciones = new javax.swing.JComboBox();
        txtRaiz = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();
        btnHor = new javax.swing.JButton();
        txtError = new javax.swing.JTextField();
        btnBairs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setName("METODOS "); // NOI18N

        tblTabal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 830, 230));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_disabled__undo.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 40, 30));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_active__no.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 40, 30));

        btnSecante.setText("Metodo Secante");
        btnSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSecante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 30));

        btnFerra.setText("Metodo Ferrari");
        btnFerra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnFerraItemStateChanged(evt);
            }
        });
        btnFerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFerraActionPerformed(evt);
            }
        });
        getContentPane().add(btnFerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 120, 30));

        btnTart.setText("Metodo Tartaglia");
        btnTart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTartActionPerformed(evt);
            }
        });
        getContentPane().add(btnTart, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, 30));

        btnMuller.setText("Metodo Müller");
        btnMuller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMullerActionPerformed(evt);
            }
        });
        getContentPane().add(btnMuller, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 110, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("F(x)=");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 30, 30));

        lblRaiz.setForeground(new java.awt.Color(255, 255, 255));
        lblRaiz.setText("RAIZ: ");
        getContentPane().add(lblRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 40, -1));

        cmbFunciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFuncionesItemStateChanged(evt);
            }
        });
        cmbFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFuncionesActionPerformed(evt);
            }
        });
        getContentPane().add(cmbFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 250, -1));
        getContentPane().add(txtRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 160, -1));

        lblError.setForeground(new java.awt.Color(255, 255, 255));
        lblError.setText("ERROR: ");
        getContentPane().add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        btnHor.setText("Metodo Horner");
        btnHor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorActionPerformed(evt);
            }
        });
        getContentPane().add(btnHor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 110, 30));
        getContentPane().add(txtError, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 190, -1));

        btnBairs.setText("Metodo Bairstow");
        btnBairs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBairsActionPerformed(evt);
            }
        });
        getContentPane().add(btnBairs, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 130, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-negro.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        General gn = new General();
        gn.show();
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecanteActionPerformed
        Oculta();
        ver(true);
        i = 1;
        
        cmbFunciones.removeAllItems();
        cmbFunciones.addItem("x^5 -3x^4 -23x^3 +55x^2 +74x -120");
        cmbFunciones.addItem("x^6 -7x^4 +x^3 +3x -1");
        cmbFunciones.addItem("ln(1+x)-cos(x)");
        cmbFunciones.addItem("10sin(x) +3cos(x)");
        cmbFunciones.addItem("e^(3x-3) -ln(x-1)^2+1");
        cmbFunciones.addItem("cos(0.785-x(1+x^2)^1/2)");

    }//GEN-LAST:event_btnSecanteActionPerformed

    private void btnTartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTartActionPerformed
        Oculta();
        ver(true);
        i = 2;
        cmbFunciones.removeAllItems();
        cmbFunciones.addItem("x^3 +3x -1");
        cmbFunciones.addItem("x^3 -4.65x^2 -49.92x -76.69");
        lblRaiz.setVisible(false);
        lblError.setVisible(false);
        txtError.setVisible(false);
        txtRaiz.setVisible(false);
    }//GEN-LAST:event_btnTartActionPerformed

    private void btnMullerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMullerActionPerformed
        Oculta();
        i = 5;
        cmbFunciones.removeAllItems();
        cmbFunciones.addItem("x^3 +3x -1");
        cmbFunciones.addItem("x^3 -4.65x^2 -49.92x -76.69");
        cmbFunciones.addItem("x^4 +x^3 +0.56x^2 -1.44x -2.88");
        cmbFunciones.addItem("x^4 -3x^2 +5x +2");
        cmbFunciones.addItem("x^5 -3x^4 -23x^3 +55x^2 +74x -120");
        cmbFunciones.addItem("x^6 -7x^4 +x^3 +3x -1");
        cmbFunciones.addItem("ln(1+x) -cos(x)");
        cmbFunciones.addItem("10sin(x) +3cos(X)");
        cmbFunciones.addItem("e^(3(x-1)) -ln(x-1)^2 +1");
        ver(true);    }//GEN-LAST:event_btnMullerActionPerformed

    private void cmbFuncionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFuncionesItemStateChanged
        double n=0, n1=0;
        limpiar();
        String f = String.valueOf(cmbFunciones.getSelectedItem());
        System.out.println("funcion: " + f);
        if (f != null) {
            switch (i) {
                case 1: {
                    if (cmbFunciones.getSelectedIndex() == 0) {
                        n = 0.25;
                        n1 = 1;
                    }
                    else if(cmbFunciones.getSelectedIndex() == 1){
                        n = 0.2;
                        n1 = 0.5;
                    }
                    else if(cmbFunciones.getSelectedIndex() == 2){
                        n = 0.7;
                        n1 = 0.9;
                    }
                    else if(cmbFunciones.getSelectedIndex() == 3){
                        n = 2.8;
                        n1 = 3;
                    }
                    else if(cmbFunciones.getSelectedIndex() == 4){
                        n = 1.2;
                        n1 = 1.5;
                    }
                    else if(cmbFunciones.getSelectedIndex() == 5){
                        n = 0.5;
                        n1 = 0.7;
                    }
                    model = s.secante(f, n, n1);
                    tblTabal.setModel(model);
                    int j = tblTabal.getRowCount();
                    txtRaiz.setText(tblTabal.getValueAt((j - 1), 3).toString());
                    txtError.setText(tblTabal.getValueAt((j - 1), 4).toString());
                    break;
                }
                case 2: {
                    if (cmbFunciones.getSelectedIndex() == 0) {
                        n = 0.2;
                        n1 = 0.5;
                    }
                    else if(cmbFunciones.getSelectedIndex() == 1){
                        n = 10;
                        n1 = 10.5;
                    }
                    model = t.tartaglia(mg.Nox(mg.RegExp(f)));
                    tblTabal.setModel(model);
                    int j = tblTabal.getRowCount();
                    txtRaiz.setText(tblTabal.getValueAt((j - 1), 0).toString());
                    
                    break;
                }
                case 3: {
//                    model=F.ferrari(f, 0.2, 0.5);
//                    tblTabal.setModel(model);
//                    int j=tblTabal.getRowCount();
//                    txtRaiz.setText(tblTabal.getValueAt((j-1), 3).toString());
//                    txtError.setText(tblTabal.getValueAt((j-1), 4).toString());
                    //
                    break;
                }
                case 4: {
                    model = mH.Horner(f, 0.2, 0.5);
                    tblTabal.setModel(model);
                    int j = tblTabal.getRowCount();
                    txtRaiz.setText(tblTabal.getValueAt((j - 1), 2).toString());
                    txtError.setText(tblTabal.getValueAt((j - 1), 3).toString());
                    break;
                }
                case 5: {
                    // model=M.Muller(f, 0.2, 0.5);
                    tblTabal.setModel(model);
                    int j = tblTabal.getRowCount();
                    txtRaiz.setText(tblTabal.getValueAt((j - 1), 3).toString());
                    txtError.setText(tblTabal.getValueAt((j - 1), 4).toString());
                    break;
                }
                case 6: {
                    //model=h.Horner(f, 0.2, 0.5);
                    tblTabal.setModel(model);
                    int j = tblTabal.getRowCount();
                    txtRaiz.setText(tblTabal.getValueAt((j - 1), 3).toString());
                    txtError.setText(tblTabal.getValueAt((j - 1), 4).toString());
                    break;
                }
                default:
                    break;
            }
        }
    }//GEN-LAST:event_cmbFuncionesItemStateChanged

    private void btnBairsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBairsActionPerformed
        Oculta();
        ver(true);
        i = 6;
        jScrollPane1.setVisible(false);
        jLabel3.setVisible(false);
        cmbFunciones.removeAllItems();
        cmbFunciones.addItem("----SELECCIONE----");
        cmbFunciones.addItem("x^3 +3x -1");
        cmbFunciones.addItem("x^3 -4.65x^2 -49.92x -76.69");
        cmbFunciones.addItem("x^4 +x^3 +0.56x^2 -1.44x -2.88");
        cmbFunciones.addItem("x^4 -3x^2 +5x +2");
        cmbFunciones.addItem("x^5 -3x^4 -23x^3 +55x^2 +74x -120");
        cmbFunciones.addItem("x^6 -7x^4 +x^3 +3x -1");
    }//GEN-LAST:event_btnBairsActionPerformed

    private void cmbFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFuncionesActionPerformed

    }//GEN-LAST:event_cmbFuncionesActionPerformed

    private void btnFerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFerraActionPerformed
        Oculta();
        ver(true);
        i = 3;
        jScrollPane1.setVisible(false);
        jLabel3.setVisible(false);
        cmbFunciones.removeAllItems();
        cmbFunciones.addItem("----SELECCIONE----");
        cmbFunciones.addItem("x^4 +x^3 +0.56x^2 -1.44x -2.88");
        cmbFunciones.addItem("x^4 -3x^2 +5x +2");
        cmbFunciones.removeAllItems();
    }//GEN-LAST:event_btnFerraActionPerformed

    private void btnFerraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnFerraItemStateChanged
        Oculta();
        ver(true);
    }//GEN-LAST:event_btnFerraItemStateChanged

    private void btnHorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorActionPerformed
        Oculta();
        ver(true);
        i = 4;
        cmbFunciones.removeAll();
        cmbFunciones.addItem("x^3 +3x -1");
        cmbFunciones.addItem("x^3 -4.65x^2 -49.92x -76.69");
        cmbFunciones.addItem("x^4 +x^3 +0.56x^2 -1.44x -2.88");
        cmbFunciones.addItem("x^4 -3x^2 +5x +2");
        cmbFunciones.addItem("x^5 -3x^4 -23x^3 +55x^2 +74x -120");
        cmbFunciones.addItem("x^6 -7x^4 +x^3 +3x -1");

    }//GEN-LAST:event_btnHorActionPerformed
    public void ver(boolean i) {
        cmbFunciones.setVisible(i);
        txtError.setVisible(i);
        txtRaiz.setVisible(i);
        lblRaiz.setVisible(i);
        lblError.setVisible(i);
        jScrollPane1.setVisible(i);
        jLabel3.setVisible(i);

    }

    public void Oculta() {
        btnBairs.setVisible(false);
        btnFerra.setVisible(false);
        btnHor.setVisible(false);
        btnMuller.setVisible(false);
        btnSecante.setVisible(false);
        btnTart.setVisible(false);

    }

    public void limpiar() {
        int row = model.getRowCount();
        for (int k = 0; k < row; k++) {
            model.removeRow(0);
        }
    }

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
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new General().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBairs;
    private javax.swing.JButton btnFerra;
    private javax.swing.JButton btnHor;
    private javax.swing.JButton btnMuller;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSecante;
    private javax.swing.JButton btnTart;
    private javax.swing.JComboBox cmbFunciones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JTable tblTabal;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtRaiz;
    // End of variables declaration//GEN-END:variables
}
