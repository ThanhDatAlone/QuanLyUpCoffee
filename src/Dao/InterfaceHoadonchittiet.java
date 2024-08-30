/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.HoaDonChiTiet;
import java.util.List;
import Model.SanPham;
/**
 *
 * @author HP
 */
public interface InterfaceHoadonchittiet {
    abstract public void insert(HoaDonChiTiet Entity);

    abstract public void update_TT(HoaDonChiTiet Entity);
    
    abstract public void update_SL(HoaDonChiTiet Entity);
    
    abstract public void update_LD(HoaDonChiTiet Entity);

    abstract public void delete(HoaDonChiTiet Entity);

    abstract public HoaDonChiTiet selectById(int idHD, String idMaSP);
    
    abstract public List<HoaDonChiTiet> selectByIdHD_TT1(int idHD, String idSP);
    
    abstract public List<HoaDonChiTiet> selectByIdHD_TT0(int idHD, String idSP);
    
    abstract public List<HoaDonChiTiet> selectAll();
    
    abstract public int selectCountdonHuy(int idhd);

    abstract public List<HoaDonChiTiet> selectBySql(String sql, Object... args);
    
    abstract public int selectCount(String sql, Object... args);
   
}
