/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;


import Model.*;
import java.util.*;
import java.sql.ResultSet;
import Helper.JDBCHeper;
/**
 *
 * @author Admin
 */
public class LoaiSanPhamDao implements InterfaceLoaiSanPham{
    
    String insert = "insert LoaiSanPham(ID_LoaiSP,Tenloai) values(?,?)";
    String selectAll = "select * from LoaiSanPham";
    String selectByid = "select * from LoaiSanPham where ID_LoaiSP =?";
    String sqlUpdate  ="update LoaiSanPham set Tenloai= ? where ID_LoaiSP=?";
    String sqlDelete = "delete LoaiSanPham where ID_LoaiSP = ?";
    
    
    @Override
    public void insert(LoaiSanPham lsp) {
        JDBCHeper.update(insert, lsp.getID_LoaiSP(),lsp.getTenLoai());
    }

    @Override
    public void update(LoaiSanPham lsp) {
        JDBCHeper.update(sqlUpdate, lsp.getTenLoai(), lsp.getID_LoaiSP());
    }

    @Override
    public void delete(String id) {
        JDBCHeper.update(sqlDelete, id);
    }

    @Override
    public List<LoaiSanPham> selectAll() {
        return selectBySQL(selectAll);
    }

    @Override
    public LoaiSanPham selectID(String id) {
        return selectBySQL(selectByid,id).get(0);
    }

    @Override
    public List<LoaiSanPham> selectBySQL(String sql, Object... agrs) {
        List<LoaiSanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql, agrs);
            while (rs.next()) {
                LoaiSanPham lsp = new LoaiSanPham();
                lsp.setID_LoaiSP(rs.getString(1));
                lsp.setTenLoai(rs.getString(2));
                list.add(lsp);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    // lay du lieu qua ten
    public String selectIdByName(String name){
        String sql = "select * from LoaiSanPham where TenLoai = ?";
        return selectBySQL(sql, name).get(0).getID_LoaiSP();
    }
        // lấy tên sản phẩm thong qua id
    public String selectNameByID(String id) {
        return selectBySQL(selectByid, id).get(0).getTenLoai();
    }
    public LoaiSanPham selectId_LSP(String id){
        List<LoaiSanPham> list = this.selectBySQL(selectByid, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    /// tự tăng mã
    public int selectMaLOAISP() {
        String sql = "select max(cast(substring(ID_LoaiSP,4,LEN(ID_LoaiSP))as int)) from  LoaiSanPham";
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
