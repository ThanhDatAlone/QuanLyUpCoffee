/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dao.ThongKeDonBan;
import Dao.ThongKeSPBan;
import Dao.ThongKeBieuDoNam;
import View.MainThongKeJPanel;
import Helper.JDBCHeper;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author sonlu
 */
public class ThongKeDao {
    String sql_doanhthutong_ngay_label = "select sum(h.TongGia)as N'Tổng Tiền1' from HoaDon d join HoaDonChiTiet h \n" +
"           on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham where d.Trangthai=1 and h.TTthanhtoan=1 and d.TTThanhtoan=1 and DAY(Ngaytao)=day(getdate())\n";
    String sql_tongdonban_ngay_label = "select COUNT(*) as soluong from HoaDon where Trangthai=1 and TTThanhtoan=1 and DAY(Ngaytao)=day(getdate())";
     
    String sql_tongdonban_thang_label = "select count(*) as soluong from HoaDon where Trangthai=1 and TTThanhtoan=1  and  MONTH(Ngaytao)=MONTH(GETDATE())";
   String sql_tongdonban_nam_label = "select count(*) as soluong from HoaDon where Trangthai=1 and TTThanhtoan=1  and  year(Ngaytao)=year(getdate())";
   String sql_tongspban_nam_label ="select sum(h.Soluong) as soluong from HoaDon d join HoaDonChiTiet h \n" +
"on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham\n" +
"where d.Trangthai=1 and  d.TTThanhtoan=1 and  h.TTthanhtoan=1 and year(Ngaytao)=year(getdate())";
   String sql_tongspban_thang_label ="select sum(h.Soluong) as soluong from HoaDon d join HoaDonChiTiet h \n" +
"on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham\n" +
"where d.Trangthai=1 and  d.TTThanhtoan=1 and  h.TTthanhtoan=1 and MONTH(Ngaytao)=MONTH(GETDATE())";
   String sql_tongspban_ngay_label ="select sum(h.Soluong) as soluong from HoaDon d join HoaDonChiTiet h \n" +
"on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham\n" +
"where d.Trangthai=1 and  d.TTThanhtoan=1 and  h.TTthanhtoan=1 and DAY(Ngaytao)=day(getdate())";
   
    String sql_doanhthutong_thang_label = "select sum(h.TongGia)as N'Tổng Tiền1' from HoaDon d join HoaDonChiTiet h \n" +
"           on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham where d.Trangthai=1 and h.TTthanhtoan=1 and d.TTThanhtoan=1 and month(Ngaytao)=month(getdate())";
    String sql_doanhthutong_nam_label = "select sum(h.TongGia)as N'Tổng Tiền1' from HoaDon d join HoaDonChiTiet h \n" +
"           on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham where d.Trangthai=1 and h.TTthanhtoan=1 and d.TTThanhtoan=1 and year(Ngaytao)=year(getdate())";
    String sql_sosanh_thang_label = "select sum(h.TongGia)as N'Tổng Tiền1' from HoaDon d join HoaDonChiTiet h \n" +
"          on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham \n" +
"		  where d.Trangthai=1 and h.TTthanhtoan=1 and d.TTThanhtoan=1 and month(Ngaytao)=month(getdate())-1";
    String sql_sosanh_ngay_label ="select sum(h.TongGia)as N'Tổng Tiền1' from HoaDon d join HoaDonChiTiet h \n" +
"          on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham \n" +
"		  where d.Trangthai=1 and h.TTthanhtoan=1 and d.TTThanhtoan=1 and day(Ngaytao)=day(getdate())-1";
    String sql_sosanh_nam_label ="select sum(h.TongGia)as N'Tổng Tiền1' from HoaDon d join HoaDonChiTiet h \n" +
"          on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham \n" +
"		  where d.Trangthai=1 and h.TTthanhtoan=1 and d.TTThanhtoan=1 and year(Ngaytao)=year(getdate())-1";
    String sql_doanhthutong_ngay_table = "select  TenSP,sum(h.Soluong) as N'Số Lượng',sum(h.TongGia) as N'Tổng Tiền1' from HoaDon d join HoaDonChiTiet h \n" +
"            on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham where  d.Trangthai=1 and  d.TTThanhtoan=1 and  h.TTthanhtoan=1 and day(Ngaytao)=day(getdate())\n" +
"            GROUP BY TenSP";
    String sql_doanhthutong_Thang_table = "select TenSP,sum(h.Soluong) as N'Số Lượng',sum(h.TongGia) as N'Tổng Tiền1' from HoaDon d join HoaDonChiTiet h \n" +
"            on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham where  d.Trangthai=1 and  d.TTThanhtoan=1 and  h.TTthanhtoan=1 and month(Ngaytao)=month(getdate())\n" +
"            GROUP BY TenSP";
    String sql_doanhthutong_nam_table = "select  TenSP,sum(h.Soluong) as N'Số Lượng',sum(h.TongGia) as N'Tổng Tiền1' from HoaDon d join HoaDonChiTiet h \n" +
"            on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham where  d.Trangthai=1 and  d.TTThanhtoan=1 and  h.TTthanhtoan=1 and year(Ngaytao)=year(getdate())\n" +
"            GROUP BY TenSP";
    String sql_doanhthunam = "select TenSP,COUNT(h.ID_SanPham) as N'Số Lượng',sum(TongGia) as N'Tổng Tiền1' \n"
            + "from HoaDon d join HoaDonChiTiet h on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham\n"
            + "\n"
            + "where year(d.Ngaytao)=? and h.TTthanhtoan=1\n"
            + "GROUP BY TenSP";
    String sql_donhuy_ngay = "select ID_Nhanvien,count(ID_Nhanvien) as soluong from HoaDon where Trangthai=0 and day(Ngaytao)=day(getdate())\n"
            + "GROUP BY ID_Nhanvien";
    String sql_donhuy_thang = "select ID_Nhanvien,count(ID_Nhanvien) as soluong from HoaDon where Trangthai=0 and month(Ngaytao)=month(getdate())\n"
            + "GROUP BY ID_Nhanvien";
    String sql_donhuy_nam = "select ID_Nhanvien,count(ID_Nhanvien) as soluong from HoaDon where Trangthai=0 and year(Ngaytao)=year(getdate())\n"
            + "GROUP BY ID_Nhanvien";
    String sql_sphuyNgay = "select sum(Soluongsanphamhuy) as soluong from HoaDon where ID_Nhanvien=? and day(Ngaytao)=day(getdate())\n"
            + "GROUP BY ID_Nhanvien";
    String sql_sphuyThang = "select sum(Soluongsanphamhuy) as soluong from HoaDon where ID_Nhanvien=? and month(Ngaytao)=month(getdate())\n"
            + "GROUP BY ID_Nhanvien";
    String sql_sphuynam = "select sum(Soluongsanphamhuy) as soluong from HoaDon where ID_Nhanvien=? and year(Ngaytao)=year(getdate())\n"
            + "GROUP BY ID_Nhanvien";
    String sql_find_sanpham = "	select  TenSP,sum(h.Soluong)  as N'Số Lượng' ,sum(h.TongGia) as N'Tổng Tiền1' from HoaDon d join HoaDonChiTiet h \n" +
"            on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham where  d.Trangthai=1 and  d.TTThanhtoan=1 and  h.TTthanhtoan=1 and Ngaytao between ? and ?\n" +
"            GROUP BY TenSP";
    String sql_find_donhuy = "select ID_Nhanvien,count(ID_Nhanvien) as soluong from HoaDon where Trangthai=0 and Ngaytao between ? and ?\n"
            + "            GROUP BY ID_Nhanvien";

    String sql_find_sphuy = "select sum(Soluongsanphamhuy) as soluong from HoaDon where ID_Nhanvien=? and Ngaytao between ? and ?\n"
            + "GROUP BY ID_Nhanvien";
 String sql_thongke_hoadonban_thang="select Ngaytao,COUNT(*) as soluong from HoaDon where Trangthai=1 and TTThanhtoan=1 and MONTH(Ngaytao)=MONTH(GETDATE())\n" +
"\n" +
"GROUP BY Ngaytao";
 String sql_thongke_hoadonban_nam="select Month(Ngaytao) as Ngaytao,COUNT(*) as soluong from HoaDon where Trangthai=1 and TTThanhtoan=1 and  year(Ngaytao)=year(GETDATE())\n" +
"GROUP BY Month(Ngaytao)";
  String sql_thongke_hoadonban_find="select Ngaytao,COUNT(*) as soluong from HoaDon where Trangthai=1 and TTThanhtoan=1  and Ngaytao between ? and ?  \n" +
"GROUP BY Ngaytao";
  String sql_thongke_spban_find="select TenSP,sum(h.Soluong) as soluong from HoaDon d join HoaDonChiTiet h \n" +
"on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham\n" +
" where d.Trangthai=1 and  d.TTThanhtoan=1 and  h.TTthanhtoan=1 and Ngaytao between ? and ?\n" +
"GROUP BY TenSP";
  String sql_thongke_spban_thang="select TenSP,sum(h.Soluong) as soluong from HoaDon d join HoaDonChiTiet h \n" +
"on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham\n" +
"where d.Trangthai=1 and  d.TTThanhtoan=1 and  h.TTthanhtoan=1 and MONTH(Ngaytao)=MONTH(GETDATE())\n" +
"GROUP BY TenSP";
  
  
  String sql_thongke_spban_nam="select TenSP,sum(h.Soluong) as soluong from HoaDon d join HoaDonChiTiet h \n" +
"on h.ID_HoaDon=d.ID_Hoadon  join SanPham s on h.ID_SanPham=s.ID_Sanpham\n" +
"where d.Trangthai=1 and  d.TTThanhtoan=1 and  h.TTthanhtoan=1 and year(Ngaytao)=year(GETDATE())\n" +
"GROUP BY TenSP";
    public List<Long> selectdaonhthu_ngay_label() {

        List<Long> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql_doanhthutong_ngay_label);
            while (rs.next()) {
                list.add(rs.getLong(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
     public List<Integer> selecttongdon_ngay_label() {

        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql_tongdonban_ngay_label);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
     public List<Integer> selecttongdon_thang_label() {

        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql_tongdonban_thang_label);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
      public List<Integer> selecttongdon_nam_label() {

        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql_tongdonban_nam_label);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
       public List<Integer> selecttongsp_thang_label() {

        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql_tongspban_thang_label);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
          public List<Integer> selecttongsp_nam_label() {

        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql_tongspban_nam_label);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
          public List<Integer> selecttongsp_ngay_label() {

        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql_tongspban_ngay_label);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Long> selectdaonhthu_Thang_label() {

        List<Long> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql_doanhthutong_thang_label);
            while (rs.next()) {
                list.add(rs.getLong(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Long> selectdaonhthu_nam_label() {

        List<Long> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql_doanhthutong_nam_label);
            while (rs.next()) {
                list.add(rs.getLong(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Long> selectsosanh_Thang_label() {

        List<Long> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql_sosanh_thang_label);
            while (rs.next()) {
                list.add(rs.getLong(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Long> selectsosanh_ngay_label() {

        List<Long> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql_sosanh_ngay_label);
            while (rs.next()) {
                list.add(rs.getLong(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
     public List<Long> selectsosanh_nam_label() {

        List<Long> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql_sosanh_nam_label);
            while (rs.next()) {
                list.add(rs.getLong(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
     private List<ThongKeDonBan> getListOfArray_thongke_donban(String sql, String[] cols, Object... args) {
        try {
            List<ThongKeDonBan> list = new ArrayList<>();
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                ThongKeDonBan a = new ThongKeDonBan();
                a.setNgayDangKy(rs.getDate(1));
                a.setSoluong(rs.getInt(2));
                list.add(a);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
     private List<ThongKeDonBan> getListOfArray_thongke_donban_find(String sql, String[] cols, Object... args) {
        try {
            List<ThongKeDonBan> list = new ArrayList<>();
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                ThongKeDonBan a = new ThongKeDonBan();
                a.setNgayDangKy(rs.getDate(1));
                a.setSoluong(rs.getInt(2));
                list.add(a);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
       private List<ThongKeBieuDoNam> getListOfArray_thongke_donban_nam(String sql, String[] cols, Object... args) {
        try {
            List<ThongKeBieuDoNam> list = new ArrayList<>();
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                ThongKeBieuDoNam a = new ThongKeBieuDoNam();
                a.setThang(rs.getInt(1));
                a.setSoluong(rs.getInt(2));
                list.add(a);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
        private List<ThongKeSPBan> getListOfArray_thongke_spban_nam(String sql, String[] cols, Object... args) {
        try {
            List<ThongKeSPBan> list = new ArrayList<>();
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                ThongKeSPBan a = new ThongKeSPBan();
                a.setTensp(rs.getString(1));
                a.setSoluong(rs.getInt(2));
                list.add(a);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
     private List<ThongKeSPBan> getListOfArray_thongke_spban(String sql, String[] cols, Object... args) {
        try {
            List<ThongKeSPBan> list = new ArrayList<>();
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                ThongKeSPBan a = new ThongKeSPBan();
                a.setTensp(rs.getString(1));
                a.setSoluong(rs.getInt(2));
                list.add(a);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> getDoanhThu_ngay_table() {

        String[] cols = {"TenSP", "Số Lượng", "Tổng Tiền1"};
        return this.getListOfArray(sql_doanhthutong_ngay_table, cols);
    }

    public List<Object[]> getDoanhThu_Thang_table() {

        String[] cols = {"TenSP", "Số Lượng", "Tổng Tiền1"};
        return this.getListOfArray(sql_doanhthutong_Thang_table, cols);
    }

    public List<Object[]> getDoanhThu_nam_table() {

        String[] cols = {"TenSP", "Số Lượng", "Tổng Tiền1"};
        return this.getListOfArray(sql_doanhthutong_nam_table, cols);
    }

    public List<Object[]> getdonhuyngay() {

        String[] cols = {"ID_Nhanvien", "soluong"};
        return this.getListOfArray(sql_donhuy_ngay, cols);
    }

    public List<Object[]> getdonhuythang() {

        String[] cols = {"ID_Nhanvien", "soluong"};
        return this.getListOfArray(sql_donhuy_thang, cols);
    }

    public List<Object[]> getdonhuynam() {

        String[] cols = {"ID_Nhanvien", "soluong"};
        return this.getListOfArray(sql_donhuy_nam, cols);
    }

    public int getsphuyngay(String mnv) {

        String[] cols = {"soluong"};
        List<Object[]> lst = this.getListOfArray(sql_sphuyNgay, cols, mnv);
        return (int) lst.get(0)[0];
    }

    public int getsphuythang(String mnv) {

        String[] cols = {"soluong"};
        List<Object[]> lst = this.getListOfArray(sql_sphuyThang, cols, mnv);
        return (int) lst.get(0)[0];
    }

    public int getsphuynam(String mnv) {

        String[] cols = {"soluong"};
        List<Object[]> lst = this.getListOfArray(sql_sphuynam, cols, mnv);
        return (int) lst.get(0)[0];
    }

    public void Find() {
        List<Object[]> list = new ArrayList<>();
        List<Object[]> list1 = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) MainThongKeJPanel.tblsoluong.getModel();
        DefaultTableModel model1 = (DefaultTableModel) MainThongKeJPanel.tblhuydon.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);
        Date a = MainThongKeJPanel.jDateNgaybd.getDate();
        Date b = MainThongKeJPanel.jDatengayKt.getDate();
        
        try {
            if (a.getTime() > b.getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày bắt đầu phải nhỏ hơn ngày kết thúc");
                return;
            }
            if (b.getTime() > new Date().getTime() || a.getTime() > new Date().getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày  không hợp lệ");
                return;
            }
            
            list = selectdaonhthu_find_table_sanpham(a, b);
            for (Object[] hd : list) {
                model.addRow(hd);

            }

        } catch (Exception e) {
        }
        try {
            list1 = selectdaonhthu_find_table_donhuy(a, b);
            for (Object[] hd : list1) {
                String ma = hd[0].toString();
                model1.addRow(new Object[]{hd[0],hd[1],selectdaonhthu_find_table_sphuy(ma, a, b)});

            }
        } catch (Exception e) {
        }
    }

    public List<Object[]> selectdaonhthu_find_table_sanpham(Date a, Date b) {
SimpleDateFormat sm=new SimpleDateFormat("yyyy.MM.dd");
        String[] cols = {"TenSP", "Số Lượng", "Tổng Tiền1"};
        return this.getListOfArray(sql_find_sanpham, cols,sm.format(a), sm.format(b));
    }

    public List<Object[]> selectdaonhthu_find_table_donhuy(Date a, Date b) {
SimpleDateFormat sm=new SimpleDateFormat("yyyy.MM.dd");
        String[] cols = {"ID_Nhanvien", "soluong"};
        return this.getListOfArray(sql_find_donhuy, cols,sm.format(a),sm.format(b));
    }
    public int selectdaonhthu_find_table_sphuy(String mnv,Date a, Date b) {
SimpleDateFormat sm=new SimpleDateFormat("yyyy.MM.dd");
        String[] cols = {"soluong"};
        List<Object[]> lst = this.getListOfArray(sql_find_sphuy, cols, mnv,sm.format(a),sm.format(b));
        return (int) lst.get(0)[0];
    }
    
    public List<ThongKeDonBan> Chart_hoadon_thang() {

        String[] cols = {"Ngaytao", "soluong"};
        return this.getListOfArray_thongke_donban(sql_thongke_hoadonban_thang, cols);
    }
     public List<ThongKeBieuDoNam> Chart_hoadon_nam() {

        String[] cols = {"Ngaytao", "soluong"};
        return this.getListOfArray_thongke_donban_nam(sql_thongke_hoadonban_nam, cols);
    }
     public List<ThongKeSPBan> Chart1_sp_thang() {

        String[] cols = {"TenSP", "soluong"};
        return this.getListOfArray_thongke_spban(sql_thongke_spban_thang, cols);
    }
     public List<ThongKeSPBan> Chart1_sp_find(Date a,Date b) {
SimpleDateFormat sm=new SimpleDateFormat("yyyy.MM.dd");
        String[] cols = {"TenSP", "soluong"};
        return this.getListOfArray_thongke_spban(sql_thongke_spban_find, cols,sm.format(a),sm.format(b));
    }
     public List<ThongKeDonBan> Chart_hoadon_find(Date a,Date b) {
SimpleDateFormat sm=new SimpleDateFormat("yyyy.MM.dd");
        String[] cols = {"Ngaytao", "soluong"};
        return this.getListOfArray_thongke_donban(sql_thongke_hoadonban_find, cols,sm.format(a),sm.format(b));
    }
      public List<ThongKeSPBan> Chart1_sp_nam() {

        String[] cols = {"TenSP", "soluong"};
        return this.getListOfArray_thongke_spban(sql_thongke_spban_nam, cols);
    }
    public void setDataToChart1_thang(JPanel jpnItem) {
        List<ThongKeDonBan> lst= Chart_hoadon_thang();
 jpnItem.removeAll();
 jpnItem.updateUI();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       
        if (lst != null) {
            for (ThongKeDonBan tk : lst) {
                dataset.addValue(tk.getSoluong(), "Hóa Đơn", tk.getNgayDangKy());
            }
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê số lượng hóa đơn đã bán tháng này".toUpperCase(),
                "Thời gian(ngày)", "Số lượng đơn ",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 550));

       
        jpnItem.setLayout(new CardLayout());
        jpnItem.setBackground(Color.yellow);
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
     public void setDataToChart1_find(JPanel jpnItem,Date a,Date b) {
        List<ThongKeDonBan> lst= Chart_hoadon_find(a,b);
 jpnItem.removeAll();
 jpnItem.updateUI();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       
        if (lst != null) {
            for (ThongKeDonBan tk : lst) {
                dataset.addValue(tk.getSoluong(), "Hóa Đơn", tk.getNgayDangKy());
            }
        }
SimpleDateFormat sm=new SimpleDateFormat("dd.MM.yyyy");
        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê số lượng hóa đơn đã bán trong khoảng ngày: ".toUpperCase()+sm.format(a)+" Đến ngày "+sm.format(b),
                "Thời gian", "Số lượng đơn ",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 550));

       
        jpnItem.setLayout(new CardLayout());
        jpnItem.setBackground(Color.yellow);
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
    public void setDataToChart1_nam(JPanel jpnItem) {
        List<ThongKeBieuDoNam> lst= Chart_hoadon_nam();
jpnItem.removeAll();
 jpnItem.updateUI();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (lst != null) {
            for (ThongKeBieuDoNam tk : lst) {
                dataset.addValue(tk.getSoluong(), "Hóa Đơn", "Tháng "+tk.getThang());
            }
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê số lượng hóa đơn đã bán năm này".toUpperCase(),
                "Thời gian(Tháng)", "Số lượng đơn ",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 550));

        
        jpnItem.setLayout(new CardLayout());
        jpnItem.setBackground(Color.yellow);
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
     public void setDataToChart2_thang(JPanel jpnItem) {
        List<ThongKeSPBan> lst= Chart1_sp_thang();
jpnItem.removeAll();
 jpnItem.updateUI();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        if (lst != null) {
            for (ThongKeSPBan tk : lst) {
                dataset.addValue(tk.getSoluong(), "Sản Phẩm", tk.getTensp());
            }
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê số lượng Sản Phẩm đã bán tháng này".toUpperCase(),
                "Tên Sản Phẩm", "Số lượng Sản Phẩm ",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 550));

        
        jpnItem.setLayout(new CardLayout());
        jpnItem.setBackground(Color.yellow);
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
     public void setDataToChart2_find(JPanel jpnItem,Date a,Date b) {
        List<ThongKeSPBan> lst= Chart1_sp_find(a, b);
jpnItem.removeAll();
 jpnItem.updateUI();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        if (lst != null) {
            for (ThongKeSPBan tk : lst) {
                dataset.addValue(tk.getSoluong(), "Sản Phẩm", tk.getTensp());
            }
        }
        SimpleDateFormat sm=new SimpleDateFormat("dd.MM.yyyy");

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê số lượng Sản Phẩm đã bán trong khoảng ngày: ".toUpperCase()+sm.format(a)+" Đến ngày "+sm.format(b),
                "Tên Sản Phẩm", "Số lượng Sản Phẩm ",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 550));

        
        jpnItem.setLayout(new CardLayout());
        jpnItem.setBackground(Color.yellow);
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
     public void setDataToChart2_nam(JPanel jpnItem) {
        List<ThongKeSPBan> lst= Chart1_sp_nam();
 jpnItem.removeAll();
  jpnItem.updateUI();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (lst != null) {
            for (ThongKeSPBan tk : lst) {
                dataset.addValue(tk.getSoluong(), "Sản Phẩm", tk.getTensp());
            }
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê số lượng Sản Phẩm đã bán Năm nay".toUpperCase(),
                "Tên Sản Phẩm", "Số lượng Sản Phẩm ",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 550));

       
        jpnItem.setLayout(new CardLayout());
        jpnItem.setBackground(Color.yellow);
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
}
