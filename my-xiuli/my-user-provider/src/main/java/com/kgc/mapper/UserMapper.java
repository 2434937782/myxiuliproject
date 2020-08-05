package com.kgc.mapper;

import com.kgc.pojo.Users;
import com.kgc.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<Users> getAllUsers(@Param("title") String title);

}
