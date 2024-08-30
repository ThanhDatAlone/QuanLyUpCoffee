/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;


import Model.SanPham;
import java.util.List;
/**
 *
 * @author Admin
 */

public interface InterfaceSanPham {
    
    abstract public void insert(SanPham sp);
    
    abstract public void update(SanPham sp);
    
    abstract public void delete(String id);
    
    abstract public List<SanPham> selectAll();
    
    abstract public SanPham selectID(String id);
    
    abstract public List<SanPham> selectBySQL(String sql, Object...args);
}
