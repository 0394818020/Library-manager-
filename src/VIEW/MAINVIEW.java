/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import CONTROLLER.*;
import MODEL.Book;
import MODEL.Loan_manager;
import MODEL.NhanVien;
import MODEL.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dat Huy
 */
public class MAINVIEW extends javax.swing.JFrame implements view {

    /**
     * Creates new form MAINVIEW
     */
    
    //Khai báo và khởi tạo đói tượng chứa các chức năng
    private BookController bookController = new BookController();
    private ReaderController readerController = new ReaderController();
    private LoanController loanController = new LoanController();
    private NhanVienController nhanVienController = new NhanVienController();
    
    //Khai báo đơn vị của bảng (List, DefaultTableModel)
    private List<Book> list_book;
    private DefaultTableModel model_book;
    private List<Reader> list_reader;
    private DefaultTableModel model_reader;
    private List<Loan_manager> list_loan;
    private DefaultTableModel model_loan;
    private List<NhanVien> list_nhanvien;
    private DefaultTableModel model_nhanvien;
    
    public MAINVIEW() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Quản lý thư viện");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Khơi tạo các danh sách và model rỗng
        list_book = new ArrayList<>();
        model_book = (DefaultTableModel) jTable1.getModel();
        list_reader = new ArrayList<>();
        model_reader = (DefaultTableModel) jTable2.getModel();
        list_loan = new ArrayList<>();
        model_loan = (DefaultTableModel) jTable3.getModel();
        list_nhanvien = new ArrayList<>();
        model_nhanvien = (DefaultTableModel) jTable4.getModel();
        
        //sắp xếp tăng, giảm
        jTable1.setAutoCreateRowSorter(true);
        jTable2.setAutoCreateRowSorter(true);
        jTable3.setAutoCreateRowSorter(true);
        jTable4.setAutoCreateRowSorter(true);
        
        //Các hàm hiển thị lên bảng
        show_Book();
        show_Reader();
        show_Loan();
        show_nhanvien();
        loanController.update_status();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        THEM_SACH = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        THEM_SACH1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        THEM_SACH2 = new javax.swing.JButton();
        THEM_SACH3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        themnv = new javax.swing.JButton();
        xoanv = new javax.swing.JButton();
        suanv = new javax.swing.JButton();
        suanv1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Tiêu đề", "Tác giả", "Thể loại", "Số lượng"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        THEM_SACH.setText("THÊM");
        THEM_SACH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THEM_SACHActionPerformed(evt);
            }
        });

        jButton3.setText("SỬA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("XÓA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(THEM_SACH, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(THEM_SACH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sách", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Tên ", "Năm sinh", "Email"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        THEM_SACH1.setText("THÊM");
        THEM_SACH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THEM_SACH1ActionPerformed(evt);
            }
        });

        jButton5.setText("XÓA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("SỬA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(THEM_SACH1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(THEM_SACH1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Đọc giả", jPanel2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "tiêu đề sách", "tên người mượn", "Ngày mượn", "Ngày trả", "Trạng thái"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        THEM_SACH2.setText("Đăng ký mượn");
        THEM_SACH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THEM_SACH2ActionPerformed(evt);
            }
        });

        THEM_SACH3.setText("Trả sách");
        THEM_SACH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THEM_SACH3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(THEM_SACH3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(THEM_SACH2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(THEM_SACH2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(THEM_SACH3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mượn - Trả", jPanel3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên", "Email", "Năm sinh", "Số điện thoại", "Chức vụ"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        themnv.setText("THÊM");
        themnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themnvActionPerformed(evt);
            }
        });

        xoanv.setText("XÓA");
        xoanv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoanvActionPerformed(evt);
            }
        });

        suanv.setText("SỬA TT");
        suanv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suanvActionPerformed(evt);
            }
        });

        suanv1.setText("SỬA TK");
        suanv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suanv1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(xoanv, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(themnv, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(suanv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(suanv1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(themnv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(xoanv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(suanv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(suanv1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lí nhân viên", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void THEM_SACHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THEM_SACHActionPerformed
        // TODO add your handling code here:
        new addbook(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_THEM_SACHActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int id = -1;
        id = jTable1.getSelectedRow();
        if (id == -1) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn sách cần xóa!");
            return;
        }
        int _id =(int) jTable1.convertRowIndexToModel(id);
        int __id = (int) model_book.getValueAt(_id, 0);
        bookController.remove(__id);
        show_Book();
    }//GEN-LAST:event_jButton4ActionPerformed
    int fix_id = -1;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int id = -1;
        id = jTable1.getSelectedRow();
        if (id == -1) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn sách cần sửa!");
            return;
        }
        int _id = (int) jTable1.convertRowIndexToModel(id);
        fix_id = _id;
        new updatebook(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void THEM_SACH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THEM_SACH1ActionPerformed
        // TODO add your handling code here:
        new addreader(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_THEM_SACH1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int id = -1;
        //Lấy vị trí gốc
        id = jTable2.getSelectedRow();
        if (id == -1) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn đọc giả cần xóa!");
            return;
        }
        //chuyển đổi vị trí gốc thành vị trí đang hiển thị trên table
        int _id = (int) jTable2.convertRowIndexToModel(id);
        //lấy id từ vị trí đã thay đổi
        int __id = (int) model_reader.getValueAt(_id, 0);
        readerController.remove(__id);
        show_Reader();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int id = -1;
        id = jTable2.getSelectedRow();
        if (id == -1) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn đọc giả cần sửa!");
            return;
        }
        int _id = (int) jTable2.convertRowIndexToModel(id);
        fix_id = _id;
        new updatereader(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void THEM_SACH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THEM_SACH2ActionPerformed
        // TODO add your handling code here:
        new addLoan(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_THEM_SACH2ActionPerformed

    private void THEM_SACH3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THEM_SACH3ActionPerformed
        // TODO add your handling code here:
        int id = -1;
        id = jTable3.getSelectedRow();
        if (id == -1) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn phiếu mượn!");
            return;
        }
        int _id = (int) jTable3.convertRowIndexToModel(id);
        int __id = (int) model_loan.getValueAt(_id, 0);
        int bookId = loanController.get_bookId(__id);
        loanController.tra_sach(__id, bookId);
        show_Reader();
        show_Book();
        show_Loan();
    }//GEN-LAST:event_THEM_SACH3ActionPerformed

    private void themnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themnvActionPerformed
        // TODO add your handling code here:
        new addnv(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_themnvActionPerformed

    private void xoanvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoanvActionPerformed
        // TODO add your handling code here:
        int id = -1;
        id = jTable4.getSelectedRow();
        if (id == -1) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn nhân viên!");
            return;
        }
        int _id = (int) jTable4.convertRowIndexToModel(id);
        String __id = (String) model_nhanvien.getValueAt(_id, 0);
        nhanVienController.remove(__id);
        show_nhanvien();
    }//GEN-LAST:event_xoanvActionPerformed

    private void suanvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suanvActionPerformed
        // TODO add your handling code here:
        int id = -1;
        id = jTable4.getSelectedRow();
        if (id == -1) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn nhân viên!");
            return;
        }
        int _id = (int) jTable4.convertRowIndexToModel(id);
        fix_id = _id;
        new updatenv(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_suanvActionPerformed

    private void suanv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suanv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suanv1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MAINVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAINVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAINVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAINVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAINVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton THEM_SACH;
    private javax.swing.JButton THEM_SACH1;
    private javax.swing.JButton THEM_SACH2;
    private javax.swing.JButton THEM_SACH3;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JButton suanv;
    private javax.swing.JButton suanv1;
    private javax.swing.JButton themnv;
    private javax.swing.JButton xoanv;
    // End of variables declaration//GEN-END:variables
    public DefaultTableModel getreaderModel() {
        return model_reader;
    }
    
    public DefaultTableModel getbookModel () {
        return model_book;
    }
    
    public DefaultTableModel getnvModel () {
        return model_nhanvien;
    }
    
    public void show_Book () {
        list_book = bookController.getList();
        showData(list_book, model_book);
    }
    
    public void show_Reader () {
        list_reader = readerController.getList();
        showData(list_reader, model_reader);
    }
    
    public void show_Loan () {
        list_loan = loanController.getListlLoan_managers();
        showData(list_loan, model_loan);
    }
    
    public void show_nhanvien() {
        list_nhanvien = nhanVienController.get_list();
        showData(list_nhanvien, model_nhanvien);
    }
    
    public int getfixId () {
        return fix_id;
    }
    
    public List<Book> getList_book() {
        return list_book;
    }

    public List<Reader> getList_reader() {
        return list_reader;
    }
    
    //hàm phân quyền
    public void Level (String role) {
        String level = role;
        if (level != "QL") {
            themnv.setEnabled(false);
            xoanv.setEnabled(false);
            suanv.setEnabled(false);
        }
        else {
            themnv.setEnabled(true);
            xoanv.setEnabled(true);
            suanv.setEnabled(true);
        }
    }
    
    @Override
    public <T> void showData(List<T> list, DefaultTableModel model) {
        //Hiển thị thông tin ra bảng
        model.setRowCount(0);
        for (Object b : list) {
            if (b instanceof Book) {
                Book book = (Book) b;
                model.addRow( new Object[] {
                    book.getId(), book.getTitle(), book.getAuthor(), book.getCategory(), book.getQuantity()
                });
            }
            if (b instanceof Reader) {
                Reader reader = (Reader) b;
                model.addRow( new Object[] {
                    reader.getId(), reader.getName(), reader.getYearOfBirth(), reader.getEmail()
                });
            }
            if (b instanceof Loan_manager) {
                Loan_manager loan = (Loan_manager) b;
                model.addRow(new Object[] {
                    loan.getId(), loan.getTitle(), loan.getName(), loan.getBorrowDate(), loan.getReturnDate(), loan.getStatus()
                });
            }
            if (b instanceof NhanVien) {
                NhanVien nv = (NhanVien) b;
                model.addRow(new Object[] {
                    nv.getMaNV(), nv.getName(), nv.getEmail(), nv.getYearOfBirth(), nv.getNumber_phone(), nv.getChucVu()
                });
            }
        }
    }

    
}
