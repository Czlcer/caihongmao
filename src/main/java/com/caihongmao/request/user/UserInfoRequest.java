package com.caihongmao.request.user;

import com.caihongmao.param.user.RegisteredUserParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class UserInfoRequest implements Serializable {
    @ApiModelProperty(name = "账号")
    private String account;
    @ApiModelProperty(name = "用户名")
    private String userName;
    @ApiModelProperty(name = "密码")
    private String password;
    @ApiModelProperty(name = "邮箱")
    private String eMail;
    @ApiModelProperty(name = "UUID")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public RegisteredUserParam backParam(){
        RegisteredUserParam param = new RegisteredUserParam();
        param.setAccount(account);
        param.seteMail(eMail);
        param.setName(userName);
        param.setPassword(password);
        param.setUserId(userId);
        return param;
    }
}
