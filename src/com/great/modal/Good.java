/**
 * 
 */
package com.great.modal;

/**
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午10:36:39
 * @Git
 *
 * 		GOODID NUMBER(6) not null, SECONDID NUMBER(4), GOODTATEID NUMBER(6),
 *      GOODPICTURE NVARCHAR2(50), GOODDESCRIBE NVARCHAR2(100), GOODSTATRPRICE
 *      NUMBER(6), GOODLARST NUMBER(6), GOODNEW NUMBER(6),
 */
public class Good {

	private int goodId;
	private int secondId;
	private int goodStateId;
	private String goodPicture;
	private String goodDescribe;
	private int goodStatrPrice;
	private int goodLarst;
	private int goodNew;
	
	/**
	 * @return the goodId
	 */
	public int getGoodId() {
		return goodId;
	}

	/**
	 * @param goodId the goodId to set
	 */
	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}

	/**
	 * @return the secondId
	 */
	public int getSecondId() {
		return secondId;
	}

	/**
	 * @param secondId the secondId to set
	 */
	public void setSecondId(int secondId) {
		this.secondId = secondId;
	}

	/**
	 * @return the goodStateId
	 */
	public int getGoodStateId() {
		return goodStateId;
	}

	/**
	 * @param goodStateId the goodStateId to set
	 */
	public void setGoodStateId(int goodStateId) {
		this.goodStateId = goodStateId;
	}

	/**
	 * @return the goodPicture
	 */
	public String getGoodPicture() {
		return goodPicture;
	}

	/**
	 * @param goodPicture the goodPicture to set
	 */
	public void setGoodPicture(String goodPicture) {
		this.goodPicture = goodPicture;
	}

	/**
	 * @return the goodDescribe
	 */
	public String getGoodDescribe() {
		return goodDescribe;
	}

	/**
	 * @param goodDescribe the goodDescribe to set
	 */
	public void setGoodDescribe(String goodDescribe) {
		this.goodDescribe = goodDescribe;
	}

	/**
	 * @return the goodStatrPrice
	 */
	public int getGoodStatrPrice() {
		return goodStatrPrice;
	}

	/**
	 * @param goodStatrPrice the goodStatrPrice to set
	 */
	public void setGoodStatrPrice(int goodStatrPrice) {
		this.goodStatrPrice = goodStatrPrice;
	}

	/**
	 * @return the goodLarst
	 */
	public int getGoodLarst() {
		return goodLarst;
	}

	/**
	 * @param goodLarst the goodLarst to set
	 */
	public void setGoodLarst(int goodLarst) {
		this.goodLarst = goodLarst;
	}

	/**
	 * @return the goodNew
	 */
	public int getGoodNew() {
		return goodNew;
	}

	/**
	 * @param goodNew the goodNew to set
	 */
	public void setGoodNew(int goodNew) {
		this.goodNew = goodNew;
	}

	/**
	 * 
	 */
	public Good() {
		super();
	}

	/**
	 * @param goodId
	 * @param secondId
	 * @param goodStateId
	 * @param goodPicture
	 * @param goodDescribe
	 * @param goodStatrPrice
	 * @param goodLarst
	 * @param goodNew
	 */
	public Good(int goodId, int secondId, int goodStateId, String goodPicture, String goodDescribe, int goodStatrPrice,
			int goodLarst, int goodNew) {
		super();
		this.goodId = goodId;
		this.secondId = secondId;
		this.goodStateId = goodStateId;
		this.goodPicture = goodPicture;
		this.goodDescribe = goodDescribe;
		this.goodStatrPrice = goodStatrPrice;
		this.goodLarst = goodLarst;
		this.goodNew = goodNew;
	}

}
