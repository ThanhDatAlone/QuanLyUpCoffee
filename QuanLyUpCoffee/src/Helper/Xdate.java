/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Xdate {
    public static final SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    
    public static Date toDate(String date, String pattern){
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static String toString(Date date, String pattern){
        formater.applyPattern(pattern);
        return formater.format(date);
    }
    
    public static Date addDay(Date date, long days){
        date.setTime(date.getTime() + days *24 *60 *60 *1000);
        return date;
    }
    
    public static Date now(){
        return new Date();
    }
}
