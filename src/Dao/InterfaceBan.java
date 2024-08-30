/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Ban;
import java.util.List;

/**
 *
 * @author HP
 */
public interface InterfaceBan {
    abstract public void insert(Ban Entity);

    abstract public void update(Ban Entity);
    
    abstract public void updateTrangThai(int id);
    
    abstract public void updateHoatDong(int id);

    abstract public void deleteTRangThai(int id);
    
    abstract public void deleteHoatDong(int id);
    
    abstract public void delete(int id);

    abstract public Ban selectById(int id);
    
    abstract public List<Ban> selectByIdcheck(int id);
    
    abstract public List<Ban> selectAll();
    
    abstract public List<Ban> selectAll_banthuc();

    abstract public List<Ban> selectBySql(String sql, Object... args);
}
