/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.NhanVienDAO;

/**
 *
 * @author Dat Huy
 */
public class NhanVienController {
    private NhanVienDAO dao = new NhanVienDAO();
    
    public boolean checking_account (String role, String maNV, String lg_name, String lg_pass) {
        return dao.account_checking(role, maNV, lg_name, lg_pass);
    }
}
