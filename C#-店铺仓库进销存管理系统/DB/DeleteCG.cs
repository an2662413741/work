using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace DB
{
    public class DeleteCG
    {

        public static void deleteUser(int id)
        {
            MySqlConnection conn = null;
            try
            {
                //获取连接的conn
                conn = DBConn.GetConn();
                string sql = "delete from cggoods where id='" + id + "'";
                MySqlCommand cmd = new MySqlCommand(sql, conn);
                int result = cmd.ExecuteNonQuery();//返回值受数据库中数据的行数影响
                if (result != 0)
                {
                    Console.WriteLine("删除完成");
                }

            }
            catch (Exception e)
            {
                Console.WriteLine(e.ToString());
            }
            conn.Close();//关闭连接
        }

    }
}
