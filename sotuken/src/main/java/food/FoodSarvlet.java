package food;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String state = request.getParameter("state");
		if (state.equals("food")) {
			request.getRequestDispatcher("/WEB-INF/fcomplete.jsp").forward(request, response);//薬情報登録画面に遷移
		} else if (state.equals("toppage")) {
			request.getRequestDispatcher("/WEB-INF/top.jsp").forward(request, response);//食事時間登録画面に遷移
		}
	}

}
