package com.lly.dao;

import com.lly.anno.EnableLly;
import org.springframework.stereotype.Repository;

@Repository

public class UserDaoImpl implements UserDao {
	@Override
	public void query() {
		System.out.println("假装查询");
	}

	@Override
	public void list() {
		System.out.println("qurey list");
	}
}
