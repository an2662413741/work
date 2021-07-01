using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace DB
{
    public class AddCG
    {
        //增采购单
        public static string addCG(CGBean cg)
        {
            string str1 = "添加失败！";
            MySqlConnection conn = null;
            try
            {
                //获取连接的conn
                conn = DBConn.GetConn();
                String sql = "insert into cggoods(goodsid,goodsname,size,color,moneyin,cgpersion,cgdate) values('" + cg.getGoodsid() + "','" + cg.getGoodsname() + "','" + cg.getSize() + "','" + cg.getColor() + "','" + cg.getMoneyin() + "','" + cg.getCgpersion() + "','" + cg.getCgdate() + "')";
                MySqlCommand cmd = new MySqlCommand(sql, conn);
                int result = cmd.ExecuteNonQuery();//返回值受数据库中数据的行数影响
                if (result != 0)
                {
                    str1 = "添加成功！";
                }
                Console.WriteLine("数据插入完成！");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.ToString());
            }
            conn.Close();//关闭连接
            return str1;
        }

        //增仓库
        public static string addCK(CGBean cg)
        {
            string str2 = "添加失败！";
            MySqlConnection conn = null;
            try
            {
                //获取连接的conn
                conn = DBConn.GetConn();
                String sql = "insert into goods(goodsid,goodsname,size,color,moneyin,starttime,flag) values('" + cg.getGoodsid() + "','" + cg.getGoodsname() + "','" + cg.getSize() + "','" + cg.getColor() + "','" + cg.getMoneyin() + "','" + cg.getCgdate() + "','1')";
                MySqlCommand cmd = new MySqlCommand(sql, conn);
                int result = cmd.ExecuteNonQuery();//返回值受数据库中数据的行数影响
                if (result != 0)
                {
                    str2 = "添加成功！";
                }
                Console.WriteLine("数据插入完成！");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.ToString());
            }
            conn.Close();//关闭连接
            return str2;
        }
    }
}
