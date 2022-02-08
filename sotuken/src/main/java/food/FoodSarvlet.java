package food;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import been.Food;
import dao.DAO;

/**
 * Servlet implementation class FoodSarvlet
 */
@WebServlet("/food")
public class FoodSarvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodSarvlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		try {
			String state = request.getParameter("state");
			if (state.equals("food")) {
				
				HttpSession session = request.getSession();
				String userid= (String)session.getAttribute("userid");
				
				String morning = request.getParameter("morning");
				String noon = request.getParameter("noon");
				String night = request.getParameter("night");
				
				Food p = new Food();
				p.setUserid(userid);
				p.setMorning(morning);
				p.setNoon(noon);
				p.setNight(night);
				
				DAO dao = new DAO();
				int line = dao.insertTime(p);
				
				if (line > 0 ) {
					System.out.println("実行成功");
					
					request.getRequestDispatcher("/WEB-INF/fcomplete.jsp").forward(request, response);//薬情報登録画面に遷移
				} else {
					System.out.println("実行失敗");
					request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
				}
				
				
				
				
			} else if (state.equals("toppage")) {
				
				request.getRequestDispatcher("/WEB-INF/top.jsp").forward(request, response);//食事時間登録画面に遷移
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
