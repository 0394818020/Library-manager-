/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;

/**
 *
 * @author Dat Huy
 */
public interface BRDAO<T> {
    <T> List<T> getALLlist ();
    public void insert (T object);
    public void remove (int id);
    public void update (T object);
}
