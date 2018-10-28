package com.management.services.impl;

import com.management.dao.UserDao;
import com.management.entity.User;
import com.management.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao dao;

    @Override
    public List<User> getList(User user) throws Exception{
        List<User> list = dao.getList();
        return list;
    }

    @Override
    public User getEntity(User user) throws Exception{
        User entity = dao.getEntity(user);
        return entity;
    }
}
