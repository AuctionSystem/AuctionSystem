/**
 * 
 */
package com.great.modal;

/**
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午10:51:04
 * @Git 
 *MENUID               NUMBER(6)            not null,
   MENUPID              NUMBER(6),
   MENUNAME             NUMERIC(10, 0),
   MENUPATH             NVARCHAR2(60),
 */
public class Menu {

	
	private int menuId;
	private int menuPid;
	private String menuName;
	private String menuPath;
	/**
	 * @param menuId
	 * @param menuPid
	 * @param menuName
	 * @param menuPath
	 */
	public Menu(int menuId, int menuPid, String menuName, String menuPath) {
		super();
		this.setMenuId(menuId);
		this.setMenuPid(menuPid);
		this.setMenuName(menuName);
		this.setMenuPath(menuPath);
	}
	/**
	 * 
	 */
	public Menu() {
		super();
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
	 * @return the menuPid
	 */
	public int getMenuPid() {
		return menuPid;
	}
	/**
	 * @param menuPid the menuPid to set
	 */
	public void setMenuPid(int menuPid) {
		this.menuPid = menuPid;
	}
	/**
	 * @return the menuName
	 */
	public String getMenuName() {
		return menuName;
	}
	/**
	 * @param menuName the menuName to set
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	/**
	 * @return the menuPath
	 */
	public String getMenuPath() {
		return menuPath;
	}
	/**
	 * @param menuPath the menuPath to set
	 */
	public void setMenuPath(String menuPath) {
		this.menuPath = menuPath;
	}
	
	
}
