package com.management.services;

import com.management.entity.User;
import com.management.entity.utils.PageData;

import java.util.List;

public interface UserService {

    /**
     * 获取所有用户
     * @param pd
     * @return
     */
    public List<User> getList(PageData pd) throws Exception;

    public User getEntity(PageData pd) throws Exception;
}
