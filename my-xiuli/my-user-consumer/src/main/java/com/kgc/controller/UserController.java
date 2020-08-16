package com.kgc.controller;

import com.kgc.dto.Dto;
import com.kgc.dto.DtoUtil;
import com.kgc.pojo.Users;
import com.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    //添加
    @RequestMapping("/add")
    public int add(Users users){
        return userService.add(users);
    }

    //根据id查询
    @RequestMapping("/getPersonById")
    public Users getusersById(Integer id){
        return userService.getusersById(id);
    }

    //更新
    @RequestMapping("/update")
    public int update(Users users){
        return userService.update(users);
    }
    @RequestMapping("/getName")
    public int getName(String name){
        return userService.getName(name);
    }

    @RequestMapping("/login")
    public Dto login(Users users, HttpServletRequest request){
        try {
            String userAgentStr=request.getHeader("User-Agent");
            return userService.findUserLogin(users.getName(),users.getPassword(),userAgentStr);
        } catch (Exception e) {
            e.printStackTrace();
            return DtoUtil.returnFail("fail","0000");
        }
    }

}
