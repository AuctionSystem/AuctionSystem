package com.great.entity;

import org.springframework.stereotype.Component;

@Component
public class Tbrolepower {
    private Integer rolepowerid;

    private Integer roleid;

    private Integer powerid;

    public Integer getRolepowerid() {
        return rolepowerid;
    }

    public void setRolepowerid(Integer rolepowerid) {
        this.rolepowerid = rolepowerid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPowerid() {
        return powerid;
    }

    public void setPowerid(Integer powerid) {
        this.powerid = powerid;
    }
}