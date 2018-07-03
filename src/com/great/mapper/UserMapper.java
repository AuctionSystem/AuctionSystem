/**
 * 
 */
package com.great.mapper;

import java.util.List;

import com.great.annotation.MyRepository;
import com.great.modal.User;

/**
 * @author gxx
 * @creation 创建时间:2018年7月3日 下午4:11:41
 * @Git 
 *
 */
@MyRepository
public interface UserMapper {
	
	public List<User> findByUser();
	
	//用户登入
	public User userLogin(User user);

}
