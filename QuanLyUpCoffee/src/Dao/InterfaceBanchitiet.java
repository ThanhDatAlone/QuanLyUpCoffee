/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.BanChiTiet;
import java.util.List;

/**
 *
 * @author HP
 */
public interface InterfaceBanchitiet {
    abstract public void insert(BanChiTiet Entity);

    abstract public void update(int idban,int idHoadon);

    abstract public void delete(int id);

    abstract public BanChiTiet selectById(int idban,int idHoadon);
    
    abstract public List<BanChiTiet> selectByIdHD(int idHoadon);
    
    abstract public List<BanChiTiet> selectByIdBan(int idban);
    
    abstract public List<BanChiTiet> selectAll();
    

    abstract public List<BanChiTiet> selectBySql(String sql, Object... args);
}
