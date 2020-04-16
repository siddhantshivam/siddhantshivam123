package com.infotech.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.infotech.model.User;

@Repository
public class UserDAO {
private static List<User> list = null;
	static{
		list = new ArrayList<User>();
		list.add(new User("SID-Admin", 30, "SID@gmail.com", "India","SID1234"));
	
	}
	public List<User> getUserList() {
		return list;
	}
	public void addUser(User user) {
		list.add(user);
	}
}
