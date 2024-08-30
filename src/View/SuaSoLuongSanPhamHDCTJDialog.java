package View;

import Dao.BanDao;
import Dao.ChiTietGiamGiaDao;
import Dao.DaoGiamGia;
import Dao.HoaDonDAO;
import Dao.HoadonchitietDAO;
import Dao.SanPhamDao;
import Model.GiamGiaChiTiet;
import Model.HoaDonChiTiet;
import Model.SanPham;
import Model.GiamGia;
import Model.Hoadon;
import static View.NhapsoluongSanPhamJDialog.MASP;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.List;

public class SuaSoLuongSanPhamHDCTJDialog extends javax.swing.JDialog {
    static String MASP;
    static int MAHOADON;
     BanDao DAOBAN = new BanDao();
     HoaDonDAO hdd = new HoaDonDAO();
    public SuaSoLuongSanPhamHDCTJDialog(java.awt.Frame parent, boolean modal, String masp, int MAHD) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        MASP = masp;
        MAHOADON = MAHD;
        
        
    }
//    public int soluong(){
//        Hoadon hd = hdd.selectById(MAHOADON);
//        int idBan = DAOBAN.selectIDHD(hd.getIdHoaDon()).getIdBan();
//        List<HoaDonChiTiet> hdct = HDCT.selectByIDBan(idBan);
//        
//       for(HoaDonChiTiet x : hdct){
//           x.getSoluong();
//           txtSoluongSP.setText(x.getSoluong()+"");
//       }
//       return ;
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnXacnhan = new javax.swing.JButton();
        txtSoluongSP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtghiChu = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        btnXacnhan.setBackground(new java.awt.Color(255, 204, 204));
        btnXacnhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXacnhan.setText("Xác nhận");
        btnXacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacnhanActionPerformed(evt);
            }
        });

        txtSoluongSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoluongSPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 182, 124));
        jLabel1.setText("Nhập số lượng sản phẩm");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        txtghiChu.setColumns(20);
        txtghiChu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtghiChu.setLineWrap(true);
        txtghiChu.setRows(5);
        jScrollPane1.setViewportView(txtghiChu);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ghi chú:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXacnhan)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtSoluongSP, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(txtSoluongSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXacnhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
SanPhamDao DAOSP = new SanPhamDao();
    HoadonchitietDAO HDCT = new HoadonchitietDAO();
    private void btnXacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacnhanActionPerformed
        // TODO add your handling code here:
        if (checknumber()) {
            return;
        }
        if (txtSoluongSP.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập sô lượng!");
            return;
        }

          HoaDonChiTiet hdct = HDCT.selectById(MAHOADON, MASP);
           hdct.setID_Hoadon(MAHOADON);
        hdct.setID_SanPHam(MASP);
        int slnew = hdct.getSoluong() + Integer.parseInt(txtSoluongSP.getText());
        hdct.setSoluong(slnew);
        System.out.println("slnew: "+slnew);
        
        
//        txtSoluongSP.setText(hdct.getSoluong()+"");
        SanPham sp = DAOSP.selectID(MASP);
        int gia = SanPhamGiamGia(sp.getId_sp(), sp.getGia_sp()) == 0 ? sp.getGia_sp() : SanPhamGiamGia(sp.getId_sp(), sp.getGia_sp());
        //System.out.println(gia);
        hdct.setGia(gia);
        int tongGia = gia * Integer.parseInt(txtSoluongSP.getText());
        hdct.setTongGia(tongGia);
        hdct.setTrangThai(true);
        HDCT.update_SL(hdct);
        this.dispose();
    }//GEN-LAST:event_btnXacnhanActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtSoluongSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoluongSPActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSoluongSPActionPerformed

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
            java.util.logging.Logger.getLogger(SuaSoLuongSanPhamHDCTJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaSoLuongSanPhamHDCTJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaSoLuongSanPhamHDCTJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaSoLuongSanPhamHDCTJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuaSoLuongSanPhamHDCTJDialog dialog = new SuaSoLuongSanPhamHDCTJDialog(new javax.swing.JFrame(), true, MASP, MAHOADON);
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
    private javax.swing.JButton btnXacnhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtSoluongSP;
    private javax.swing.JTextArea txtghiChu;
    // End of variables declaration//GEN-END:variables
public boolean checknumber() {
        try {
            int i = Integer.parseInt(txtSoluongSP.getText());
            if (txtSoluongSP.getText().matches("[^0-9]")) {
                JOptionPane.showMessageDialog(this, "Không được nhập ký tự đặc biệt");
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "không phải là số! \nVui long nhập lại!!!");
            return true;
        }
        return false;
    }
    DaoGiamGia DAOGG = new DaoGiamGia();
    ChiTietGiamGiaDao DAOGGCT = new ChiTietGiamGiaDao();

    public int SanPhamGiamGia(String masp, int gia) {
        GiamGiaChiTiet ggct = DAOGGCT.selectbyIDSP(masp);
        if (ggct == null) {
            System.out.println("heelo");
            return 0;
        }
        GiamGia gg = DAOGG.selectByIdss(ggct.getidgiamgia());
        if (gg == null) {
            return 0;
        }
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date datereal = new Date();
            String dareal = formatter.format(datereal);
            Date datenow = formatter.parse(dareal);
            Date datekt = gg.getNgayKT();
            Date datebd = gg.getNgayBD();
//        if (datenow.equals(datekt)) {
//            System.out.println("dit me may");
//        }
            if ((datenow.before(datekt) && datenow.after(datebd)) || datenow.equals(datekt) || datenow.equals(datebd)) {
                float tiengiam = (float) gia - (((float) ggct.getPhantramgiam() / 100) * gia);
                //System.out.println((float) gia - ((float) ggct.getPhantramgiam()/100) * gia);
                int tiengiamint = (int) tiengiam;
                // System.out.println(tiengiamint);
                String a = tiengiamint + "";
                //System.out.println(a.length());
                if (a.length() == 4) {
                    int soThu1 = Integer.parseInt(a.charAt(1) + "");
                    if (soThu1 < 5) {
                        //System.out.println("heelo");
                        a = a.substring(0, 1);
                        //System.out.println(a);
                        return Integer.parseInt(a + "000");
                    } else {
                        a = a.substring(0, 1);
                        tiengiamint = Integer.parseInt(a + "000");
                        return (int) tiengiamint + 1000;
                    }
                } else {
                    System.out.println("heelosssss");
                    int soThu2 = Integer.parseInt(a.charAt(2) + "");
                    if (soThu2 < 5) {
                        a = a.substring(0, 2);;
                        return Integer.parseInt(a + "000");
                    } else {
                        a = a.substring(0, 2);
                        tiengiamint = Integer.parseInt(a + "000");
                        return (int) tiengiamint + 1000;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
