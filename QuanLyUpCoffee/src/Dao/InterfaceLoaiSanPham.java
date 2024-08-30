/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;
import Model.*;
import java.util.List;
/**
 *
 * @author Admin
 */
public interface InterfaceLoaiSanPham {
    abstract public void insert(LoaiSanPham lsp);
    
    abstract public void update(LoaiSanPham lsp);
    
    abstract public void delete(String id);
    
    abstract public List<LoaiSanPham> selectAll();
    
    abstract public LoaiSanPham selectID(String id);
    
    abstract public List<LoaiSanPham> selectBySQL(String sql, Object...agrs);
}
