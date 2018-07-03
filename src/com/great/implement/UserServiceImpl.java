/**
 * 
 */
package com.great.implement;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.great.mapper.UserMapper;
import com.great.modal.User;
import com.great.service.UserService;

/**
 * @author gxx
 * @creation 创建时间:2018年7月3日 下午4:16:54
 * @Git 
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;

	/* (non-Javadoc)
	 * @see com.great.service.UserService#qurry()
	 */
	@Override
	public List<User> qurry() {
		
		return userMapper.findByUser();
	}

	/* (non-Javadoc)
	 * @see com.great.service.UserService#login(com.great.modal.User)
	 */
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userMapper.userLogin(user);
	}

}
