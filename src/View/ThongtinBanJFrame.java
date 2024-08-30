package View;

import Dao.BanChiTietDAO;
import Dao.BanDao;
import Dao.HoaDonDAO;
import Dao.HoadonchitietDAO;
import Model.Ban;
import Model.BanChiTiet;
import Model.Hoadon;
import Model.HoaDonChiTiet;
import Helper.Xdate;
import java.awt.Color;
import java.util.List;

public class ThongtinBanJFrame extends javax.swing.JFrame {

    public ThongtinBanJFrame(List<BanChiTiet> bct, int ban) {
        initComponents();
        banct = bct;
        idban = ban;
        if (!banct.isEmpty()) {
            setinfor();
        } else {
            Ban bans = bandao.selectById(idban);
            lblSocho.setText(bans.getSoluongcho() + "");
        }
        getContentPane().setBackground(Color.CYAN);
    }
    static List<BanChiTiet> banct;
    static int idban;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblthoigiantaodon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSocho = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblban = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbltrangthaidon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lblthoigiantaodon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblthoigiantaodon.setText("00:00:00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Tại:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Số chỗ:");

        lblSocho.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSocho.setText("...");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Thanh toán tại:");

        lblban.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblban.setText("...");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tổng tiền:");

        lblTongTien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTongTien.setText("...");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Đơn:");

        lbltrangthaidon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltrangthaidon.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblthoigiantaodon, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(13, 13, 13)
                                .addComponent(lblSocho))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblban))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lblTongTien))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(13, 13, 13)
                                .addComponent(lbltrangthaidon)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblthoigiantaodon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblban))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTongTien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblSocho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbltrangthaidon))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongtinBanJFrame(banct, idban).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblSocho;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblban;
    private javax.swing.JLabel lblthoigiantaodon;
    private javax.swing.JLabel lbltrangthaidon;
    // End of variables declaration//GEN-END:variables
    BanChiTietDAO banctdao = new BanChiTietDAO();
    BanDao bandao = new BanDao();
    HoaDonDAO hddao = new HoaDonDAO();
    HoadonchitietDAO hdctDAO = new HoadonchitietDAO();

    public void setinfor() {
        Ban ban = bandao.selectById(idban);
        lblSocho.setText(ban.getSoluongcho() + "");
        if (!banct.isEmpty()) {
            BanChiTiet banchitiet = banctdao.selectById(banct.get(0).getID_Ban(), banct.get(0).getID_HoaDon());
            lblthoigiantaodon.setText(Xdate.toString(banchitiet.getThoidiemCoNguoi(), "hh:mm:ss"));
            BanChiTiet banctdc = banctdao.selectBydonchinh(banchitiet.getID_HoaDon());
            lblban.setText(banctdc.getID_Ban() + "");
            int tienTong = 0;
            List<Hoadon> listhd = hddao.selectCTT(idban);
            for (Hoadon hoadon : listhd) {
                tienTong += hoadon.getThanhTien();
            }
            lblTongTien.setText(tienTong + "");
            Hoadon hd = hddao.selectById(banctdc.getID_HoaDon());
            if (hd.getSDT() == null || hd.getSDT().equals("")) {
                if (ban.isTrangThai() == false) {
                    lbltrangthaidon.setText("tại quầy");
                } else {
                    lbltrangthaidon.setText("tại quán");
                }
            } else {
                lbltrangthaidon.setText("đặt");
            }
            //System.out.println(XDate.toString(banchitiet.getThoidiemCoNguoi(), "hh:mm:ss"));   
//            BanChitiet bct = banctdao.selectBydonchinh(ban.getIdBan());
//            lblban.setText(bct.getID_Ban()+"");
        }
    }
}
