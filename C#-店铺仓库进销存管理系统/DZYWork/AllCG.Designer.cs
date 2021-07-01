namespace DZYWork
{
    partial class AllCG
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.tb_goodsname = new System.Windows.Forms.TextBox();
            this.bt_find = new System.Windows.Forms.Button();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.ID = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.goodsname = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.goodsid = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.size = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.color = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.moneyin = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.cgpersion = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.cgdate = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.delete = new System.Windows.Forms.DataGridViewButtonColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // tb_goodsname
            // 
            this.tb_goodsname.Font = new System.Drawing.Font("宋体", 15F);
            this.tb_goodsname.Location = new System.Drawing.Point(35, 26);
            this.tb_goodsname.Name = "tb_goodsname";
            this.tb_goodsname.Size = new System.Drawing.Size(168, 36);
            this.tb_goodsname.TabIndex = 0;
            // 
            // bt_find
            // 
            this.bt_find.Font = new System.Drawing.Font("宋体", 12F);
            this.bt_find.Location = new System.Drawing.Point(220, 29);
            this.bt_find.Name = "bt_find";
            this.bt_find.Size = new System.Drawing.Size(106, 29);
            this.bt_find.TabIndex = 1;
            this.bt_find.Text = "查询";
            this.bt_find.UseVisualStyleBackColor = true;
            this.bt_find.Click += new System.EventHandler(this.bt_find_Click);
            // 
            // dataGridView1
            // 
            this.dataGridView1.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.dataGridView1.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.ID,
            this.goodsname,
            this.goodsid,
            this.size,
            this.color,
            this.moneyin,
            this.cgpersion,
            this.cgdate,
            this.delete});
            this.dataGridView1.Location = new System.Drawing.Point(12, 79);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 27;
            this.dataGridView1.Size = new System.Drawing.Size(1009, 500);
            this.dataGridView1.TabIndex = 2;
            this.dataGridView1.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            this.dataGridView1.CellMouseDoubleClick += new System.Windows.Forms.DataGridViewCellMouseEventHandler(this.dataGridView1_CellMouseDoubleClick);
            // 
            // ID
            // 
            this.ID.HeaderText = "ID";
            this.ID.Name = "ID";
            // 
            // goodsname
            // 
            this.goodsname.HeaderText = "商品名称";
            this.goodsname.Name = "goodsname";
            // 
            // goodsid
            // 
            this.goodsid.HeaderText = "商品编号";
            this.goodsid.Name = "goodsid";
            // 
            // size
            // 
            this.size.HeaderText = "商品尺寸";
            this.size.Name = "size";
            // 
            // color
            // 
            this.color.HeaderText = "商品颜色";
            this.color.Name = "color";
            // 
            // moneyin
            // 
            this.moneyin.HeaderText = "商品进价";
            this.moneyin.Name = "moneyin";
            // 
            // cgpersion
            // 
            this.cgpersion.HeaderText = "采购员";
            this.cgpersion.Name = "cgpersion";
            // 
            // cgdate
            // 
            this.cgdate.HeaderText = "采购日期";
            this.cgdate.Name = "cgdate";
            // 
            // delete
            // 
            this.delete.HeaderText = "删除";
            this.delete.Name = "delete";
            this.delete.Resizable = System.Windows.Forms.DataGridViewTriState.True;
            this.delete.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.Automatic;
            // 
            // AllCG
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1033, 591);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.bt_find);
            this.Controls.Add(this.tb_goodsname);
            this.Name = "AllCG";
            this.Text = "LIstCG";
            this.Load += new System.EventHandler(this.AllCG_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox tb_goodsname;
        private System.Windows.Forms.Button bt_find;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.DataGridViewTextBoxColumn ID;
        private System.Windows.Forms.DataGridViewTextBoxColumn goodsname;
        private System.Windows.Forms.DataGridViewTextBoxColumn goodsid;
        private System.Windows.Forms.DataGridViewTextBoxColumn size;
        private System.Windows.Forms.DataGridViewTextBoxColumn color;
        private System.Windows.Forms.DataGridViewTextBoxColumn moneyin;
        private System.Windows.Forms.DataGridViewTextBoxColumn cgpersion;
        private System.Windows.Forms.DataGridViewTextBoxColumn cgdate;
        private System.Windows.Forms.DataGridViewButtonColumn delete;
    }
}