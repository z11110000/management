package com.management.controller;

import com.management.base.BaseResult;
import com.management.base.BaseResultMap;
import com.management.entity.User;
import com.management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 获取所有用户
     * @return
     */
    @RequestMapping("/getList")
    @ResponseBody
    public Map<String,Object> getList(User user){
        Map<String, Object> map = BaseResultMap.resultOk();
        List<User> userList = null;
        try {
            userList = userService.getList(user);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.resultError("查询异常");
        }
        map.put("userList",userList);
        return map;
    }

    /**
     * 登录
     * @return
     */
    @RequestMapping("login")
    @ResponseBody
    public Map<String,Object> login(User user){
        try {
            User entity = userService.getEntity(user);
            if(entity != null){
                return BaseResult.resultOk();
            }else {
                return BaseResult.resultError();
            }
        } catch (Exception e) {
            return BaseResult.resultError("登录异常");
        }
    }
}
