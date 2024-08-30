/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class CheckNull {
    public static boolean Check(JTextField tf, String mss){
        if(tf.getText().equals("")){
            JOptionPane.showMessageDialog(null, mss);
            tf.setBackground(Color.yellow);
            tf.requestFocus();
            return true;
        }else{
            tf.setBackground(Color.white);
        }
        return false;
    }
}
