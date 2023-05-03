/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina030523.controller;
import vina030523.model.AnggotaDao;
import vina030523.model.AnggotaDaoImpl;
import vina030523.model.Anggota;
import vina030523.view.FormAnggota;
import javax.swing.*;
import javax.swing.table.*;
import java.util.List;

/**
 *
 * @author HP
 */
public class AnggotaController {
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    public AnggotaController(FormAnggota formAnggota){
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDaoImpl();
    }
    
    public void bersihForm(){
        formAnggota.getTxtkodeAnggota().setText("");
        formAnggota.getTxtnamaAnggota().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    
    public void isiCboJenisKelamin (){
        formAnggota.getCbojenisKelamin().removeAllItems();
        formAnggota.getCbojenisKelamin().addItem("L");
        formAnggota.getCbojenisKelamin().addItem("P");    
    }
    
    public void saveAnggota(){
        anggota = new Anggota();
        anggota.setkodeAnggota(formAnggota.getTxtkodeAnggota().getText());
        anggota.setnamaAnggota(formAnggota.getTxtnamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setjenisKelamin(formAnggota.getCbojenisKelamin().getSelectedItem().toString()); 
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota,"insert Ok");      
    }
    
    public void updateAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota.setkodeAnggota(formAnggota.getTxtkodeAnggota().getText());
        anggota.setnamaAnggota(formAnggota.getTxtnamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setjenisKelamin(formAnggota.getCbojenisKelamin().getSelectedItem().toString()); 
        anggotaDao.update(index, anggota);
        JOptionPane.showMessageDialog(formAnggota,"update Ok");      
    }
    
    public void delete(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delete(index);
        JOptionPane.showMessageDialog(formAnggota,"Delete Ok"); 
    }
    
    public void getAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota!=null){
            formAnggota.getTxtkodeAnggota().setText(anggota.getkodeAnggota());
            formAnggota.getTxtnamaAnggota().setText(anggota.getnamaAnggota());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
            formAnggota.getCbojenisKelamin().setSelectedItem(anggota.getjenisKelamin());
        }
    }
    
    public void tampil(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = anggotaDao.getAllAnggota();
        for (Anggota anggota1 : list){
            Object row[] = {
                anggota1.getkodeAnggota(),
                anggota1.getnamaAnggota(),
                anggota1.getjenisKelamin(),
                anggota1.getAlamat()
            };
            tabelModel.addRow(row); 
            }
        }
        
    }
    

