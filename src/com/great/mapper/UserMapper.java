package com.great.mapper;

import com.great.modal.User;

public interface UserMapper {

	public void addUser(User user);     		// 增加用户
	
	public void deleteUser(int userId);  		// 删除指定用户
	
	public void changeUserStates(int userId);   // 更改指定用户状态
}
