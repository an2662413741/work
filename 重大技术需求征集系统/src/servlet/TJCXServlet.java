package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import bean.Table;
import dao.TJCXDao;;

@WebServlet("/TJCXServlet")
public class TJCXServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TJCXServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        System.out.println("111");
        String name[];
		String value[];
		String flag1[];
		String flag2[];
		name=request.getParameterValues("name");
		value=request.getParameterValues("value");
		flag1=request.getParameterValues("yhf");
		flag2=request.getParameterValues("jingmo");
		List<Table> tableall=TJCXDao.getAllBook(name, value, flag1, flag2, name.length);
		@SuppressWarnings("rawtypes")
		List list=TJCXDao.getAllNameValue(name, value, flag1, flag2, name.length);
	    request.setAttribute("mapDataJson", JSONArray.fromObject(list));
		java.util.Collections.reverse(tableall);
		request.setAttribute("tableall", tableall);
		request.getRequestDispatcher("tjcx/tjcx.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
