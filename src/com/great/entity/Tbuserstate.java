package com.great.entity;

import org.springframework.stereotype.Component;

@Component
public class Tbuserstate {
    private Short userstateid;

    private Object userstate;

    public Short getUserstateid() {
        return userstateid;
    }

    public void setUserstateid(Short userstateid) {
        this.userstateid = userstateid;
    }

    public Object getUserstate() {
        return userstate;
    }

    public void setUserstate(Object userstate) {
        this.userstate = userstate;
    }
}