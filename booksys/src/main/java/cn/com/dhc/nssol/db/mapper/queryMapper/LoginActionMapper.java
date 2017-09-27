package cn.com.dhc.nssol.db.mapper.queryMapper;

import cn.com.dhc.nssol.db.model.UserAuthorityInfo;

public interface LoginActionMapper {

	UserAuthorityInfo selectUserByUserId(String username);
}
