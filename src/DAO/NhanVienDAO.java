/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Dat Huy
 */
import java.sql.*;

public class NhanVienDAO {
    public boolean account_checking (String maNV, String lg_name, String lg_pass) {
        try (Connection conn = DBConnection.connection()) {
            String sql = "SELECT * FROM TaiKhoan WHERE maNV = ? AND lg_name = ? AND lg_pass = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, maNV);
            ps.setString(2, lg_name);
            ps.setString(3, lg_pass);
            
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
}
