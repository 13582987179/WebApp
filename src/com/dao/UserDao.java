package com.dao;

import com.po.UserBean;

public interface UserDao {
 int login(UserBean userBean) ;
 int reg(UserBean userBean) ;
}
