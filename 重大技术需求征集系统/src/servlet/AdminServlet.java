package servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Power;
import bean.Table;
import bean.User;
import dao.AdminDao;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
		if ("getTheTableById".equals(method)) {
			getTheTableById(request, response);
		}
		else if ("changeTheTableById".equals(method)) {
			changeTheTableById(request, response);
		}
		else if ("changeTheTable".equals(method)) {
			changeTheTable(request, response);
		}
		else if ("deleteTheTableById".equals(method)) {
			deleteTheTableById(request, response);
		}
		else if ("getTheUserById".equals(method)) {
			getTheUserById(request, response);
		}
		else if ("changeTheUserById".equals(method)) {
			changeTheUserById(request, response);
		}
		else if ("changeTheUser".equals(method)) {
			changeTheUser(request, response);
		}
		else if ("deleteTheUserById".equals(method)) {
			deleteTheUserById(request, response);
		}
		else if ("changeTheJoker".equals(method)) {
			changeTheJoker(request, response);
		}
		else if ("changeThePowerByJoker".equals(method)) {
			changeThePowerByJoker(request, response);
		}
		else if ("changeThePower".equals(method)) {
			changeThePower(request, response);
		}
	}
	
	private void getTheTableById(final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		Table table = AdminDao.getTheTableById(id);
		request.setAttribute("table", table);
		request.getRequestDispatcher("table/thetable.jsp").forward(request,response);
	}
	
	private void changeTheTableById(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		Table table = AdminDao.getTheTableById(id);
		request.setAttribute("table", table);
		request.getRequestDispatcher("table/changetable.jsp").forward(request,response);
	}
	
	private void changeTheTable(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String wjid1=request.getParameter("wjid");
		int wjid=Integer.parseInt(wjid1);
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
        String xssh=request.getParameter("xssh");
		String glcs=request.getParameter("glcs");
		String xsyj=request.getParameter("xsyj");
		String bmsh=request.getParameter("bmsh");
		String bmyj=request.getParameter("bmyj");
        
        Table tbwork =new Table();
        tbwork.setWjid(wjid);
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
        tbwork.setXsyj(xsyj);
        tbwork.setGlcs(glcs);
        tbwork.setBmsh(bmsh);
        tbwork.setBmyj(bmyj);
        
        try{
        	AdminDao.changeTheTableById(tbwork);  
        	request.setAttribute("message", "修改成功");
        	request.getRequestDispatcher("AllTableServlet").forward(request,response);

        }catch(Exception e){
            System.out.println("保存失败");
            e.printStackTrace();
        }

	}
	
	private void getTheUserById(final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		User user = AdminDao.getTheUserById(id);
		request.setAttribute("user", user);
		request.getRequestDispatcher("user/theuser.jsp").forward(request,response);
	}
	
	private void changeTheUserById(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		User user = AdminDao.getTheUserById(id);
		request.setAttribute("user", user);
		request.getRequestDispatcher("user/changeuser.jsp").forward(request,response);
	}
	
	private void changeTheUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id1=request.getParameter("id");
		int id=Integer.parseInt(id1);
		String username=request.getParameter("username");
        String password=request.getParameter("password");
        String jgmc=request.getParameter("jgmc");
        String zzjgdm=request.getParameter("zzjgdm");
        String name=request.getParameter("name");
        String ssz=request.getParameter("ssz");
        String yzbm=request.getParameter("yzbm");
        String sex=request.getParameter("sex");
        String sheng=request.getParameter("sheng");
        String shi=request.getParameter("shi");
        String zyfx=request.getParameter("zyfx");
        String szhy=request.getParameter("szhy");
        String jycd=request.getParameter("jycd");
        String zc=request.getParameter("zc");
        String txdz=request.getParameter("txdz");
        String sj=request.getParameter("sj");
        String gddh=request.getParameter("gddh");
        String yx=request.getParameter("yx");
        String qq=request.getParameter("qq");
        String joker=request.getParameter("joker");
        
        User Subject =new User();
        Subject.setId(id);
        Subject.setUsername(username);
        Subject.setPassword(password);
        Subject.setJgmc(jgmc);
        Subject.setZzjgdm(zzjgdm);
        Subject.setName(name);
        Subject.setSsz(ssz);
        Subject.setYzbm(yzbm);
        Subject.setSex(sex);
        Subject.setSheng(sheng);
        Subject.setShi(shi);
        Subject.setZyfx(zyfx);
        Subject.setSzhy(szhy);
        Subject.setJycd(jycd);
        Subject.setZc(zc);
        Subject.setTxdz(txdz);
        Subject.setSj(sj);
        Subject.setGddh(gddh);
        Subject.setYx(yx);
        Subject.setQq(qq);
        Subject.setJoker(joker);
        
        try{
        	AdminDao.changeTheUserById(Subject);  
        	request.setAttribute("message", "修改成功");
        	request.getRequestDispatcher("AllUserServlet").forward(request,response);

        }catch(Exception e){
            System.out.println("保存失败");
            e.printStackTrace();
        }

	}

	private void deleteTheTableById(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		
		try{
			AdminDao.deleteTheTableById(id);
			request.setAttribute("message", "删除成功");
			request.getRequestDispatcher("AllTableServlet").forward(request,response);

        }catch(Exception e){
            System.out.println("删除失败");
            e.printStackTrace();
        }
	}
	
	private void deleteTheUserById(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		
		try{
			AdminDao.deleteTheUserById(id);
			request.setAttribute("message", "删除成功");
			request.getRequestDispatcher("AllUserServlet").forward(request,response);

        }catch(Exception e){
            System.out.println("删除失败");
            e.printStackTrace();
        }
	}
	
	private void changeTheJoker(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String joker = request.getParameter("joker");
	
		try{
			AdminDao.changeTheJoker(username,joker);
			request.setAttribute("message", "保存成功");
			request.getRequestDispatcher("AllJokerServlet").forward(request,response);

        }catch(Exception e){
            System.out.println("保存失败");
            e.printStackTrace();
        }
	}
	
	private void changeThePowerByJoker(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		
		String joker = request.getParameter("joker");	
		Power power = new Power();
	    power = AdminDao.getThePowerByJoker(joker);
	    
		request.setAttribute("power", power);
		request.getRequestDispatcher("admin/changepower.jsp").forward(request,response);

        
	}
	
	private void changeThePower(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		
		String joker = request.getParameter("joker");
		String xqzj_qx1 = request.getParameter("xqzj_qx");
		int xqzj_qx = Integer.parseInt(xqzj_qx1);
		String xqgl_qx1 = request.getParameter("xqgl_qx");
		int xqgl_qx = Integer.parseInt(xqgl_qx1);
		String yhxx_qx1 = request.getParameter("yhxx_qx");
		int yhxx_qx = Integer.parseInt(yhxx_qx1);
		String xgmm_qx1 = request.getParameter("xgmm_qx");
		int xgmm_qx = Integer.parseInt(xgmm_qx1);
		String tjxq_qx1 = request.getParameter("tjxq_qx");
		int tjxq_qx = Integer.parseInt(tjxq_qx1);
		String xssh_qx1 = request.getParameter("xssh_qx");
		int xssh_qx = Integer.parseInt(xssh_qx1);
		String bmsh_qx1 = request.getParameter("bmsh_qx");
		int bmsh_qx = Integer.parseInt(bmsh_qx1);
	
		try{
			AdminDao.changeThePower(joker,xqzj_qx,xqgl_qx,yhxx_qx,xgmm_qx,tjxq_qx,xssh_qx,bmsh_qx);
			request.setAttribute("message", "保存成功");
			request.getRequestDispatcher("AllPowerServlet").forward(request,response);

        }catch(Exception e){
            System.out.println("保存失败");
            e.printStackTrace();
        }
	}
	
}
