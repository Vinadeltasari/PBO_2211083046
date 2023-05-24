/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina270423.controller;
import vina270423.model.*;
import vina270423.view.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HP
 */
public class PeminjamanController {
    private Peminjaman peminjaman;
    private PeminjamanDaoImpl peminjamanDao;
    private FormPeminjaman formPeminjaman;
    
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
    }
    public void bersihForm(){
        formPeminjaman.getTxtPinjam().setText("");
        formPeminjaman.getTxtKembali().setText("");
    }
    
    public void isiCombo(){
        List<Anggota> listAnggota = anggotaDao.getAllAnggota();
        List<Buku> listBuku = bukuDao.getAllBuku();
        formPeminjaman.getcboAnggota().removeAllItems();
        formPeminjaman.getcbobuku().removeAllItems();
        //isi anggota
        for (Anggota anggota : listAnggota) {
            formPeminjaman.getcboAnggota().addItem(anggota.getKodeAnggota()+" - "+anggota.getNamaAnggota());
        }
        
        for (Buku buku : listBuku) {
            formPeminjaman.getcbobuku().addItem(buku.getKodeBuku()+" - "+buku.getJudul());
        }
    }
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(
   anggotaDao.getAnggota(formPeminjaman.getcboAnggota().getSelectedIndex()));
        peminjaman.setBuku(
            bukuDao.getbuku(formPeminjaman.getcbobuku().getSelectedIndex()));
        peminjaman.setTglPinjam(formPeminjaman.getTxtPinjam().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtKembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Entri Ok");
    }
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getcboAnggota()
                    .setSelectedItem(peminjaman.getAnggota().getKodeAnggota());
            formPeminjaman.getcbobuku()
                    .setSelectedItem(peminjaman.getBuku().getKodeBuku());
            formPeminjaman.getTxtPinjam()
                    .setText(peminjaman.getTglPinjam());
            formPeminjaman.getTxtKembali()
                    .setText(peminjaman.getTglKembali());
        }
    }
    
    public void updatePeminjaman(){
        int idx = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(
   anggotaDao.getAnggota(formPeminjaman.getcboAnggota().getSelectedIndex()));
        peminjaman.setBuku(
            bukuDao.getbuku(formPeminjaman.getcbobuku().getSelectedIndex()));
        peminjaman.setTglPinjam(formPeminjaman.getTxtPinjam().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtKembali().getText());
        peminjamanDao.update(idx,peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Update Ok");
    }
    
    public void deletePeminjaman(){
        int idx = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Deleted");
    }
    
    public void tampil(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAllPeminjaman();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getAnggota().getKodeAnggota(),
                peminjaman.getBuku().getKodeBuku(),
                peminjaman.getTglPinjam(),
                peminjaman.getTglKembali()
            };
            tabelModel.addRow(data);
        }
    }
}


