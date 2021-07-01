using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DB
{
    public class CGBean
    {

        int id;
        String goodsname;
        String goodsid;
        String size;
        int cgdate;
        String cgpersion;
        String color;
        int moneyin;

        public int getId()
        {
            return id;
        }
        public void setId(int id)
        {
            this.id = id;
        }
        public String getGoodsname()
        {
            return goodsname;
        }
        public void setGoodsname(String goodsname)
        {
            this.goodsname = goodsname;
        }
        public String getGoodsid()
        {
            return goodsid;
        }
        public void setGoodsid(String goodsid)
        {
            this.goodsid = goodsid;
        }
        public String getSize()
        {
            return size;
        }
        public void setSize(String size)
        {
            this.size = size;
        }
        public int getCgdate()
        {
            return cgdate;
        }
        public void setCgdate(int cgdate)
        {
            this.cgdate = cgdate;
        }
        public String getCgpersion()
        {
            return cgpersion;
        }
        public void setCgpersion(String cgpersion)
        {
            this.cgpersion = cgpersion;
        }
        public String getColor()
        {
            return color;
        }
        public void setColor(String color)
        {
            this.color = color;
        }
        public int getMoneyin()
        {
            return moneyin;
        }
        public void setMoneyin(int moneyin)
        {
            this.moneyin = moneyin;
        }

    }
}
