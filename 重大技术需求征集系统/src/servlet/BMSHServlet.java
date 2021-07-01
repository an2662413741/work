package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Table;
import dao.AdminDao;
import dao.BMSHDao;

@WebServlet("/BMSHServlet")
public class BMSHServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BMSHServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
		if ("BSAllTable".equals(method)) {
			BSAllTable(request, response);
		}
		else if ("BSTheTableById".equals(method)) {
			BSTheTableById(request, response);
		}
		else if ("BSTheTable".equals(method)) {
			BSTheTable(request, response);
		}
		else if ("BSMyTable".equals(method)) {
			BSMyTable(request, response);
		}
		
	}
    
    private void BSAllTable(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		List<Table> table = BMSHDao.listtable();
		request.setAttribute("table", table);
		request.getRequestDispatcher("shenhe/bsalltable.jsp").forward(request,response);
	}
    
    private void BSMyTable(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String zzjgdm = (String) session.getAttribute("zzjgdm");
		System.out.println("BSMyTable:glcs="+zzjgdm);
		List<Table> table = BMSHDao.listmytable(zzjgdm);
		request.setAttribute("table", table);
		request.getRequestDispatcher("shenhe/bsalltable.jsp").forward(request,response);
	}
    
    private void BSTheTableById(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		Table table = AdminDao.getTheTableById(id);
		request.setAttribute("table", table);
		request.getRequestDispatcher("shenhe/bsthetable.jsp").forward(request,response);
	}
    
    private void BSTheTable(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String wjid1=request.getParameter("wjid");
		int wjid=Integer.parseInt(wjid1);
		String bmsh=request.getParameter("bmsh");
		String bmyj=request.getParameter("bmyj");
		
		Table table = new Table();
		table.setWjid(wjid);
		table.setBmsh(bmsh);
		table.setBmyj(bmyj);
		
		try{
        	BMSHDao.XSTheTableById(table);  
        	request.setAttribute("message", "修改成功");
        	request.getRequestDispatcher("BMSHServlet?method=BSMyTable").forward(request,response);

        }catch(Exception e){
            System.out.println("保存失败");
            e.printStackTrace();
        }
	}

}
