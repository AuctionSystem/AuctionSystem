/**
 * 
 */
package com.great.model;

/**
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午11:02:29
 * @Git 
 *ROLEID               NUMBER(6)            not null,
   ROLENAME             NVARCHAR2(10),
 */
public class Role {

	private int roleId;
	private String roleName;
	/**
	 * @param roleId
	 * @param roleName
	 */
	public Role(int roleId, String roleName) {
		super();
		this.setRoleId(roleId);
		this.setRoleName(roleName);
	}
	/**
	 * 
	 */
	public Role() {
		super();
	}
	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}
	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
	
}
