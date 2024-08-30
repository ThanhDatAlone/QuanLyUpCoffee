
package View;

import Dao.BanChiTietDAO;
import Dao.BanDao;
import Dao.HoaDonDAO;
import Model.Ban;
import Model.BanChiTiet;
import Model.Hoadon;
import Helper.PrintPDF;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ChucNangThanhToanNhieuDonJDialog extends javax.swing.JDialog {

    public ChucNangThanhToanNhieuDonJDialog(java.awt.Frame parent, boolean modal, List<Hoadon> list, DefaultTableModel model) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        listhoadonctt = list;
        models = model;
        Ban ban = DAOBAN.selectIDHD(listhoadonctt.get(0).getIdHoaDon());
        lblBanSo.setText(ban.getIdBan() + "");
        filltocbo();
    }
    static List<Hoadon> listhoadonctt;
    static DefaultTableModel models;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBanSo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboDonSo = new javax.swing.JComboBox<>();
        btnThanhtoanTaonBo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblTongTien = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbltienthoi = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTienKhachtra = new javax.swing.JTextField();
        lblthongbaoloi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(116, 169, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Bàn số:");

        lblBanSo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBanSo.setText("........");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Đơn số:");

        cboDonSo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDonSoItemStateChanged(evt);
            }
        });

        btnThanhtoanTaonBo.setBackground(new java.awt.Color(255, 255, 255));
        btnThanhtoanTaonBo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThanhtoanTaonBo.setText("Thanh toán toàn bộ");
        btnThanhtoanTaonBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhtoanTaonBoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(250, 124, 105));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thanh toán");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblTongTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTongTien.setText("........");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tổng tiền:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tiền thối: ");

        lbltienthoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltienthoi.setText("........");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tiền khách trả:");

        txtTienKhachtra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTienKhachtra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienKhachtraKeyReleased(evt);
            }
        });

        lblthongbaoloi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblthongbaoloi.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTienKhachtra, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblthongbaoloi)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbltienthoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboDonSo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblBanSo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThanhtoanTaonBo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblBanSo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboDonSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblTongTien))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lbltienthoi)))
                    .addComponent(btnThanhtoanTaonBo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTienKhachtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblthongbaoloi, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Xác nhận thanh toán!") != JOptionPane.YES_OPTION) {
            return;
        }
        if (txtTienKhachtra.getText().equals("") || Integer.parseInt(txtTienKhachtra.getText()) == 0) {
            JOptionPane.showMessageDialog(this, "Khách chưa trả tiền hóa đơn");
            return;
        }
        if (checkTienKTJoption()) {
            return;
        }
        int tienThoi = Integer.parseInt(lbltienthoi.getText());
        if (tienThoi < 0) {
            JOptionPane.showMessageDialog(this, "khách trả thiếu tiền hóa đơn");
            return;
        }

        Hoadon hd = DAOHD.selectById((int) cboDonSo.getSelectedItem());
        List<BanChiTiet> listbct = DAObct.selectByIdHD((int) cboDonSo.getSelectedItem());
        hd.setTrangThaiTT(true);
        DAOHD.updateThanhToan(hd);
        for (BanChiTiet banChitiet : listbct) {
            if (DAOBAN.selectIDBan(banChitiet.getID_Ban()).isEmpty()) {//nnếu không còn đơn thanh toán nào nauwx sẽ đổi trạng tahis bàn
                DAOBAN.deleteHoatDong(banChitiet.getID_Ban());
            }
        }
        PrintPDF p = new PrintPDF();
        p.a((DefaultTableModel) models, (int) cboDonSo.getSelectedItem(), Integer.parseInt(txtTienKhachtra.getText()), Integer.parseInt(lbltienthoi.getText()));
        filltocbo();
        JOptionPane.showMessageDialog(this, "Thanh toán thành công");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnThanhtoanTaonBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhtoanTaonBoActionPerformed
        // TODO add your handling code here:
        if (btnThanhtoanTaonBo.getText().equalsIgnoreCase("Xác nhận thanh toán")) {
            if (checkTienKTJoption()) {
                return;
            }
            if (JOptionPane.showConfirmDialog(this, "Xác nhận thanh toán!") != JOptionPane.YES_OPTION) {
                return;
            }
            if (txtTienKhachtra.getText().equals("") || Integer.parseInt(txtTienKhachtra.getText()) == 0) {
                JOptionPane.showMessageDialog(this, "Khách chưa trả tiền hóa đơn");
                return;
            }
            int tienThoi = Integer.parseInt(lbltienthoi.getText());
            if (tienThoi < 0) {
                JOptionPane.showMessageDialog(this, "khách trả thiếu tiền hóa đơn");
                return;
            }
            jButton1.setEnabled(false);
            btnThanhtoanTaonBo.setText("Thanh toán toàn bộ");
            for (Hoadon hoadon : listhoadonctt) {
                Hoadon hd = DAOHD.selectById(hoadon.getIdHoaDon());
                hd.setTrangThaiTT(true);
                DAOHD.updateThanhToan(hd);
            }
            List<BanChiTiet> listbct = DAObct.selectByIdHD((int) cboDonSo.getSelectedItem());
            for (BanChiTiet banChitiet : listbct) {
                if (DAOBAN.selectIDBan(banChitiet.getID_Ban()).isEmpty()) {
                    DAOBAN.deleteHoatDong(banChitiet.getID_Ban());
                }
            }
            for (int i = 0; i < listhoadonctt.size(); i++) {
                PrintPDF p = new PrintPDF();
                p.a((DefaultTableModel) models, listhoadonctt.get(i).getIdHoaDon(), Integer.parseInt(txtTienKhachtra.getText()), Integer.parseInt(lbltienthoi.getText()));
            }
            filltocbo();
            JOptionPane.showMessageDialog(this, "Thanh toán thành công");
            dispose();
        } else {
            jButton1.setEnabled(false);
            btnThanhtoanTaonBo.setText("Xác nhận thanh toán");
            int tien = 0;
            for (Hoadon hoadon : listhoadonctt) {
                tien += hoadon.getThanhTien();
            }
            lblTongTien.setText(tien + "");
        }
    }//GEN-LAST:event_btnThanhtoanTaonBoActionPerformed
//Hoadon hd = DAOHD.selectById((int) cboDonSo.getSelectedItem());
//        if (hd != null) {
//            lblTongTien.setText(hd.getThanhTien()+"");
//        }else{
//            lblTongTien.setText("......");
//        }
    private void txtTienKhachtraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienKhachtraKeyReleased
        // TODO add your handling code here:
        tinhTienThoi();
    }//GEN-LAST:event_txtTienKhachtraKeyReleased

    private void cboDonSoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDonSoItemStateChanged
        // TODO add your handling code here:
        if (cboDonSo.getSelectedIndex() > -1) {
            jButton1.setEnabled(true);
            btnThanhtoanTaonBo.setText("Thanh toán toàn bộ");
            Hoadon hd = DAOHD.selectById((int) cboDonSo.getSelectedItem());
            if (hd != null) {
                lblTongTien.setText(hd.getThanhTien() + "");
            } else {
                lblTongTien.setText("......");
            }
        }
    }//GEN-LAST:event_cboDonSoItemStateChanged

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
            java.util.logging.Logger.getLogger(ChucNangThanhToanNhieuDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChucNangThanhToanNhieuDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChucNangThanhToanNhieuDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChucNangThanhToanNhieuDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChucNangThanhToanNhieuDonJDialog dialog = new ChucNangThanhToanNhieuDonJDialog(new javax.swing.JFrame(), true, listhoadonctt, models);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhtoanTaonBo;
    private javax.swing.JComboBox<String> cboDonSo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBanSo;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblthongbaoloi;
    private javax.swing.JLabel lbltienthoi;
    private javax.swing.JTextField txtTienKhachtra;
    // End of variables declaration//GEN-END:variables
BanDao DAOBAN = new BanDao();
    HoaDonDAO DAOHD = new HoaDonDAO();
    BanChiTietDAO DAObct = new BanChiTietDAO();

    public void filltocbo() {
        resetList();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboDonSo.getModel();
        model.removeAllElements();
        List<Hoadon> list = listhoadonctt;
        for (Hoadon hoadon : list) {
            model.addElement(hoadon.getIdHoaDon());
            System.out.println("d");
        }
        System.out.println("a");
    }

    public void resetList() {
        List<Hoadon> list = DAOHD.selectCTT(Integer.parseInt(lblBanSo.getText()));
        listhoadonctt = list;
    }

    public void tinhTienThoi() {
        if (txtTienKhachtra.getText().length() > 10) {
            lblthongbaoloi.setText("chỉ thanh toán < 1 tỷ");
        }
        if (checkTienKT()) {
            return;
        }
        int tienKT = Integer.parseInt(txtTienKhachtra.getText());
        int tongTien = Integer.parseInt(lblTongTien.getText());
        if (tienKT > tongTien) {
            int tienThoi = tienKT - tongTien;
            lbltienthoi.setText(tienThoi + "");
        } else if (tienKT < tongTien) {
            int tienThoi = tienKT - tongTien;
            lbltienthoi.setText(tienThoi + "");
        } else {
            lbltienthoi.setText("0");
        }
    }

    public boolean checkTienKT() {
        if (txtTienKhachtra.getText().equals("")) {
            lbltienthoi.setText("0");
            return true;
        } else {
            try {
                int i = Integer.parseInt(txtTienKhachtra.getText());
                lblthongbaoloi.setText("");
            } catch (Exception e) {
                lblthongbaoloi.setText("Tiền khách trả phải nhập số!!!");
                return true;
            }
            return false;
        }
    }

    public boolean checkTienKTJoption() {
        if (txtTienKhachtra.getText().equals("")) {
            lbltienthoi.setText("0");
            return true;
        } else {
            try {
                int i = Integer.parseInt(txtTienKhachtra.getText());
                if (i < 0) {
                    JOptionPane.showMessageDialog(this, "Tiền khách trả không đc là số âm!");
                    return true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách trả phải nhập số!!!");
                return true;
            }
            return false;
        }
    }
}
