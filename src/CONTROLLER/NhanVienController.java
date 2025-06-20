/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.NhanVienDAO;
import MODEL.NhanVien;
import java.util.List;

/**
 *
 * @author Dat Huy
 */
public class NhanVienController {
    private NhanVienDAO dao = new NhanVienDAO();
    
    public boolean checking_account (String role, String maNV, String lg_name, String lg_pass) {
        return dao.account_checking(role, maNV, lg_name, lg_pass);
    }
    
    public void remove (String maNV) {
        dao.remove(maNV);
    } 
    
    public List<NhanVien> get_list () {
        return dao.getALLlist();
    }
    
    public void insert_nv (String maNV, String name, String email, int yearOfBirth, String number_Phone, String ChucVu) {
        NhanVien nv = new NhanVien(maNV, name, email, yearOfBirth, number_Phone, ChucVu);
        dao.insert(nv);
    }
    
    public void insert_account (String role, String maNV, String lg_name, String lg_password) {
        dao.insert(role, maNV, lg_name, lg_password);
    }
    
    public void update (String maNV, String name, String email, int yearOfBirth, String phone_number) {
        dao.update(maNV, name, email, yearOfBirth, phone_number);
    }
}
