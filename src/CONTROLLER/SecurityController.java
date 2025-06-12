/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.SecurityDAO;

/**
 *
 * @author Dat Huy
 */
public class SecurityController {
    
    public String SHA256 (String input) {
        return SecurityDAO.SHA256(input);
    }
}
