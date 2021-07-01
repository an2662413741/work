package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SelectDao;
import bean.Table;

@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        
        String[] yhf;
        yhf=request.getParameterValues("yhf");
        String[] name;
        name=request.getParameterValues("name");
        String[] value;
        value=request.getParameterValues("value");
        String[] jingmo;
        jingmo=request.getParameterValues("jingmo");
        
        List<Table> table = SelectDao.getTable(yhf, name, value, jingmo, yhf.length);
               
        request.setAttribute("table", table);
		request.getRequestDispatcher("admin/alltable.jsp").forward(request,response);
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
