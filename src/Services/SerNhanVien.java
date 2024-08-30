package Services;

import Dao.NhanVienDAO;
import Model.NhanVien;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.List;

public class SerNhanVien {

    NhanVienDAO dao = new NhanVienDAO();

  public void insert(NhanVien nv) {
    if (nv == null) {
        System.out.println("NhanVien khong  duoc null.");
        return;
    }
    
   
    if (nv.getId_Nhanvien() == null) {
        System.out.println("ID khong  duoc null.");
        return;
    }
    if (nv.getTenNV() == null) {
        System.out.println("Ten NV khong  duoc null.");
        return;
    }
    if (nv.getNgaysinh() == null) {
        System.out.println("ngay sinh khong  duoc null.");
        return;
    }
    if (nv.getDiaChi() == null) {
        System.out.println("dia chi khong  duoc null.");
        return;
    }
    if (nv.getEmail() == null) {
        System.out.println("Email khong  duoc null.");
        return;
    }
    if (nv.getSDT() == null) {
        System.out.println("sdt khong  duoc null.");
        return;
    }
    if (nv.getUserName() == null) {
        System.out.println("Username khong  duoc null.");
        return;
    }
    if (nv.getPass() == null) {
        System.out.println("Password khong  duoc null");
        return;
    }
    if (nv.getHinh() == null) {
        System.out.println("ảnh khong  duoc null");
        return;
    }
    
  
    dao.insert(nv);
}
    public List<NhanVien> list() {
        List<NhanVien> danhSachNhanVien = new ArrayList<>();

        danhSachNhanVien = dao.selectAll;
        if (danhSachNhanVien == null) {
            danhSachNhanVien = new ArrayList<>();
        }
        return danhSachNhanVien;
    }

  


    public void update(NhanVien nv) {
        dao.update(nv);
    }

    public void delete(NhanVien nv) {
        dao.delete(nv.getId_Nhanvien());
    }

    private boolean checkSame(JTextField txtMaNV) {
        if (dao.selectById(txtMaNV.getText()) == null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Trùng mã nhân viên");
            return false;
        }
    }

    private boolean checkSameAccount(JTextField txtTaikhoan) {
        if (dao.selectByAccount(txtTaikhoan.getText()) == null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Trùng tài khoản nhân viên");
            return false;
        }
    }
}
