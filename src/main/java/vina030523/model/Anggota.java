/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina030523.model;

/**
 *
 * @author HP
 */
public class Anggota {
    private String kodeAnggota;
    private String namaAnggota;
    private String alamat;
    private String jenisKelamin;
    
    public Anggota() {}
    
    public Anggota(String kodeAnggota, String namaAnggota, String alamat, String jenisKelamin){
        this.kodeAnggota = kodeAnggota;
        this.namaAnggota = namaAnggota ;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getkodeAnggota(){
        return kodeAnggota;
    }
    
    public void setkodeAnggota(String kodeAnggota){
        this.kodeAnggota = kodeAnggota;
    }
    
    public String getnamaAnggota(){
        return namaAnggota;
    }
    
    public void setnamaAnggota(String namaAnggota){
        this.namaAnggota = namaAnggota;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getjenisKelamin(){
        return jenisKelamin;
    }
    
    public void setjenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    
}


