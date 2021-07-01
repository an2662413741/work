package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.User;
import util.DBUtil;

public class UserDao {
	
	Connection conn=(Connection)DBUtil.getConnection();

	//登录
	public User login(User user) {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            con=DBUtil.getConnection();//1:获取数据库的连接
            //2:书写sql语句
            String sql="select * from t_user where username=? and password=? ";
            ps=con.prepareStatement(sql);//3：预编译
            //4：设置值
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            rs=ps.executeQuery();//5:执行sql语句
            if(rs.next()){
                User users=new User();
                //从数据库中获取值设置到实体类的setter方法中
                users.setId(rs.getInt("id"));
                users.setUsername(rs.getString("username"));
                users.setPassword(rs.getString("password"));
                users.setZzjgdm(rs.getString("zzjgdm"));
                users.setJoker(rs.getString("joker"));

                return users;
            }else{
                return null;
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    //注册
    public boolean add(User user) {
        
        boolean flag=false;
        
        try {
            String sql="insert into t_user(username,password,jgmc,zzjgdm,name,ssz,yzbm,sex,sheng,shi,zyfx,szhy,jycd,zc,txdz,sj,gddh,yx,qq,joker)"
                +" values('"+user.getUsername()
                +"','"+user.getPassword()
                +"','"+user.getJgmc()
                +"','"+user.getZzjgdm()
                +"','"+user.getName()
                +"','"+user.getSsz()
                +"','"+user.getYzbm()
                +"','"+user.getSex()
                +"','"+user.getSheng()
                +"','"+user.getShi()
                +"','"+user.getZyfx()
                +"','"+user.getSzhy()
                +"','"+user.getJycd()
                +"','"+user.getZc()
                +"','"+user.getTxdz()
                +"','"+user.getSj()
                +"','"+user.getGddh()
                +"','"+user.getYx()
                +"','"+user.getQq()
                +"','"+user.getJoker()+"')";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            int i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            if(i>0) {
                flag = true;
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return flag;    
    }
    
    public static boolean xgmm(String username,String password) {
		
    	Connection conn=(Connection)DBUtil.getConnection();
    	boolean flag=false;
        
        try {
            String sql="update t_user set password = '"+password+"' where username = '"+username+"'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            int i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            if(i>0) {
                flag = true;
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return flag; 
    	
    }
    
public static boolean changeMyMessageById(User user) {
		
		Connection conn = DBUtil.getConnection();
		boolean flag = false;
		try {
			String sql = "update t_user set username = '"+user.getUsername()
			+ "', jgmc = '"+user.getJgmc()
			+ "', zzjgdm = '"+user.getZzjgdm()
			+ "', name = '"+user.getName()
			+ "', ssz = '"+user.getSsz()
			+ "', yzbm = '"+user.getYzbm()
			+ "', sex = '"+user.getSex()
			+ "', sheng = '"+user.getSheng()
			+ "', shi = '"+user.getShi()
			+ "', zyfx = '"+user.getZyfx()
			+ "', szhy = '"+user.getSzhy()
			+ "', jycd = '"+user.getJycd()
			+ "', zc = '"+user.getZc()
			+ "', txdz = '"+user.getTxdz()
			+ "', sj = '"+user.getSj()
			+ "', gddh = '"+user.getGddh()
			+ "', yx = '"+user.getYx()
			+ "', qq = '"+user.getQq()
			+ "' where id = '"+user.getId()+"'";
	
			System.out.println(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
            int i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            if(i>0) {
                flag = true;
            }

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return flag;
	}

	
}
