package com.great.entity;

import org.springframework.stereotype.Component;

@Component
public class Tbprovince {
    private Integer provinceid;

    private Object provincename;

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public Object getProvincename() {
        return provincename;
    }

    public void setProvincename(Object provincename) {
        this.provincename = provincename;
    }
}