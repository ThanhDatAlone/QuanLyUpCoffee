/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.sql.*;
public class JDBCHeper {
   static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
   static String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=UPCOFFEE";
   static String user ="sa";
   static String password ="123456";

//    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//    static String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=QUANLYCAPHEBANME";//kết nối db
//    static String user = "admin1";//tài khoản 
//    static String password = "12345";//mật khẩu
    
     static {
        try {
            Class.forName(driver);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement getStmt(String sql, Object... args) throws Exception {
        Connection con = DriverManager.getConnection(url, user, password);//kết nối
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = con.prepareCall(sql);//câu lệnh SQl là thủ tục
        } else {
            stmt = con.prepareStatement(sql);//câu lệnh sql select
        }

        for (int i = 0; i < args.length; i++) {//i = 0 suy ra câu truy vấn không có ?
            stmt.setObject(i + 1, args[i]);//đẩy dữ liệu vào dấu ?
        }
        return stmt;
    }

    public static ResultSet query(String sql, Object... args) throws Exception {
        PreparedStatement stmt = JDBCHeper.getStmt(sql, args);
        return stmt.executeQuery();//trả về rs "preparestatement có thể chạy executeQuery"
    }

    public static Object value(String sql, Object... args) {//trả về Mã mỗi bảng
        try {
            ResultSet rs = JDBCHeper.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }//nếu có dữ liệu sẽ không đóng rs nếu đóng không trả đc rs
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int update(String sql, Object... args) {
        try {
            PreparedStatement stmt = JDBCHeper.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
