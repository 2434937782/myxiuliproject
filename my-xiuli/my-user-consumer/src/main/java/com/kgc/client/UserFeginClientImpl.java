package com.kgc.client;

import com.kgc.pojo.Users;
import org.springframework.stereotype.Component;

@Component
public class UserFeginClientImpl implements  UserFeginClient{

    @Override
    public int add(Users users) {
        return 0;
    }

    @Override
    public Users getusersById(Integer id) {
        return null;
    }

    @Override
    public int update(Users users) {
        return 0;
    }

    @Override
    public int getName(String name) {
        return 0;
    }

    @Override
    public Users findUserLogin(String name, String password) {
        return null;
    }
}
