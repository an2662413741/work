package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;

@WebServlet("/XGMMServlet")
public class XGMMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public XGMMServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        
		HttpSession session=request.getSession();
		String username = (String)session.getAttribute("username");
        String password = request.getParameter("password");        
        
        try{
            UserDao.xgmm(username,password);
            request.setAttribute("message", "修改成功");
        	request.getRequestDispatcher("/templete/xgmm.jsp").forward(request,response);
        }catch(Exception e){
            System.out.println("修改失败");
            e.printStackTrace();
        }
              
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
