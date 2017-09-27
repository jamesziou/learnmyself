package cn.com.dhc.nssol.db.model;

import java.io.Serializable;
import java.util.List;

public class UserAuthorityInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userId;

	private String userCode;

	private String password;

	private String name;

	private String delFlg;

	private String cancelFlg;

	private String startDay;

	private String endDay;

	private String lockedFlg;

	private List<String> roleCodeList;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	public String getCancelFlg() {
		return cancelFlg;
	}

	public void setCancelFlg(String cancelFlg) {
		this.cancelFlg = cancelFlg;
	}

	public String getStartDay() {
		return startDay;
	}

	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

	public String getEndDay() {
		return endDay;
	}

	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

	public String getLockedFlg() {
		return lockedFlg;
	}

	public void setLockedFlg(String lockedFlg) {
		this.lockedFlg = lockedFlg;
	}

	public List<String> getRoleCodeList() {
		return roleCodeList;
	}

	public void setRoleCodeList(List<String> roleCodeList) {
		this.roleCodeList = roleCodeList;
	}
}
