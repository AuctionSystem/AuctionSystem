/**
 * 
 */
package com.great.modal;

import org.springframework.stereotype.Component;

/**
 * @author gxx
 * @creation 创建时间:2018年7月3日 下午5:00:06
 * @Git 
 *
 */
@Component
public class CreateImage {
	
	private String code;

	/**
	 * @param code
	 */
	public CreateImage(String code) {
		super();
		this.setCode(code);
	}

	/**
	 * 
	 */
	public CreateImage() {
		super();
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	

}
