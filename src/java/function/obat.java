/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class obat {
    public static List<fobat> getAllRecords(){
        List<fobat> list=new ArrayList<fobat>();
        try{
            Connection con=koneksi.getKoneksi();
            PreparedStatement ps=con.prepareStatement("SELECT * FROM `obat`");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            fobat u=new fobat();
            u.setKd_obat(rs.getString("kd_obat"));
            u.setNama_obat(rs.getString("nama_obat"));
            u.setId_jenis(rs.getString("id_jenis"));
            u.setKeterangan(rs.getString("keterangan"));
            u.setDosis(rs.getString("dosis"));
            u.setStok(rs.getInt("stok"));
            u.setHarga(rs.getInt("harga"));
            list.add(u);
            }
        } catch(Exception e){ System.out.println(e); }
        return list;
    }
    
    public static int save(fobat gt){
        int status=0;
        
        try{
            Connection con=koneksi.getKoneksi();
            PreparedStatement ps=con.prepareStatement("INSERT INTO `obat` VALUES (?,?,?,?,?,?,?)");
                        
            ps.setString(1, gt.getKd_obat());
            ps.setString(2, gt.getNama_obat());
            ps.setString(3, gt.getId_jenis());
            ps.setString(4, gt.getKeterangan());
            ps.setString(5, gt.getDosis());
            ps.setInt(6, gt.getStok());
            ps.setInt(7, gt.getHarga());            
            
            status=ps.executeUpdate();
           
        } catch(Exception e){
            System.out.println(e);
        }
        return status;
    }
    
    public static int update(fobat gt) {
        int status = 0;
        try {
            Connection con = koneksi.getKoneksi();
            PreparedStatement ps = con.prepareStatement("UPDATE obat SET nama_obat=?,"
                    + "id_jenis=?,keterangan=?,dosis=?,stok=?,harga=? WHERE kd_obat=?");
            ps.setString(1, gt.getNama_obat());
            ps.setString(2, gt.getId_jenis());
            ps.setString(3, gt.getKeterangan());
            ps.setString(4, gt.getDosis());
            ps.setInt(5, gt.getStok());
            ps.setInt(6, gt.getHarga());
            ps.setString(7, gt.getKd_obat());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public static fobat getRecordById(String kd) {
        fobat u = null;
        try {
            Connection con = koneksi.getKoneksi();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM obat WHERE kd_obat=?");
            ps.setString(1,kd);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new fobat();
                u.setKd_obat(rs.getString("kd_obat"));
                u.setNama_obat(rs.getString("nama_obat"));
                u.setId_jenis(rs.getString("id_jenis"));
                u.setKeterangan(rs.getString("keterangan"));
                u.setDosis(rs.getString("dosis"));
                u.setStok(rs.getInt("stok"));
                u.setHarga(rs.getInt("harga"));                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return u;
    }
    
    public static int delete(fobat gt) {
        int status = 0;
        try {            
            Connection con = koneksi.getKoneksi();
            PreparedStatement ps = con.prepareStatement("DELETE FROM obat WHERE kd_obat=?"); 
            ps.setString(1, gt.getKd_obat());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }    
}