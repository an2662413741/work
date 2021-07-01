package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	public static final String connectionURL="jdbc:mysql://localhost:3306/three?useUnicode=true&characterEncoding=GB18030&useSSL=false&serverTimezone=GMT&allowPublicKeyRetrieval=true";
	    public static final String username="root";
	    public static final String psw="root";
	    static Connection connection;
	    static ResultSet rSet;
	    static PreparedStatement sql;
	    public static Connection getConnection()
	    {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("数据库连接成功");
	            return DriverManager.getConnection(connectionURL, username, psw);
	        } catch (Exception e) {
	            // TODO: handle exception
	            System.out.println("数据库连接失败");
	            e.printStackTrace();
	        }
	        return null;
	    }     
	     
	    public static void close(Statement state, Connection conn) {
	        if(state!=null) {
	            try {
	                state.close();
	            } catch (SQLException e) {
	                e.printStackTrace();    
	            }
	        }    
	        if(conn!=null) {
	            try {
	                conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    
	    public static void close(ResultSet rs, Statement state, Connection conn) {
	        if(rs!=null) {
	            try {
	                rs.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        if(state!=null) {
	            try {
	                state.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        if(conn!=null) {
	            try {
	                conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
    
}