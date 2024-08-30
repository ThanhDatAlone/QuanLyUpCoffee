/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class MsgBox {
    public static void alert(Component parent, String mess){
        JOptionPane.showMessageDialog(parent, mess,"Hệ thống quản lý Up Coffee", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean confirm(Component parent, String mess){
        int result = JOptionPane.showConfirmDialog(parent, mess,"Hệ thống quản lý Up Coffee",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
    public static String promt(Component parent, String mess){
        return JOptionPane.showInputDialog(parent,mess,"Hệ thống quản lý Up Coffe", JOptionPane.INFORMATION_MESSAGE);
    }
}
