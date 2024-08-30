/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Ban;
import Helper.JDBCHeper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//sua ban
/**
 *
 * @author HP
 */
public class BanDao implements InterfaceBan{
    String INSERT_SQL = "INSERT dbo.Ban VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE dbo.Ban SET Soluongcho = ?, Trangthai = ?, Hoatdong = ? WHERE ID_Ban = ?";
    String UPDATE_SQL_TRANGTHAI = "UPDATE dbo.Ban SET Trangthai = 1 WHERE ID_Ban = ?";//ban su dung ngoai quan (xóa)
    String UPDATE_SQL_HD = "UPDATE dbo.Ban SET Hoatdong = 0 WHERE ID_Ban = ?";//cho ban thanh co nguoi
    String DELETE_SQL_TRANGTHAI = "UPDATE dbo.Ban SET Trangthai = 0 WHERE ID_Ban = ?";//ban cat trong kho (xóa)
    String DELETE_SQL_HD = "UPDATE dbo.Ban SET Hoatdong = 1 WHERE ID_Ban = ?";//cho ban ve khong co nguoi
    String DELETE = "DELETE FROM dbo.Ban WHERE ID_Ban = ?";//cho ban ve khong co nguoi
    String SELECT_ALL_SQL = "SELECT * FROM dbo.Ban";
    String SELECT_ALL_AO_SQL = "SELECT * FROM dbo.Ban WHERE Trangthai = 0";
    String SELECT_ALL_Ban_Trong_ALL = "SELECT * FROM dbo.Ban WHERE Hoatdong = 1";
    String SELECT_ALL_Ban_Thuc = "SELECT * FROM dbo.Ban WHERE Trangthai = 1";
    String SELECT_ALL_Ban_Trong_BanThuc = "SELECT * FROM dbo.Ban WHERE Hoatdong = 1 AND Trangthai = 1";
    String SELECT_BY_ID_SQL = "select * from dbo.Ban where ID_Ban = ?";
    String SELECT_BY_ID_Ban = "SELECT * FROM dbo.Ban JOIN dbo.BanChiTiet ON BanChiTiet.ID_Ban = Ban.ID_Ban  \n" +
        "JOIN dbo.HoaDon ON HoaDon.ID_Hoadon = BanChiTiet.ID_Hoadon WHERE dbo.HoaDon.Trangthai = 1\n" +
        "AND dbo.HoaDon.TTThanhtoan = 0 AND Ban.ID_Ban = ?";
    String SELECT_BY_ID_Ban_TT = "SELECT * FROM dbo.Ban JOIN dbo.BanChiTiet ON BanChiTiet.ID_Ban = Ban.ID_Ban  \n" +
        "JOIN dbo.HoaDon ON HoaDon.ID_Hoadon = BanChiTiet.ID_Hoadon WHERE dbo.HoaDon.Trangthai = 1\n" +
        "AND dbo.HoaDon.TTThanhtoan = 1 AND Ban.ID_Ban = ?";
    String SELECT_BY_ID_HD = "SELECT * FROM dbo.Ban JOIN dbo.BanChiTiet ON BanChiTiet.ID_Ban = Ban.ID_Ban \n" +
        "JOIN dbo.HoaDon ON HoaDon.ID_Hoadon = BanChiTiet.ID_Hoadon WHERE dbo.HoaDon.Trangthai = 1\n" +
        "AND dbo.HoaDon.TTThanhtoan = 0 AND dbo.HoaDon.ID_Hoadon = ?";
//    String SELECT_donchinh = "SELECT * FROM dbo.Ban JOIN dbo.BanChiTiet ON BanChiTiet.ID_Ban = Ban.ID_Ban \n" +
//        "JOIN dbo.HoaDon ON HoaDon.ID_Hoadon = BanChiTiet.ID_Hoadon WHERE dbo.HoaDon.Trangthai = 1\n" +
//        "AND dbo.HoaDon.TTThanhtoan = 0 AND Donchinh = 1 AND dbo.HoaDon.ID_Hoadon = ?";
    @Override
    public void insert(Ban Entity) {
        Helper.JDBCHeper.update(INSERT_SQL, Entity.getIdBan(), Entity.isTrangThai(),Entity.isHoatDong(),Entity.getSoluongcho());
    }

    @Override
    public void updateTrangThai(int id) {
        Helper.JDBCHeper.update(UPDATE_SQL_TRANGTHAI, id);
    }

    @Override
    public void deleteTRangThai(int id) {
        Helper.JDBCHeper.update(DELETE_SQL_TRANGTHAI, id);
    }

    @Override
    public Ban selectById(int id) {
        List<Ban> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

//    public Ban selectBydonchinh(int id) {
//        List<Ban> list = this.selectBySql(SELECT_donchinh, id);
//        if (list.isEmpty()) {
//            return null;
//        }
//        return list.get(0);
//    }
    
    @Override
    public List<Ban> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    public List<Ban> selectAllAO() {
        return this.selectBySql(SELECT_ALL_AO_SQL);
    }
    @Override
    public List<Ban> selectBySql(String sql, Object... args) {
        List<Ban> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                Ban Entity = new Ban();
                Entity.setIdBan(rs.getInt("ID_Ban"));
                Entity.setTrangThai(rs.getBoolean("Trangthai"));
                Entity.setHoatDong(rs.getBoolean("Hoatdong"));
                Entity.setSoluongcho(rs.getInt("Soluongcho"));
                list.add(Entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateHoatDong(int id) {
        Helper.JDBCHeper.update(UPDATE_SQL_HD, id);
    }

    @Override
    public void deleteHoatDong(int id) {
        Helper.JDBCHeper.update(DELETE_SQL_HD, id);
    }
    
    public Ban selectIDHD(int maHD){
        //return selectBySql(SELECT_BY_ID_HD, maHD).get(0);
        List<Ban> list = this.selectBySql(SELECT_BY_ID_HD, maHD);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
        
    }
    
    public List<Ban> selectbanTrong(){
        return selectBySql(SELECT_ALL_Ban_Trong_ALL);
    }
    
    public List<Ban> selectbanThuc(){
        return selectBySql(SELECT_ALL_Ban_Thuc);
    }
    
    //số lường chỗ người trong bàn
    //có cần số lượng khách hiện tại đang ngồi
    //chuyển bàn từ khách này sang bàn có khách khác 
    
    //hóa đơn bắt trạng thái hóa đơn thanh toán hay chưa thanh toán để hiển thị hóa đơn chi tiết theo bàn tạo hóa đơn đó
    //

    @Override
    public void delete(int id) {
        Helper.JDBCHeper.update(DELETE, id);
    }

    @Override
    public List<Ban> selectByIdcheck(int id) {
        return selectBySql(SELECT_BY_ID_SQL, id);
    }

    @Override
    public void update(Ban Entity) {
        Helper.JDBCHeper.update(UPDATE_SQL, Entity.getSoluongcho(), Entity.isTrangThai(), Entity.isHoatDong(), Entity.getIdBan());
    }

    @Override
    public List<Ban> selectAll_banthuc() {
        return selectBySql(SELECT_ALL_Ban_Trong_BanThuc);
    }
    
    public List<Ban> selectIDBan(int idban) {
        return selectBySql(SELECT_BY_ID_Ban, idban);
    }
    
    public List<Ban> selectIDBanTT(int idban) {
        return selectBySql(SELECT_BY_ID_Ban_TT, idban);
    }
}
