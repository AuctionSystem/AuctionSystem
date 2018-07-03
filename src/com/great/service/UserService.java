/**
 * 
 */
package com.great.service;

import java.util.List;

import com.great.modal.User;

/**
 * @author gxx
 * @creation 创建时间:2018年7月3日 下午4:15:40
 * @Git 
 *
 */

public interface UserService {
	
	public List<User> qurry();
	
	//用户登入
	public User login(User user);

}
