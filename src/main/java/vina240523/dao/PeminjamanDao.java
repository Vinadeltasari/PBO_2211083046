/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vina240523.dao;
import vina240523.model.Peminjaman;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author USER
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws SQLException;
    void update(Peminjaman peminjaman) throws SQLException;
    void delete(Peminjaman peminjaman) throws SQLException;
    Peminjaman getPeminjaman(String nobp, String kodeBuku,String tglPinjam) throws SQLException;
    List<Peminjaman> getAll() throws SQLException;
}
