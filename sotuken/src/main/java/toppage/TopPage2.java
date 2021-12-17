package toppage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TopPage2
 */
@WebServlet("/toppage2")
public class TopPage2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TopPage2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String state = request.getParameter("state");
		if (state.equals("drag")) {
			request.getRequestDispatcher("/WEB-INF/drag.jsp").forward(request, response);//薬情報登録画面に遷移
		} else if (state.equals("food")) {
			request.getRequestDispatcher("/WEB-INF/food.jsp").forward(request, response);//食事時間登録画面に遷移
		} else if(state.equals("mypage")) {
			request.getRequestDispatcher("/WEB-INF/mypage.jsp").forward(request, response);//マイページ画面に遷移
		}else if(state.equals("logout")) {
			//request.getRequestDispatcher("/WEB-INF/mypage.jsp").forward(request, response);//ログアウト処理をする
		}

	}

}
