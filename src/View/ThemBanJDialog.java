
package View;

import Dao.BanDao;
import Model.Ban;
import java.util.List;
import javax.swing.JOptionPane;


public class ThemBanJDialog extends javax.swing.JDialog {

    public ThemBanJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBanso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rdoBanao = new javax.swing.JRadioButton();
        btnBanthuc = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        lblThoat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSocho = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bàn số:");

        txtBanso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Kiểu:");

        buttonGroup1.add(rdoBanao);
        rdoBanao.setText("Bàn ảo");

        buttonGroup1.add(btnBanthuc);
        btnBanthuc.setSelected(true);
        btnBanthuc.setText("Bàn thực");

        jButton1.setBackground(new java.awt.Color(250, 182, 124));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblThoat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblThoat.setForeground(new java.awt.Color(255, 51, 51));
        lblThoat.setText("X");
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Số chỗ:");

        txtSocho.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSocho, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtBanso, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(87, 87, 87)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rdoBanao)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBanthuc)))
                            .addGap(34, 34, 34))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBanso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSocho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdoBanao)
                    .addComponent(btnBanthuc))
                .addGap(15, 15, 15))
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

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblThoatMouseClicked
    BanDao banDao = new BanDao();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (txtBanso.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập bàn số");
            return;
        }
        if (txtSocho.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập số chỗ");
            return;
        }
        if (checkBanso()) return;
        if (checkSocho()) return;
        if (checktrung()) return;
        
        Ban ban = new Ban();
        ban.setIdBan(Integer.parseInt(txtBanso.getText()));
        ban.setSoluongcho(Integer.parseInt(txtSocho.getText()));
        ban.setTrangThai( rdoBanao.isSelected() ? false : true);
        ban.setHoatDong(true);
        banDao.insert(ban);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean checkBanso(){
        try {
            int i = Integer.parseInt(txtBanso.getText());
            if (i < 0) {
                JOptionPane.showMessageDialog(this, "Số bàn không thể là sô âm");
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số bàn vừa nhập không phải là số");
            return true;
        }
        return false;
    }
    
    public boolean checkSocho(){
        try {
            int i = Integer.parseInt(txtSocho.getText());
            if (i < 1 || i > 6) {
                JOptionPane.showMessageDialog(this, "Số chỗ tối đa của bàn là 1 -> 5");
                return true;
            } else if (i < 1) {
                JOptionPane.showMessageDialog(this, "Sô chỗ ngồi không được bằng không hoặc là số âm");
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số chỗ vừa nhập không phải là số");
            return true;
        }
        return false;
    }
    
    public boolean checktrung(){
        List<Ban> list = banDao.selectByIdcheck(Integer.parseInt(txtBanso.getText()));
        if (list.isEmpty()) {
            return false;
        } else{
            JOptionPane.showMessageDialog(this, "Bàn bạn nhập đã tồn tại!!");
            return true;
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThemBanJDialog dialog = new ThemBanJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JRadioButton btnBanthuc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JRadioButton rdoBanao;
    private javax.swing.JTextField txtBanso;
    private javax.swing.JTextField txtSocho;
    // End of variables declaration//GEN-END:variables
}
