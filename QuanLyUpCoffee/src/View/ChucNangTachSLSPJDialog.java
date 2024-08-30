package View;

import Dao.HoadonchitietDAO;
import Dao.SanPhamDao;
import Model.HoaDonChiTiet;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class ChucNangTachSLSPJDialog extends javax.swing.JDialog {

    public ChucNangTachSLSPJDialog(java.awt.Frame parent, boolean modal, int mahdcu, String masp, int SL, int tongsld) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        idhdcu = mahdcu;
        slsanpham = SL;
        idsp = masp;
        tongsoluongdon = tongsld;
        filltocboSL();
    }
    static int idhdcu;
    static int slsanpham;
    static String idsp;
    static int tongsoluongdon;
    int tiencong = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTenSp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSoluong = new javax.swing.JLabel();
        cbosoluong = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnTach = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(116, 169, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tên sản phẩm:");

        lblTenSp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTenSp.setForeground(new java.awt.Color(255, 255, 255));
        lblTenSp.setText("........");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Số lượng:");

        lblSoluong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSoluong.setForeground(new java.awt.Color(255, 255, 255));
        lblSoluong.setText("........");

        cbosoluong.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbosoluong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Số lượng tách:");

        btnTach.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTach.setText("Tách");
        btnTach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbosoluong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenSp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSoluong))
                    .addComponent(btnTach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblSoluong)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblTenSp)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbosoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(btnTach))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTachActionPerformed
        // TODO add your handling code here:
//        Hoadonchitiet hdctcu = DAOhdct.selectById(idhdcu, idsp);
//        int i = (int) cbosoluong.getSelectedItem();
//        int sotru = hdctcu.getSoluong() - i;
//        if (sotru == 0) {
//            hdctcu.setSoluong(hdctcu.getSoluong() - i);
//            hdctcu.setTongGia(hdctcu.getGia()*hdctcu.getSoluong());
//            DAOhdct.update_SL(hdctcu);
//            DAOhdct.deletehoadonct(idhdcu, idsp);
//            Hoadonchitiet hdctmoi = new Hoadonchitiet();
//            hdctmoi.setGhiChu("Tách từ đơn: "+idhdcu+", SL: "+i);
//            hdctmoi.setGia(hdctcu.getGia());
//            hdctmoi.setID_Hoadon(idhdmoi);
//            hdctmoi.setID_SanPHam(idsp);
//            hdctmoi.setLyDoHuy("");
//            hdctmoi.setSoluong(i);
//            hdctmoi.setTongGia(i*hdctcu.getGia());
//            hdctmoi.setTrangThai(true);
//            DAOhdct.insert(hdctmoi);
//            tiencong = hdctmoi.getTongGia();
//        }else {
//            hdctcu.setSoluong(hdctcu.getSoluong() - i);
//            hdctcu.setTongGia(hdctcu.getGia()*hdctcu.getSoluong());
//            DAOhdct.update_SL(hdctcu);
//            Hoadonchitiet hdctmoi = new Hoadonchitiet();
//            hdctmoi.setGhiChu("Tách từ đơn: "+idhdcu+", SL: "+i);
//            hdctmoi.setGia(hdctcu.getGia());
//            hdctmoi.setID_Hoadon(idhdmoi);
//            hdctmoi.setID_SanPHam(idsp);
//            hdctmoi.setLyDoHuy("");
//            hdctmoi.setSoluong(i);
//            hdctmoi.setTongGia(i*hdctcu.getGia());
//            hdctmoi.setTrangThai(true);
//            DAOhdct.insert(hdctmoi);
//            tiencong = hdctmoi.getTongGia();
//        }
////        Hoadonchitiet hdctmoi = new Hoadonchitiet();
////        hdctmoi.setID_Hoadon(idhdmoi);
////        hdctmoi.setSoluong(i);
////        hdctmoi.setTongGia(hdctmoi.getGia()*i);
////        hdctmoi.setGhiChu("");
////        DAOhdct.insert(hdctmoi);
////        tiencong = hdctmoi.getTongGia();
        hdctsua();
        hdcttach();
        dispose();
    }//GEN-LAST:event_btnTachActionPerformed
    public HoaDonChiTiet hdctsua() {
        HoaDonChiTiet hdct = DAOhdct.selectById(idhdcu, idsp);
        int i = (int) cbosoluong.getSelectedItem();
        hdct.setSoluong(slsanpham - i);
        hdct.setTongGia(hdct.getSoluong() * hdct.getGia());
        return hdct;
    }

    public HoaDonChiTiet hdcttach() {
        HoaDonChiTiet hdct = DAOhdct.selectById(idhdcu, idsp);
        int i = (int) cbosoluong.getSelectedItem();
        hdct.setSoluong(i);
        hdct.setTongGia(i * hdct.getGia());
        hdct.setGhiChu("Tách từ đơn: " + idhdcu + ", SL: " + i);
        return hdct;
    }

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
            java.util.logging.Logger.getLogger(ChucNangTachSLSPJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChucNangTachSLSPJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChucNangTachSLSPJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChucNangTachSLSPJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChucNangTachSLSPJDialog dialog = new ChucNangTachSLSPJDialog(new javax.swing.JFrame(), true, idhdcu, idsp, slsanpham, tongsoluongdon);
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
    private javax.swing.JButton btnTach;
    private javax.swing.JComboBox<String> cbosoluong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSoluong;
    private javax.swing.JLabel lblTenSp;
    // End of variables declaration//GEN-END:variables
HoadonchitietDAO DAOhdct = new HoadonchitietDAO();
    SanPhamDao DAOSanpham = new SanPhamDao();

    public void filltocboSL() {
        HoaDonChiTiet hdct = DAOhdct.selectById(idhdcu, idsp);
        lblSoluong.setText(slsanpham + "");
        lblTenSp.setText(DAOSanpham.selecteByIDSP(idsp).getTen_sp());
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbosoluong.getModel();
        model.removeAllElements();
        for (int i = 0; i < slsanpham; i++) {
            if (!(i + 1 == slsanpham && tongsoluongdon == 1)) {
                model.addElement(i + 1);
            }
        }
    }
}
