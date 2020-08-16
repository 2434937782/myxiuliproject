package com.kgc.mapper;


import com.kgc.pojo.Dingdan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DingdanMapper {
    //查询所有订单
    public List<Dingdan> getAllDindan();
    //根据手机号查看订单
    public Dingdan getByphone(String djiphone);
}
