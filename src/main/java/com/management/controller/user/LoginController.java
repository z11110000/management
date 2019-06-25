package com.management.controller.user;

import com.management.controller.base.BaseController;
import com.management.entity.User;
import com.management.entity.utils.PageData;
import com.management.services.UserService;
import com.management.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public ModelAndView login(){
        ModelAndView model = new ModelAndView();
        PageData pd = this.getPageData();
        try {
            String password = pd.getString("password");
            String md5String = BaseUtils.getMD5String(password);
            pd.put("password",md5String);
            User entity = userService.getEntity(pd);
            if(entity != null){
                model.setViewName("/jsp/index.jsp");
            }else {
                model.setViewName("/jsp/login.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
            model.setViewName("/jsp/login.jsp");
        }
        return model;
    }

    @RequestMapping("toLogin")
    public ModelAndView toLogin(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/jsp/login.jsp");
        return mv;
    }
}
