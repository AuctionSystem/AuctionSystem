/**
 * 
 */
package com.great.model;

/**
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午10:29:57
 * @Git 
 *CITYID               NUMBER(6)            not null,
   PROVINCEID           NUMBER(6),
   CITYNAME             NVARCHAR2(6),
 */
public class City {
	
	private int cityId;
	private int provinceId;
	private String cityName;
	
	
	/**
	 * 
	 */
	public City() {
		super();
	}


	/**
	 * @param cityId
	 * @param provinceId
	 * @param cityName
	 */
	public City(int cityId, int provinceId, String cityName) {
		super();
		this.setCityId(cityId);
		this.setProvinceId(provinceId);
		this.setCityName(cityName);
	}


	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}


	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
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
	
	

}
