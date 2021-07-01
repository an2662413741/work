namespace DZYWork
{
    partial class CGMain
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
            this.panel1 = new System.Windows.Forms.Panel();
            this.bt_listcg = new System.Windows.Forms.Button();
            this.bt_addcg = new System.Windows.Forms.Button();
            this.cgpanel = new System.Windows.Forms.Panel();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.bt_listcg);
            this.panel1.Controls.Add(this.bt_addcg);
            this.panel1.Location = new System.Drawing.Point(6, 12);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(169, 506);
            this.panel1.TabIndex = 0;
            // 
            // bt_listcg
            // 
            this.bt_listcg.Font = new System.Drawing.Font("宋体", 12F);
            this.bt_listcg.Location = new System.Drawing.Point(28, 143);
            this.bt_listcg.Name = "bt_listcg";
            this.bt_listcg.Size = new System.Drawing.Size(123, 61);
            this.bt_listcg.TabIndex = 1;
            this.bt_listcg.Text = "所有采购单";
            this.bt_listcg.UseVisualStyleBackColor = true;
            this.bt_listcg.Click += new System.EventHandler(this.bt_listcg_Click);
            // 
            // bt_addcg
            // 
            this.bt_addcg.Font = new System.Drawing.Font("宋体", 12F);
            this.bt_addcg.Location = new System.Drawing.Point(28, 33);
            this.bt_addcg.Name = "bt_addcg";
            this.bt_addcg.Size = new System.Drawing.Size(123, 61);
            this.bt_addcg.TabIndex = 0;
            this.bt_addcg.Text = "添加采购单";
            this.bt_addcg.UseVisualStyleBackColor = true;
            this.bt_addcg.Click += new System.EventHandler(this.bt_addcg_Click);
            // 
            // cgpanel
            // 
            this.cgpanel.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.cgpanel.Location = new System.Drawing.Point(181, 12);
            this.cgpanel.Name = "cgpanel";
            this.cgpanel.Size = new System.Drawing.Size(859, 506);
            this.cgpanel.TabIndex = 1;
            // 
            // CGMain
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1048, 525);
            this.Controls.Add(this.cgpanel);
            this.Controls.Add(this.panel1);
            this.Name = "CGMain";
            this.Text = "CGMain";
            this.Load += new System.EventHandler(this.CGMain_Load);
            this.panel1.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button bt_addcg;
        private System.Windows.Forms.Button bt_listcg;
        private System.Windows.Forms.Panel cgpanel;
    }
}