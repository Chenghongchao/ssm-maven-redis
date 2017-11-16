package com.maven.web.service.impl;

import com.maven.web.entity.UserInfo;

public interface UserService {

	Integer insert(UserInfo userInfo);

	Integer delete(Long uid);

	UserInfo select(Long uid);

	/** 从缓存中获取 */
	UserInfo getUserInfo(Long uid);

}
