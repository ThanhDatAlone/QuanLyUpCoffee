/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Hoadon;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public interface InterfaceHoadon {
    abstract public void insert(Hoadon Entity);

    abstract public void updateThanhToan(Hoadon Entity);
    
    abstract public void updateTrangThai(Hoadon Entity);
    
    abstract public void updateThanhtien(Hoadon Entity);
    
    abstract public void updateLydohuy(Hoadon Entity);
    
    abstract public void updateSLSPHUY(Hoadon Entity);

    abstract public void delete(Hoadon Entity);

    abstract public Hoadon selectById(int id);
    
    abstract public List<Hoadon> selectAll();
    abstract public List<Hoadon> selectAll_trangthai1();

    abstract public List<Hoadon> selectAll_trangthai0();

    abstract public List<Hoadon> selectAll_SQL_Find_HoatDong(Date a, Date b);

    abstract public List<Hoadon> selectAll_SQL_Find_HoatDong_keyword(String keyword);

    abstract public List<Hoadon> select_all_sql_find_HoatDong_keyword_IDMaNV(String keyword);

    abstract public List<Hoadon> select_all_sql_find_KoHoatDong_keyword_IDMaNV(String keyword);

    abstract public List<Hoadon> selectAll_SQL_Find_koHoatDong_keyword(String keyword);

    abstract public List<Hoadon> selectAll_SQL_Find_KoHoatDong(Date a, Date b);

    abstract public List<Hoadon> selectAll_SQL_Find_HoatDong_1ngay(Date a);

    abstract public List<Hoadon> selectAll_SQL_Find_KoHoatDong_1ngay(Date a);

    abstract public List<Hoadon> selectBySql(String sql, Object... args);
}
