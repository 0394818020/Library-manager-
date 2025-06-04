/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package VIEW;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dat Huy
 */
public interface view {
     <T> void showData (List<T> list, DefaultTableModel model);
}
