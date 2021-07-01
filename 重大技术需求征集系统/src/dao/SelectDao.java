package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Table;
import util.DBUtil;

public class SelectDao {
	
	public static List<Table> getTable(String yhf[],String name[],String value[],String jingmo[],int length) {
		
		System.out.println(Arrays.toString(yhf));
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(value));
		System.out.println(Arrays.toString(jingmo));
		
		String sql = "select * from t_table where ";
		
		if(yhf[0].equals("binghan")) {
			
			if(jingmo[0].equals("jingque")) {				
				sql +=name[0]+" = '"+value[0]+"'";
			}
			
			else if(jingmo[0].equals("mohu")) {				
				sql = sql + name[0]+" like '%"+value[0]+"%'";
			}
			System.out.println("1:"+sql);
		}
		
		if(yhf[0].equals("buhan")) {
			
			if(jingmo[0].equals("jingque")) {
				sql = sql + "not " + name[0]+" = '"+value[0]+"'";
			}
			
			else if(jingmo[0].equals("mohu")) {
				sql = sql + "not " + name[0]+" like '%"+value[0]+"%'";
			}
			System.out.println("2:"+sql);
		}								
		
		for(int i=1;i<length;i++) {
			
			if(yhf[i].equals("binghan")) {
				   
				if(jingmo[i].equals("jingque")) {
			        sql = sql + " and "+name[i]+" = '"+value[i]+"'";
		        }
				
				else if(jingmo[i].equals("mohu")) {
					sql = sql + " and "+name[i]+" like '%"+value[i]+"%'";
				}
				
				else if(jingmo[i].equals("null")) {
					break;
				}
				
				System.out.println("3:"+sql);
			}
			
			else if(yhf[i].equals("huohan")) {
				
				if(jingmo[i].equals("jingque")) {
			        sql = sql + " or "+name[i]+" = '"+value[i]+"'";
		        }
				
				else if(jingmo[i].equals("mohu")) {
					sql = sql + " or "+name[i]+" like '%"+value[i]+"%'";
				}
				
				else if(jingmo[i].equals("null")) {
					break;
				}
				
				System.out.println("4:"+sql);
				
			}
			
			else if(yhf[i].equals("buhan")) {
				
				if(jingmo[i].equals("jingque")) {
			        sql = sql + " not "+name[i]+" = '"+value[i]+"'";
		        }
				
				else if(jingmo[i].equals("mohu")) {
					sql = sql + " not "+name[i]+" like '%"+value[i]+"%'";
				}
				
				else if(jingmo[i].equals("null")) {
					break;
				}
				
				System.out.println("5:"+sql);
				
			}
			
		}

		System.out.println("6:"+sql);
		
		
		List<Table> list = new ArrayList<>();
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

				list.add(table);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, state, conn);
		}		
		return list;
	}

}
