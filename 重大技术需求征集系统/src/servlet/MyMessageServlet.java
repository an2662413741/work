package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import dao.AdminDao;
import dao.UserDao;

@WebServlet("/MyMessageServlet")
public class MyMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyMessageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
		if ("getMyMessageById".equals(method)) {
			getMyMessageById(request, response);
		}
		else if ("changeMyMessageById".equals(method)) { 
			changeMyMessageById(request, response); 
		}
		else if ("changeMyMessage".equals(method)) { 
			changeMyMessage(request, response); 
		}
	}

	protected void getMyMessageById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int id = (int) session.getAttribute("id");
		User user = AdminDao.getTheUserById(id);
		request.setAttribute("user", user);
		request.getRequestDispatcher("user/mymessage.jsp").forward(request,response);
	}
	
	protected void changeMyMessageById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		// TODO Auto-generated method stub 
		HttpSession session = request.getSession(); 
		int id = (int) session.getAttribute("id"); 
		User user = AdminDao.getTheUserById(id);
		request.setAttribute("user", user);
		request.getRequestDispatcher("user/changemessage.jsp").forward(request,response); 
	}

	private void changeMyMessage(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		HttpSession session = request.getSession(); 
		int id = (int) session.getAttribute("id"); 
		String username=request.getParameter("username");
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
        
        User Subject =new User();
        Subject.setId(id);
        Subject.setUsername(username);
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
        
        try{
        	UserDao.changeMyMessageById(Subject);  
        	request.setAttribute("message", "修改成功");
        	request.getRequestDispatcher("MyMessageServlet?method=getMyMessageById").forward(request,response);

        }catch(Exception e){
            System.out.println("保存失败");
            e.printStackTrace();
        }

	}

	
}
