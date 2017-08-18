package com.smartparking.car.manager.bean;

public class TUserToken {
    private Integer id;

    private Integer phoneNumber;

    private String autoLogin;

    private String pwdToken;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAutoLogin() {
        return autoLogin;
    }

    public void setAutoLogin(String autoLogin) {
        this.autoLogin = autoLogin == null ? null : autoLogin.trim();
    }

    public String getPwdToken() {
        return pwdToken;
    }

    public void setPwdToken(String pwdToken) {
        this.pwdToken = pwdToken == null ? null : pwdToken.trim();
    }
}