package com.great.entity;

import org.springframework.stereotype.Component;

@Component
public class Tbgood {
    private Integer goodid;

    private Short secondid;

    private Integer goodstateid;

    private Object goodpicture;

    private Object gooddescribe;

    private Integer goodstatrprice;

    private Integer goodlarst;

    private Integer goodnew;

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Short getSecondid() {
        return secondid;
    }

    public void setSecondid(Short secondid) {
        this.secondid = secondid;
    }

    public Integer getGoodstateid() {
        return goodstateid;
    }

    public void setGoodstateid(Integer goodstateid) {
        this.goodstateid = goodstateid;
    }

    public Object getGoodpicture() {
        return goodpicture;
    }

    public void setGoodpicture(Object goodpicture) {
        this.goodpicture = goodpicture;
    }

    public Object getGooddescribe() {
        return gooddescribe;
    }

    public void setGooddescribe(Object gooddescribe) {
        this.gooddescribe = gooddescribe;
    }

    public Integer getGoodstatrprice() {
        return goodstatrprice;
    }

    public void setGoodstatrprice(Integer goodstatrprice) {
        this.goodstatrprice = goodstatrprice;
    }

    public Integer getGoodlarst() {
        return goodlarst;
    }

    public void setGoodlarst(Integer goodlarst) {
        this.goodlarst = goodlarst;
    }

    public Integer getGoodnew() {
        return goodnew;
    }

    public void setGoodnew(Integer goodnew) {
        this.goodnew = goodnew;
    }
}