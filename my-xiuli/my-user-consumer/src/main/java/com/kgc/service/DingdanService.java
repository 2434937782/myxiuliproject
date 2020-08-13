package com.kgc.service;

import com.kgc.pojo.Ddxq;
import com.kgc.pojo.Dingdan;

import java.util.List;

public interface DingdanService {
    //查看所有订单
    public List<Dingdan> getdingdan();

    //订单数量
    public int count();

    //添加订单
    public int add(Dingdan dingdan);

    //订单详情
    public Ddxq getById(Integer ddxqid);

}
