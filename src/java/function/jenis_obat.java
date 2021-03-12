/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class jenis_obat {
    public static List<fjenis_obat> getAllRecords(){
        List<fjenis_obat> list=new ArrayList<fjenis_obat>();
        try{
            Connection con=koneksi.getKoneksi();
            PreparedStatement ps=con.prepareStatement("SELECT * FROM `jenis_obat`");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            fjenis_obat u=new fjenis_obat();
            u.setId_jenis(rs.getString("id_jenis"));            
            u.setJenis(rs.getString("jenis"));
            list.add(u);
            }
        } catch(Exception e){ System.out.println(e); }
        return list;
    }
    
    public static int save(fjenis_obat gt){
        int status=0;
        
        try{
            Connection con=koneksi.getKoneksi();
            PreparedStatement ps=con.prepareStatement("INSERT INTO `jenis_obat` VALUES (?,?)");
                        
            ps.setString(1, gt.getId_jenis());            
            ps.setString(2, gt.getJenis());
            status=ps.executeUpdate();           
        } catch(Exception e){
            System.out.println(e);
        }
        return status;
    }
    
    public static int update(fjenis_obat gt) {
        int status = 0;
        try {
            Connection con = koneksi.getKoneksi();
            PreparedStatement ps = con.prepareStatement("UPDATE jenis_obat SET jenis=? WHERE id_jenis=?");
            ps.setString(1, gt.getJenis());
            ps.setString(2, gt.getId_jenis());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public static fjenis_obat getRecordById(String kd) {
        fjenis_obat u = null;
        try {
            Connection con = koneksi.getKoneksi();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM jenis_obat WHERE id_jenis=?");
            ps.setString(1,kd);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new fjenis_obat();
                u.setId_jenis(rs.getString("id_jenis"));
                u.setJenis(rs.getString("jenis"));       
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return u;
    }    
    
    public static int delete(fjenis_obat gt) {
        int status=0;
        try {            
            Connection con = koneksi.getKoneksi();
            PreparedStatement ps = con.prepareStatement("DELETE FROM jenis_obat WHERE id_jenis=?"); 
            ps.setString(1, gt.getId_jenis());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }    
}