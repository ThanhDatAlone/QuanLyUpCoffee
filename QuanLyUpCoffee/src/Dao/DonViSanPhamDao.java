/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Model.DonViSanPham;
import java.util.*;
import Helper.JDBCHeper;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class DonViSanPhamDao implements InterfaceDonViSanPham{
    
    String insert = "insert DonViSanPham(ID_DonviSP, TenDonvi,Kichthuoc,ThemTien) values (?,?,?,?)";
    String selectAll ="select * from DonViSanPham";
    String selectId = "select * from DonViSanPham where ID_DonviSP = ?";
    String sqlUpdate = "update DonViSanPham set TENDONVI = ?, KICHTHUOC=?, ThemTien=? where ID_DONVISP = ?";
    String sqlDelete = "delete DonViSanPham where ID_DonviSP =?";
    
    @Override
    public void insert(DonViSanPham dv) {
        JDBCHeper.update(insert, dv.getID_DonviSP(), dv.getTenDonvi(), dv.getKichthuoc(),dv.getThemTien());
    }

    @Override
    public void update(DonViSanPham dv) {
        JDBCHeper.update(sqlUpdate, dv.getTenDonvi(), dv.getKichthuoc(),dv.getThemTien(), dv.getID_DonviSP());
    }

    @Override
    public void delete(String id) {
        JDBCHeper.update(sqlDelete, id);
    }

    @Override
    public List<DonViSanPham> selectAll() {
        return selectBySQL(selectAll);
    }

    @Override
    public DonViSanPham selectID(String id) {
        return selectBySQL(selectId, id).get(0);
    }

    @Override
    public List<DonViSanPham> selectBySQL(String sql, Object... agrs) {
        List<DonViSanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql, agrs);
            while (rs.next()) {
                DonViSanPham dv = new DonViSanPham();
                dv.setID_DonviSP(rs.getString(1));
                dv.setTenDonvi(rs.getString(2));
                dv.setKichthuoc(rs.getInt(3));
                dv.setThemTien(rs.getInt(4));
                list.add(dv);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
//    public String selectNameByID(String id) {
//        return selectBySQL(selectId, id).get(0).getTenDonvi();
//    }
    public DonViSanPham selectGiaupsize(String id){
        String sql = "select ThemTien where ID_DonviSP=?";
       List<DonViSanPham> dv = this.selectBySQL(sql, id);
       if(dv.isEmpty()){
           return null;
       }
       return dv.get(0);
    }
    public String selectByName(String name){
        String sql = "select * from DonViSanPham where TenDonvi = ?";
        return selectBySQL(sql, name).get(0).getID_DonviSP();
    }
    public DonViSanPham selectid_DVDU(String id) {
        List<DonViSanPham> list = this.selectBySQL(selectId, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public String selectNameByID(String id) {
        return selectBySQL(selectId, id).get(0).getTenDonvi();
    }

    /// tự tăng mã
    public int selectMaLOAISP() {
        String sql = "select max(cast(substring(ID_DonviSP,3,LEN(ID_DonviSP))as int)) from  DonViSanPham";
        try {

            ResultSet rs = JDBCHeper.query(sql);
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;

    }
}
