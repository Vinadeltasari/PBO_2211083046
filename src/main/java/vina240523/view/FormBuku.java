/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vina240523.view;

import vina240523.controller.*;
import javax.swing.JTable;
import javax.swing.JTextField;
/**
 *
 * @author USER
 */
public class FormBuku extends javax.swing.JFrame {

    /**
     * Creates new form FormBuku
     */
    private final BukuController controller;
    public FormBuku() {
        initComponents();
        controller = new BukuController(this);
        controller.clearForm();
        controller.tampilTabel();
    }
    
    
    public JTextField getTxtJudulBuku() {
        return txtJudulBuku;
    }

    public JTextField getTxtKodeBuku() {
        return txtKodeBuku;
    }

    public JTextField getTxtPenerbit() {
        return txtPenerbit;
    }

    public JTextField getTxtPengarang() {
        return txtPengarang;
    }

    public JTable getTblBuku() {
        return tblBuku;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtKodeBuku = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtJudulBuku = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPengarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPenerbit = new javax.swing.JTextField();
        tbnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Buku");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 70, 90, 16);

        txtKodeBuku.setText("jTextField1");
        getContentPane().add(txtKodeBuku);
        txtKodeBuku.setBounds(180, 60, 490, 30);

        jLabel2.setText("Judul Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(57, 116, 60, 16);

        txtJudulBuku.setText("jTextField2");
        txtJudulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulBukuActionPerformed(evt);
            }
        });
        getContentPane().add(txtJudulBuku);
        txtJudulBuku.setBounds(180, 110, 490, 30);

        jLabel3.setText("Pengarang");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 170, 60, 16);

        txtPengarang.setText("jTextField3");
        txtPengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPengarangActionPerformed(evt);
            }
        });
        getContentPane().add(txtPengarang);
        txtPengarang.setBounds(180, 160, 490, 30);

        jLabel4.setText("Penerbit");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 220, 60, 16);

        txtPenerbit.setText("jTextField4");
        getContentPane().add(txtPenerbit);
        txtPenerbit.setBounds(180, 220, 490, 30);

        tbnInsert.setText("Insert");
        tbnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(tbnInsert);
        tbnInsert.setBounds(50, 280, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(240, 280, 72, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(420, 280, 72, 20);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(580, 280, 72, 23);

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Buku", "Judul Buku", "Pengarang", "Penerbit"
            }
        ));
        tblBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuku);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 330, 680, 270);

        jLabel5.setText("Form Buku");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 20, 80, 16);

        setSize(new java.awt.Dimension(714, 616));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnInsertActionPerformed
        // TODO add your handling code here:
          controller.insert();
        controller.tampilTabel();
        controller.clearForm();
    }//GEN-LAST:event_tbnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.update();
        controller.tampilTabel();
        controller.clearForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.delete();
        controller.tampilTabel();
        controller.clearForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        controller.tampilTabel();
        controller.clearForm();
    }//GEN-LAST:event_btnCancelActionPerformed

   
    private void tblBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBukuMouseClicked
        // TODO add your handling code here:
        controller.getBuku();
    }//GEN-LAST:event_tblBukuMouseClicked

    private void txtJudulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulBukuActionPerformed

    private void txtPengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPengarangActionPerformed
    
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
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuku;
    private javax.swing.JButton tbnInsert;
    private javax.swing.JTextField txtJudulBuku;
    private javax.swing.JTextField txtKodeBuku;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    // End of variables declaration//GEN-END:variables
}
