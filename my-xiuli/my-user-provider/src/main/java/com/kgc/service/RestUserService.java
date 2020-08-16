package com.kgc.service;

import com.kgc.mapper.UserMapper;
import com.kgc.pojo.Users;
import com.kgc.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class RestUserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisUtils redisUtils;


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

    @RequestMapping("/findUserLogin")
    public Users findUserLogin(@RequestParam("name") String name,@RequestParam("password") String password){
        Users users=null;
        Map<String,Object> map=new HashMap<>();
        map.put("name",name);
        map.put("password",password);
        List<Users> list=userMapper.getQgUserListByMap(map);
        if(list!=null&&list.size()>0){
            return list.get(0);
        }
        return null;
    }

    @RequestMapping("/getName")
    public int getName(@RequestParam("name") String name){
        return userMapper.getName(name);
    }
}
