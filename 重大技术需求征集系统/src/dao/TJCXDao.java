package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Table;
import util.DBUtil;

public class TJCXDao {
	
		public static List<Table> getAllBook(String name[],String value[],String flag1[],String flag2[],int n)
		{
			
			String sql="select wjid,jsxqmc,kjhdlx,xssh,bmsh from t_kjcg where";
			for(int i=0;i<n;i++)
			{
				if(flag2[i].equals("jingque"))
				{
					sql+=" "+name[i]+" ='"+value[i]+"'";
					if(i==n-1)
					{
						break;
					}
					else
					{
						if(flag1[i].equals("binghan"))
						{
							sql+=" and ";
						}
						else
						{
							sql+=" or";
						}
					}
					
				}
				else
				{
					sql+=" "+name[i]+" like'%"+value[i]+"%'";
					if(i==n-1)
					{
						break;
					}
					else
					{
						if(flag1[i].equals("binghan"))
						{
							sql+=" and ";
						}
						else
						{
							sql+=" or";
						}
					}
				}
			}
			
			System.out.println(sql);
			List<Table> list = new ArrayList<>();
			Connection conn = DBUtil.getConnection();
			Statement state = null;
			ResultSet rs = null;
			
			try
			{
				state = conn.createStatement();
				rs = state.executeQuery(sql);
				while(rs.next())
				{
					System.out.println(rs.getString(1));
					Table tb=new Table();
					tb.setWjid(rs.getInt(1));
					tb.setJsxqmc(rs.getString(2));
					tb.setKjhdlx(rs.getString(3));
					tb.setXssh(rs.getString(4));
					tb.setBmsh(rs.getString(5));
					list.add(tb);
				}
				rs.close();
				state.close();
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBUtil.close(rs, state, conn);
			}
			
			return list;

		}
	   
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static List getAllNameValue(String name[],String value[],String flag1[],String flag2[],int n)
		{
			List list=new ArrayList();
			Connection conn = DBUtil.getConnection();
			Statement state = null;
			ResultSet rs = null;
			String sql="select jzxqsx,count(*) from t_kjcg where";
			for(int i=0;i<n;i++)
			{
				if(flag2[i].equals("jingque"))
				{
					sql+=" "+name[i]+" ='"+value[i]+"'";
					if(i==n-1)
					{
						break;
					}
					else
					{
						if(flag1[i].equals("binghan"))
						{
							sql+=" and ";
						}
						else
						{
							sql+=" or";
						}
					}
					
				}
				else
				{
					sql+=" "+name[i]+" like'%"+value[i]+"%'";
					if(i==n-1)
					{
						break;
					}
					else
					{
						if(flag1[i].equals("binghan"))
						{
							sql+=" and ";
						}
						else
						{
							sql+=" or";
						}
					}
				}
			}
			try
			{
				sql +=" group by jzxqsx";
				System.out.println(sql);
				state = conn.createStatement();
				rs = state.executeQuery(sql);
				
				while(rs.next())
				{
					System.out.println(rs.getString(1));
					Map<String, Object> map = new HashMap<String, Object>();
			        map.put("name",rs.getString(1));
			        map.put("value",rs.getString(2));
			        list.add(map);
				}
				rs.close();
				state.close();
				conn.close();
			}
			catch(Exception e)
			{
				
			}
			
			return list;

		}

}
