package com.kgc.service.impl;

import com.kgc.pojo.Users;
import com.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {

    @Autowired UserService userService;

    @Override
    public int add(Users users) {
        return userService.add(users);
    }

    @Override
    public Users getusersById(Integer id) {
        return userService.getusersById(id);
    }

    @Override
    public int update(Users users) {
        return userService.update(users);
    }
}
