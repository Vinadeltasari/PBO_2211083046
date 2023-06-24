/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina240523.controller;
import vina240523.DAO.*;
import vina240523.model.*;
import vina240523.view.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vina240523.database.DatabaseHelper;
/**
 *
 * @author USER
 */
public class AnggotaController {
    FormAnggota view;
    Anggota model;
    AnggotaDao dao;
    
    public AnggotaController(FormAnggota view) {
        try {
            this.view = view;
            dao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm() {
        view.getTxtNobp().setText("");
        view.getTxtNama().setText("");
        view.getTxtAlamat().setText("");
        view.getCboJenisKelamin().removeAllItems();
        view.getCboJenisKelamin().addItem("L");
        view.getCboJenisKelamin().addItem("P");
    }
    
    public void insert() {
        try {
            model = new Anggota();
            model.setNobp(view.getTxtNobp().getText());
            model.setNama(view.getTxtNama().getText());
            model.setAlamat(view.getTxtAlamat().getText());
            model.setJenisKelamin(view.getCboJenisKelamin().getSelectedItem().toString());
            dao.insert(model);
            JOptionPane.showMessageDialog(view, "Entri Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void update() {
        try {
            model.setNobp(view.getTxtNobp().getText());
            model.setNama(view.getTxtNama().getText());
            model.setAlamat(view.getTxtAlamat().getText());
            model.setJenisKelamin(view.getCboJenisKelamin().getSelectedItem().toString());
            dao.update(model);
            JOptionPane.showMessageDialog(view, "Update Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void delete() {
        try {
            String nobp = view.getTxtNobp().getText();
            dao.delete(nobp);
            JOptionPane.showMessageDialog(view, "Delete Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void getAnggota() {
        try {
            String nobp = view.getTblAnggota().getValueAt(view.getTblAnggota().getSelectedRow(), 0).toString();
            model = dao.getAnggota(nobp);
            if(model!=null) {
                view.getTxtNobp().setText(model.getNobp());
                view.getTxtNama().setText(model.getNama());
                view.getTxtAlamat().setText(model.getAlamat());
                view.getCboJenisKelamin().setSelectedItem(model.getJenisKelamin());
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilTabel() {
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) view.getTblAnggota().getModel();
            tabelModel.setRowCount(0);
            List<Anggota> list = dao.getAll();
            for (Anggota anggota1 : list) {
                Object[] row = {
                    anggota1.getNobp(),
                    anggota1.getNama(),
                    anggota1.getAlamat(),
                    anggota1.getJenisKelamin()
                };
                tabelModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
