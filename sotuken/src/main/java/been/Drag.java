package been;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Drag
 */
@WebServlet("/Drag")
public class Drag extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String userid;
	private String kusurimei;
    private String zaigata;
    private String itinitiryou;
    private String youhou;
    private String zenryou;
    
    
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getKusurimei() {
		return kusurimei;
	}
	public void setKusurimei(String kusurimei) {
		this.kusurimei = kusurimei;
	}
	public String getZaigata() {
		return zaigata;
	}
	public void setZaigata(String zaigata) {
		this.zaigata = zaigata;
	}
	public String getItinitiryou() {
		return itinitiryou;
	}
	public void setItinitiryou(String itinitiryou) {
		this.itinitiryou = itinitiryou;
	}
	public String getYouhou() {
		return youhou;
	}
	public void setYouhou(String youhou) {
		this.youhou = youhou;
	}
	public String getZenryou() {
		return zenryou;
	}
	public void setZenryou(String zenryou) {
		this.zenryou = zenryou;
	}
    
    
}
