/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UTS_A.view;
import UTS_A.controller.*;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
/**
 *
 * @author HP
 */
public class FormPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form FormPelanggan
     */
    PelangganController controller;
    public FormPelanggan() {
        initComponents();
        
        controller = new PelangganController(this);
        controller.bersihForm();
        controller.tampil();
        
        
    }
    
    public javax.swing.JTextField getTxtKodePelanggan(){
        return TxtKodePelanggan;
    }
    
    public javax.swing.JTextField getTxtNama(){
        return  TxtNama;
    }
    
    public javax.swing.JTextField getTxtMeterbulanini(){
        return TxtMeterbulanini;
    }
    
    public javax.swing.JTextField getTxtMeterbulanlalu(){
        return TxtMeterbulanlalu;
    }
    
    public javax.swing.JTextField getTxtTarif(){
        return  TxtTarif;
    }
    
    public javax.swing.JTextField getTxtDiskon(){
        return TxtDiskon;
    }
    
    public javax.swing.JTable getTblPelanggan(){
        return TblPelanggan;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtKodePelanggan = new javax.swing.JTextField();
        TxtNama = new javax.swing.JTextField();
        TxtMeterbulanini = new javax.swing.JTextField();
        TxtMeterbulanlalu = new javax.swing.JTextField();
        TxtTarif = new javax.swing.JTextField();
        TxtDiskon = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPelanggan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Pelanggan");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 16, 100, 16);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 40, 34, 16);

        jLabel3.setText("Meter Bulan ini");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 100, 16);

        jLabel4.setText("Meter bulan lalu");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 90, 16);

        jLabel5.setText("Tarif");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 60, 16);

        jLabel6.setText("Diskon");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 170, 39, 16);

        TxtKodePelanggan.setText("jTextField1");
        getContentPane().add(TxtKodePelanggan);
        TxtKodePelanggan.setBounds(150, 10, 290, 28);

        TxtNama.setText("jTextField2");
        getContentPane().add(TxtNama);
        TxtNama.setBounds(150, 40, 290, 28);

        TxtMeterbulanini.setText("jTextField3");
        getContentPane().add(TxtMeterbulanini);
        TxtMeterbulanini.setBounds(150, 70, 290, 28);

        TxtMeterbulanlalu.setText("jTextField4");
        getContentPane().add(TxtMeterbulanlalu);
        TxtMeterbulanlalu.setBounds(150, 100, 290, 28);

        TxtTarif.setText("jTextField5");
        getContentPane().add(TxtTarif);
        TxtTarif.setBounds(150, 130, 290, 28);

        TxtDiskon.setText("jTextField6");
        getContentPane().add(TxtDiskon);
        TxtDiskon.setBounds(150, 160, 290, 28);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(20, 200, 59, 28);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(190, 200, 68, 28);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(360, 200, 64, 28);

        TblPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama", "mBi", "mBL", "Tarif", "Diskon", "Total"
            }
        ));
        TblPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblPelangganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblPelanggan);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 230, 440, 220);

        setBounds(0, 0, 471, 491);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controller.savePelanggan();
        controller.tampil();
        controller.bersihForm();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.savePelanggan();
        controller.tampil();
        controller.bersihForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.delete();
        controller.tampil();
        controller.bersihForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void TblPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblPelangganMouseClicked
        // TODO add your handling code here:
        controller.getPelanggan();
    }//GEN-LAST:event_TblPelangganMouseClicked

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
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblPelanggan;
    private javax.swing.JTextField TxtDiskon;
    private javax.swing.JTextField TxtKodePelanggan;
    private javax.swing.JTextField TxtMeterbulanini;
    private javax.swing.JTextField TxtMeterbulanlalu;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField TxtTarif;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
