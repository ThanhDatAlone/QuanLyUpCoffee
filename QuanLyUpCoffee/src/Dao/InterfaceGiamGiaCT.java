
package Dao;

import Model.GiamGiaChiTiet;
import Model.LoaiSanPham;
import java.util.List;

/**
 *
 * @author top1z
 */
public interface InterfaceGiamGiaCT {
    abstract public void insert(GiamGiaChiTiet sale);
    abstract public void update(int phantramGiam,String idsanpham);
    abstract public void delete(String id);
    abstract public List<GiamGiaChiTiet> selectll();
    abstract public GiamGiaChiTiet selectID(int id, String idsanpham);
    abstract public List<GiamGiaChiTiet> selectBysql(String sql, Object...agrs);
}
