package com.lenovo.crm.settings.service.impl;

import com.lenovo.crm.settings.dao.UserDao;
import com.lenovo.crm.settings.service.UserService;
import com.lenovo.crm.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class UserServiceImpl implements UserService {
    private UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
}
