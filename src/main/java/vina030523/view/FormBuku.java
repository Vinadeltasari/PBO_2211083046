/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vina030523.view;

/**
 *
 * @author HP
 */
public class FormBuku extends javax.swing.JFrame {

    /**
     * Creates new form FormBuku
     */
    public FormBuku() {
        initComponents();
    }
    
    public javax.swing.JTextField getTxtkodeBuku(){
        return txtkodeBuku;
    }
    
    public javax.swing.JTextField getTxtjudul(){
        return txtjudul;
    }
    public javax.swing.JTextField getTxtpengarang(){
        return txtpengarang;
    }
    
    public javax.swing.JTextField getTxtpenerbit(){
        return txtpenerbit;
    }
    
    public javax.swing.JTextField getTxttahun(){
        return txttahun;
    }
    
    public javax.swing.JTable getTblBuku(){
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

        jLabel1 = new javax.swing.JLabel();
        txtkodeBuku = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtjudul = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpengarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpenerbit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttahun = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("kode Buku");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 90, 16);

        txtkodeBuku.setText("jTextField1");
        getContentPane().add(txtkodeBuku);
        txtkodeBuku.setBounds(110, 10, 310, 28);

        jLabel2.setText("judul");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 60, 16);

        txtjudul.setText("jTextField2");
        getContentPane().add(txtjudul);
        txtjudul.setBounds(110, 40, 310, 28);

        jLabel3.setText("pengarang");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 70, 16);

        txtpengarang.setText("jTextField3");
        getContentPane().add(txtpengarang);
        txtpengarang.setBounds(110, 70, 310, 28);

        jLabel4.setText("penerbit");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 60, 16);

        txtpenerbit.setText("jTextField4");
        getContentPane().add(txtpenerbit);
        txtpenerbit.setBounds(110, 100, 310, 28);

        jLabel5.setText("tahun");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 60, 16);

        txttahun.setText("jTextField5");
        getContentPane().add(txttahun);
        txttahun.setBounds(110, 130, 310, 28);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(10, 190, 59, 28);

        btnUpdate.setText("Update");
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(130, 190, 68, 28);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(270, 190, 64, 28);

        btnCancel.setText("Cancel");
        getContentPane().add(btnCancel);
        btnCancel.setBounds(370, 190, 67, 28);

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblBuku);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 220, 450, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

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
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtjudul;
    private javax.swing.JTextField txtkodeBuku;
    private javax.swing.JTextField txtpenerbit;
    private javax.swing.JTextField txtpengarang;
    private javax.swing.JTextField txttahun;
    // End of variables declaration//GEN-END:variables
}
