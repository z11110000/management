package com.management.dao;

import com.management.entity.User;

import java.util.List;

public interface UserDao {

    List<User> getList();

    User getEntity(User user);
}
