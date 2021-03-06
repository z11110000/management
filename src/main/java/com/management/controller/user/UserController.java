package com.management.controller.user;

import com.management.base.BaseResult;
import com.management.controller.base.BaseController;
import com.management.entity.User;
import com.management.entity.utils.PageData;
import com.management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;


    /**
     * 获取所有用户
     * @return
     */
    @RequestMapping("/getList")
    @ResponseBody
    public Map<String,Object> getList(){
        Map<String, Object> map = BaseResult.resultOk();
        PageData pd = this.getPageData();
        List<User> userList = null;
        try {
            userList = userService.getList(pd);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.resultError("查询异常");
        }
        map.put("userList",userList);
        return map;
    }
}
