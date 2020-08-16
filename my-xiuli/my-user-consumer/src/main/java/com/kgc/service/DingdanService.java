package com.kgc.service;

import com.kgc.pojo.Ddxq;
import com.kgc.pojo.Dingdan;
import com.kgc.util.PageUtil;

import java.util.List;

public interface DingdanService {

    public PageUtil getPage(Integer userid, Integer index, Integer size);

    //添加订单
    public int add(Dingdan dingdan);

    //订单详情
    public Ddxq getById(Integer ddxqid);

}
