package com.caihongmao.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 修改文件测试
 */
@Controller
@RequestMapping("/user")
public class AdminController {

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ApiOperation(value = "test",notes = "test")
    public Map<String,String> login(){
        Map<String,String> result = new HashMap<>();
        result.put("name","aa");
        result.put("age","18");
        return result;
    }
}
