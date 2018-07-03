/**
 * 
 */
package com.great.modal;

/**
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午10:46:26
 * @Git 
 * GOODSTATEID          NUMBER(6)            not null,
   GOODSTATENAME        NVARCHAR2(6),
 */
public class GoodState {
	
	
	private int goodStateId;
	private String goodStateName;
	/**
	 * @param goodStateId
	 * @param goodStateName
	 */
	public GoodState(int goodStateId, String goodStateName) {
		super();
		this.setGoodStateId(goodStateId);
		this.setGoodStateName(goodStateName);
	}
	/**
	 * 
	 */
	public GoodState() {
		super();
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
	 * @return the goodStateName
	 */
	public String getGoodStateName() {
		return goodStateName;
	}
	/**
	 * @param goodStateName the goodStateName to set
	 */
	public void setGoodStateName(String goodStateName) {
		this.goodStateName = goodStateName;
	}
	
	

}
