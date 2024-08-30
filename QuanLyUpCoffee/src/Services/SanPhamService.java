/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;
import Model.SanPham;
import Dao.SanPhamDao;
/**
 *
 * @author Admin
 */
public class SanPhamService {
    SanPhamDao dao = new SanPhamDao();

    public void insert(SanPham sp) {
        dao.insert(sp);
    }

    public void update(SanPham sp) {
        dao.update(sp);
    }

    public void delete(SanPham sp) {
        dao.delete(sp.getId_sp());
    }
}
