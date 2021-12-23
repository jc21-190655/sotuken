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
	
	private String user_id;
    private String m_date;
    private String medichine_name;
    private String dosage_form;
    private String daily_dose;
    private String total_amount;
    
    public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String m_date) {
		this.m_date = m_date;
	}
	public String getMedichine_name() {
		return medichine_name;
	}
	public void setMedichine_name(String medichine_name) {
		this.medichine_name = medichine_name;
	}
	public String getDosage_form() {
		return dosage_form;
	}
	public void setDosage_form(String dosage_form) {
		this.dosage_form = dosage_form;
	}
	public String getDaily_dose() {
		return daily_dose;
	}
	public void setDaily_dose(String daily_dose) {
		this.daily_dose = daily_dose;
	}
	public String getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}


}
