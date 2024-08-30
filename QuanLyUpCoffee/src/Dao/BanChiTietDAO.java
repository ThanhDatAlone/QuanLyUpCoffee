
package Dao;

import Model.BanChiTiet;
import Helper.JDBCHeper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class BanChiTietDAO implements InterfaceBanchitiet{
    String INSERT_SQL = "INSERT dbo.BanChiTiet VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE dbo.BanChiTiet SET ID_Ban = ? WHERE ID_Hoadon = ?";
    String DELETE_SQL = "DELETE dbo.BanChiTiet WHERE ID_Ban = ?";
    String SELECT_ALL_SQL = "SELECT * FROM dbo.BanChiTiet WHERE Trangthai = 1";
    String SELECT_BY_ID_SQL = "select * from dbo.BanChiTiet where ID_Hoadon = ? AND ID_Ban = ?";
    String SELECT_BY_ID_HD = "SELECT * FROM dbo.BanChiTiet WHERE ID_Hoadon = ?";
    String SELECT_BY_ID_Ban = "SELECT * FROM dbo.HoaDon JOIN dbo.BanChiTiet ON BanChiTiet.ID_Hoadon = HoaDon.ID_Hoadon WHERE TTThanhtoan = 0 AND dbo.HoaDon.Trangthai = 1 AND  ID_Ban = ? ";
    String SELECT_ALL_BAN_GOP = "SELECT  HoaDon.ID_Hoadon FROM dbo.BanChiTiet JOIN dbo.HoaDon ON HoaDon.ID_Hoadon = BanChiTiet.ID_Hoadon\n" +
        "WHERE dbo.HoaDon.Trangthai = 1 AND dbo.HoaDon.TTThanhtoan = 0 GROUP BY  HoaDon.ID_Hoadon HAVING COUNT(BanChiTiet.ID_Hoadon) > 1\n" +
        "ORDER BY dbo.HoaDon.ID_Hoadon ASC";
    String SELECT_donchinh = "SELECT * FROM dbo.Ban JOIN dbo.BanChiTiet ON BanChiTiet.ID_Ban = Ban.ID_Ban \n" +
        "JOIN dbo.HoaDon ON HoaDon.ID_Hoadon = BanChiTiet.ID_Hoadon WHERE dbo.HoaDon.Trangthai = 1\n" +
        "AND dbo.HoaDon.TTThanhtoan = 0 AND Donchinh = 1 AND BanChiTiet.ID_Hoadon = ?";
    @Override
    public void insert(BanChiTiet Entity) {
        Helper.JDBCHeper.update(INSERT_SQL, Entity.getID_Ban(), Entity.getID_HoaDon(), Entity.getThoidiemCoNguoi(), Entity.isBanChinh());
    }

    @Override
    public void update(int idban,int idHoadon) {
        Helper.JDBCHeper.update(UPDATE_SQL, idban,idHoadon);
    }

    @Override
    public void delete(int id) {
        Helper.JDBCHeper.update(DELETE_SQL, id);
    }

    @Override
    public BanChiTiet selectById(int idban,int idHoadon) {
        List<BanChiTiet> list = this.selectBySql(SELECT_BY_ID_SQL, idHoadon,idban);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<BanChiTiet> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BanChiTiet> selectBySql(String sql, Object... args) {
        List<BanChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql, args);
            while (rs.next()) {
                BanChiTiet Entity = new BanChiTiet();
                Entity.setID_Ban(rs.getInt("ID_Ban"));
                Entity.setID_HoaDon(rs.getInt("ID_Hoadon"));
                Entity.setThoidiemCoNguoi(rs.getTime("Thoidiemconguoi"));
                Entity.setBanChinh(rs.getBoolean("Donchinh"));
                System.out.println(rs.getTime("Thoidiemconguoi"));
                list.add(Entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<BanChiTiet> selectByIdBan(int idban) {
        return selectBySql(SELECT_BY_ID_Ban, idban);
    }

    @Override
    public List<BanChiTiet> selectByIdHD(int idHoadon) {
        return selectBySql(SELECT_BY_ID_HD, idHoadon);
    }

    public List<Integer> selectallbangop(){
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(SELECT_ALL_BAN_GOP);
            while (rs.next()) {
                list.add(rs.getInt("ID_Hoadon"));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public BanChiTiet selectBydonchinh(int id) {
        List<BanChiTiet> list = this.selectBySql(SELECT_donchinh, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
