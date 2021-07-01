using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace DB
{
    class DBConn
    {
        public static MySqlConnection GetConn()
        {
            string connString = "server=localhost;database=vs_cs;uid=root;pwd=root";//数据连接字段
            MySqlConnection conn = new MySqlConnection(connString);//之前SQLServer的连接名是SqlConnection
            try
            {
                conn.Open();
            }
            catch (MySqlException ex)
            {
                Console.Write(ex.Message);
            }
            return conn;
        }
    }
}
