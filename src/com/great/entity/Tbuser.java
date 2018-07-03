package com.great.entity;

import org.springframework.stereotype.Component;

@Component
public class Tbuser {
    private Short userid;

    private Short stateid;

    private Integer cityid;

    private Integer roleid;

    private Object username;

    private String userpwd;

    private Object sex;

    private Long phone;

    private Object address;

    public Short getUserid() {
        return userid;
    }

    public void setUserid(Short userid) {
        this.userid = userid;
    }

    public Short getStateid() {
        return stateid;
    }

    public void setStateid(Short stateid) {
        this.stateid = stateid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public Object getSex() {
        return sex;
    }

    public void setSex(Object sex) {
        this.sex = sex;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }
}