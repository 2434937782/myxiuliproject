package com.kgc.service;

import com.kgc.dto.Dto;
import com.kgc.pojo.Users;

public interface UserService {

    //添加
    public int add(Users users);

    //根据id查询
    public Users getusersById(Integer id);

    //更新
    public int update(Users users);

    public int getName(String name);

    public Dto findUserLogin(String name, String password,String userAgent);
}
