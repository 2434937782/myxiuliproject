package com.kgc.client;

import com.kgc.pojo.Users;

public interface UserFeginClient {

    public int add(Users users);

    //根据id查询
    public Users getusersById(Integer id);

    //更新
    public int update(Users users);
}
