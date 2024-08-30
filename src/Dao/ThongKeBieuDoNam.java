/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author sonlu
 */
public class ThongKeBieuDoNam {

    private Integer thang, soluong;

    public ThongKeBieuDoNam() {
    }

    public ThongKeBieuDoNam(Integer thang, Integer soluong) {
        this.thang = thang;
        this.soluong = soluong;
    }

    public Integer getThang() {
        return thang;
    }

    public void setThang(Integer thang) {
        this.thang = thang;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

}
