package com.kgc.mapper;

import com.kgc.pojo.Personnel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper {
    //登录  查账号密码对应的是什么职务
    public Personnel getPerson(@Param("gl_name") String gl_name, @Param("gl_Password") String gl_Password);

}
