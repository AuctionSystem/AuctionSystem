package com.great.entity;

import org.springframework.stereotype.Component;

@Component
public class Tbauction {
    private Long auctionid;
  
    
    private Short userid;

    private Integer goodsid;

    private Object autiondate;

    private Long userprice;

    public Long getAuctionid() {
        return auctionid;
    }

    public void setAuctionid(Long auctionid) {
        this.auctionid = auctionid;
    }

    public Short getUserid() {
        return userid;
    }

    public void setUserid(Short userid) {
    	System.out.println(1111111);
        this.userid = userid;
    }

    public Integer getGoodsid() {
    	System.out.println("111");
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Object getAutiondate() {
        return autiondate;
    }

    public void setAutiondate(Object autiondate) {
        this.autiondate = autiondate;
    }

    public Long getUserprice() {
        return userprice;
    }

    public void setUserprice(Long userprice) {
        this.userprice = userprice;
    }
}