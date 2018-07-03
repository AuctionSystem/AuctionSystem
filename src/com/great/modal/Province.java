/**
 * 
 */
package com.great.modal;

/**
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午11:00:20
 * @Git 
 *
 */
public class Province {
	
	
	private int provinceId;
	private String provinceName;
	/**
	 * @param provinceId
	 * @param provinceName
	 */
	public Province(int provinceId, String provinceName) {
		super();
		this.provinceId = provinceId;
		this.provinceName = provinceName;
	}
	/**
	 * 
	 */
	public Province() {
		super();
	}
	/**
	 * @return the provinceId
	 */
	public int getProvinceId() {
		return provinceId;
	}
	/**
	 * @param provinceId the provinceId to set
	 */
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	/**
	 * @return the provinceName
	 */
	public String getProvinceName() {
		return provinceName;
	}
	/**
	 * @param provinceName the provinceName to set
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	
	

}
