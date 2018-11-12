package com.management.services.impl;

import com.management.dao.user.UserDao;
import com.management.entity.User;
import com.management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public List<User> getList(User user) throws Exception{
        List<User> list = (List<User>) userDao.getList("UserMapper.getList",user);
        return list;
    }

    @Override
    public User getEntity(User user) throws Exception{
        User entity = (User) userDao.getEnity("UserMapper.getEntity",user);
        return entity;
    }
}
