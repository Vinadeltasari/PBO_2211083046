/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina240523.DAO;
import java.sql.*;
import java.util.*;
import vina240523.model.Peminjaman;
/**
 *
 * @author USER
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
    
     Connection connection;
    public PeminjamanDaoImpl (Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void insert(Peminjaman peminjaman) throws SQLException {
        String sql = "Insert into peminjaman values (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNobp());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4, peminjaman.getTglKembali());
        ps.executeUpdate();
    }

    @Override
    public void update(Peminjaman peminjaman) throws SQLException {
        String sql= "Update peminjaman set tglkembali=?" 
                + "where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,peminjaman.getTglKembali());
        ps.setString(2,peminjaman.getNobp());
        ps.setString(3,peminjaman.getKodeBuku());
        ps.setString(4,peminjaman.getTglPinjam());
        ps.executeUpdate();
    }

    @Override
    public void delete(Peminjaman peminjaman) throws SQLException {
        String sql= "Delete from peminjaman " 
                + "where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,peminjaman.getNobp());
        ps.setString(2,peminjaman.getKodeBuku());
        ps.setString(3,peminjaman.getTglPinjam());
        ps.executeUpdate();
    }

    @Override
    public Peminjaman getPeminjaman(String nobp, String kodeBuku, String tglPinjam) throws SQLException {
        String sql = "select * from peminjaman "
                + "where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ps.setString(2,kodeBuku);
        ps.setString(3,tglPinjam);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()) {
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
        }
        return peminjaman;
    }

    @Override
    public List<Peminjaman> getAll() throws SQLException {
        String sql = "Select * from peminjaman";
        PreparedStatement ps = connection.prepareStatement(sql);
        Peminjaman peminjaman;
        ResultSet rs = ps.executeQuery();
        List <Peminjaman> list = new ArrayList<>();
        while (rs.next()) {
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
    }
}
