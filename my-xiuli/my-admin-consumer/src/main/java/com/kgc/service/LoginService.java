package com.kgc.service;

import com.kgc.pojo.Personnel;

public interface LoginService {
    //登录  查账号密码对应的是什么职务
    public Personnel getPerson(String gl_name, String gl_Password);

}
