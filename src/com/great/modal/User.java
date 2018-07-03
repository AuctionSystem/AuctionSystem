package com.great.modal;

/**
 *  用户表
 * USERID               NUMBER(4)            not null,
   STATEID              NUMBER(2),
   CITYID               NUMBER(6),
   ROLEID               NUMBER(6),
   USERNAME             NVARCHAR2(10),
   USERPWD              VARCHAR2(30),
   SEX                  NVARCHAR2(2),
   PHONE                NUMBER(11),
   USERSTATES           NUMBER(2),
   ADDRESS              NVARCHAR2(100),
 */
public class User {
	
	private int userId;
	private int stateId;
	private int cityId;
	private int roleId;
	private String userName;
	private String userPwd;
	private String Sex;
	private long phone;
	private String address;
	/**
	 * @param userId
	 * @param stateId
	 * @param cityId
	 * @param roleId
	 * @param userName
	 * @param userPwd
	 * @param sex
	 * @param phone
	 * @param address
	 */
	public User(int userId, int stateId, int cityId, int roleId, String userName, String userPwd, String sex,
			long phone, String address) {
		super();
		this.userId = userId;
		this.stateId = stateId;
		this.cityId = cityId;
		this.roleId = roleId;
		this.userName = userName;
		this.userPwd = userPwd;
		Sex = sex;
		this.phone = phone;
		this.address = address;
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
	 * @return the stateId
	 */
	public int getStateId() {
		return stateId;
	}
	/**
	 * @param stateId the stateId to set
	 */
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	/**
	 * @return the cityId
	 */
	public int getCityId() {
		return cityId;
	}
	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userPwd
	 */
	public String getUserPwd() {
		return userPwd;
	}
	/**
	 * @param userPwd the userPwd to set
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return Sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		Sex = sex;
	}
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 
	 */
	public User() {
		super();
	}
	

}
