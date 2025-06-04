/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.LoanDAO;
import MODEL.Loan;
import MODEL.Loan_manager;
import java.util.List;

/**
 *
 * @author Dat Huy
 */
public class LoanController {
    private LoanDAO dao = new LoanDAO();
    
//    public List<Loan> getList () {
//        return dao.getALLlist();
//    }
    
    public List<Loan_manager> getListlLoan_managers () {
        return dao.getALLlistL();
    }
    
    public void add (int id_book, int id_reader, String status) {
        dao.insert(id_book,id_reader,status);
    }
    
    public void tra_sach (int id, int bookId) {
        dao.remove(id, bookId);
    }
    
    public void update_status () {
        dao.update_tra_sach();
    }
    
    public int get_bookId (int id) {
        return dao.get_bookId(id);
    }
}
