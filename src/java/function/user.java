package function;
import java.sql.*;
import java.util.*;
public class user {
    public static List<fuser> getAllRecords(){
        List<fuser> list=new ArrayList<fuser>();
        try{
            Connection con=koneksi.getKoneksi();
            PreparedStatement ps=con.prepareStatement("SELECT * FROM `user`");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            fuser u=new fuser();
            u.setIDuser(rs.getString("id_user"));
            u.setnamauser(rs.getString("nama"));
            u.setusername(rs.getString("username"));
            u.setpassword(rs.getString("password"));
            u.setNo_hp(rs.getString("no_hp"));
            list.add(u);
            }
        } catch(Exception e){ System.out.println(e); }
        return list;
    }
    
    public static int save(fuser gt){
        int status=0;
        try{
            Connection con=koneksi.getKoneksi();
            PreparedStatement ps=con.prepareStatement("INSERT INTO `user` VALUES (?,?,?,?,?)");
            
            ps.setString(1, gt.getIDuser());
            ps.setString(2, gt.getnamauser());
            ps.setString(3, gt.getusername());
            ps.setString(4, gt.getpassword());
            ps.setString(5, gt.getNo_hp());
            status = ps.executeUpdate();
        } catch(Exception e){
            System.out.println(e);
        }
        return status;
    }
    
    public static int update(fuser u) {
        int status = 0;
        try {
            Connection con = koneksi.getKoneksi();
            PreparedStatement ps = con.prepareStatement("UPDATE user SET nama=?,username=?,password=?,no_hp=? WHERE id_user=?");
            ps.setString(1, u.getnamauser());
            ps.setString(2, u.getusername());
            ps.setString(3, u.getpassword());
            ps.setString(4, u.getNo_hp());
            ps.setString(5, u.getIDuser());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public static fuser getRecordById(String id) {
        fuser u = null;
        try {
            Connection con = koneksi.getKoneksi();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM user WHERE id_user=?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new fuser();
                u.setIDuser(rs.getString("id_user"));
                u.setnamauser(rs.getString("nama"));
                u.setusername(rs.getString("username"));
                u.setpassword(rs.getString("password"));
                u.setNo_hp(rs.getString("no_hp"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return u;
    }    
}
