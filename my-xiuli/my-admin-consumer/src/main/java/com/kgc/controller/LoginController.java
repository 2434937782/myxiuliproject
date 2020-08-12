package com.kgc.controller;

import com.kgc.pojo.Personnel;
import com.kgc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/getPerson")
    public Personnel getPerson(@RequestParam("gl_name") String gl_name,
                               @RequestParam("gl_Password") String gl_Password) {
        return loginService.getPerson(gl_name, gl_Password);
    }
}
