package com.kgc.service.Impl;

import com.kgc.client.LoginFeignClient;
import com.kgc.pojo.Personnel;
import com.kgc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginFeignClient loginFeignClient;

    @Override
    public Personnel getPerson(String gl_name, String gl_Password) {
        return loginFeignClient.getPerson(gl_name, gl_Password);
    }
}
