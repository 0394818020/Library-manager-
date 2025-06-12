/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Dat Huy
 */
import MODEL.NhanVien;
import java.sql.*;
import java.util.List;

public class NhanVienDAO implements BRDAO<NhanVien>{
    public boolean account_checking (String role, String maNV, String lg_name, String lg_pass) {
        String role_name = null;
        if (role.equals("MT")) {
            role_name = "MƯỢN - TRẢ";
        }
        else if (role.equals("TT")) {
            role_name = "THỦ THƯ";
        }
        else if (role.equals("QL")) {
            role_name = "Quản Lí";
        }
        try (Connection conn = DBConnection.connection()) {
            String sql = "SELECT * FROM TaiKhoan WHERE ChucVu = ? AND maNV = ? AND lg_name = ? AND lg_pass = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setString(1, role_name);
            ps.setString(2, maNV);
            ps.setString(3, lg_name);
            ps.setString(4, lg_pass);
            
            ResultSet rs = ps.executeQuery();
            //Nếu có tài khoản hợp lệ thì sẽ trả về true
            while (rs.next()){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public <T> List<T> getALLlist() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(NhanVien object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(NhanVien object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
