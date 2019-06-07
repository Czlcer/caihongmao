package com.caihongmao.service;

import com.caihongmao.request.user.UserInfoRequest;

public interface UserService {
    /**
     * 创建用户
     * @param param
     * @return
     */
  int registeredUser(UserInfoRequest param);
}
