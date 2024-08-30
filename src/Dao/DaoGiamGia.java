/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.NhanVien;
import Model.GiamGia;
import java.util.List;
import Helper.JDBCHeper;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DaoGiamGia implements InterfaceGiamGia {

    String INSERY_SQL = "insert  dbo.GiamGia values(?,?,?,?)";
    String UPDATE_SQL = "update GiamGia set Tensukien=? where Id_GiamGia=?";
    String DELETE_SQL = "delete from GiamGia where ID_Giamgia =?";
    String Select_SQL_SK = "select * from GiamGia where Tensukien=?";
    String SelectALL = "select * from GiamGia";
    String SELECT_BY_ID_SQL = "select * from GiamGia where Id_GiamGia = ?";

    public List<GiamGia> selectAll;

    @Override
    public void insert(GiamGia Entity) {
        JDBCHeper.update(INSERY_SQL, Entity.getTenSK(), Entity.getIdnhanvien(), Entity.getNgayBD(), Entity.getNgayKT());
    }

    @Override
    public void update(GiamGia Entity) {
        JDBCHeper.update(UPDATE_SQL, Entity.getTenSK(), Entity.getId_GiamGia());
    }

    @Override
    public void delete(String id) {
        JDBCHeper.update(DELETE_SQL, id);
    }

    @Override
    public List<GiamGia> selectAll() {
        return this.selectBySql(SelectALL);
    }

    @Override
    public List<GiamGia> selectBySql(String sql, Object... args) {
        List<GiamGia> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                GiamGia e = new GiamGia();
                e.setId_GiamGia(rs.getInt("Id_GiamGia"));
                e.setTenSK(rs.getString("Tensukien"));
                e.setIdnhanvien(rs.getString("ID_Nhanvien"));
                e.setNgayBD(rs.getDate("Ngaybd"));
                e.setNgayKT(rs.getDate("ngaykt"));
//                e.setGiamGia(rs.getInt("Giam"));
                list.add(e);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public GiamGia selectById(String id) {
        List<GiamGia> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<GiamGia> selectALLL() {
        return selectBySql(SelectALL);

    }

    public void updateDateFinsh(GiamGia e) {
        String sql = "update GiamGia set  NGAYKT = ? WHERE Id_GiamGia=?";
        JDBCHeper.update(sql, e.getNgayKT(), e.getId_GiamGia());
    }

    // 
    public GiamGia selectKhoangNgay(String idsp) {
        String sql = "select   * from giamgiachitiet join GiamGia on "
                + "Giamgiachitiet.Id_GiamGia = GiamGia.Id_GiamGia\n"
                + "where id_sanpham = ?  order by ngaykt desc";
        List<GiamGia> list = selectBySql(sql, idsp);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    // lấy ra id của giảm giá
    public GiamGia selectByIdss(int id) {
        String SELECT_BY_ID_SQL = "select * from GiamGia where Id_GiamGia = ?";
        List<GiamGia> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        System.out.println(list.get(0).getId_GiamGia());
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public GiamGia selectByIdSK(String SK) {
        List<GiamGia> list = this.selectBySql(Select_SQL_SK, SK);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    // hiển thị những sản phẩm giảm giá còn hạn sử dụng
    

}
