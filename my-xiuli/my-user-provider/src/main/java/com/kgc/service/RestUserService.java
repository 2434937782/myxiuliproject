package com.kgc.service;

import com.kgc.mapper.UserMapper;
import com.kgc.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestUserService {
    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/add")
    public int add(@RequestBody Users users) {
        int count = userMapper.add(users);
        return count;
    }

    @RequestMapping("/getPersonById/{id}")
    public Users getusersById(@PathVariable("id") Integer id) {
        return userMapper.getusersById(id);
    }

    @RequestMapping("/update")
    public int update(@RequestBody Users users) {
        return userMapper.update(users);
    }


}
