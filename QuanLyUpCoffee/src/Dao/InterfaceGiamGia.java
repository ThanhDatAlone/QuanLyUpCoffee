/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.GiamGia;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface InterfaceGiamGia {
    abstract public void insert(GiamGia Entity);

    abstract public void update(GiamGia Entity);

    abstract public void delete(String id);
    
    abstract public GiamGia selectById(String id);
    
    abstract public GiamGia selectByIdSK(String SK);
    
    abstract public List<GiamGia> selectAll();

    abstract public List<GiamGia> selectBySql(String sql, Object... args);
}
