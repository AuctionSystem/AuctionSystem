package com.great.entity;

import org.springframework.stereotype.Component;

@Component
public class Tbsecond {
    private Short secondid;

    private Short fristid;

    private Object secondname;

    public Short getSecondid() {
        return secondid;
    }

    public void setSecondid(Short secondid) {
        this.secondid = secondid;
    }

    public Short getFristid() {
        return fristid;
    }

    public void setFristid(Short fristid) {
        this.fristid = fristid;
    }

    public Object getSecondname() {
        return secondname;
    }

    public void setSecondname(Object secondname) {
        this.secondname = secondname;
    }
}