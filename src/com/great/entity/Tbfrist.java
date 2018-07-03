package com.great.entity;

import org.springframework.stereotype.Component;

@Component
public class Tbfrist {
    private Short fristid;

    private Object fristname;

    public Short getFristid() {
        return fristid;
    }

    public void setFristid(Short fristid) {
        this.fristid = fristid;
    }

    public Object getFristname() {
        return fristname;
    }

    public void setFristname(Object fristname) {
        this.fristname = fristname;
    }
}