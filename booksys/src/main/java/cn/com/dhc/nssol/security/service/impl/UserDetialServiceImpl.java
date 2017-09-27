package cn.com.dhc.nssol.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cn.com.dhc.nssol.common.model.UserLoginInfoModel;
import cn.com.dhc.nssol.db.mapper.queryMapper.LoginActionMapper;
import cn.com.dhc.nssol.db.model.UserAuthorityInfo;
import cn.com.dhc.nssol.security.model.UserDetailsModel;

@Service
public class UserDetialServiceImpl implements UserDetailsService {

	@Autowired
	private LoginActionMapper loginActionMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserAuthorityInfo authorityInfo = loginActionMapper.selectUserByUserId(username);
		if (authorityInfo == null) {
			throw new UsernameNotFoundException("abc1234567890");
		}
		UserDetails dserDetails = new UserDetailsModel(createLoginInfo(authorityInfo));
		return dserDetails;
	}

	/**
	 * 验证用户信息做成
	 * 
	 * @param authorityInfo
	 *            用户信息
	 * @return 验证用户信息
	 */
	private UserLoginInfoModel createLoginInfo(UserAuthorityInfo authorityInfo) {
		UserLoginInfoModel userDetailsModel = new UserLoginInfoModel();
		userDetailsModel.setUserId(authorityInfo.getUserId());
		userDetailsModel.setUserCode(authorityInfo.getUserCode());
		userDetailsModel.setPassword(authorityInfo.getPassword());
		userDetailsModel.setName(authorityInfo.getName());
		userDetailsModel.setStartDay(authorityInfo.getStartDay());
		userDetailsModel.setEndDay(authorityInfo.getEndDay());
		userDetailsModel.setCancelFlg(authorityInfo.getCancelFlg());
		userDetailsModel.setLockedFlg(authorityInfo.getLockedFlg());
		userDetailsModel.setDelFlg(authorityInfo.getDelFlg());
		userDetailsModel.setRoleCodeList(authorityInfo.getRoleCodeList());
		return userDetailsModel;
	}
}
