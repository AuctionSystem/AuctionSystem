/**
 * 
 */
package com.great.model;

/**
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午11:04:24
 * @Git ROLEPOWERID NUMBER(6) not null, ROLEID NUMBER(6), POWERID NUMBER(6),
 */
public class RolePower {
	private int rolePowerId;
	private int roleId;
	private int powerId;
	/**
	 * @param rolePowerId
	 * @param roleId
	 * @param powerId
	 */
	public RolePower(int rolePowerId, int roleId, int powerId) {
		super();
		this.rolePowerId = rolePowerId;
		this.roleId = roleId;
		this.powerId = powerId;
	}
	/**
	 * 
	 */
	public RolePower() {
		super();
	}
	/**
	 * @return the rolePowerId
	 */
	public int getRolePowerId() {
		return rolePowerId;
	}
	/**
	 * @param rolePowerId the rolePowerId to set
	 */
	public void setRolePowerId(int rolePowerId) {
		this.rolePowerId = rolePowerId;
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
	
	
}
