/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Dat Huy
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.lang.String;
public class SecurityDAO {
    //Chuyển đổi thông tin sang HashCode
    public static String SHA256(String input) {
        try {
            //Tạo đối tượng chứa thuật toán SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            
            //Tạo chuỗi đầu vào thành mảng byte và băm
            byte[] hashBytes = md.digest(input.getBytes());
            
            //Sử dụng stringBuiler để ghép ký tự HEX
            StringBuilder hashCode = new StringBuilder();
            for (byte b: hashBytes) {
                hashCode.append(String.format("%02x", b & 0xff));
            }
            
            return hashCode.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
