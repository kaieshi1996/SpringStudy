package com.kuang.service.impl;

import com.kuang.dao.UserDao;
import com.kuang.dao.impl.UserDaoImpl;
import com.kuang.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void getUser() {
        userDao.getUser();
    }


}
