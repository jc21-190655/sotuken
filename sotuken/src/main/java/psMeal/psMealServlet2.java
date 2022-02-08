package psMeal;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import been.ImageBean;
import dao.DAO;

/**
 * Servlet implementation class psMealBgServlet
 */
@WebServlet("/psMeal")
@MultipartConfig(location = "")
public class psMealServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//multipart/form-dataで送信されたデータを取得
		try {
			Part part = request.getPart("image");
			InputStream inputStream = part.getInputStream();
			
			//InputStreamをByte配列に変換してDBに保存
			byte[] bt = convertInputStreamToArray(inputStream);
			
			HttpSession session = request.getSession();
			String userid= (String)session.getAttribute("userid");
			
			ImageBean p=new ImageBean();
			p.setUserid(userid);
			p.setImage(bt);
			
			DAO dao = new DAO();
			int line = dao.uploadImage(p);
			
			if (line > 0 ) {
				System.out.println("実行成功");
				request.getRequestDispatcher("/WEB-INF/ps_medicine.jsp").forward(request, response);
			} else {
				System.out.println("実行失敗");
				request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//InputStreamをByte配列にする
	public byte[] convertInputStreamToArray(InputStream inputStream) throws IOException {
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		int nRead;
		byte[] data = new byte[16777215];	
		while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
			buffer.write(data, 0, nRead);
		}
		return buffer.toByteArray();
	}

}
