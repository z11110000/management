package com.management.services;

import com.management.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 获取所有用户
     * @param user
     * @return
     */
    public List<User> getList(User user);
}
