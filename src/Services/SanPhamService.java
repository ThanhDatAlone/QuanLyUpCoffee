/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;
import Model.SanPham;
import Dao.SanPhamDao;

import java.util.List;

public class SanPhamService {
    SanPhamDao dao = new SanPhamDao();

    public void insert(SanPham sp) {
       if(sp.getId_sp() == null){
           System.out.println("không được để trống");
       }
       dao.insert(sp);
    }

    public void update(SanPham sp) {
        dao.update(sp);
    }

    public void delete(SanPham sp) {
        dao.delete(sp.getId_sp());
    }


}
