package View;

import Helper.Auth;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        setLocationRelativeTo(null);
        //showPanel(new QuanLySanPhamJPanel());
//        new DangnhapJDialog(this, true).setVisible(true);
        
        if(Auth.isLogin() == true){
            lblNameNV.setText(Auth.user.getTenNV());
        }else{
            new DangnhapJDialog(this, true).setVisible(true);
            lblNameNV.setText(Auth.user.getTenNV());
        }
        setExtendedState(this.MAXIMIZED_BOTH);
        setColor(lblTrangchu);
        setColorJpanel(pnTrangChu);
         showPanel(new TrangchuJPanel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnDMK = new javax.swing.JMenuItem();
        mnThoat = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnTrangChu = new javax.swing.JPanel();
        lblTrangchu = new javax.swing.JLabel();
        pnBanHang = new javax.swing.JPanel();
        lblBanHang = new javax.swing.JLabel();
        pnSanPham = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        pnHoaDon = new javax.swing.JPanel();
        lblHoaDon = new javax.swing.JLabel();
        pnNhanVien = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        pnThongke = new javax.swing.JPanel();
        lblThongke = new javax.swing.JLabel();
        pnGiagia = new javax.swing.JPanel();
        lblGiamGia = new javax.swing.JLabel();
        lblNameNV = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnscrene = new javax.swing.JPanel();

        jLabel2.setText("jLabel2");

        mnDMK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnDMK.setText("Đổi mật khẩu");
        mnDMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDMKActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnDMK);

        mnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnThoat.setText("Thoát");
        mnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnThoatActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnThoat);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UPCOFFEE - Cà Phê Thượng Hạng Việt Nam");

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel4.setBackground(new java.awt.Color(41, 93, 157));
        jPanel4.setToolTipText("");
        jPanel4.setPreferredSize(new java.awt.Dimension(260, 780));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        pnTrangChu.setBackground(new java.awt.Color(41, 93, 157));
        pnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnTrangChuMouseClicked(evt);
            }
        });

        lblTrangchu.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblTrangchu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hom.png"))); // NOI18N
        lblTrangchu.setText("Trang chủ");

        javax.swing.GroupLayout pnTrangChuLayout = new javax.swing.GroupLayout(pnTrangChu);
        pnTrangChu.setLayout(pnTrangChuLayout);
        pnTrangChuLayout.setHorizontalGroup(
            pnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangChuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnTrangChuLayout.setVerticalGroup(
            pnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTrangChuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnTrangChu);

        pnBanHang.setBackground(new java.awt.Color(41, 93, 157));
        pnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBanHangMouseClicked(evt);
            }
        });

        lblBanHang.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblBanHang.setForeground(new java.awt.Color(255, 255, 255));
        lblBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sell.png"))); // NOI18N
        lblBanHang.setText("Bán hàng");

        javax.swing.GroupLayout pnBanHangLayout = new javax.swing.GroupLayout(pnBanHang);
        pnBanHang.setLayout(pnBanHangLayout);
        pnBanHangLayout.setHorizontalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBanHangLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnBanHangLayout.setVerticalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnBanHang);

        pnSanPham.setBackground(new java.awt.Color(41, 93, 157));
        pnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnSanPhamMouseClicked(evt);
            }
        });

        lblSanPham.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/drink.png"))); // NOI18N
        lblSanPham.setText("Sản Phẩm");

        javax.swing.GroupLayout pnSanPhamLayout = new javax.swing.GroupLayout(pnSanPham);
        pnSanPham.setLayout(pnSanPhamLayout);
        pnSanPhamLayout.setHorizontalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSanPhamLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnSanPhamLayout.setVerticalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnSanPham);

        pnHoaDon.setBackground(new java.awt.Color(41, 93, 157));
        pnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnHoaDonMouseClicked(evt);
            }
        });

        lblHoaDon.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bill.png"))); // NOI18N
        lblHoaDon.setText("Hóa đơn");

        javax.swing.GroupLayout pnHoaDonLayout = new javax.swing.GroupLayout(pnHoaDon);
        pnHoaDon.setLayout(pnHoaDonLayout);
        pnHoaDonLayout.setHorizontalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pnHoaDonLayout.setVerticalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnHoaDon);

        pnNhanVien.setBackground(new java.awt.Color(41, 93, 157));
        pnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnNhanVienMouseClicked(evt);
            }
        });

        lblNhanVien.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon-user.png"))); // NOI18N
        lblNhanVien.setText("Nhân viên");

        javax.swing.GroupLayout pnNhanVienLayout = new javax.swing.GroupLayout(pnNhanVien);
        pnNhanVien.setLayout(pnNhanVienLayout);
        pnNhanVienLayout.setHorizontalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnNhanVienLayout.setVerticalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnNhanVien);

        pnThongke.setBackground(new java.awt.Color(41, 93, 157));
        pnThongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnThongkeMouseClicked(evt);
            }
        });

        lblThongke.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblThongke.setForeground(new java.awt.Color(255, 255, 255));
        lblThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rank.png"))); // NOI18N
        lblThongke.setText("Thống kê");

        javax.swing.GroupLayout pnThongkeLayout = new javax.swing.GroupLayout(pnThongke);
        pnThongke.setLayout(pnThongkeLayout);
        pnThongkeLayout.setHorizontalGroup(
            pnThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongkeLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnThongkeLayout.setVerticalGroup(
            pnThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongkeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnThongke);

        pnGiagia.setBackground(new java.awt.Color(41, 93, 157));
        pnGiagia.setPreferredSize(new java.awt.Dimension(260, 86));
        pnGiagia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnGiagiaMouseClicked(evt);
            }
        });

        lblGiamGia.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblGiamGia.setForeground(new java.awt.Color(255, 255, 255));
        lblGiamGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/voucher.png"))); // NOI18N
        lblGiamGia.setText("Khuyến mãi");

        javax.swing.GroupLayout pnGiagiaLayout = new javax.swing.GroupLayout(pnGiagia);
        pnGiagia.setLayout(pnGiagiaLayout);
        pnGiagiaLayout.setHorizontalGroup(
            pnGiagiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiagiaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnGiagiaLayout.setVerticalGroup(
            pnGiagiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGiagiaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnGiagia);

        lblNameNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNameNV.setForeground(new java.awt.Color(255, 255, 255));
        lblNameNV.setText("Wellcome Here!");

        jPanel2.setBackground(new java.awt.Color(41, 93, 157));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/use.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNameNV, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNameNV, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);

        pnscrene.setBackground(new java.awt.Color(241, 241, 241));
        pnscrene.setPreferredSize(new java.awt.Dimension(1159, 0));
        pnscrene.setLayout(new java.awt.BorderLayout());
        jPanel3.add(pnscrene);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTrangChuMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnTrangChu);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnThongke);
        
        setColor(lblTrangchu);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblThongke);
        resetColor(lblGiamGia);
        showPanel(new TrangchuJPanel());
    }//GEN-LAST:event_pnTrangChuMouseClicked

    private void pnSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSanPhamMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnSanPham);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnThongke);
        setColor(lblSanPham);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblTrangchu);
        resetColor(lblThongke);
        showPanel(new QuanLySanPhamJPanel());
    }//GEN-LAST:event_pnSanPhamMouseClicked

    private void pnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnNhanVienMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnNhanVien);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnThongke);
        setColor(lblNhanVien);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblSanPham);
        resetColor(lblTrangchu);
        resetColor(lblThongke);
        showPanel(new QuanLyNhanvienJPanel());
    }//GEN-LAST:event_pnNhanVienMouseClicked

    private void pnBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBanHangMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnBanHang);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnThongke);
        setColor(lblBanHang);
        resetColor(lblHoaDon);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblTrangchu);
        resetColor(lblThongke);
        resetColor(lblGiamGia);
        showPanel(new QuanLyBanHangJPanel());
    }//GEN-LAST:event_pnBanHangMouseClicked

    private void pnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnHoaDonMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnHoaDon);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnTrangChu);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnThongke);
        setColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblTrangchu);
        resetColor(lblThongke);
        showPanel(new QuanLyHoaDonJPanel());
    }//GEN-LAST:event_pnHoaDonMouseClicked

    private void pnThongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnThongkeMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnThongke);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnTrangChu);
        setColor(lblThongke);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblTrangchu);
        resetColor(lblHoaDon);
        resetColor(lblGiamGia);
         showPanel(new MainThongKeJPanel());
    }//GEN-LAST:event_pnThongkeMouseClicked

    private void pnGiagiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnGiagiaMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnGiagia);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnThongke);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnTrangChu);
        setColor(lblGiamGia);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblTrangchu);
        resetColor(lblHoaDon);
        resetColor(lblThongke);
        showPanel(new GiamGiaSanPhamJPanel());
    }//GEN-LAST:event_pnGiagiaMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        jPopupMenu1.show(evt.getComponent(), -45, 70);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void mnDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDMKActionPerformed
        // TODO add your handling code here:
        DoiMatKhauJDialog a = new DoiMatKhauJDialog(null, true);
        a.setVisible(true);
        
    }//GEN-LAST:event_mnDMKActionPerformed

    private void mnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnThoatActionPerformed
       
       
        int result = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn thoát khỏi phiên làm việc?", "UPCOFFEE", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            Auth.clear();
             lblNameNV.setText("Wellcome Here!");
             DangnhapJDialog b = new DangnhapJDialog(null, true);
             
            b.setVisible(true);
            if(Auth.isLogin()==true){
                lblNameNV.setText(Auth.user.getTenNV());
            }
        }
//             Auth.clear();
//             lblNameNV.setText("Wellcome Here!");
//             DangnhapJDialog b = new DangnhapJDialog(null, true);
//             
//            b.setVisible(true);
//            if(Auth.isLogin()==true){
//                lblNameNV.setText(Auth.user.getTenNV());
//            }
       
    }//GEN-LAST:event_mnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblGiamGia;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblNameNV;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblThongke;
    private javax.swing.JLabel lblTrangchu;
    private javax.swing.JMenuItem mnDMK;
    private javax.swing.JMenuItem mnThoat;
    private javax.swing.JPanel pnBanHang;
    private javax.swing.JPanel pnGiagia;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JPanel pnNhanVien;
    private javax.swing.JPanel pnSanPham;
    private javax.swing.JPanel pnThongke;
    private javax.swing.JPanel pnTrangChu;
    private javax.swing.JPanel pnscrene;
    // End of variables declaration//GEN-END:variables
    private JPanel chidrenpanel;

    public void showPanel(JPanel panel) {
//        chidrenpanel = panel;
        pnscrene.removeAll();
        pnscrene.add(panel);
        pnscrene.validate();
    }
     public void setColorJpanel(JPanel pane){
        pane.setBackground(new java.awt.Color(55, 148, 254));
    }
    public void resetColorJpane(JPanel pane){
        pane.setBackground(new java.awt.Color(41, 93, 157));
    }
    public void setColor(JLabel label) {
        label.setForeground(Color.black);
    }

    public void resetColor(JLabel label) {
        label.setForeground(Color.white);
    }

}
