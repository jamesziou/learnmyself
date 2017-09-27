package cn.com.dhc.nssol.web.from;

import java.io.Serializable;

public class UserLoginForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5515664593292227822L;

	private String userId;

	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
