package View;

import Dao.BanChiTietDAO;
import Dao.BanDao;
import Dao.HoaDonDAO;
import Dao.HoadonchitietDAO;
import Model.BanChiTiet;
import Model.Hoadon;
import Model.HoaDonChiTiet;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class ChucNangGopDonJDialog extends javax.swing.JDialog {

    public ChucNangGopDonJDialog(java.awt.Frame parent, boolean modal, Hoadon hd) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        hoadon = hd;
        fillcbo();
        lblMadon.setText(hoadon.getIdHoaDon() + "");
    }
    static Hoadon hoadon;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMadon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboMaDon = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnGop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(116, 169, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Đơn:");

        lblMadon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMadon.setText("......");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("gộp vào");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        btnGop.setBackground(new java.awt.Color(255, 255, 255));
        btnGop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGop.setText("Gộp vào");
        btnGop.setEnabled(false);
        btnGop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblMadon)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboMaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblMadon)
                    .addComponent(jLabel2)
                    .addComponent(cboMaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
boolean status = true;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        status = false;
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked
    HoadonchitietDAO DAOhdct = new HoadonchitietDAO();
    BanChiTietDAO DAOBanCT = new BanChiTietDAO();
    BanDao DAOBAN = new BanDao();
    HoaDonDAO DAOHD = new HoaDonDAO();
    private void btnGopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGopActionPerformed
        // TODO add your handling code here:
        Hoadon hd = DAOHD.selectById(hoadon.getIdHoaDon());
        hd.setTrangThai(false);//xét trạng thái hủy
        DAOHD.updateTrangThai(hd);
        List<BanChiTiet> listbct = DAOBanCT.selectByIdHD(hoadon.getIdHoaDon());//xem có liên kết với bàn khác nữa không
        for (BanChiTiet banChitiet : listbct) {
            if (DAOBAN.selectIDBan(banChitiet.getID_Ban()).isEmpty()) {//xem còn bàn chưa hủy hay không còn thì không đổi trạng thái hủy
                DAOBAN.deleteHoatDong(banChitiet.getID_Ban());
            }
            //System.out.println(banChitiet.getID_Ban());
        }
        int goptoi = (int) cboMaDon.getSelectedItem();
        List<HoaDonChiTiet> listdoncu = DAOhdct.selectByIdHD(hoadon.getIdHoaDon());
        List<HoaDonChiTiet> listdonmoi = DAOhdct.selectByIdHD(goptoi);
        int tiendonmoi = 0;
        for (HoaDonChiTiet hdchitietcu : listdoncu) {
//            for (Hoadonchitiet hoadonchitietmoi : listdonmoi) {
//                if (hdchitietcu.getID_SanPHam() == hoadonchitietmoi.getID_SanPHam()) {
//                    int cong = hdchitietcu.getSoluong() + hoadonchitietmoi.getSoluong();
//                    int thanhten = cong*hoadonchitietmoi.getGia();
//                    Hoadonchitiet hoadoncp = hoadonchitietmoi;
//                    hoadoncp.setSoluong(cong);
//                    hoadoncp.setTongGia(thanhten);
//                    DAOhdct.update_SL(hoadoncp);
//                    DAOhdct.deletehoadonct(hdchitietcu.getID_Hoadon());
//                }else{
//                    DAOhdct.updateIDHOADON(hdchitietcu.getID_Hoadon(), goptoi, hdchitietcu.getID_SanPHam());
//                }
//            }

            HoaDonChiTiet hoadonchitietmoi = DAOhdct.selectById(goptoi, hdchitietcu.getID_SanPHam());
            if (hoadonchitietmoi != null) {
                int cong = hdchitietcu.getSoluong() + hoadonchitietmoi.getSoluong();
                int thanhten = cong * hoadonchitietmoi.getGia();
                HoaDonChiTiet hoadoncp = hoadonchitietmoi;
                hoadoncp.setSoluong(cong);
                hoadoncp.setTongGia(thanhten);
                hoadoncp.setGhiChu("Gộp từ đơn: " + hdchitietcu.getID_Hoadon() + ", SL: " + hdchitietcu.getSoluong());
                DAOhdct.update_SL(hoadoncp);
                //tiendonmoi += hoadoncp.getTongGia()+hdchitietcu.getTongGia();
                DAOhdct.deletehoadonct(hdchitietcu.getID_Hoadon(), hdchitietcu.getID_SanPHam());
            } else {
                System.out.println("a");
                hdchitietcu.setGhiChu("Gộp từ đơn: " + hdchitietcu.getID_Hoadon() + ", SL: " + hdchitietcu.getSoluong());
                DAOhdct.update_ghichu(hdchitietcu);
                DAOhdct.updateIDHOADON(hdchitietcu.getID_Hoadon(), goptoi, hdchitietcu.getID_SanPHam());
                Hoadon hdgopvao = DAOHD.selectById((int) cboMaDon.getSelectedItem());
//                    tiendonmoi = hdgopvao.getThanhTien();
//                    tiendonmoi += hdchitietcu.getTongGia();
            }
        }
        Hoadon hdtachmoi = DAOHD.selectById(goptoi);
        List<HoaDonChiTiet> hdcongtien = DAOhdct.selectByIdHD(goptoi);
        for (HoaDonChiTiet hoadonchitiet : hdcongtien) {
            tiendonmoi += hoadonchitiet.getTongGia();
        }
        hdtachmoi.setThanhTien(tiendonmoi);
        DAOHD.updateThanhtien(hdtachmoi);
        DAOhd.delete(hoadon);
        dispose();
    }//GEN-LAST:event_btnGopActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChucNangGopDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChucNangGopDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChucNangGopDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChucNangGopDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChucNangGopDonJDialog dialog = new ChucNangGopDonJDialog(new javax.swing.JFrame(), true, hoadon);
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
    private javax.swing.JButton btnGop;
    private javax.swing.JComboBox<String> cboMaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMadon;
    // End of variables declaration//GEN-END:variables
HoaDonDAO DAOhd = new HoaDonDAO();

    public void fillcbo() {

        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaDon.getModel();
        model.removeAllElements();
        List<Hoadon> list = DAOhd.selectCTTALL();
        if (list.isEmpty()) {
            btnGop.setEnabled(false);
        } else {
            btnGop.setEnabled(true);
        }
        for (Hoadon hd : list) {
            if (hd.getSDT() != null) {
                continue;
            }
            if (hd.getIdHoaDon() != hoadon.getIdHoaDon()) {
                model.addElement(hd.getIdHoaDon());
            }
        }
    }
}
