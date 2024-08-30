/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.JDBCHeper;
import Model.SanPham;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author Admin
 */
public class SanPhamDao implements InterfaceSanPham{
    
   String insert = "insert into dbo.SanPham(ID_Sanpham,TenSP,Gia,ID_DonviSP,ID_LoaiSP,Trangthai,Hinh) values(?,?,?,?,?,?,?)";
//String insert = "insert into dbo.SanPham(ID_Sanpham,TenSP,Gia,ID_DonviSP,ID_LoaiSP,Trangthai,Hinh) values(?,?,?,DV1,?,?,?)";
String update_size = "update SanPham set ID_DonviSP=? where ID_Sanpham=?";
String update_size2 = "update SanPham set ID_DonviSP=?";
    String update = "update SanPham set TenSP = ? , Gia =? ,ID_DonviSP=?,"
            + "ID_LoaiSP =?, Trangthai=?  ,Hinh= ? where ID_Sanpham=?";

    String delete = "delete from SanPham where ID_Sanpham = ?";

    String seleteAll = "select * from SanPham";

    String selectID = "select * from SanPham where ID_Sanpham = ?";

    String select_Trangthai = "SELECT * FROM dbo.SanPham WHERE Trangthai = 1";

    String select_Trangthai2 = "SELECT * FROM dbo.SanPham WHERE Trangthai = 0";

    String update_trangtrai = "update SanPham set Trangthai = 0 where ID_Sanpham =?";

    String NAME_LOAISP = "SELECT * FROM dbo.LoaiSanPham WHERE ID_LoaiSP = ?";

    String NAME_DVSP = "SELECT * FROM dbo.DonViSanPham WHERE ID_DonviSP = ?";

    String SElECT_SQL_IDSP = "SELECT * FROM dbo.SanPham WHERE Trangthai = 1 AND ID_Sanpham = ?";

    @Override
    public void insert(SanPham sp) {

        JDBCHeper.update(insert, sp.getId_sp(), sp.getTen_sp(), sp.getGia_sp(),sp.getId_donviSP(),
                sp.getId_loaiSP(), sp.isTrangthai(), sp.getHinh());
    }

    @Override
    public void update(SanPham sp) {
        JDBCHeper.update(update, sp.getTen_sp(), sp.getGia_sp(), sp.getId_donviSP(),
                sp.getId_loaiSP(), sp.isTrangthai(), sp.getHinh(), sp.getId_sp());
    }
    
    public void update_size(String size, String idSP){
        JDBCHeper.update(update_size, size,idSP);
    }
    
    public void update_size2(String size){
        JDBCHeper.update(update_size2, size);
    }
    @Override
    public void delete(String id) {
        JDBCHeper.update(update_trangtrai, id);
    }

    @Override
    public List<SanPham> selectAll() {
        return selectBySQL(select_Trangthai);

    }

    @Override
    public SanPham selectID(String id) {
        List<SanPham> list = selectBySQL(selectID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<SanPham> selectBySQL(String sql, Object... agrs) {
        List<SanPham> list_sanpham = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql, agrs);
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setId_sp(rs.getString("ID_Sanpham"));
                sp.setTen_sp(rs.getString("TenSP"));
                sp.setGia_sp(rs.getInt("Gia"));
                sp.setId_loaiSP(rs.getString("ID_LoaiSP"));
                sp.setId_donviSP(rs.getString("ID_DonviSP"));
                sp.setTrangthai(rs.getBoolean("Trangthai"));
                sp.setHinh(rs.getString("Hinh"));
                list_sanpham.add(sp);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list_sanpham;
    }

    public List<SanPham> select_Trangthai() {
        return selectBySQL(select_Trangthai2);
    }

    public List<SanPham> selectByKeyword(String keyword, String LoaiSP) {
        String sql = "SELECT * FROM dbo.SanPham WHERE TenSP LIKE ? AND ID_LoaiSP = ? AND Trangthai = 1 ";
        return selectBySQL(sql, "%" + keyword + "%", LoaiSP);
    }

    public SanPham selecteByIDSP(String key) {
        List<SanPham> list = (List<SanPham>) selectBySQL(SElECT_SQL_IDSP, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public int select_Max_id_java() {
        try {
            String sql = "select max(cast(substring(ID_Sanpham,3,LEN(ID_Sanpham))as int)) from  SanPham ";
            ResultSet rs = JDBCHeper.query(sql);
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<SanPham> selectALLL() {
        return selectBySQL(seleteAll);
    }

    public List<SanPham> Select_ByName(String name) {  // tìm theo tên sản phẩm
        String Select_ByName = "select  *  from SanPham where TenSP like ? and Trangthai =1";
        return selectBySQL(Select_ByName, "%" + name + "%");
    }
    // lấy tên sản phẩm

    public String selectnameSP(String id) {
        String sql = "select * from SanPham where ID_SanPham = ?";
        return selectBySQL(sql, id).get(0).getTen_sp();
    }
    // lấy ra giá sản phẩm

    public int selectPrice(String id) {
        String sql = "select * from SanPham where ID_SanPham = ?";
        return selectBySQL(sql, id).get(0).getGia_sp();
    }
    // lấy id qua tên sản phẩm

    public String selectNameByID(String name) {
        String sql = "select * from SanPham where TENSP   = ?";
        return selectBySQL(sql, name).get(0).getId_sp();
    }
}
