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
public interface InterfaceDonViSanPham {
    abstract public void insert(DonViSanPham dv);
    abstract public void update(DonViSanPham dv);
    abstract public void delete(String id);
    abstract public List<DonViSanPham> selectAll();
    abstract public DonViSanPham selectID(String id);
    abstract public List<DonViSanPham> selectBySQL(String sql, Object...agrs);
}
