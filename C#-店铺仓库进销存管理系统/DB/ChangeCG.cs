using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace DB
{
    public class ChangeCG
    {
        //修改采购表
        public static void changeCG(CGBean cg)
        {
            MySqlConnection conn = null;
            try
            {
                //获取连接的conn
                conn = DBConn.GetConn();
                string sql = "update cggoods set goodsname='" + cg.getGoodsname()
                    + "', goodsid = '"+ cg.getGoodsid()
                    + "', size = '" + cg.getSize()
                    + "', color = '" + cg.getColor()
                    + "', moneyin = '" + cg.getMoneyin()
                    + "', cgpersion = '" + cg.getCgpersion()
                    + "', cgdate = '" + cg.getCgdate()
                    + "' where id='" + cg.getId() + "'";
                MySqlCommand cmd = new MySqlCommand(sql, conn);
                int result = cmd.ExecuteNonQuery();//返回值受数据库中数据的行数影响
                if (result != 0)
                {
                }
                Console.WriteLine("更新完成");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.ToString());
            }
            conn.Close();//关闭连接
        }
    }
}
