package com.management.dao;

public interface DAO {

    /**
     * 添加
     * @param sql sql
     * @param object 参数
     * @return
     */
    Object insert(String sql,Object object) throws Exception;

    /**
     * 删除
     * @param sql sql
     * @param object 参数
     * @return
     */
    Object delete(String sql,Object object) throws Exception;

    /**
     * 更新
     * @param sql sql
     * @param object 参数
     * @return
     */
    Object update(String sql,Object object) throws Exception;

    /**
     * 获取对象
     * @param sql sql
     * @param object 参数
     * @return
     */
    Object getEnity(String sql,Object object) throws Exception;

    /**
     * 获取多个对象
     * @param sql sql
     * @param object 参数
     * @return
     */
    Object getList(String sql,Object object) throws Exception;

    /**
     * 获取map，将结果以map形式返回
     * @param sql sql
     * @param object 参数
     * @return
     */
    Object getMap(String sql,Object object,String key,String value) throws Exception;
}
