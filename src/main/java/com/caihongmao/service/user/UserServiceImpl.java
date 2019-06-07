package com.caihongmao.service.user;

import com.caihongmao.dao.UserInfoMapper;
import com.caihongmao.param.user.RegisteredUserParam;
import com.caihongmao.request.user.UserInfoRequest;
import com.caihongmao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    @Transactional
    public int registeredUser(UserInfoRequest param) {
        RegisteredUserParam userParam = param.backParam();
        if (userParam != null){
            this.userInfoMapper.insert(userParam);
        }
        return 0;
    }
}
