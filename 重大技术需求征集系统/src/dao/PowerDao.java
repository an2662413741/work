package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.Power;
import util.DBUtil;

public class PowerDao {
	
	public static Power getpower(String jkr) {
		
		String sql = "select * from t_power where joker = '"+jkr+"'";
		Power pwr = new Power();
		Connection conn = DBUtil.getConnection();
		Statement state = null;
		ResultSet rs = null;
		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);			
			while (rs.next()) {

				String joker = rs.getString("joker");
				int xqzj_qx = rs.getInt("xqzj_qx");
				int xqgl_qx = rs.getInt("xqgl_qx");
				int yhxx_qx = rs.getInt("yhxx_qx");
				int xgmm_qx = rs.getInt("xgmm_qx");
				int xssh_qx = rs.getInt("xssh_qx");
				int bmsh_qx = rs.getInt("bmsh_qx");
				int tjxq_qx = rs.getInt("tjxq_qx");
				int power = rs.getInt("power");
				
				pwr.setJoker(joker);
				pwr.setXqzj_qx(xqzj_qx);
				pwr.setXqgl_qx(xqgl_qx);
				pwr.setYhxx_qx(yhxx_qx);
				pwr.setXgmm_qx(xgmm_qx);
				pwr.setXssh_qx(xssh_qx);
				pwr.setBmsh_qx(bmsh_qx);
				pwr.setTjxq_qx(tjxq_qx);
				pwr.setPower(power);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, state, conn);
		}	
		return pwr;
	}

}
