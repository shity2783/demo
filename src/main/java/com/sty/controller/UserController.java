package com.sty.controller;

import com.sty.entity.User;
import com.sty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(HttpServletRequest request){

        //调用service层的查所有
        List<User> users = userService.findAll();
        request.setAttribute("users",users);
        System.out.println("哈哈");
        //转到findAll页面
        return "findAll";
    }
}
