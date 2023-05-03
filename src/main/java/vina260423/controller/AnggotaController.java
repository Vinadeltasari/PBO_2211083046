/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina260423.controller;
import vina260423.view.FormAnggota;
import vina260423.model.AnggotaDao;
import vina260423.model.AnggotaDaoImpl;
import vina260423.model.Anggota;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class AnggotaController {
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    public AnggotaController(FormAnggota formAnggota) {
        this.formAnggota = formAnggota;
        anggotaDao =  (AnggotaDao) new AnggotaDaoImpl();
    }
    
    public void bersihForm() {
        formAnggota.getTxtNobp().setText("");
        formAnggota.getTxtNama().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    
    public void saveAnggota() {
        anggota = new Anggota();
        anggota.setNobp(formAnggota.getTxtNobp().getText());
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Insert OK");
    }
    
    public void tampil() {
         DefaultTableModel tabelModel = 
    (DefaultTableModel) formAnggota.getTblAnggota().getModel();
    tabelModel.setRowCount(0);
    List<Anggota> list = anggotaDao.getAllAnggota();
    for (Anggota anggota1 : list) {
        Object row[] = {
            anggota1.getNobp(),
            anggota1.getNama(),
            anggota1.getAlamat()
        };
        tabelModel.addRow(row);
        }
    }
}

    

