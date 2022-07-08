/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.IOFile;
import java.awt.Graphics;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BanDoc;
import model.QuanLyMuonSach;
import model.Sach;

/**
 *
 * @author Thom
 */
public class FormQuanLyMuonSach extends javax.swing.JPanel {
    
    DefaultTableModel tm;
    private String fqlmuon;
    private List<QuanLyMuonSach> lqlmuon;
    private String fsach;
    private List<Sach> lsach;
    public FormQuanLyMuonSach() {
        initComponents();
        String[] cols = {"Ma ban doc", "Ho ten", "Ma sach", "Ten sach", "So luong", "Tinh trang"};
        tm = new DefaultTableModel(cols, 0);
        jTable1.setModel(tm);
        fqlmuon = "src/controller/qlmuon.txt";
        fsach = "src/controller/sach.txt";
        loadData();
        load2Ma();
    }
    
    private void loadData(){
        File f = new File(fqlmuon);
        if(f.exists()){
            lqlmuon = IOFile.doc(fqlmuon);
        }else
            lqlmuon = new ArrayList<>();
        File fs = new File(fsach);
        if(fs.exists()){
            lsach = IOFile.doc(fsach);
        }else
            lsach = new ArrayList<>();
    }
    private void load2Ma(){
        cbMaBanDoc.removeAllItems();
        cbMaSach.removeAllItems();
        String fbd = "src/controller/bandoc.txt";
        List<BanDoc> l1 = IOFile.doc(fbd);
        if(l1!=null){
            for(BanDoc i: l1)
               cbMaBanDoc.addItem(i.getMa()+"");
        }
        for(Sach i: lsach)
            cbMaSach.addItem(i.getMa()+"");
    }
// cùng một loại bạn đọc với một đầu sách thì không thể xuất hiện 2 lần trong bảng
    private boolean trung2Ma(int maBanDoc, int maSach){
        for(QuanLyMuonSach i:lqlmuon)
            if(i.getBanDoc().getMa() == maBanDoc && i.getSach().getMa() == maSach)
                return true;
            return false;
    }
// một bạn đọc sẽ được phép mượn không quá 5 đầu sách khác nhau, mỗi đầu sách không mượn quá 3 cuốn.
    private int demDauSach(int maBanDoc){
        int count = 0;
        for(QuanLyMuonSach i: lqlmuon)
            if(i.getBanDoc().getMa() == maBanDoc)
                count++;
        return count;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btHienThi = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        cbSapXep = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbMaBanDoc = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbMaSach = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btThem.setText("Them");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btHienThi.setText("Hien thi");
        btHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHienThiActionPerformed(evt);
            }
        });

        btLuu.setText("Luu vao file");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        cbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------Lua chon sap xep--------", "Theo ho ten ban doc", "Theo so luong cuon sach duoc muon " }));
        cbSapXep.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSapXepItemStateChanged(evt);
            }
        });
        cbSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSapXepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btThem)
                .addGap(62, 62, 62)
                .addComponent(btHienThi)
                .addGap(52, 52, 52)
                .addComponent(btLuu)
                .addGap(51, 51, 51)
                .addComponent(cbSapXep, 0, 208, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btHienThi)
                    .addComponent(btLuu)
                    .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setText("Ma ban doc :");

        cbMaBanDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Ma sach :");

        jLabel3.setText("So luong :");

        jLabel4.setText("Tinh trang sach :");

        cbMaSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton4.setText("Lam tuoi 2 ma");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel1))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbMaBanDoc, javax.swing.GroupLayout.Alignment.LEADING, 0, 158, Short.MAX_VALUE)
                                        .addComponent(cbMaSach, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addComponent(jLabel4))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButton4)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbMaBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSapXepActionPerformed
        
    }//GEN-LAST:event_cbSapXepActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        load2Ma();  
    }//GEN-LAST:event_jButton4ActionPerformed

    private Sach getSachByMa(int ma){
        for(Sach i:lsach)
            if(i.getMa() == ma)
                return i;
        return null;
    }
       private BanDoc getBanDocByMa(int ma){
        String fbanDoc = "src/controller/bandoc.txt";
        List<BanDoc> l1 = IOFile.doc(fbanDoc);
        if(l1!=null){
            for(BanDoc i:l1)
                if(i.getMa() == ma)
                    return i;
        }
        return null;
    }
    
    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        int maBanDoc = Integer.parseInt(cbMaBanDoc.getSelectedItem().toString());
        int maSach = Integer.parseInt(cbMaSach.getSelectedItem().toString());
        if(trung2Ma(maBanDoc, maSach)){
            JOptionPane.showMessageDialog(this, "Khong the xuat hien 2 lan voi cung mot loai ban doc voi mot dau sach");
            cbMaBanDoc.requestFocus();
            return;
        }
        int soLuong = 0;
        int soLuongSachThuVienCo = getSachByMa(maSach).getSoLuong();
        try{
            soLuong = Integer.parseInt(jTextField1.getText());
            if(soLuong > soLuongSachThuVienCo){
                JOptionPane.showMessageDialog(this, "Khong du sach");
                jTextField1.requestFocus();
                return;
            }
            String tinhTrang = jTextField2.getText();
            QuanLyMuonSach ql = new QuanLyMuonSach(getBanDocByMa(maBanDoc), getSachByMa(maSach), soLuong, tinhTrang);
            tm.addRow(ql.toObject());
            lqlmuon.add(ql);
            getSachByMa(maSach).setSoLuong(soLuongSachThuVienCo - soLuong);
            IOFile.viet(fsach, lsach); // mượn sách bao nhiêu thì trừ đi bấy nhiêu số lượng ở bên số lượng sách thư viện có sau khi click button Hien thi ở FormSach
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Nhap so");
            jTextField1.requestFocus();
            return;  
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHienThiActionPerformed
        File f = new File(fqlmuon);
        if(f.exists()){
           lqlmuon = IOFile.doc(fqlmuon);
           tm.setRowCount(0);
           for(QuanLyMuonSach i: lqlmuon)
               tm.addRow(i.toObject());
        }
    }//GEN-LAST:event_btHienThiActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        IOFile.viet(fqlmuon, lqlmuon);
    }//GEN-LAST:event_btLuuActionPerformed

    private void cbSapXepItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSapXepItemStateChanged
        if(cbSapXep.getSelectedIndex() == 1){
            lqlmuon.sort(new Comparator<QuanLyMuonSach>(){
                @Override
                public int compare(QuanLyMuonSach o1, QuanLyMuonSach o2) {
                    String[] ten1 = o1.getBanDoc().getHoTen().split("\\s+");
                    String[] ten2 = o2.getBanDoc().getHoTen().split("\\s+");
                    if(ten1[ten1.length-1].equalsIgnoreCase(ten2[ten2.length-1])){
                        return o1.getBanDoc().getHoTen().compareToIgnoreCase(o1.getBanDoc().getHoTen());
                    }else
                        return ten1[ten1.length-1].compareToIgnoreCase(ten2[ten2.length-1]);
                }
            });
        }
        if(cbSapXep.getSelectedIndex() == 2){
            lqlmuon.sort(new Comparator<QuanLyMuonSach>(){
                @Override
                public int compare(QuanLyMuonSach o1, QuanLyMuonSach o2) {
                    return Integer.compare(o1.getSoLuong(), o2.getSoLuong());
                }
            }); 
        }
        tm.setRowCount(0);
        for(QuanLyMuonSach i:lqlmuon)
            tm.addRow(i.toObject());
    }//GEN-LAST:event_cbSapXepItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHienThi;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btThem;
    private javax.swing.JComboBox<String> cbMaBanDoc;
    private javax.swing.JComboBox<String> cbMaSach;
    private javax.swing.JComboBox<String> cbSapXep;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}