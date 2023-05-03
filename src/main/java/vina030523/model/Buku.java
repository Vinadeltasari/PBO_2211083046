/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina030523.model;

/**
 *
 * @author HP
 */
public class Buku {
     private String kodeBuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tahun;
    
    public Buku() {}
    
    public Buku(String kodeBuku, String judul , String  pengarang, String penerbit, String tahun ){
        this.kodeBuku = kodeBuku;
        this.judul = judul ;
        this.pengarang = pengarang;
        this.pengarang = penerbit;
        this.tahun = tahun;
    }
    
    public String getkodeBuku(){
        return kodeBuku;
    }
    
    public void setkodeBuku (String kodeAnggota){
        this.kodeBuku = kodeBuku;
    }
    
    public String getjudul(){
        return judul;
    }
    
    public void setjudul(String judul){
        this.judul = judul;
    }
    
    public String getpengarang(){
        return pengarang;
    }
    
    public void setpengarang(String pengarang){
        this.pengarang = pengarang;
    }
    public String getpenerbit(){
        return penerbit;
    }
    
    public void setpenerbit(String penerbit){
        this.penerbit = penerbit;
    }
    
    public String gettahun(){
        return tahun;
    }
    
    public void settahun(String tahun){
        this.tahun = tahun;
    }
    
}
