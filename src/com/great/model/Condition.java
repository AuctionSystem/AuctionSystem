package com.great.model;

/**
 * 条件类
 * 
 * @author jianyu
 *
 */
public class Condition {
	private String beginTime = "";// 起始时间
	private String endTime = "";// 截止时间
	private String status = "";// 查询的状态
	private String userName = "";// 查询的用户名
	
	private int startRow = 0;
	private int endRow = 0;

	public Condition() {
		super();
	}

	public Condition(String beginTime, String endTime, String status, String userName) {
		super();
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.status = status;
		this.userName = userName;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

}
