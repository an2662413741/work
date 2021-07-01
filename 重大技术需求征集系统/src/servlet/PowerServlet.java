package servlet;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import bean.Power;
import dao.PowerDao;

@WebServlet("/PowerServlet")
public class PowerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PowerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session=request.getSession();
        String joker=(String) session.getAttribute("joker");
        System.out.println("PowerServlet:joker="+joker);
   
        Power power = PowerDao.getpower(joker); 
        
        System.out.println("PowerServlet:power.xqzj_qx="+power.getXqzj_qx());
        System.out.println("PowerServlet:power.xqgl_qx="+power.getXqgl_qx());
        System.out.println("PowerServlet:power.yhxx_qx="+power.getYhxx_qx());
        System.out.println("PowerServlet:power.xgmm_qx="+power.getXgmm_qx());
        System.out.println("PowerServlet:power.xssh_qx="+power.getXssh_qx());
        System.out.println("PowerServlet:power.bmsh_qx="+power.getBmsh_qx());
        System.out.println("PowerServlet:power.tjxq_qx="+power.getTjxq_qx());
        System.out.println("PowerServlet:power.power="+power.getPower());
        
        List<Power> list=new ArrayList<Power>();
        list.add(power);
        
        
        
        Gson gson = new Gson();
        String json = gson.toJson(list);
        try {

        	response.getWriter().println(json);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	response.getWriter().close();
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
