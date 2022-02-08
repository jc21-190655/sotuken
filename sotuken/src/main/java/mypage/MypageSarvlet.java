package mypage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mypage
 */
@WebServlet("/mypage")
public class MypageSarvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String state = request.getParameter("state");
		if (state.equals("mypage")) {
			
			request.getRequestDispatcher("/WEB-INF/mycomplete.jsp").forward(request, response);
		} else if (state.equals("toppage")) {
			request.getRequestDispatcher("/WEB-INF/top.jsp").forward(request, response);//食事時間登録画面に遷移
		}
		
	}

}
