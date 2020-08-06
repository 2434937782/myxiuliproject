package com.kgc.service.impl;

import com.kgc.mapper.LoginMapper;
import com.kgc.pojo.Personnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestLoginServiceImpl {

    @Autowired
    private LoginMapper loginMapper;

    //登录  查账号密码对应的是什么职务
    @RequestMapping("/getPerson")
    public Personnel getPerson(@RequestParam("gl_name") String gl_name,
                               @RequestParam("gl_Password") String gl_Password) {
        return loginMapper.getPerson(gl_name, gl_Password);
    }

}
