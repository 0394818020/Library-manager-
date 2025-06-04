/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.Loan;
import MODEL.Loan_manager;
import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Dat Huy
 */
public class LoanDAO{
  
    public List<Loan_manager> getALLlistL () {
        List<Loan_manager> list = new ArrayList<>();
        try (Connection conn = DBConnection.connection()) {
            Statement st = conn.createStatement();
            String sql = "SELECT l.id, b.title AS book_title, r.name AS reader_name, l.borrowDate, l.returnDate, l.status FROM Loan l "
                    + "JOIN Book b ON l.bookId = b.id "
                    + "JOIN Reader r ON l.readerId = r.id";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                list.add (new Loan_manager(
                        rs.getInt("id"),
                        rs.getString("book_title"),
                        rs.getString("reader_name"),
                        rs.getDate("borrowDate"),
                        rs.getDate("returnDate"),
                        rs.getString("status")
                ));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insert(int id_book, int id_reader, String status) {
        try (Connection conn = DBConnection.connection()) {
            String sql = "INSERT INTO Loan(bookId, readerId, borrowDate, returnDate, status) VALUES (?,?, CURDATE(), CURDATE() + INTERVAL 10 DAY,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id_book);
            ps.setInt(2, id_reader);
            ps.setString(3, status);
            update_muon(id_book);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remove(int id, int bookId) {
        try (Connection conn = DBConnection.connection()) {
            String sql = "DELETE FROM Loan WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            update(bookId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int bookId) {
        try (Connection conn = DBConnection.connection()) {
            String sql = "UPDATE Book SET quantity = quantity + 1 WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, bookId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void update_muon (int id) {
        try (Connection conn = DBConnection.connection()) {
            String sql = "UPDATE Book SET quantity = quantity - 1 WHERE id = ? AND quantity > 0";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void update_tra_sach () {
        try (Connection conn = DBConnection.connection()) {
            String sql = "UPDATE Loan SET status = 'Quá hạn' WHERE status = 'Đang mượn' AND returnDate < CURDATE()";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public int get_bookId (int id) {
        int bookId = -1;
        try (Connection conn = DBConnection.connection()) {
            String sql = "SELECT bookId FROM Loan WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            bookId = rs.getInt("bookId");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return bookId;
    }
}
