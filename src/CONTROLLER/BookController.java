/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import MODEL.Book;
import java.util.List;
import DAO.BookDAO;
/**
 *
 * @author Dat Huy
 */
public class BookController {
    private BookDAO dao = new BookDAO();
    
    public List<Book> getList () {
        return dao.getALLlist();
    }
    
    public void add (String title, String author, String catogory, int quantity, boolean available) {
        Book b = new Book(0, title, author, catogory, quantity, available);
        dao.insert(b);
    }
    
    public void remove (int id) {
        dao.remove(id);
    }
    
    public void update (Book b) {
        dao.update(b);
    }
}
