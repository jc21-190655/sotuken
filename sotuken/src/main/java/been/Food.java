package been;

import javax.servlet.annotation.WebServlet;


public class Food implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    
    private String userid;
    private String morning;
    private String noon;
    private String night;

	public String getMorning() {
		return morning;
	}
	public void setMorning(String morning) {
		this.morning = morning;
	}
	public String getNoon() {
		return noon;
	}
	public void setNoon(String noon) {
		this.noon = noon;
	}
	public String getNight() {
		return night;
	}
	public void setNight(String night) {
		this.night = night;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
}