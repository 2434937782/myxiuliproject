package com.kgc.service.impl;

import com.kgc.client.TokenFeignClient;
import com.kgc.client.TokenFeignClientImpl;
import com.kgc.client.UserFeginClient;
import com.kgc.dto.Dto;
import com.kgc.dto.DtoUtil;
import com.kgc.pojo.Users;
import com.kgc.service.UserService;
import com.kgc.vo.UserTokenVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserFeginClient userFeginClient;
    @Autowired
    private TokenFeignClient tokenFeignClient;

    @Override
    public int add(Users users) {
        return userFeginClient.add(users);
    }

    @Override
    public Users getusersById(Integer id) {
        return userFeginClient.getusersById(id);
    }

    @Override
    public int update(Users users) {
        return userFeginClient.update(users);
    }

    @Override
    public int getName(String name) {
        return userFeginClient.getName(name);
    }

    @Override
    public Dto findUserLogin(String name, String password, String userAgent) {
        Users users=userFeginClient.findUserLogin(name, password);
        if(users!=null){
            String token=tokenFeignClient.generateToken(userAgent,users);
            UserTokenVo userTokenVo=new UserTokenVo();
            userTokenVo.setToken(token);
            userTokenVo.setGenTime(Calendar.getInstance().getTimeInMillis());
            userTokenVo.setExpTime(Calendar.getInstance().getTimeInMillis()+2*60*60*1000);
            tokenFeignClient.save(token,users);
            return DtoUtil.returnSuccess("ok",userTokenVo);
        }else{
            return DtoUtil.returnFail("fail","0001");
        }
    }


}
