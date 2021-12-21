package been;

import java.io.PrintWriter;

public class Webapp implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    
    private int user_no;
    private String name;
    private String age;
    private String sex;
    private String birthday;
    private String email;
    private int phone;
    private String passward;
    private String repassward;
    
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getRepassward() {
		return repassward;
	}
	public void setRepassward(String repassward) {
		this.repassward = repassward;
	}

}
