package com.vanceinfo.javaserial.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



import com.vanceinfo.javaserial.dao.UserMapper;
import com.vanceinfo.javaserial.model.User;

@Service
public class UserServiceImpl  {

    private UserMapper userMapper;
    
    public UserMapper getUserMapper() {
        return userMapper;
    }
    
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    
    public User getUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
    
    public void insertById(User user)
    {
    	userMapper.insert(user);
    }

	public void update(User user) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKey(user);
	}
    
	public void delete(int id)
	{
		userMapper.deleteByPrimaryKey(id);
	}


	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return (List<User>) userMapper.selectAll();
	}
    

}