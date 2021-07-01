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
    public partial class ChangeCG : Form
    {

        int id;
        string goodsname;
        string goodsid;
        string size;
        string color;
        int moneyin;
        string cgpersion;
        int cgdate;

        public ChangeCG(CGBean cg)
        {
            InitializeComponent();
            id = cg.getId();
            goodsname = cg.getGoodsname();
            goodsid = cg.getGoodsid();
            size = cg.getSize();
            color = cg.getColor();
            moneyin = cg.getMoneyin();
            cgpersion = cg.getCgpersion();
            cgdate = cg.getCgdate();
        }

        private void ChangeCG_Load(object sender, EventArgs e)
        {
            string moneyin1 = moneyin.ToString();
            string cgdate1 = cgdate.ToString();
            tb_goodsid.Text = goodsid;
            tb_goodsname.Text = goodsname;
            tb_size.Text = size;
            tb_color.Text = color;
            tb_moneyin.Text = moneyin1;
            tb_cgpersion.Text = cgpersion;
            tb_cgdate.Text = cgdate1;
        }

        private void bt_changecg_Click(object sender, EventArgs e)
        {
            String goodsid2 = tb_goodsid.Text;
            String goodsname2 = tb_goodsname.Text;
            String color2 = tb_color.Text;
            String size2 = tb_size.Text;
            String moneyin3 = tb_moneyin.Text;
            int moneyin2 = int.Parse(moneyin3);
            String cgpersion2 = tb_cgpersion.Text;
            String cgdate3 = tb_cgdate.Text;
            int cgdate2 = int.Parse(cgdate3);

            CGBean cg1 = new CGBean();
            cg1.setId(id);
            cg1.setGoodsid(goodsid2);
            cg1.setGoodsname(goodsname2);
            cg1.setColor(color2);
            cg1.setSize(size2);
            cg1.setMoneyin(moneyin2);
            cg1.setCgpersion(cgpersion2);
            cg1.setCgdate(cgdate2);

            DB.ChangeCG.changeCG(cg1);
            this.DialogResult = DialogResult.OK;
            this.Close();
        }
    }
}
