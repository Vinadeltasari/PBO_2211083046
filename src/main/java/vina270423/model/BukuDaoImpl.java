/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina270423.model;
import java.util.ArrayList;
import java.util.List;
import java.util.*; 

/**
 *
 * @author HP
 */
public  class BukuDaoImpl implements BukuDao {
    List<Buku> data = new ArrayList();

    public void save (Buku buku) {
        data.add(buku);
    }
    
    public void update (int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete (int index){
        data.remove(index);
    }
    
    public Buku getbuku (int index){
        return data.get(index);
    }
    
    public List<Buku> getAllBuku(){
        return data;
    }
}    

