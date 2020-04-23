package com.service.impl;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.po.UserBean;
import com.service.UserService;

public class UserSerivceImpl implements UserService {
      
	@Override
	public int login(UserBean userBean) {
		UserDao userDao=new UserDaoImpl();
				return userDao.login(userBean);

	}

	@Override
	public int reg(UserBean userBean) {
		UserDao userDao=new UserDaoImpl();
		return userDao.reg(userBean);
	}

}
