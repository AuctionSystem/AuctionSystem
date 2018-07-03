package com.great.entity;

import org.springframework.stereotype.Component;

@Component
public class Tbgoodstate {
    private Integer goodstateid;

    private Object goodstatename;

    public Integer getGoodstateid() {
        return goodstateid;
    }

    public void setGoodstateid(Integer goodstateid) {
        this.goodstateid = goodstateid;
    }

    public Object getGoodstatename() {
        return goodstatename;
    }

    public void setGoodstatename(Object goodstatename) {
        this.goodstatename = goodstatename;
    }
}