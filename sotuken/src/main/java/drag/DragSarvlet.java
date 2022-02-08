package drag;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import been.Drag;
import dao.DAO;

/**
 * Servlet implementation class DragSarvlet
 */
@WebServlet("/drag")
public class DragSarvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DragSarvlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//request.getRequestDispatcher("/WEB-INF/dcomplete.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		try {
			String state = request.getParameter("state");
			if (state.equals("drag")) {
				
				HttpSession session = request.getSession();
				String userid= (String)session.getAttribute("userid");
				/*userid = "111";
				
				if(userid==null) {
					System.out.println("null");
				}else {
					System.out.println(userid);
				}*/
				
				String kusurimei = request.getParameter("kusurimei");
				String zaigata = request.getParameter("zaigata");
				String itinitiryou = request.getParameter("itinitiryou");
				String youhou = request.getParameter("youhou");
				String zenryou = request.getParameter("zenryou");
				
				Drag p=new Drag();
				p.setUserid(userid);
				p.setKusurimei(kusurimei);
				p.setZaigata(zaigata);
				p.setItinitiryou(itinitiryou);
				p.setYouhou(youhou);
				p.setZenryou(zenryou);
				
				DAO dao = new DAO();
				int line = dao.insertDrag(p);
				
				if (line > 0 ) {
					System.out.println("実行成功");
					
					request.getRequestDispatcher("/WEB-INF/dcomplete.jsp").forward(request, response);//薬情報登録画面に遷移
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
