package com.kgc.mapper;

import com.kgc.pojo.Ddxq;
import com.kgc.pojo.Dingdan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DingdanMapper {

    //查看所有订单
    public List<Dingdan> getdingdan(Map<String, Object> param);

    //订单
    public int count(Map<String, Object> param);

    //添加订单
    public int add(Dingdan dingdan);

    //订单详情
    public Ddxq getById(Integer ddxqid);
}
