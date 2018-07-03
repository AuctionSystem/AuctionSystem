package com.great.entity;

import org.springframework.stereotype.Component;

@Component
public class Tbpower {
    private Integer powerid;

    private Integer menuid;

    private Object powername;

    public Integer getPowerid() {
        return powerid;
    }

    public void setPowerid(Integer powerid) {
        this.powerid = powerid;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Object getPowername() {
        return powername;
    }

    public void setPowername(Object powername) {
        this.powername = powername;
    }
}