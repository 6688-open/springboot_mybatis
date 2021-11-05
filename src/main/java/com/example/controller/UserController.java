package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@RestController
@RequestMapping("/testBoot/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUser")
    public String GetUser(Integer id){
        return userService.selectByPrimaryKey(id).toString();
    }
}
