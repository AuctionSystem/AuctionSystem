package com.great.modal;



// 用户状态表
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
