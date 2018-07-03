/**
 * 
 */
package com.great.modal;

/**
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午11:06:43
 * @Git 
 *
 */
public class Second {
	
	private int secondId;
	private int fristId;
	private String secondName;
	/**
	 * @param secondId
	 * @param fristId
	 * @param secondName
	 */
	public Second(int secondId, int fristId, String secondName) {
		super();
		this.secondId = secondId;
		this.fristId = fristId;
		this.secondName = secondName;
	}
	/**
	 * 
	 */
	public Second() {
		super();
	}
	/**
	 * @return the secondId
	 */
	public int getSecondId() {
		return secondId;
	}
	/**
	 * @param secondId the secondId to set
	 */
	public void setSecondId(int secondId) {
		this.secondId = secondId;
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
	 * @return the secondName
	 */
	public String getSecondName() {
		return secondName;
	}
	/**
	 * @param secondName the secondName to set
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	

}
