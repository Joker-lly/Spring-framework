package com.lly.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl2 implements UserDao{
	@Override
	public void query() {
		System.out.println("3");
	}

	@Override
	public void list() {

	}
}
