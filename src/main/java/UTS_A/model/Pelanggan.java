/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.model;

/**
 *
 * @author HP
 */
public class Pelanggan {
    
    private String kodePelanggan;
    private String nama;
    private String meterbulanini;
    private String meterbulanlalu;
    private String tarif;
    private String diskon;
    
    
    public Pelanggan(){
        
    }
    
    public Pelanggan(String kodePelanggan, String nama, String meterbulanini, String meterbulanlu, String tarif, String diskon){
        this.kodePelanggan = kodePelanggan;
        this.nama = nama;
        this.meterbulanini = meterbulanini;
        this.meterbulanlalu = meterbulanlalu;
        this.tarif = tarif;
        this.diskon = diskon;
    }
    
     public String getKodePelanggan(){
        return kodePelanggan;      
    }
    public void setKodePelanggan (String kodePelanggan ){
        this.kodePelanggan = kodePelanggan;
    }
    
    public String getNama(){
        return nama; 
    }
    public void setNama(String nama){
        this.nama = nama ;
    }
    
    public String getMeterbulanini(){
        return meterbulanini;
    }
    public void setMeterbulanini (String meterbulanini){
        this.meterbulanini = meterbulanini;
    } 
    
    public String getMeterbulanlalu(){
        return meterbulanlalu;
    }
    public void setMeterbulanlalu (String meterbulanlalu){
        this.meterbulanlalu = meterbulanlalu;
    } 
    
    public String getTarif(){
        return tarif;
    }
    public void setTarif (String tarif){
        this.tarif = tarif;
    } 
    
    public String getDiskon(){
        return diskon;
    }
    public void setDiskon (String diskon){
        this.diskon = diskon;
    } 
}

    

