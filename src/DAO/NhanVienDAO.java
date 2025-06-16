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
import java.util.ArrayList;
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
            role_name = "Quản lí";
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
    public List<NhanVien> getALLlist() {
        List<NhanVien> list = new ArrayList<>();
        try (Connection conn = DBConnection.connection()) {
            Statement sm = conn.createStatement();
            String sql = "SELECT * FROM NhanVien";
            ResultSet rs = sm.executeQuery(sql);
            while (rs.next()) {
                list.add(new NhanVien(
                        rs.getString("maNV"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("yearOfBirth"),
                        rs.getString("number_phone"),
                        rs.getString("ChucVu")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void insert(NhanVien nv) {
        try (Connection conn = DBConnection.connection()){
            String sql = "INSERT INTO NhanVien(maNV, name, email, yearOfBirth, number_phone, ChucVu) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, nv.getMaNV());
            ps.setString(2, nv.getName());
            ps.setString(3, nv.getEmail());
            ps.setInt(4, nv.getYearOfBirth());
            ps.setString(5, nv.getNumber_phone());
            ps.setString(6, nv.getChucVu());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void insert (String role, String maNV, String lg_name, String lg_password) {
        try (Connection conn = DBConnection.connection()){
            String sql = "INSERT INTO TaiKhoan (ChucVu, maNV, lg_name, lg_pass) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, role);
            ps.setString(2, maNV);
            ps.setString(3, lg_name);
            ps.setString(4, lg_password);
            
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void remove (String maNV) {
        try (Connection conn = DBConnection.connection()) {
            String sql = "DELETE FROM NhanVien WHERE maNV = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, maNV);
            
            remove_account(maNV);
            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void remove_account (String maNV) {
        try (Connection conn = DBConnection.connection()) {
            String sql = "DELETE FROM TaiKhoan WHERE maNV = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, maNV);
            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void update(NhanVien object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
