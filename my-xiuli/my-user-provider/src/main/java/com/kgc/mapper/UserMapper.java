package com.kgc.mapper;

import com.kgc.pojo.Users;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

    //添加
    public int add(Users users);

    //根据id查询
    public Users getusersById(Integer id);

    //更新
    public int update(Users users);


}
