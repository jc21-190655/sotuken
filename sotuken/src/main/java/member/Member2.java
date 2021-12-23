package member;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import been.Webapp;
import dao.DAO;



/**
 * Servlet implementation class KaiintourokuSarvlet
 */
@WebServlet("/kaiintouroku")
public class Member2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Member2() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			String sex = request.getParameter("sex");
			String birthday = request.getParameter("birthday");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String userid = request.getParameter("userid");
			String password = request.getParameter("password");
			String repassword = request.getParameter("repassword");
			Webapp p = new Webapp();
			p.setName(name);
			p.setAge(age);
			p.setSex(sex);
			p.setBirthday(birthday);
			p.setEmail(email);
			p.setPhone(phone);
			p.setUserid(userid);
			p.setPassword(password);
			p.setRepassword(repassword);
			
			DAO dao = new DAO();
			int line = dao.insertMember(p);
			if (line > 0 ) {
				System.out.println("実行成功");
				request.getRequestDispatcher("/WEB-INF/mcomplete.jsp").forward(request, response);
			} else {
				System.out.println("実行失敗");
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
