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
    public partial class AllCG : Form
    {
        public AllCG()
        {
            InitializeComponent();
        }

        private void AllCG_Load(object sender, EventArgs e)
        {
            dataGridView1.AllowUserToAddRows = false;
            show();
        }

        //查询
        private void bt_find_Click(object sender, EventArgs e)
        {
            string goodsname = "";
            goodsname = this.tb_goodsname.Text;
            this.dataGridView1.Rows.Clear();
            List<CGBean> listcg = DB.SelectCG.listCG(goodsname);

            foreach (var date in listcg)
            {
                int index = this.dataGridView1.Rows.Add();
                this.dataGridView1.Rows[index].Cells[0].Value = date.getId();
                this.dataGridView1.Rows[index].Cells[1].Value = date.getGoodsname();
                this.dataGridView1.Rows[index].Cells[2].Value = date.getGoodsid();
                this.dataGridView1.Rows[index].Cells[3].Value = date.getSize();
                this.dataGridView1.Rows[index].Cells[4].Value = date.getColor();
                this.dataGridView1.Rows[index].Cells[5].Value = date.getMoneyin();
                this.dataGridView1.Rows[index].Cells[6].Value = date.getCgpersion();
                this.dataGridView1.Rows[index].Cells[7].Value = date.getCgdate();
                this.dataGridView1.Rows[index].Cells[8].Value = "删除";
            }
        }

        //刷新表格
        public void show()
        {
            this.dataGridView1.Rows.Clear();
            List<CGBean> listcg = DB.SelectCG.listCG("");

            foreach (var date in listcg)
            {
                int index = this.dataGridView1.Rows.Add();
                this.dataGridView1.Rows[index].Cells[0].Value = date.getId();
                this.dataGridView1.Rows[index].Cells[1].Value = date.getGoodsname();
                this.dataGridView1.Rows[index].Cells[2].Value = date.getGoodsid();
                this.dataGridView1.Rows[index].Cells[3].Value = date.getSize();
                this.dataGridView1.Rows[index].Cells[4].Value = date.getColor();
                this.dataGridView1.Rows[index].Cells[5].Value = date.getMoneyin();
                this.dataGridView1.Rows[index].Cells[6].Value = date.getCgpersion();
                this.dataGridView1.Rows[index].Cells[7].Value = date.getCgdate();
                this.dataGridView1.Rows[index].Cells[8].Value = "删除";
            }
        }

        //删除采购单
        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (dataGridView1.Columns[e.ColumnIndex].Name == "delete")
            {
                int index = e.RowIndex;
                string id1 = this.dataGridView1.Rows[index].Cells[0].Value.ToString();
                int id = int.Parse(id1);
                DB.DeleteCG.deleteUser(id);
                MessageBox.Show("删除成功！");
                show();
            }      
        }

        //修改采购单
        private void dataGridView1_CellMouseDoubleClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            int index = e.RowIndex;
           
            CGBean cg = new CGBean();
            
            string id1 = this.dataGridView1.Rows[index].Cells[0].Value.ToString();
            string moneyin1 = this.dataGridView1.Rows[index].Cells[5].Value.ToString();
            string cgdate1 = this.dataGridView1.Rows[index].Cells[7].Value.ToString();
            int id = int.Parse(id1);
            int moneyin = int.Parse(moneyin1);
            int cgdate = int.Parse(cgdate1);
            
            cg.setId(id);
            cg.setGoodsname(this.dataGridView1.Rows[index].Cells[1].Value.ToString());
            cg.setGoodsid(this.dataGridView1.Rows[index].Cells[2].Value.ToString());
            cg.setSize(this.dataGridView1.Rows[index].Cells[3].Value.ToString());
            cg.setColor(this.dataGridView1.Rows[index].Cells[4].Value.ToString());
            cg.setMoneyin(moneyin);
            cg.setCgpersion(this.dataGridView1.Rows[index].Cells[6].Value.ToString());
            cg.setCgdate(cgdate);

            ChangeCG changecg = new ChangeCG(cg);
            
            if(changecg.ShowDialog() == DialogResult.OK){
                MessageBox.Show("修改成功！");
                show();
            }
        }

    }
}
