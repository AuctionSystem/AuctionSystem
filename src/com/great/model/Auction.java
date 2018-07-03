/**
 * 
 */
package com.great.model;

import org.springframework.stereotype.Component;

/**
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午10:23:28
 * @Git 
 * AUCTIONID            NUMBER(10)           not null,
   USERID               NUMBER(4),
   GOODSID              NUMBER(6),
   AUTIONDATE           NVARCHAR2(30),
   USERPRICE            NUMBER(16),
 */

@Component
public class Auction {

	private int auctionId;
	private int userId;
	private int goodsId;
	private String auctionDate;
	private int userPrice;
	
	/**
	 * 
	 */
	public Auction() {
		super();
	}
	/**
	 * @param auctionId
	 * @param userId
	 * @param goodsId
	 * @param auctionDate
	 * @param userPrice
	 */
	public Auction(int auctionId, int userId, int goodsId, String auctionDate, int userPrice) {
		super();
		this.auctionId = auctionId;
		this.userId = userId;
		this.goodsId = goodsId;
		this.auctionDate = auctionDate;
		this.userPrice = userPrice;
	}
	/**
	 * @return the auctionId
	 */
	public int getAuctionId() {
		return auctionId;
	}
	/**
	 * @param auctionId the auctionId to set
	 */
	public void setAuctionId(int auctionId) {
		this.auctionId = auctionId;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		System.out.println(111);
		this.userId = userId;
	}
	/**
	 * @return the goodsId
	 */
	public int getGoodsId() {
		return goodsId;
	}
	/**
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * @return the auctionDate
	 */
	public String getAuctionDate() {
		return auctionDate;
	}
	/**
	 * @param auctionDate the auctionDate to set
	 */
	public void setAuctionDate(String auctionDate) {
		this.auctionDate = auctionDate;
	}
	/**
	 * @return the userPrice
	 */
	public int getUserPrice() {
		return userPrice;
	}
	/**
	 * @param userPrice the userPrice to set
	 */
	public void setUserPrice(int userPrice) {
		this.userPrice = userPrice;
	}
	
	
}
