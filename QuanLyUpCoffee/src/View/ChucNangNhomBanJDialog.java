package View;

import Dao.BanChiTietDAO;
import Dao.BanDao;
import Model.Ban;
import Model.BanChiTiet;
import Helper.Xdate;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ChucNangNhomBanJDialog extends javax.swing.JDialog {

    public ChucNangNhomBanJDialog(java.awt.Frame parent, boolean modal, int ban, int hd) {
        super(parent, modal);
        idban = ban;
        idhoadon = hd;
        initComponents();
        setLocationRelativeTo(null);
        filltocbo();
        lblBanchinh.setText(ban + "");
        lblMaHD.setText(hd + "");
    }
    static int idban;
    static int idhoadon;
    boolean trangthaitao = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblBanchinh = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboban = new javax.swing.JComboBox<>();
        btngop = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMaHD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(116, 169, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bàn đơn chính:");

        lblBanchinh.setBackground(new java.awt.Color(255, 255, 255));
        lblBanchinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBanchinh.setForeground(new java.awt.Color(255, 255, 255));
        lblBanchinh.setText("..........");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bàn muốn nhóm:");

        cboban.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btngop.setBackground(new java.awt.Color(255, 255, 255));
        btngop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btngop.setText("Nhóm");
        btngop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngopActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mã đơn:");

        lblMaHD.setBackground(new java.awt.Color(255, 255, 255));
        lblMaHD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMaHD.setForeground(new java.awt.Color(255, 255, 255));
        lblMaHD.setText("..........");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cboban, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btngop, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblBanchinh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblMaHD)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblBanchinh))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblMaHD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngop))
                .addGap(36, 36, 36))
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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        //status = false;
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked
    BanChiTietDAO DAObanct = new BanChiTietDAO();

    //boolean status = true;
    private void btngopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngopActionPerformed
        // TODO add your handling code here:
        trangthaitao = true;
        List<Integer> listIDHD = DAObanct.selectallbangop();
        if (listIDHD.size() == 4) {
            JOptionPane.showMessageDialog(this, "Tối đa 4 bàn nhóm");
            return;
        }
        BanChiTiet bct = DAObanct.selectById(idban, idhoadon);
        BanChiTiet banchitiet = new BanChiTiet();
        Ban ban = (Ban) cboban.getSelectedItem();
        banchitiet.setID_Ban(ban.getIdBan());
        int mabangop = ban.getIdBan();
        banchitiet.setID_HoaDon(idhoadon);
        banchitiet.setThoidiemCoNguoi(bct.getThoidiemCoNguoi());
        banchitiet.setBanChinh(false);
        DAOban.updateHoatDong(mabangop);
        DAObanct.insert(banchitiet);
        filltocbo();
    }//GEN-LAST:event_btngopActionPerformed

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
            java.util.logging.Logger.getLogger(ChucNangNhomBanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChucNangNhomBanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChucNangNhomBanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChucNangNhomBanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChucNangNhomBanJDialog dialog = new ChucNangNhomBanJDialog(new javax.swing.JFrame(), true, idban, idhoadon);
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
    private javax.swing.JButton btngop;
    private javax.swing.JComboBox<String> cboban;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBanchinh;
    private javax.swing.JLabel lblMaHD;
    // End of variables declaration//GEN-END:variables
BanDao DAOban = new BanDao();

    public void filltocbo() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboban.getModel();
        model.removeAllElements();
        List<Ban> list = DAOban.selectAll_banthuc();
        for (Ban ban : list) {
            model.addElement(ban);
        }
    }
}
