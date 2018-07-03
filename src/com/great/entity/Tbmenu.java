package com.great.entity;

import org.springframework.stereotype.Component;

@Component
public class Tbmenu {
    private Integer menuid;

    private Integer menupid;

    private Object menuname;

    private Object menupath;

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getMenupid() {
        return menupid;
    }

    public void setMenupid(Integer menupid) {
        this.menupid = menupid;
    }

    public Object getMenuname() {
        return menuname;
    }

    public void setMenuname(Object menuname) {
        this.menuname = menuname;
    }

    public Object getMenupath() {
        return menupath;
    }

    public void setMenupath(Object menupath) {
        this.menupath = menupath;
    }
}