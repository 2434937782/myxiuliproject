package com.kgc.mapper;

import com.kgc.pojo.Personnel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    //登录  查账号密码对应的是什么职务
    public Personnel getPerson(String gl_name, String gl_Password);

}
