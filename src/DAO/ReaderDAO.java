/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.Reader;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author Dat Huy
 */
public class ReaderDAO implements BRDAO<Reader> {
    
    //Trả về danh sách đọc giả
    @Override
    public List<Reader> getALLlist() {
        List<Reader> list = new ArrayList<>();
        
        try (Connection conn = DBConnection.connection()) {
            Statement sm = conn.createStatement();
            ResultSet rs = sm.executeQuery("SELECT * FROM Reader");
            
            while (rs.next()) {
                list.add( new Reader (
                   rs.getInt("id"),
                   rs.getString("name"),
                   rs.getInt("yearOfBirth"),
                   rs.getString("email")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    //Thêm đọc giả mới vào hệ thống
    @Override
    public void insert(Reader object) {
        try (Connection conn = DBConnection.connection()) {
            String sql = "INSERT INTO Reader (name, yearOfBirth, Email) VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, object.getName());
            ps.setInt(2, object.getYearOfBirth());
            ps.setString(3, object.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //Xóa đọc giả theo id
    @Override
    public void remove(int id) {
        try (Connection conn = DBConnection.connection()) {
            String sql = "DELETE FROM Reader WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //Cập nhật thông tin đọc giả
    @Override
    public void update(Reader object) {
        try (Connection conn = DBConnection.connection()) {
            String sql = "UPDATE Reader SET name = ?, yearOfBirth = ?, Email = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, object.getName());
            ps.setInt(2, object.getYearOfBirth());
            ps.setString(3, object.getEmail());
            ps.setInt(4, object.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
