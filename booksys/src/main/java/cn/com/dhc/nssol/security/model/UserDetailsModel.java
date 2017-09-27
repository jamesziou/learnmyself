package cn.com.dhc.nssol.security.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import cn.com.dhc.nssol.common.constants.BookSysConstants;
import cn.com.dhc.nssol.common.model.UserLoginInfoModel;
import cn.com.dhc.nssol.common.utils.BookSysUtils;

public class UserDetailsModel implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserLoginInfoModel userLoginInfo;

	public UserDetailsModel() {
	}

	public UserDetailsModel(UserLoginInfoModel userLoginInfo) {
		this.userLoginInfo = userLoginInfo;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		GrantedAuthority authority = null;
		for (String roleCOde : userLoginInfo.getRoleCodeList()) {
			authority = new SimpleGrantedAuthority(roleCOde);
			authorities.add(authority);
		}
		return authorities;
	}

	@Override
	public String getPassword() {
		return userLoginInfo.getPassword();
	}

	@Override
	public String getUsername() {
		return userLoginInfo.getUserCode();
	}

	/**
	 * 判断用户是否过期
	 */
	@Override
	public boolean isAccountNonExpired() {
		final String sysdate = BookSysUtils.getSystimeStr(true);
		final String startDate = BookSysUtils.changObj2Str(userLoginInfo.getStartDay());
		final String endDate = BookSysUtils.changObj2Str(userLoginInfo.getEndDay());
		if (sysdate.compareTo(startDate) >= 0 && sysdate.compareTo(endDate) <= 0) {
			return true;
		}
		return false;
	}

	/**
	 * 判断账户是否已经锁定
	 */
	@Override
	public boolean isAccountNonLocked() {
		if (BookSysConstants.FLG_ON.equals(userLoginInfo.getLockedFlg())) {
			return false;
		}
		return true;
	}

	/**
	 * 凭证是否过期
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	/**
	 * 是否可用
	 */
	@Override
	public boolean isEnabled() {
		if (BookSysConstants.FLG_ON.equals(userLoginInfo.getDelFlg())
				|| BookSysConstants.FLG_ON.equals(userLoginInfo.getCancelFlg())) {
			return false;
		}
		return true;
	}

}
