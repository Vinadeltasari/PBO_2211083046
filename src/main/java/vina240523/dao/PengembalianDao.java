/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vina240523.dao;
import vina240523.model.Pengembalian;
import java.util.List;
/**
 *
 * @author USER
 */
public interface PengembalianDao {
    void insert(Pengembalian pengembalian) throws Exception;
    void update(Pengembalian pengembalian) throws Exception;
    void delete(Pengembalian pengembalian) throws Exception;
    Pengembalian getPengembalian(String nobp, String kodeBuku, String tglPinjam) throws Exception;
    List<Pengembalian> getAll() throws Exception;
    int selisihTanggal (String tgl1, String tgl2) throws Exception;

    
}
