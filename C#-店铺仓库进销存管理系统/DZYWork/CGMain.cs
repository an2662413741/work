using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DZYWork
{
    public partial class CGMain : Form
    {
        public CGMain()
        {
            InitializeComponent();
        }

        private void CGMain_Load(object sender, EventArgs e)
        {
            //this.FormBorderStyle = FormBorderStyle.None;     //设置窗体为无边框样式
            this.WindowState = FormWindowState.Maximized;    //最大化窗体 
        }

        //在cgpanel中打开指定窗体，调用该方法时，只需传入一个窗体对象即可
        private void OpenForm(Form frm)
        {

            frm.TopLevel = false;//取消非顶级窗体
            frm.WindowState = FormWindowState.Maximized;//将窗体最大化
            frm.FormBorderStyle = FormBorderStyle.None;//设为无边框
            frm.Parent = cgpanel;//指定该窗体的父窗体
            frm.Show();//展示窗体
        }

        //打开添加采购页面
        private void bt_addcg_Click(object sender, EventArgs e)
        {
            AddCG addcg = new AddCG();
            OpenForm(addcg);
        }

        //打开所有采购页面
        private void bt_listcg_Click(object sender, EventArgs e)
        {
            AllCG allcg = new AllCG();
            OpenForm(allcg);
        }

    }
}
