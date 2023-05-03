/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina260423.model;

/**
 *
 * @author HP
 */
public class Anggota {
     private String nama;
    private String nobp;
    private String alamat;
    
    public Anggota() {}
    
    public Anggota(String nama, String nobp, String alamat){
        this.nama = nama;
        this.nobp = nobp ;
        this.alamat = alamat;
    }
    
    public String getNobp(){
        return nobp;
    }
    
    public void setNobp(String nobp){
        this.nobp = nobp;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
