package com.kgc.service;

import com.kgc.pojo.Dingdan;

import java.util.List;

public interface DingdanService {
    //查询所有订单
    public List<Dingdan> getAllDindan();
    //根据手机号查看订单
    public Dingdan getByphone(String djiphone);
}
