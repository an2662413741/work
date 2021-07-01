package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Power;
import bean.Table;
import bean.User;
import util.DBUtil;

public class AdminDao {
	
	public static List<User> listuser() {
		String sql = "select * from t_user";
		List<User> list = new ArrayList<>();
		Connection conn = DBUtil.getConnection();
		Statement state = null;
		ResultSet rs = null;
		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);			
			while (rs.next()) {
				User user = new User();
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				String jgmc = rs.getString("jgmc");
				String joker = rs.getString("joker");
				
				user.setId(id);
				user.setUsername(username);
				user.setName(name);
				user.setSex(sex);
				user.setJgmc(jgmc);
				user.setJoker(joker);
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, state, conn);
		}	
		return list;
	}
	
	public static List<Power> listpower() {
		String sql = "select * from t_power";
		List<Power> list = new ArrayList<>();
		Connection conn = DBUtil.getConnection();
		Statement state = null;
		ResultSet rs = null;
		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);			
			while (rs.next()) {
				Power power = new Power();

				String joker = rs.getString("joker");
				int xqzj_qx = rs.getInt("xqzj_qx");
				int xqgl_qx = rs.getInt("xqgl_qx");
				int yhxx_qx = rs.getInt("yhxx_qx");
				int xgmm_qx = rs.getInt("xgmm_qx");
				int xssh_qx = rs.getInt("xssh_qx");
				int bmsh_qx = rs.getInt("bmsh_qx");
				int tjxq_qx = rs.getInt("tjxq_qx");
				
				power.setJoker(joker);
				power.setXqzj_qx(xqzj_qx);
				power.setXqgl_qx(xqgl_qx);
				power.setYhxx_qx(yhxx_qx);
				power.setXgmm_qx(xgmm_qx);
				power.setXssh_qx(xssh_qx);
				power.setBmsh_qx(bmsh_qx);
				power.setTjxq_qx(tjxq_qx);
				list.add(power);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, state, conn);
		}	
		return list;
	}
	
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
	
	public static Table getTheTableById(int id) {
		String sql = "select * from t_table where wjid ="+id;
		Connection conn = DBUtil.getConnection();
		Statement state = null;
		ResultSet rs = null;
		Table table = new Table();
		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);			
			while (rs.next()) {
				
				int wjid = rs.getInt("wjid");
				String jsxqmc = rs.getString("jsxqmc");
				String jgqc = rs.getString("jgqc");
				String gkglbm = rs.getString("gkglbm");
				String txdz = rs.getString("txdz");
				String szdy = rs.getString("szdy");
				String wz = rs.getString("wz");
				String dzxx = rs.getString("dzxx");
				String frdb = rs.getString("frdb");
				String yzbm = rs.getString("yzbm");
				String lxr = rs.getString("lxr");
				String gddh = rs.getString("gddh");
				String sj = rs.getString("sj");
				String cz = rs.getString("cz");
				String jgsx = rs.getString("jgsx");
				String jgjj = rs.getString("jgjj");
				String qsxqsx = rs.getString("qsxqsx");
				String jzxqsx = rs.getString("jzxqsx");
				String jsxqgs = rs.getString("jsxqgs");
				String gjz = rs.getString("gjz");
				int ntrjeze = rs.getInt("ntrjeze");			
				String jsxqjjfs = rs.getString("jsxqjjfs");
				String hzyxdw = rs.getString("hzyxdw");
				String kjhdlx = rs.getString("kjhdlx");										
				String xkfl = rs.getString("xkfl");			
				String xqjsssly = rs.getString("xqjsssly");
				String xqjsyyhy = rs.getString("xqjsyyhy");
				String qtjs = rs.getString("qtjs");
				String glcs = rs.getString("glcs");
				String xssh = rs.getString("xssh");
				String bmsh = rs.getString("bmsh");
				String xsyj = rs.getString("xsyj");
				String bmyj = rs.getString("bmyj");
				
				table.setWjid(wjid);
				table.setJgqc(jgqc);
				table.setGkglbm(gkglbm);
				table.setTxdz(txdz);
				table.setSzdy(szdy);
				table.setWz(wz);
				table.setDzxx(dzxx);
				table.setFrdb(frdb);
				table.setYzbm(yzbm);
				table.setLxr(lxr);
				table.setGddh(gddh);
				table.setSj(sj);
				table.setCz(cz);
				table.setJgsx(jgsx);
				table.setJgjj(jgjj);
				table.setJsxqmc(jsxqmc);
				table.setQsxqsx(qsxqsx);
				table.setJzxqsx(jzxqsx);
				table.setJsxqgs(jsxqgs);
				table.setGjz(gjz);
				table.setNtrjeze(ntrjeze);
				table.setJsxqjjfs(jsxqjjfs);
				table.setHzyxdw(hzyxdw);
				table.setKjhdlx(kjhdlx);
				table.setXkfl(xkfl);
				table.setXqjsssly(xqjsssly);
				table.setXqjsyyhy(xqjsyyhy);
				table.setQtjs(qtjs);
				table.setXssh(xssh);
				table.setBmsh(bmsh);
				table.setGlcs(glcs);
				table.setXsyj(xsyj);
				table.setBmyj(bmyj);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, state, conn);
		}	
		return table;
	}
	
	public static User getTheUserById(int id1) {
		String sql = "select * from t_user where id ="+id1;
		Connection conn = DBUtil.getConnection();
		Statement state = null;
		ResultSet rs = null;
		User user = new User();
		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);			
			while (rs.next()) {
				
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String jgmc = rs.getString("jgmc");
				String zzjgdm = rs.getString("zzjgdm");
				String name = rs.getString("name");
				String ssz = rs.getString("ssz");
				String yzbm = rs.getString("yzbm");
				String sex = rs.getString("sex");
				String sheng = rs.getString("sheng");
				String shi = rs.getString("shi");
				String zyfx = rs.getString("zyfx");
				String szhy = rs.getString("szhy");
				String jycd = rs.getString("jycd");
				String zc = rs.getString("zc");
				String txdz = rs.getString("txdz");
				String sj = rs.getString("sj");
				String gddh = rs.getString("gddh");
				String yx = rs.getString("yx");
				String qq = rs.getString("qq");		
				String joker = rs.getString("joker");
				
				user.setId(id);
				user.setUsername(username);
				user.setPassword(password);
				user.setJgmc(jgmc);
				user.setZzjgdm(zzjgdm);
				user.setName(name);
				user.setSsz(ssz);
				user.setYzbm(yzbm);
				user.setSex(sex);
				user.setSheng(sheng);
				user.setShi(shi);
				user.setZyfx(zyfx);
				user.setSzhy(szhy);
				user.setJycd(jycd);
				user.setZc(zc);
				user.setTxdz(txdz);
				user.setSj(sj);
				user.setGddh(gddh);
				user.setYx(yx);
				user.setQq(qq);
				user.setJoker(joker);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, state, conn);
		}	
		return user;
	}
	
	public static boolean changeTheTableById(Table table) {
		
		Connection conn = DBUtil.getConnection();
		boolean flag = false;
		try {
			String sql = "update t_table set jgqc = '"+table.getJgqc()
			+ "', gkglbm = '"+table.getGkglbm()
			+ "', txdz = '"+table.getTxdz()
			+ "', szdy = '"+table.getSzdy()
			+ "', wz = '"+table.getWz()
			+ "', dzxx = '"+table.getDzxx()
			+ "', frdb = '"+table.getFrdb()
			+ "', yzbm = '"+table.getYzbm()
			+ "', lxr = '"+table.getLxr()
			+ "', gddh = '"+table.getGddh()
			+ "', sj = '"+table.getSj()
			+ "', cz = '"+table.getCz()
			+ "', jgsx = '"+table.getJgsx()
			+ "', jgjj = '"+table.getJgjj()
			+ "', jsxqmc = '"+table.getJsxqmc()
			+ "', qsxqsx = '"+table.getQsxqsx()
			+ "', jzxqsx = '"+table.getJzxqsx()
			+ "', jsxqgs = '"+table.getJsxqgs()
			+ "', gjz = '"+table.getGjz()
			+ "', ntrjeze = '"+table.getNtrjeze()
			+ "', jsxqjjfs = '"+table.getJsxqjjfs()
			+ "', hzyxdw = '"+table.getHzyxdw()
			+ "', kjhdlx = '"+table.getKjhdlx()
			+ "', xkfl = '"+table.getXkfl()
			+ "', xqjsssly = '"+table.getXqjsssly()
			+ "', xqjsyyhy = '"+table.getXqjsyyhy()
			+ "', qtjs = '"+table.getQtjs()
			+ "', xssh = '"+table.getXssh()
			+ "', xsyj = '"+table.getXsyj()
			+ "', glcs = '"+table.getGlcs()
			+ "', bmsh = '"+table.getBmsh()
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
	
public static boolean changeTheUserById(User user) {
		
		Connection conn = DBUtil.getConnection();
		boolean flag = false;
		try {
			String sql = "update t_user set username = '"+user.getUsername()
			+ "', password = '"+user.getPassword()
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
			+ "', joker = '"+user.getJoker()
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

	public static boolean deleteTheTableById (int id) {
		boolean f = false;
		String sql = "delete from t_table where wjid='" + id + "'";
		Connection conn = DBUtil.getConnection();
		Statement state = null;
		int a = 0;
		
		try {
			state = conn.createStatement();
			a = state.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(state, conn);
		}	
		if (a > 0) {
			f = true;
		}
		return f;
	}
	
	public static boolean deleteTheUserById (int id) {
		boolean f = false;
		String sql = "delete from t_user where id='" + id + "'";
		Connection conn = DBUtil.getConnection();
		Statement state = null;
		int a = 0;
		
		try {
			state = conn.createStatement();
			a = state.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(state, conn);
		}	
		if (a > 0) {
			f = true;
		}
		return f;
	}
	
	public static boolean changeTheJoker (String username,String joker) {
		boolean f = false;
		String sql = "update t_user set joker = '"+joker+"' where username='" + username + "'";
		Connection conn = DBUtil.getConnection();
		Statement state = null;
		int a = 0;
		
		try {
			state = conn.createStatement();
			a = state.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(state, conn);
		}	
		if (a > 0) {
			f = true;
		}
		return f;
	}
	
	public static Power getThePowerByJoker(String joker) {
		String sql = "select * from t_power where joker = '"+joker+"'";
		Power power = new Power();
		Connection conn = DBUtil.getConnection();
		Statement state = null;
		ResultSet rs = null;
		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);	
			while(rs.next()) {
				int xqzj_qx = rs.getInt("xqzj_qx");
				int xqgl_qx = rs.getInt("xqgl_qx");
				int yhxx_qx = rs.getInt("yhxx_qx");
				int xgmm_qx = rs.getInt("xgmm_qx");
				int xssh_qx = rs.getInt("xssh_qx");
				int bmsh_qx = rs.getInt("bmsh_qx");
				int tjxq_qx = rs.getInt("tjxq_qx");
					
				power.setJoker(joker);
				power.setXqzj_qx(xqzj_qx);
				power.setXqgl_qx(xqgl_qx);
				power.setYhxx_qx(yhxx_qx);
				power.setXgmm_qx(xgmm_qx);
				power.setXssh_qx(xssh_qx);
				power.setBmsh_qx(bmsh_qx);
				power.setTjxq_qx(tjxq_qx);
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, state, conn);
		}	
		return power;
	} 
	
	public static boolean changeThePower (String joker, int xqzj_qx, int xqgl_qx, int yhxx_qx, int xgmm_qx, int tjxq_qx, int xssh_qx, int bmsh_qx) {
		boolean f = false;
		String sql = "update t_power set xqzj_qx = '"+xqzj_qx
				+"', xqgl_qx = '"+xqgl_qx
				+"', yhxx_qx = '"+yhxx_qx
				+"', xgmm_qx = '"+xgmm_qx
				+"', tjxq_qx = '"+tjxq_qx
				+"', xssh_qx = '"+xssh_qx
				+"', bmsh_qx = '"+bmsh_qx
				+"' where joker='" + joker + "'";
		Connection conn = DBUtil.getConnection();
		Statement state = null;
		int a = 0;
		
		try {
			state = conn.createStatement();
			a = state.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(state, conn);
		}	
		if (a > 0) {
			f = true;
		}
		return f;
	}
	
}
