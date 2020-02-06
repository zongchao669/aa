package com.inspur.mapper;

import java.util.HashMap;
import java.util.List;

import com.inspur.pojo.User;

public interface UserMapper {
	   public User getUserforLogin(User user);
	   public List<User> getUserList(HashMap<String,Object> map);
	   public void deleteUser(String userId);
	   public void saveUser(User user);
	   public User getUserByKey(String userId);
	   public void updateUser(User user);
	 
}
