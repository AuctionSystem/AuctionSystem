package com.great.entity;

import org.springframework.stereotype.Component;

@Component
public class Tbcity {
    private Integer cityid;

    private Integer provinceid;

    private Object cityname;

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public Object getCityname() {
        return cityname;
    }

    public void setCityname(Object cityname) {
        this.cityname = cityname;
    }
}