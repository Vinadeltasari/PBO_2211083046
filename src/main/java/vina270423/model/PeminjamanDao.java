/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vina270423.model;
import java.util.*;
/**
 *
 * @author HP
 */
public interface PeminjamanDao {
    void save (Peminjaman peminjaman);
    void update (int idx, Peminjaman peminjaman);
    void delete (int idx);
    Anggota getPeminajaman (int idx);
    public List<Peminjaman> getAllPeminjaman();
}
    

