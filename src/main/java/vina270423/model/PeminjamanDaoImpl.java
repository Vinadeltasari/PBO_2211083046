/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina270423.model;
import vina270423.model.AnggotaDao;
import vina270423.model.AnggotaDaoImpl;
import vina270423.model.BukuDao;
import vina270423.model.BukuDaoImpl;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
    List<Peminjaman> data = new ArrayList<>();
    public PeminjamanDaoImpl(){
        AnggotaDao daoAnggota = new AnggotaDaoImpl();
        BukuDao daoBuku = new BukuDaoImpl();
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getbuku(0)
                ,"27-04-2023","02-05-2023"));
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getbuku(1)
                ,"15-04-2023","01-05-2023"));
    }
    public void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    public void update(int idx, Peminjaman peminjaman){
        data.set(idx, peminjaman);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public Peminjaman getPeminjaman(int idx){
        return data.get(idx);
    }
    public List<Peminjaman> getAllPeminjaman(){
        return data;
    } 
}
    

