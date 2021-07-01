package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import bean.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        
        String username=request.getParameter("username");
        String password=request.getParameter("password1");
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
        String joker = "普通用户";
        User Subject =new User();
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
        
        UserDao sd = new UserDao();
        try{
            sd.add(Subject);
            request.setAttribute("message", "注册成功");
        	request.getRequestDispatcher("/login.html").forward(request,response);
        }catch(Exception e){
            System.out.println("添加失败");
            e.printStackTrace();
        }
        
    }


}