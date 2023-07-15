/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina240523.controller;

import java.sql.Connection;
import vina240523.dao.*;
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
public class PengembalianController {
  FormPengembalian formPengembalian;
    PengembalianDao pengembalianDao;
    PeminjamanDao peminjamanDao;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;
    Pengembalian pengembalian;
    
    Connection connection;
    
    public PengembalianController(FormPengembalian formPengembalian) {
        try {
            this.formPengembalian = formPengembalian;
            connection = DatabaseHelper.getConnection();
            pengembalianDao = new PengembalianDaoImpl(connection);
            peminjamanDao = new PeminjamanDaoImpl(connection);
            anggotaDao = new AnggotaDaoImpl(connection);
            bukuDao = new BukuDaoImpl(connection);
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm() {
        formPengembalian.getTxtDenda().setText(" ");
        formPengembalian.getTxtTerlambat().setText(" ");
        formPengembalian.getTxtTglDikembalikan().setText(" ");
        formPengembalian.getTxtTglPinjam().setText(" ");
    }
    
    public void isiComboAnggota() {
        try {
            formPengembalian.getCboNobp().removeAllItems();
            List<Anggota> list = anggotaDao.getAll();
            for (Anggota anggota : list) {
                formPengembalian.getCboNobp().addItem(anggota.getNobp() + "-" + anggota.getNama());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void isiComboBuku() {
        try {
            formPengembalian.getCboKodeBuku().removeAllItems();
            List<Buku> list = bukuDao.getAll();
            for (Buku buku : list) {
                formPengembalian.getCboKodeBuku().addItem(buku.getKodeBuku() + "-" + buku.getJudulBuku());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert() {
        try {
            pengembalian = new Pengembalian();
            pengembalian.setNobp(formPengembalian.getCboNobp().getSelectedItem().toString().split("-")[0]);
            pengembalian.setKodeBuku(formPengembalian.getCboKodeBuku().getSelectedItem().toString().split("-")[0]);
            pengembalian.setTglPinjam(formPengembalian.getTxtTglPinjam().getText());
            pengembalian.setTglDikembalikan(formPengembalian.getTxtTglDikembalikan().getText());
            pengembalian.setTerlambat(formPengembalian.getTxtTerlambat().getText());
            pengembalian.setDenda(formPengembalian.getTxtDenda().getText());
            pengembalianDao.insert(pengembalian);
            JOptionPane.showMessageDialog(formPengembalian, "Entri Ok");
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getPengembalian() {
        try {
            String nobp = formPengembalian.getTblPengembalian()
                    .getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 0).toString();
            String kodeBuku = formPengembalian.getTblPengembalian()
                    .getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 1).toString();
            String tglPinjam = formPengembalian.getTblPengembalian()
                    .getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 3).toString();
            
            pengembalian = pengembalianDao.getPengembalian(nobp, kodeBuku, tglPinjam, tglPinjam, tglPinjam, nobp);
            Peminjaman peminjaman = peminjamanDao.getPeminjaman(nobp, kodeBuku, tglPinjam);
            Anggota anggota = anggotaDao.getAnggota(peminjaman.getNobp());
            formPengembalian.getCboNobp().setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
            Buku buku = bukuDao.getBuku(peminjaman.getKodeBuku());
            formPengembalian.getCboNobp()
                    .setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
            formPengembalian.getCboKodeBuku()
                    .setSelectedItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
            formPengembalian.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
            formPengembalian.getTxtTglDikembalikan().setText(peminjaman.getTglKembali());
            formPengembalian.getTxtTerlambat().setText(pengembalian.getTerlambat());
            formPengembalian.getTxtDenda().setText(pengembalian.getDenda());
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilTabel() {
        try {
            DefaultTableModel tableModel
                    = (DefaultTableModel) formPengembalian.getTblPengembalian().getModel();
            tableModel.setRowCount(0);
            List<Pengembalian> list = pengembalianDao.getAll();
            for (Pengembalian peng : list) {
                Anggota anggota = anggotaDao.getAnggota(peng.getNobp());
                Buku buku = bukuDao.getBuku(peng.getKodeBuku());
                Object[] row = {
                    peng.getNobp(),
                    anggota.getNama(),
                    peng.getKodeBuku(),
                    buku.getJudulBuku(),
                    peng.getTglPinjam(),
                    peng.getTglDikembalikan(),
                    peng.getTerlambat(),
                    peng.getDenda()
                };
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update() {
        try {
            pengembalian.setNobp(formPengembalian.getCboNobp().getSelectedItem().toString().split("-")[0]);
            pengembalian.setKodeBuku(formPengembalian.getCboKodeBuku().getSelectedItem().toString().split("-")[0]);
            pengembalian.setTglPinjam(formPengembalian.getTxtTglPinjam().getText());
            pengembalian.setTglDikembalikan(formPengembalian.getTxtTglDikembalikan().getText());
            pengembalian.setTerlambat(formPengembalian.getTxtTerlambat().getText());
            pengembalian.setDenda(formPengembalian.getTxtDenda().getText());
            pengembalianDao.update(pengembalian);
            JOptionPane.showMessageDialog(formPengembalian, "Entri Ok");
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete() {
        try {
            pengembalianDao.delete(pengembalian);
            JOptionPane.showMessageDialog(formPengembalian, "Delete Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPengembalian, ex.getMessage());
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}