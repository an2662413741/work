package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.Table;
import util.DBUtil;

public class TableDao {
	
	Connection conn=(Connection)DBUtil.getConnection();
	
	//注册
    public boolean add(Table table) {
        
        boolean flag=false;
        
        try {
            String sql="insert into t_table(jgqc,gkglbm,txdz,szdy,wz,dzxx,frdb,yzbm,lxr,gddh,sj,cz,jgsx,jgjj,jsxqmc,qsxqsx,jzxqsx,jsxqgs,gjz,ntrjeze,jsxqjjfs,hzyxdw,kjhdlx,xkfl,xqjsssly,xqjsyyhy,qtjs,xssh,bmsh)"
                +" values('"+table.getJgqc()
                +"','"+table.getGkglbm()
                +"','"+table.getTxdz()
                +"','"+table.getSzdy()
                +"','"+table.getWz()
                +"','"+table.getDzxx()
                +"','"+table.getFrdb()
                +"','"+table.getYzbm()
                +"','"+table.getLxr()
                +"','"+table.getGddh()
                +"','"+table.getSj()
                +"','"+table.getCz()
                +"','"+table.getJgsx()
                +"','"+table.getJgjj()
                +"','"+table.getJsxqmc()
                +"','"+table.getQsxqsx()
                +"','"+table.getJzxqsx()
                +"','"+table.getJsxqgs()
                +"','"+table.getGjz()
                +"','"+table.getNtrjeze()
                +"','"+table.getJsxqjjfs()
                +"','"+table.getHzyxdw()
                +"','"+table.getKjhdlx()
                +"','"+table.getXkfl()
                +"','"+table.getXqjsssly()
                +"','"+table.getXqjsyyhy()
                +"','"+table.getQtjs()
                +"','"+table.getXssh()
                +"','"+table.getBmsh()
                +"')";
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

}
