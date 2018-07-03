package com.great.entity;

import org.springframework.stereotype.Component;

@Component
public class Tblikegoods {
    private Integer userlikeid;

    private Short userid;

    private Short fristid;

    public Integer getUserlikeid() {
        return userlikeid;
    }

    public void setUserlikeid(Integer userlikeid) {
        this.userlikeid = userlikeid;
    }

    public Short getUserid() {
        return userid;
    }

    public void setUserid(Short userid) {
        this.userid = userid;
    }

    public Short getFristid() {
        return fristid;
    }

    public void setFristid(Short fristid) {
        this.fristid = fristid;
    }
}