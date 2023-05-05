/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina270423.controller;
import vina270423.model.BukuDao;
import vina270423.model.BukuDaoImpl;
import vina270423.model.Buku;
import vina270423.view.FormBuku;
import javax.swing.*;
import javax.swing.table.*;
import java.util.List;

/**
 *
 * @author HP
 */
public class BukuController {
    
    private FormBuku formBuku;
    private Buku buku;
    private BukuDao bukuDao;
    
    public BukuController(FormBuku formBuku){
        this.formBuku = formBuku;
        bukuDao = new BukuDaoImpl();
    }
    
    public void bersihForm(){
        formBuku.getTxtkodeBuku().setText("");
        formBuku.getTxtjudul().setText("");
        formBuku.getTxtpengarang().setText("");
        formBuku.getTxtpenerbit().setText("");
        formBuku.getTxttahun().setText("");
        
    }
    public void saveBuku(){
        buku = new Buku();
        buku.setkodeBuku(formBuku.getTxtkodeBuku().getText());
        buku.setjudul(formBuku.getTxtjudul().getText());
        buku.setpengarang(formBuku.getTxtpengarang().getText());
        buku.setpenerbit(formBuku.getTxtpenerbit().getText());
        buku.settahun(formBuku.getTxttahun().getText());
        bukuDao.save(buku);
        JOptionPane.showMessageDialog(formBuku, "Insert ok ");
    }
    
    public void updateBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku.setkodeBuku(formBuku.getTxtkodeBuku().getText());
        buku.setjudul(formBuku.getTxtjudul().getText());
        buku.setpengarang(formBuku.getTxtpengarang().getText());
        buku.setpenerbit(formBuku.getTxtpenerbit().getText());
        buku.settahun(formBuku.getTxttahun().getText());
        bukuDao.update(index,buku);
        JOptionPane.showMessageDialog(formBuku, "Update ok ");
    }
    
    public void deleteBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        bukuDao.delete(index);
         JOptionPane.showMessageDialog(formBuku, "Delete ok ");
    }
    
    public void getBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = bukuDao.getbuku(index);
        if(buku != null ){
            formBuku.getTxtkodeBuku().setText(buku.getkodeBuku());
            formBuku.getTxtjudul().setText(buku.getjudul());
            formBuku.getTxtpengarang().setText(buku.getpengarang());
            formBuku.getTxtpenerbit().setText(buku.getpenerbit());
            formBuku.getTxttahun().setText(buku.gettahun());
        }
    }
    
    public void tampil(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formBuku.getTblBuku().getModel();
        tabelModel.setRowCount(0);
        List<Buku> list = bukuDao.getAllBuku();
        for (Buku buku1 : list){
            Object row[]= {
                buku1.getkodeBuku(),
                buku1.getjudul(),
                buku1.getpengarang(),
                buku1.getpenerbit(),
                buku1.gettahun()
            };
            tabelModel.addRow(row);
        }
    }
}

    
    
    
   