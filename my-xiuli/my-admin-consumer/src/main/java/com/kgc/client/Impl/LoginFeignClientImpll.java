package com.kgc.client.Impl;

import com.kgc.client.LoginFeignClient;
import com.kgc.pojo.Personnel;
import org.springframework.stereotype.Component;

@Component
public class LoginFeignClientImpll implements LoginFeignClient {
    @Override
    public Personnel getPerson(String gl_name, String gl_Password) {
        return null;
    }
}
