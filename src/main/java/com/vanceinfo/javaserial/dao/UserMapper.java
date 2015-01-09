package com.vanceinfo.javaserial.dao;

import java.util.List;

import com.vanceinfo.javaserial.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

	User selectByPrimaryKey(int id);
	
	void updateByPrimaryKey(User record);
	
	void deleteByPrimaryKey(int id);
	
	List<User> selectAll();
}