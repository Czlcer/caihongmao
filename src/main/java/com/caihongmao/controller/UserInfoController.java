package com.caihongmao.controller;

import com.caihongmao.request.user.UserInfoRequest;
import com.caihongmao.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registered",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,String> registeredUser(@RequestBody UserInfoRequest userInfo){
        String message = null;
        String code = null;
        Map result = new HashMap();
        this.userService.registeredUser(userInfo);
        if (userInfo != null){
            message = "请求成功";
            code = "0";
        }else {
            message = "请求失败";
            code = "1";
        }
        result.put("message",message);
        result.put("code",code);
        return result;
    }
}
