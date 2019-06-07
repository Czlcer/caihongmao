package com.caihongmao.dao;

import com.caihongmao.model.UserInfo;
import com.caihongmao.param.user.RegisteredUserParam;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RegisteredUserParam record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}