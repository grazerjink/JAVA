/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_csdl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author graze
 */
public class sqlConnet {

    private Connection conn;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    Statement st;
    public ResultSet rs;

    final String className = "com.mysql.jdbc.Driver";

    public boolean getConnect() {
        try {
            String url = "jdbc:mysql://localhost:3306/qlsanpham2";
            Class.forName(className);
            conn = DriverManager.getConnection(url, "root", "");
            return true;
        } catch (ClassNotFoundException ex) {
            System.out.println("Không tìm thấy được nơi kết nối ...");
        } catch (SQLException ex) {
            System.out.println("Kết nối không thành công, vui lòng kiểm tra lại !");
        }
        return false;
    }
}
