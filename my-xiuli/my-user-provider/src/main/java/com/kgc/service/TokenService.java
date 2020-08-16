package com.kgc.service;

import com.alibaba.fastjson.JSON;
import com.kgc.pojo.Users;
import com.kgc.util.MD5;
import com.kgc.util.RedisUtils;
import nl.bitwalker.useragentutils.UserAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TokenService {

    @Autowired
    private RedisUtils redisUtils;
    @RequestMapping("/generateToken")
    public String generateToken(@RequestParam("userAgent") String userAgent,@RequestBody Users users) {
        StringBuffer sb=new StringBuffer("token:");
        UserAgent agent=UserAgent.parseUserAgentString(userAgent);
        if(agent.getOperatingSystem().isMobileDevice()){
            sb.append("MOBILE-");
        }else{
            sb.append("PC-");
        }
        sb.append(MD5.getMd5(users.getName(),32)+"-");
        sb.append(users.getId()+"-");
        sb.append(new SimpleDateFormat("YYYYMMddHHmmss").format(new Date())+"-");
        sb.append(MD5.getMd5(userAgent,6));
        return sb.toString();
    }
    @RequestMapping("/save")
    public void save(@RequestParam("token") String token,@RequestBody Users user) {
        if(token.startsWith("token:PC-")){
            redisUtils.set(token,2*60*60, JSON.toJSONString(user));
        }else{
            redisUtils.set(token,JSON.toJSONString(user));
        }
    }
    @RequestMapping("/getToken")
    public Users getToken(@RequestParam("token") String token) {
        if(redisUtils.exist(token)){
            String userStr=redisUtils.get(token).toString();
            Users users=JSON.parseObject(userStr,Users.class);
            return users;
        }
        return null;
    }
}
