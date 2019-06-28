package com.management.controller;

import com.management.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController extends BaseController {

    @RequestMapping("/jump")
    public ModelAndView jump(String page){
        ModelAndView mv = new ModelAndView();
        mv.addObject("page",page);
        return mv;
    }


}
