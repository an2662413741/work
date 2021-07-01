package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Table;
import dao.AdminDao;
import dao.XSSHDao;

@WebServlet("/XSSHServlet")
public class XSSHServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public XSSHServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
		if ("XSAllTable".equals(method)) {
			XSAllTable(request, response);
		}
		else if ("XSTheTableById".equals(method)) {
			XSTheTableById(request, response);
		}
		else if ("XSTheTable".equals(method)) {
			XSTheTable(request, response);
		}
		else if ("XSMyTable".equals(method)) {
			XSMyTable(request, response);
		}
	}
    
    private void XSAllTable(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		List<Table> table = XSSHDao.listtable();
		request.setAttribute("table", table);
		request.getRequestDispatcher("shenhe/xsalltable.jsp").forward(request,response);
	}
    
    private void XSMyTable(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		List<Table> table = XSSHDao.listmytable();
		request.setAttribute("table", table);
		request.getRequestDispatcher("shenhe/xsalltable.jsp").forward(request,response);
	}
    
    private void XSTheTableById(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		Table table = AdminDao.getTheTableById(id);
		request.setAttribute("table", table);
		request.getRequestDispatcher("shenhe/xsthetable.jsp").forward(request,response);
	}
    
    private void XSTheTable(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String wjid1=request.getParameter("wjid");
		int wjid=Integer.parseInt(wjid1);
		String xssh=request.getParameter("xssh");
		String glcs=request.getParameter("glcs");
		String xsyj=request.getParameter("xsyj");
		
		Table table = new Table();
		table.setWjid(wjid);
		table.setXssh(xssh);
		table.setGlcs(glcs);
		table.setXsyj(xsyj);
		
		try{
        	XSSHDao.XSTheTableById(table);  
        	request.setAttribute("message", "修改成功");
        	request.getRequestDispatcher("XSSHServlet?method=XSMyTable").forward(request,response);

        }catch(Exception e){
            System.out.println("保存失败");
            e.printStackTrace();
        }
	}

}
