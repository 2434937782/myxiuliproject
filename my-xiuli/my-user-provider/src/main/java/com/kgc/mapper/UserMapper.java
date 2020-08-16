package com.kgc.mapper;

import com.kgc.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


@Mapper
public interface UserMapper {

    //添加
    public int add(Users users);

    //用户登录
    public Users findUserLogin(@Param("name") String name,@Param("password") String password);

    //用户名数量
    public int getName(String name);

    //根据id查询
    public Users getusersById(Integer id);

    //更新
    public int update(Users users);

    public List<Users> getQgUserListByMap(Map<String,Object> param);


}
