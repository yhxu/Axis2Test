package com.xuyh.servers.axis2test;

import java.util.HashSet;
import java.util.Set;

import com.xuyh.servers.dao.User;

public class Axis2Test {

	public Set<User> getUsers(String args) {
		Set<User> set = new HashSet<User>();
		if(null == args || "".equals(args) || "?".equals(args)){
			for(int i=0;i<5;i++){
				set.add(new User("����","zhangsan", 24));
				set.add(new User("����","lisi", 25));
				set.add(new User("����","zhangsan", 24));
			}
		} else {
			set.add(new User("����","zhangsan", 24));
		}
		return set;
	}
}
