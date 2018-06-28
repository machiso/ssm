package com.machi.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.machi.model.User;
import com.machi.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/showUser")
    @ResponseBody
    public Object selectUser(HttpServletRequest request, HttpServletResponse response,
                             @RequestParam("id") Integer id,
                             @RequestParam("name") String name) throws IOException {

        logger.info("id={},name={}",id,name);

        String queryString = request.getQueryString();
        System.out.println("queryString:"+queryString);

        Map<String, String[]> parameterMap = request.getParameterMap();
        Iterator<Map.Entry<String, String[]>> iterator = parameterMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String[]> entry = iterator.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue().toString());
        }
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        User user = this.userService.selectUser(userId);
//        ObjectMapper mapper = new ObjectMapper();
//        response.getWriter().write(mapper.writeValueAsString(user));
//        response.getWriter().close();
        return user;
    }



}
