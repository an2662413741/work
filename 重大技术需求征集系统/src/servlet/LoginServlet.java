package servlet;
 
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import dao.UserDao;
 

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	 
	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        this.doGet(request, response);
	    }

	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        
	        //获取login.jsp页面提交的账号和密码
	        String username=request.getParameter("user");
	        String password=request.getParameter("pwd");
	        //测试数据
	        System.out.println(username+" "+password);	        
	        User user=new User();
	        //获取login.jsp页面提交的账号和密码设置到实体类User中
	        user.setUsername(username);
	        user.setPassword(password);

	        //引入数据交互层
	        UserDao dao=new UserDao();
	        User us=dao.login(user);
	        
	        HttpSession session=request.getSession();
	        session.setAttribute("id", us.getId());
	        session.setAttribute("username",username); 
	        session.setAttribute("joker",us.getJoker());
	        session.setAttribute("zzjgdm",us.getZzjgdm());
	        System.out.println("session.id="+session.getAttribute("id"));
	        System.out.println("session.username="+session.getAttribute("username"));
	        System.out.println("session.zzjgdm="+session.getAttribute("zzjgdm"));
	        System.out.println("session.joker="+session.getAttribute("joker"));
	        
	        request.setAttribute("message","登陆成功");
	        RequestDispatcher rd=request.getRequestDispatcher("main.jsp");
			rd.forward(request,response);

	    }
}