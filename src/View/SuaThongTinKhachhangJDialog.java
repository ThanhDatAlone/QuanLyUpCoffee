package View;

import Dao.HoaDonDAO;
import Model.Hoadon;
import javax.swing.JOptionPane;

public class SuaThongTinKhachhangJDialog extends javax.swing.JDialog {

    public SuaThongTinKhachhangJDialog(java.awt.Frame parent, boolean modal, Hoadon hd) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        hoadon = hd;
        filltext();
    }
    static Hoadon hoadon;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextArea();
        txtTienShip = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCapNhap = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel4.setText("Nhập thông tin khách hàng");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên:");

        txtTen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SĐT:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        txtDiachi.setColumns(20);
        txtDiachi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDiachi.setLineWrap(true);
        txtDiachi.setRows(5);
        jScrollPane1.setViewportView(txtDiachi);

        txtTienShip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tiền Ship:");

        btnCapNhap.setBackground(new java.awt.Color(255, 169, 94));
        btnCapNhap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapNhap.setText("Cập nhập");
        btnCapNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhapActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(255, 169, 94));
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLamMoi)
                .addGap(18, 18, 18)
                .addComponent(btnCapNhap)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtTienShip, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtTienShip, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtSDT, txtTen, txtTienShip});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    HoaDonDAO daohd = new HoaDonDAO();
    private void btnCapNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhapActionPerformed
        // TODO add your handling code here:
        if (checknull()) {
            return;
        }
        if (checknumberphone()) {
            return;
        }
        if (checknumber()) {
            return;
        }
        if (txtTienShip.getText().length() < 4 && Integer.parseInt(txtTienShip.getText()) != 0) {
            JOptionPane.showMessageDialog(this, "Tiền ship phải 1.000 đồng trở lên");
            return;
        }
        Hoadon capnhaphoadon = updateBill();
        daohd.updatekh(hoadon);
        dispose();
    }//GEN-LAST:event_btnCapNhapActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnLamMoiActionPerformed

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
            java.util.logging.Logger.getLogger(SuaThongTinKhachhangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinKhachhangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinKhachhangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinKhachhangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuaThongTinKhachhangJDialog dialog = new SuaThongTinKhachhangJDialog(new javax.swing.JFrame(), true, hoadon);
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
    private javax.swing.JButton btnCapNhap;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDiachi;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTienShip;
    // End of variables declaration//GEN-END:variables
public void filltext() {
        txtSDT.setText(hoadon.getSDT());
        txtTen.setText(hoadon.getTen());
        txtDiachi.setText(hoadon.getDiaChi());
        txtTienShip.setText(hoadon.getTienShip() + "");
    }

    public Hoadon updateBill() {
        Hoadon hd = hoadon;
        hd.setSDT(txtSDT.getText());
        hd.setTen(txtTen.getText());
        hd.setDiaChi(txtDiachi.getText());
        if (!txtTienShip.getText().equals("")) {
            hd.setTienShip(Integer.parseInt(txtTienShip.getText()));
        } else {
            hd.setTienShip(0);
        }
        return hd;
    }

    private void clear() {
        txtDiachi.setText("");
        txtSDT.setText("");
        txtTen.setText("");
        txtTienShip.setText("");
    }

    private boolean checknull() {
        StringBuilder sb = new StringBuilder();
        if (txtTen.getText().equals("")) {
            sb.append("Chưa nhập tên khách hàng!\n");
        }
        if (txtSDT.getText().equals("")) {
            sb.append("Chưa nhập SĐT khách hàng!\n");
        }
        if (txtDiachi.getText().equals("")) {
            sb.append("Chưa nhập địa chỉ khách hàng!\n");
        }
//    if (txtTienShip.getText().equals("")) {
//        sb.append("Chưa nhập tiền vận chuyển hàng cho khách hàng!");
//    }

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
            return true;
        }
        return false;
    }

    public boolean checknumberphone() {
        String regix = "0\\d{9,10}";
        String phone = txtSDT.getText();
        if (!phone.matches(regix)) {
            JOptionPane.showMessageDialog(this, "Sai định dạng số điện thoại (0 + 9,10 số)");
            return true;
        }
        return false;
    }

    public boolean checknumber() {
        if (txtTienShip.getText().equals("")) {
            return false;
        }
        try {
            int numbe = Integer.parseInt(txtTienShip.getText());
            if (numbe < 0) {
                JOptionPane.showMessageDialog(this, "tiền ship không được phép nhập số âm!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tiền ship bạn nhập không phải là số!!");
            return true;
        }
        return false;
    }

}
