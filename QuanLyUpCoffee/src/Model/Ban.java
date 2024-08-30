
package Model;

import java.util.Date;

public class Ban {
    private int idBan;
    private boolean trangThai;
    private boolean hoatDong;
    private int soluongcho;
    
    public Ban() {
    }

    public Ban(int idBan, boolean trangThai, boolean hoatDong, int soluongcho) {
        this.idBan = idBan;
        this.trangThai = trangThai;
        this.hoatDong = hoatDong;
        this.soluongcho = soluongcho;
    }

    

    public int getIdBan() {
        return idBan;
    }

    public void setIdBan(int idBan) {
        this.idBan = idBan;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public boolean isHoatDong() {
        return hoatDong;
    }

    public void setHoatDong(boolean hoatDong) {
        this.hoatDong = hoatDong;
    }

    public int getSoluongcho() {
        return soluongcho;
    }

    public void setSoluongcho(int soluongcho) {
        this.soluongcho = soluongcho;
    }

 
    @Override
    public String toString() {
        return "Bàn:"+ idBan + " ("+soluongcho+")";
    }
    
}
