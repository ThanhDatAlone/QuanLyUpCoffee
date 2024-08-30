/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dao.DaoGiamGia;
import Model.GiamGia;

/**
 *
 * @author sonlu
 */
public class SerGiamGia {

    DaoGiamGia dao = new DaoGiamGia();

    public void insert(GiamGia gg) {
        dao.insert(gg);
    }

    public void update(GiamGia gg) {
        dao.update(gg);
    }

    public void delete(GiamGia gg) {
//        dao.delete(gg.getId_GiamGia());
    }
}
