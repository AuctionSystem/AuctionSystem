/**
 * 
 */
package com.great.model;

/**
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午11:27:11
 * @Git 
 *
 */
public class UserState {
	
	
	private int userStateId;
	private String userState;
	
	
	
	/**
	 * 
	 */
	public UserState() {
		super();
	}
	
	/**
	 * @param userStateId
	 * @param userState
	 */
	public UserState(int userStateId, String userState) {
		super();
		this.userStateId = userStateId;
		this.userState = userState;
	}
	
	/**
	 * @return the userStateId
	 */
	public int getUserStateId() {
		return userStateId;
	}
	/**
	 * @param userStateId the userStateId to set
	 */
	public void setUserStateId(int userStateId) {
		this.userStateId = userStateId;
	}
	/**
	 * @return the userState
	 */
	public String getUserState() {
		return userState;
	}
	/**
	 * @param userState the userState to set
	 */
	public void setUserState(String userState) {
		this.userState = userState;
	}
	
	
	

}
