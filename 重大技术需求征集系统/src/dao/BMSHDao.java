package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Table;
import util.DBUtil;

public class BMSHDao {
	
	public static List<Table> listtable() {
		String sql = "select * from t_table";
		List<Table> list2 = new ArrayList<>();
		Connection conn = DBUtil.getConnection();
		Statement state = null;
		ResultSet rs = null;
		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);			
			while (rs.next()) {
				
				Table table = new Table();
				
				int wjid = rs.getInt("wjid");
				String jsxqmc = rs.getString("jsxqmc");
				String jgqc = rs.getString("jgqc");
				String gkglbm = rs.getString("gkglbm");
				String szdy = rs.getString("szdy");
				String frdb = rs.getString("frdb");
				String lxr = rs.getString("lxr");
				String jgsx = rs.getString("jgsx");
				int ntrjeze = rs.getInt("ntrjeze");			
				String jsxqjjfs = rs.getString("jsxqjjfs");				
				String kjhdlx = rs.getString("kjhdlx");										
				String xkfl = rs.getString("xkfl");			
				String xqjsssly = rs.getString("xqjsssly");
				String xqjsyyhy = rs.getString("xqjsyyhy");
				String glcs = rs.getString("glcs");
				String xssh = rs.getString("xssh");
				String bmsh = rs.getString("bmsh");
				
				table.setWjid(wjid);
				table.setJsxqmc(jsxqmc);
				table.setJsxqjjfs(jsxqjjfs);
				table.setKjhdlx(kjhdlx);
				table.setGkglbm(gkglbm);
				table.setJgqc(jgqc);
				table.setLxr(lxr);
				table.setSzdy(szdy);
				table.setFrdb(frdb);
				table.setJgsx(jgsx);
				table.setNtrjeze(ntrjeze);
				table.setXkfl(xkfl);
				table.setXqjsssly(xqjsssly);
				table.setXqjsyyhy(xqjsyyhy);
				table.setGlcs(glcs);
				table.setXssh(xssh);
				table.setBmsh(bmsh);
				
				list2.add(table);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, state, conn);
		}	
		return list2;
	}
	
	public static List<Table> listmytable(String zzjgdm) {

		String sql = "select * from t_table where bmsh = '未审核' and glcs = '"+zzjgdm+"'";
		List<Table> list2 = new ArrayList<>();
		Connection conn = DBUtil.getConnection();
		Statement state = null;
		ResultSet rs = null;
		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);			
			while (rs.next()) {
				
				Table table = new Table();
				
				int wjid = rs.getInt("wjid");
				String jsxqmc = rs.getString("jsxqmc");
				String jgqc = rs.getString("jgqc");
				String gkglbm = rs.getString("gkglbm");
				String szdy = rs.getString("szdy");
				String frdb = rs.getString("frdb");
				String lxr = rs.getString("lxr");
				String jgsx = rs.getString("jgsx");
				int ntrjeze = rs.getInt("ntrjeze");			
				String jsxqjjfs = rs.getString("jsxqjjfs");				
				String kjhdlx = rs.getString("kjhdlx");										
				String xkfl = rs.getString("xkfl");			
				String xqjsssly = rs.getString("xqjsssly");
				String xqjsyyhy = rs.getString("xqjsyyhy");
				String glcs = rs.getString("glcs");
				String xssh = rs.getString("xssh");
				String bmsh = rs.getString("bmsh");
				
				table.setWjid(wjid);
				table.setJsxqmc(jsxqmc);
				table.setJsxqjjfs(jsxqjjfs);
				table.setKjhdlx(kjhdlx);
				table.setGkglbm(gkglbm);
				table.setJgqc(jgqc);
				table.setLxr(lxr);
				table.setSzdy(szdy);
				table.setFrdb(frdb);
				table.setJgsx(jgsx);
				table.setNtrjeze(ntrjeze);
				table.setXkfl(xkfl);
				table.setXqjsssly(xqjsssly);
				table.setXqjsyyhy(xqjsyyhy);
				table.setGlcs(glcs);
				table.setXssh(xssh);
				table.setBmsh(bmsh);
				
				list2.add(table);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, state, conn);
		}	
		return list2;
	}
	
public static boolean XSTheTableById(Table table) {
		
		Connection conn = DBUtil.getConnection();
		boolean flag = false;
		try {
			String sql = "update t_table set bmsh = '"+table.getBmsh()
			+ "', bmyj = '"+table.getBmyj()
			+ "' where wjid = '"+table.getWjid()+"'";
	
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
