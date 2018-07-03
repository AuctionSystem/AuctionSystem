/**
 * 
 */
package com.great.modal;

/**
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午10:48:41
 * @Git 
 * USERLIKEID           NUMBER(8)            not null,
   USERID               NUMBER(4),
   FRISTID              NUMBER(4),
 */
public class LikeGood {
	
	private int userLikeId;
	private int userId;
	private int fristId;
	/**
	 * @param userLikeId
	 * @param userId
	 * @param fristId
	 */
	public LikeGood(int userLikeId, int userId, int fristId) {
		super();
		this.setUserLikeId(userLikeId);
		this.setUserId(userId);
		this.setFristId(fristId);
	}
	/**
	 * 
	 */
	public LikeGood() {
		super();
	}
	/**
	 * @return the fristId
	 */
	public int getFristId() {
		return fristId;
	}
	/**
	 * @param fristId the fristId to set
	 */
	public void setFristId(int fristId) {
		this.fristId = fristId;
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
		this.userId = userId;
	}
	/**
	 * @return the userLikeId
	 */
	public int getUserLikeId() {
		return userLikeId;
	}
	/**
	 * @param userLikeId the userLikeId to set
	 */
	public void setUserLikeId(int userLikeId) {
		this.userLikeId = userLikeId;
	}
	
	

}
