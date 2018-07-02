/**
 * 
 */
package com.great.model;

/**
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午10:57:54
 * @Git 
 * POWERID              NUMBER(6)            not null,
   MENUID               NUMBER(6),
   POWERNAME            NVARCHAR2(10),
 */
public class Power {
	
	private int powerId;
	private int menuId;
	private String powerName;
	/**
	 * 
	 */
	public Power() {
		super();
	}
	/**
	 * @param powerId
	 * @param menuId
	 * @param powerName
	 */
	public Power(int powerId, int menuId, String powerName) {
		super();
		this.setPowerId(powerId);
		this.setMenuId(menuId);
		this.setPowerName(powerName);
	}
	/**
	 * @return the powerId
	 */
	public int getPowerId() {
		return powerId;
	}
	/**
	 * @param powerId the powerId to set
	 */
	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}
	/**
	 * @return the menuId
	 */
	public int getMenuId() {
		return menuId;
	}
	/**
	 * @param menuId the menuId to set
	 */
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	/**
	 * @return the powerName
	 */
	public String getPowerName() {
		return powerName;
	}
	/**
	 * @param powerName the powerName to set
	 */
	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}
	

}
