package View;

import Services.SerHoaDon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import Model.Hoadon;
import Model.NhanVien;
import javax.swing.DefaultComboBoxModel;

public class QuanLyHoaDonJPanel extends javax.swing.JPanel {


    SerHoaDon sv = new SerHoaDon();
    Hoadon hd = new Hoadon();

    public QuanLyHoaDonJPanel() {
        initComponents();
        fillcombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoadon = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblhuydon = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Jdatebatdau = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Jdateketthuc = new com.toedter.calendar.JDateChooser();
        btnTim = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtfind_mnv = new javax.swing.JTextField();
        btn_lammoi = new javax.swing.JButton();
        cbotrangthai = new javax.swing.JComboBox<>();

        jMenuItem2.setText("Hủy Đơn");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem1.setText("Hoàn Tác");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem1);

        setBackground(new java.awt.Color(241, 241, 241));

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        tblHoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Ngày tạo", "Trạng thái", "Thanh toán", "Người tạo", "Thành tiền", "Số Lượng SP bị hủy", "SDT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoadon.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblHoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoadonMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblHoadonMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoadon);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hóa đơn hủy", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        tblhuydon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Ngày tạo", "Trạng thái", "Thanh toán", "Người tạo", "Thành tiền", "Số Lượng SP bị hủy", "Lý Do Hủy", "SDT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblhuydon.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblhuydon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblhuydonMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblhuydonMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblhuydon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Từ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã hóa đơn");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("đến");

        btnTim.setBackground(new java.awt.Color(255, 204, 204));
        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mã Nhân Viên");

        txtfind_mnv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfind_mnvKeyReleased(evt);
            }
        });

        btn_lammoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_lammoi.setText("Làm Mới");
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
            }
        });

        cbotrangthai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbotrangthaiItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(Jdatebatdau, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(Jdateketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnTim))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtfind_mnv, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbotrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_lammoi)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField1, txtfind_mnv});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnTim, btn_lammoi});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(Jdatebatdau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jdateketthuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnTim))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lammoi))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfind_mnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbotrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField1, txtfind_mnv});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnTim, btn_lammoi});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        if (Jdatebatdau.getDate() == null && Jdateketthuc.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Hãy chọn ít nhất 1 ngày");

            return;
        }
        if (Jdatebatdau.getDate() != null && Jdateketthuc.getDate() != null) {

            if (cbotrangthai.getSelectedIndex() == 2) {
                sv.Find();
            }
            if (cbotrangthai.getSelectedIndex() == 1) {
                sv.Find_chuathanhtoan();
            }
            if (cbotrangthai.getSelectedIndex() == 0) {
                sv.Find_dathanhtoan();
            }

        }

        if (Jdatebatdau.getDate() == null && Jdateketthuc.getDate() != null) {
            if (cbotrangthai.getSelectedIndex() == 2) {
                sv.Find_1ngay(Jdateketthuc.getDate());
            }
            if (cbotrangthai.getSelectedIndex() == 1) {
                sv.Find_1ngay_chuathanhtoan(Jdateketthuc.getDate());
            }
            if (cbotrangthai.getSelectedIndex() == 0) {
                sv.Find_1ngay_dathanhtoan(Jdateketthuc.getDate());
            }

        }
        if (Jdatebatdau.getDate() != null && Jdateketthuc.getDate() == null) {
            if (cbotrangthai.getSelectedIndex() == 2) {
                sv.Find_1ngay(Jdatebatdau.getDate());
            }
            if (cbotrangthai.getSelectedIndex() == 1) {
                sv.Find_1ngay_chuathanhtoan(Jdatebatdau.getDate());
            }
            if (cbotrangthai.getSelectedIndex() == 0) {
                sv.Find_1ngay_dathanhtoan(Jdatebatdau.getDate());
            }
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        sv.fillTableSearch(jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void txtfind_mnvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfind_mnvKeyReleased
        sv.fillTableSearch_IDMaNV(txtfind_mnv.getText());
    }//GEN-LAST:event_txtfind_mnvKeyReleased

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
        Jdatebatdau.setDate(null);
        Jdateketthuc.setDate(null);
    }//GEN-LAST:event_btn_lammoiActionPerformed

    private void tblHoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoadonMouseClicked
        int index = tblHoadon.getSelectedRow();

        int a = (int) tblHoadon.getValueAt(index, 0);

        HoadonchitietJDialog hd = new HoadonchitietJDialog(a);
        hd.setVisible(true);
    }//GEN-LAST:event_tblHoadonMouseClicked

    private void tblhuydonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhuydonMouseClicked
        int index = tblhuydon.getSelectedRow();

        int x = (int) tblhuydon.getValueAt(index, 0);

        HoadonchitietJDialog hd = new HoadonchitietJDialog(x);
        hd.setVisible(true);
    }//GEN-LAST:event_tblhuydonMouseClicked

    private void tblHoadonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoadonMouseReleased
        int r = tblHoadon.rowAtPoint(evt.getPoint());
        if (r >= 0 && r < tblHoadon.getRowCount()) {
            tblHoadon.setRowSelectionInterval(r, r);
        } else {
            tblHoadon.clearSelection();
        }

        int rowindex = tblHoadon.getSelectedRow();
        if (rowindex < 0) {
            return;
        }

        if (evt.isPopupTrigger() && evt.getComponent() instanceof JTable) {
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblHoadonMouseReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        NhanVien nv = new NhanVien();
        if (nv.isVaiTro() == false) {
            int index = tblHoadon.getSelectedRow();
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn hủy đơn này?", "Hủy Đơn", JOptionPane.YES_NO_OPTION);
            if (hoi == JOptionPane.YES_OPTION) {
                sv.huydon((int) tblHoadon.getValueAt(index, 0));
            }

        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tblhuydonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhuydonMouseReleased
        int r = tblhuydon.rowAtPoint(evt.getPoint());
        if (r >= 0 && r < tblhuydon.getRowCount()) {
            tblhuydon.setRowSelectionInterval(r, r);
        } else {
            tblhuydon.clearSelection();
        }

        int rowindex = tblhuydon.getSelectedRow();
        if (rowindex < 0) {
            return;
        }

        if (evt.isPopupTrigger() && evt.getComponent() instanceof JTable) {
            jPopupMenu2.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblhuydonMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NhanVien nv = new NhanVien();
        if (nv.isVaiTro() == false) {
            int index = tblhuydon.getSelectedRow();
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn hoàn tác hủy đơn này?", "Hoàn Tác Hủy Đơn", JOptionPane.YES_NO_OPTION);
            if (hoi == JOptionPane.YES_OPTION) {
                sv.hoantacdon((int) tblhuydon.getValueAt(index, 0));
            }

        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cbotrangthaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbotrangthaiItemStateChanged
        if (cbotrangthai.getSelectedIndex() == 2) {
            sv.filltotablehoadon();
            sv.filltotablehoadonhuy();
        }
        if (cbotrangthai.getSelectedIndex() == 1) {
            sv.filltotablehoadon_chuathanhtoan();
            sv.filltotablehoadonhuy_chuathanhtoan();
        }
        if (cbotrangthai.getSelectedIndex() == 0) {
            sv.filltotablehoadon_dathanhtoan();
            sv.filltotablehoadonhuy_dathanhtoan();
        }
    }//GEN-LAST:event_cbotrangthaiItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.toedter.calendar.JDateChooser Jdatebatdau;
    public static com.toedter.calendar.JDateChooser Jdateketthuc;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btn_lammoi;
    private javax.swing.JComboBox<String> cbotrangthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTable tblHoadon;
    public static javax.swing.JTable tblhuydon;
    private javax.swing.JTextField txtfind_mnv;
    // End of variables declaration//GEN-END:variables

    private void init() {
        sv.filltotablehoadon();
        sv.filltotablehoadonhuy();
    }

    private void fillcombo() {
        String[] a = {"Đã Thanh Toán", "Chưa Thanh Toán", "Tất Cả"};
        DefaultComboBoxModel modelcb = (DefaultComboBoxModel) cbotrangthai.getModel();
        for (int i = 0; i < a.length; i++) {
            modelcb.addElement(a[i]);
        }
    }
}
