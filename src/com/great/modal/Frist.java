package com.great.modal;

/**
 * @author gxx
 * @creation 创建时间:2018年7月2日 下午10:33:34
 * @Git 
 *FRISTID              NUMBER(4)            not null,
   FRISTNAME            NVARCHAR2(20),
 */
public class Frist {
	
	private int fristId;
	private String fristName;
	/**
	 * 
	 */
	public Frist() {
		super();
	}
	/**
	 * @param fristId
	 * @param fristName
	 */
	public Frist(int fristId, String fristName) {
		super();
		this.setFristId(fristId);
		this.setFristName(fristName);
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
	 * @return the fristName
	 */
	public String getFristName() {
		return fristName;
	}
	/**
	 * @param fristName the fristName to set
	 */
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	

}
