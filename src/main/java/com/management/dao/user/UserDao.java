package com.management.dao.user;

import com.management.dao.DAO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 用户DAO
 */
@Repository("userDao")
public class UserDao implements DAO {

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplateUser;

    @Override
    public Object insert(String sql, Object object) throws Exception {
        return sqlSessionTemplateUser.insert(sql, object);
    }

    @Override
    public Object delete(String sql, Object object) throws Exception {
        return sqlSessionTemplateUser.delete(sql,object);
    }

    @Override
    public Object update(String sql, Object object) throws Exception {
        return sqlSessionTemplateUser.update(sql,object);
    }

    @Override
    public Object getEnity(String sql, Object object) throws Exception {
        return sqlSessionTemplateUser.selectOne(sql,object);
    }

    @Override
    public Object getList(String sql, Object object) throws Exception {
        return sqlSessionTemplateUser.selectList(sql,object);
    }

    @Override
    public Object getMap(String sql, Object object,String key,String value) throws Exception {
        return sqlSessionTemplateUser.selectMap(sql,object,key);
    }
}
