/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina260423.model;
import java.util.*;
/**
 *
 * @author HP
 */
public class AnggotaDaoImpl {
    private List<Anggota> data = new ArrayList<>();
    
    public Anggota save(Anggota anggota){
        data.add(anggota);
        return anggota;
    }
    
    public Anggota update(int index, Anggota anggota){
        data.set(index, anggota);
        return anggota;
    }
    
    public void delete (int index) {
        data.remove(index);
    }
    
    public Anggota getAnggota (int index) {
        return data.get(index);
    }
    
    public List<Anggota> getAllAnggota(){
        return data;
    }
}

    

