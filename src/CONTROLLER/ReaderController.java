/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import MODEL.Reader;
import java.util.List;
import DAO.*;

/**
 *
 * @author Dat Huy
 */
public class ReaderController {
    private ReaderDAO dao = new ReaderDAO();
    
    public List<Reader> getList () {
        return dao.getALLlist();
    }
    
    public void add (String name, int yearOfBirth, String email) {
        Reader reader = new Reader(0, name, yearOfBirth, email);
        dao.insert(reader);
    }
    
    public void remove (int id) {
        dao.remove(id);
    }
    
    public void update (Reader r) {
        dao.update(r);
    }
}
