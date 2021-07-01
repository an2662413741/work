using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using DB;

namespace DZYWork
{
    public partial class AddCG : Form
    {
        public AddCG()
        {
            InitializeComponent();
        }

        private void bt_addcg_Click(object sender, EventArgs e)
        {
            String goodsid = tb_goodsid.Text;
            String goodsname = tb_goodsname.Text;
            String color = tb_color.Text;
            String size = tb_size.Text;
            String moneyin1 = tb_moneyin.Text;
            int moneyin = int.Parse(moneyin1);
            String cgpersion = tb_cgpersion.Text;
            String cgdate1 = tb_cgdate.Text;
            int cgdate = int.Parse(cgdate1);

            CGBean cg = new CGBean();
            cg.setGoodsid(goodsid);
            cg.setGoodsname(goodsname);
            cg.setColor(color);
            cg.setSize(size);
            cg.setMoneyin(moneyin);
            cg.setCgpersion(cgpersion);
            cg.setCgdate(cgdate);

            String str1 = DB.AddCG.addCG(cg);
            String str2 = DB.AddCG.addCK(cg);
            if (str1 == "添加成功！")
            {
                if (str2 == "添加成功！")
                {
                    MessageBox.Show("添加成功！");
                    this.Close();
                }else {
                    MessageBox.Show("仓库添加数据失败！");
                    this.Close();
                }
            }
            else
            {
                if (str2 == "添加成功！")
                {
                    MessageBox.Show("采购表添加失败！");
                    this.Close();
                }
                else
                {
                    MessageBox.Show("采购表、仓库添加数据失败！");
                    this.Close();
                }
            }
        }
    }
}
