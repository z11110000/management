package com.management.controller.base;

import com.management.entity.utils.PageData;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author zm
 * @date 2018/11/26 0026 10:28
 */
public class BaseController {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Headers", "X-Requested-With, accept, content-type, xxxx");
        response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");
        response.setHeader("Access-Control-Allow-Origin", "*");

        this.request = request;
        this.response = response;
    }

    public PageData getPageData(){
        return new PageData(this.request);
    }

}
