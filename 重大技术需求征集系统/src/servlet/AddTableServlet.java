package servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TableDao;
import bean.Table;

@WebServlet("/AddTableServlet")
public class AddTableServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        
        String jgqc=request.getParameter("jgqc");
        String gkglbm=request.getParameter("gkglbm");
        String txdz=request.getParameter("txdz");
        String szdy=request.getParameter("szdy");
        String wz=request.getParameter("wz");
        String dzxx=request.getParameter("dzxx");
        String frdb=request.getParameter("frdb");
        String yzbm=request.getParameter("yzbm");
        String lxr=request.getParameter("lxr");
        String gddh=request.getParameter("gddh");
        String sj=request.getParameter("sj");
        String cz=request.getParameter("cz");
        String jgsx=request.getParameter("jgsx");
        String jgjj=request.getParameter("jgjj");
        String jsxqmc=request.getParameter("jsxqmc");
        String qsxqsx=request.getParameter("qsxqsx");
        String jzxqsx=request.getParameter("jzxqsx");
        String jsxqgs=request.getParameter("jsxqgs");
        String gjza=request.getParameter("gjza");
        String gjzb=request.getParameter("gjzb");
        String gjzc=request.getParameter("gjzc");
        String gjzd=request.getParameter("gjzd");
        String gjze=request.getParameter("gjze");
        String gjz=gjza+" "+gjzb+" "+gjzc+" "+gjzd+" "+gjze;
        String ntrjeze1=request.getParameter("ntrjeze");
        int ntrjeze=Integer.parseInt(ntrjeze1);
        String jsxqjjfs=request.getParameter("jsxqjjfs");
        String hzyxdw=request.getParameter("hzyxdw");
        String kjhdlx=request.getParameter("kjhdlx");
        String xkfl=request.getParameter("xkfl");
        String [] a = request.getParameterValues("xqjsssly");
        String xqjsssly=Arrays.toString(a);
        xqjsssly=xqjsssly.substring(1,xqjsssly.length()-1);
        String xqjsyyhy=request.getParameter("xqjsyyhy");
        String qtjs=request.getParameter("qtjs");
        String xssh="未审核";
        String bmsh="未审核"; 
        
        Table tbwork =new Table();
        tbwork.setJgqc(jgqc);
        tbwork.setGkglbm(gkglbm);
        tbwork.setTxdz(txdz);
        tbwork.setSzdy(szdy);
        tbwork.setWz(wz);
        tbwork.setDzxx(dzxx);
        tbwork.setFrdb(frdb);
        tbwork.setYzbm(yzbm);
        tbwork.setLxr(lxr);
        tbwork.setGddh(gddh);
        tbwork.setSj(sj);
        tbwork.setCz(cz);
        tbwork.setJgsx(jgsx);
        tbwork.setJgjj(jgjj);
        tbwork.setJsxqmc(jsxqmc);
        tbwork.setQsxqsx(qsxqsx);
        tbwork.setJzxqsx(jzxqsx);
        tbwork.setJsxqgs(jsxqgs);
        tbwork.setGjz(gjz);
        tbwork.setNtrjeze(ntrjeze);
        tbwork.setJsxqjjfs(jsxqjjfs);
        tbwork.setHzyxdw(hzyxdw);
        tbwork.setKjhdlx(kjhdlx);
        tbwork.setXkfl(xkfl);
        tbwork.setXqjsssly(xqjsssly);
        tbwork.setXqjsyyhy(xqjsyyhy);
        tbwork.setQtjs(qtjs);
        tbwork.setXssh(xssh);
        tbwork.setBmsh(bmsh);
        
        TableDao sd = new TableDao();
        try{
            sd.add(tbwork);
            response.sendRedirect(request.getContextPath() + "table/table.jsp");

        }catch(Exception e){
            System.out.println("添加失败");
            e.printStackTrace();
        }
        
    }


}