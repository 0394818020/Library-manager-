/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.*;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Dat Huy
 */
public class BookDAO implements BRDAO<Book>{
    //Trả về danh sách các cuốn sách có trong thư viện
    @Override
    public List<Book> getALLlist() {
        List<Book> list = new ArrayList<>();
        try (Connection conn = DBConnection.connection()) {
            Statement sm = conn.createStatement();
            ResultSet rs = sm.executeQuery("SELECT * FROM Book");
            
            while (rs.next()) {
                list.add(
                    new Book(
                        rs.getInt("id"), 
                        rs.getString("title"), 
                        rs.getString("author"), 
                        rs.getString("category"),
                        rs.getInt("quantity"),
                        rs.getBoolean("available")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    //Thêm sách vào thư viện
    @Override
    public void insert(Book object) {
        try (Connection conn = DBConnection.connection()) {
            
            String sql = "INSERT INTO Book(title, author, category, quantity, available) VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, object.getTitle());
            ps.setString(2, object.getAuthor());
            ps.setString(3, object.getCategory());
            ps.setInt(4, object.getQuantity());
            ps.setBoolean(5, object.isAvailable());    
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    //Xóa sách khỏi thư viện
    @Override
    public void remove(int id) {
        try (Connection conn = DBConnection.connection()){
            
            String sql = "DELETE FROM Book WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //Cập nhật thông tin sách
    @Override
    public void update(Book object) {
        try (Connection conn = DBConnection.connection()) {
            String sql = "UPDATE Book SET title = ?, author = ?, category = ?, quantity = ?, available = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, object.getTitle());
            ps.setString(2, object.getAuthor());
            ps.setString(3, object.getCategory());
            ps.setInt(4, object.getQuantity());
            ps.setBoolean(5, object.isAvailable());
            ps.setInt(6, object.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
